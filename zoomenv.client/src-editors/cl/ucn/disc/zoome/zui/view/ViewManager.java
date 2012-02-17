package cl.ucn.disc.zoome.zui.view;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import cl.ucn.disc.zoome.binding.Binder;
import cl.ucn.disc.zoome.binding.Binding;
import cl.ucn.disc.zoome.binding.PiccoloBinder;
import cl.ucn.disc.zoome.cs.CSConnection;
import cl.ucn.disc.zoome.cs.CSElement;
import cl.ucn.disc.zoome.cs.CSFactory;
import cl.ucn.disc.zoome.cs.CSNode;
import cl.ucn.disc.zoome.cs.CSRoot;
import cl.ucn.disc.zoome.cs.CSTemplateDescription;
import cl.ucn.disc.zoome.cs.CSText;
import cl.ucn.disc.zoome.cs.CSTransform;
import cl.ucn.disc.zoome.cs.ConcreteSyntaxManager;
import cl.ucn.disc.zoome.util.ReflectionUtil;
import cl.ucn.disc.zoome.zui.layout.ElementView;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.nodes.PText;
import edu.umd.cs.piccolo.util.PBounds;

// FIXME The template 't' has two arrows for YConnection0
// FIXME When adding a second child, that node has 0.0 width (temporarily fixed setting default widthRatioToParent=1
public class ViewManager {

	private CanvasView canvas;

	public ConcreteSyntaxManager csManager;

	private PiccoloBinder piccoloBinder = new PiccoloBinder(this);

	private RootView rootView;

	private ConcreteSyntaxManager templateManager;
	
	

	/**
	 * Creates all of the components that can be created in the canvas, e.g.
	 * nodes, connections, etc.
	 */
	private ViewFactory viewFactory;

	public ViewManager(ViewFactory f, ConcreteSyntaxManager csManager) {
		this(f, csManager, null);
	}

	public ViewManager(ViewFactory f, ConcreteSyntaxManager csManager, ConcreteSyntaxManager templateManager) {
		viewFactory = f;
		this.csManager = csManager;
		this.templateManager = templateManager;
		this.canvas = f.getCanvas();
	}

	public void delete(Collection<PNode> nodes) {

		Set<PNode> pnodesToDelete = new LinkedHashSet<PNode>();
		Set<EObject> eobjectsToDelete = new LinkedHashSet<EObject>();
		for (PNode n : nodes) {
			findNodesToDelete(pnodesToDelete, eobjectsToDelete, n);
		}
		for (PNode n : nodes) {
			piccoloBinder.unbindRecursive(n);
		}
		for (PNode n : pnodesToDelete) {
			PNode parent = n.getParent();
			parent.removeChild(n);
		}

		for (EObject o : eobjectsToDelete) {
			csManager.delete(o);
		}

	}

	private void findChildrenNodesToDelete(Set<PNode> pnodesToDelete, Set<EObject> eobjectsToDelete, EObject o) {
		TreeIterator<EObject> it = o.eAllContents();
		while (it.hasNext()) {
			EObject ch = it.next();
			pnodesToDelete.addAll(getViewsOfCsObject(ch));
			eobjectsToDelete.add(ch);
		}
	}

	/**
	 * Fills the sets of PNodes to delete and the EObjects that are linked to
	 * them through the bindings
	 * 
	 * @param pnodesToDelete
	 * @param eobjectsToDelete
	 * @param pickedNode
	 */
	private void findNodesToDelete(Set<PNode> pnodesToDelete, Set<EObject> eobjectsToDelete, PNode pickedNode) {
		pnodesToDelete.add(pickedNode);
		EObject o = getCsObjectOfView(pickedNode);

		// Find connections
		if (o instanceof CSNode) {
			CSNode n = (CSNode) o;
			for (CSConnection c : n.getConnections()) {
				eobjectsToDelete.add(c);
				pnodesToDelete.addAll(getViewsOfCsObject(c));
				findChildrenNodesToDelete(pnodesToDelete, eobjectsToDelete, c);
			}

		}

		eobjectsToDelete.add(o);

		findChildrenNodesToDelete(pnodesToDelete, eobjectsToDelete, o);

	}

	private Set<PNode> findParentPNodes(CSElement cso, EObject parent, EStructuralFeature parentSf) {
		if (cso instanceof CSConnection) {
			return getViewsOfCsObject(csManager.getCsRoot());
		} else {
			Set<PNode> nodes = new HashSet<PNode>();
			Set<CSElement> elems = csManager.getCsObjectsOfEObject(parent);
			for (CSElement parentCso : elems) {
				Set<CSElement> l = csManager.findParentCsos(parentCso, parentSf);
				for (CSElement e : l) {
					nodes.addAll(getViewsOfCsObject(e));
				}
			}
			return nodes;
		}
	}

	public void fitNode(PNode n) {
		canvas.getCamera().animateViewToCenterBounds(n.getGlobalFullBounds(), true, 1000);

	}

	public void fitToAll() {
		PBounds b = rootView.getUnionOfChildrenBounds(null);
		canvas.getCamera().animateViewToCenterBounds(b, true, 1000);

	}

	public void fitToBounds(PBounds b) {
		canvas.getCamera().setViewBounds(b);
	}

	public Binder<PNode, CSElement> getPiccoloBinder() {
		return piccoloBinder;
	}

	/**
	 * Obtains the concrete syntax object that describes the view
	 * 
	 * @param view
	 * @return
	 */
	public CSElement getCsObjectOfView(PNode view) {
		if (piccoloBinder.viewBindings.containsKey(view)) {
			return piccoloBinder.viewBindings.get(view).getModel();
		} else {
			return null;
		}
	}



	public RootView getRootView() {
		return rootView;
	}

	// FIXME Do the following:
	// Visualize an association inside a PNode.
	// to achieve this, the program must determine all of the
	// PNodes that are views of the src and dst elements
	// and create the corresponding connections.

	/**
	 * Obtains the PNodes that depict the concrete syntax object csObject
	 * 
	 * @param csObject
	 *            The concrete syntax object
	 * @return The set of PNodes that depict csObject
	 */
	public Set<PNode> getViewsOfCsObject(EObject csObject) {
		Set<PNode> views = new LinkedHashSet<PNode>();
		if (piccoloBinder.modelBindings.containsKey(csObject)) {
			for (Binding<? extends PNode, ? extends EObject> b : piccoloBinder.modelBindings.get(csObject)) {
				views.add(b.getView());
			}
		}
		return views;
	}

	public Set<PNode> getViewsOfCsObjects(List<? extends EObject> csObjects) {
		Set<PNode> views = new LinkedHashSet<PNode>();
		for (EObject o : csObjects) {
			views.addAll(getViewsOfCsObject(o));
		}
		return views;
	}



	public void setRootView(RootView rootView) {
		this.rootView = rootView;
	}

	public void setTemplateManager(ConcreteSyntaxManager templateManager) {
		this.templateManager = templateManager;
	}

	/**
	 * Displays an object using the template associated with its parent and
	 * attribute. It assumes that obj is contained within the attribute attr of
	 * parent
	 * 
	 * @param obj
	 *            The object to display
	 * @param parent
	 *            obj's parent
	 * @param attr
	 *            Name of parent's attribute where obj is contained/referenced
	 * @return The PNode that is displaying obj
	 */
	public Set<PNode> visualize(EObject obj, EObject parent, String parentSfName) {
		EClass parentClass = parent.eClass();
		EStructuralFeature parentSf = parentClass.getEStructuralFeature(parentSfName);
		CSTemplateDescription td = templateManager.getTemplateDescription(parentClass, parentSf, obj.eClass());
		CSElement elem = templateManager.createFromTemplate(td);

		if (elem instanceof CSConnection) {
			csManager.assignYNodesToYConnection((CSConnection) elem, obj);
		}
		
		csManager.addYElementToParentCsObjects(parent, parentSf, elem);
		csManager.bindRecursively(elem, obj);
		
		Set<PNode> parentPNodes = findParentPNodes(elem, parent, parentSf);
		Set<PNode> nodes = new HashSet<PNode>();
		for (PNode parentPNode : parentPNodes) {
			PNode n = visualize(elem, parentPNode);
			if (!(parentPNode instanceof RootView)) {
				n.scale(td.getScale()); // FIXME This should be somehow updated in the binder
			}
			visualizeChildren(elem, n);
			if (n instanceof ElementView) {
				((ElementView)n).getLayoutManager().updateLayout();
			}
			nodes.add(n);
		}
		return nodes;
	}

	public PNode visualize(EObject obj, PNode parent) {
		try {
			// Reflectively chooses which "visualize" method to invoke
			Method visualizeMethod = getClass().getDeclaredMethod("visualize", obj.eClass().getInstanceClass(), PNode.class);
			PNode n = (PNode) visualizeMethod.invoke(this, obj, parent);
			obj.eNotify(new ENotificationImpl((InternalEObject) obj, Notification.SET, EcorePackage.EOBJECT, null, obj));

			// if (parent instanceof YRootView) {
			// ((YRootView) parent).getGraphLayout().updateLayout();
			// }
			// if (parent instanceof YNodeView) {
			// ((YNodeView) parent).getGraphLayout().updateLayout();
			// }

			return n;
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			throw new RuntimeException("Cannot visualize " + obj.eClass().getInstanceClass());

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}


	/**
	 * Visualizes a connection
	 * 
	 * @param c
	 * @param parent
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private PNode visualize(CSConnection c, PNode parent) { 
	
		Set<PNode> views = getViewsOfCsObjects(csManager.getNodes(c) );
		List<NodeView> nodeViews = (List<NodeView>) ReflectionUtil.filterByClass(views, NodeView.class);
		
//		for (PNode v : views) {
//			if (v instanceof YNodeView) {
//				nodeViews.add((YNodeView) v);
//			}
//		}
		if (nodeViews.size() >= 2) {
			ConnectionView av = viewFactory.createConnectionView(nodeViews, parent);
			// Sets layout for the node
//			av.addLayout(new YMatrixLayout());
			piccoloBinder.bind(av, c);

			return av;
		} else {
			throw new RuntimeException("Must select at least two nodes" );
		}

	}

	/**
	 * Visualizes a Node
	 * 
	 * @param n
	 * @param parent
	 * @return
	 */
	@SuppressWarnings("unused")
	private PNode visualize(CSNode n, PNode parent) {
		PBounds b = new PBounds(0, 0, 100, 50);
		assignDefaultTransform(n);
		// Create the views
		NodeView nv = viewFactory.createNodeView(b, parent);
		
		n.setX(parent.getX());
		n.setY(parent.getY());


		// Binds views with the model
		piccoloBinder.bind(nv, n, Binder.InitType.NONE);

		return nv;
	}

	private void assignDefaultTransform(CSElement n) {
		if (n.getTransform() == null) {
			CSTransform tr = CSFactory.eINSTANCE.createCSTransform();
			tr.setM00(1.0);
			tr.setM11(1.0);
			n.setTransform(tr);
		}
	}

	@SuppressWarnings("unused")
	private PNode visualize(CSTemplateDescription td, PNode parent) {
		PBounds b = new PBounds(0, 0, 100, 50);
		assignDefaultTransform(td);
		// Create the views
		NodeView nv = viewFactory.createNodeView(b, parent);
//		TextView t = viewFactory.createText("", nv);
		PText t = new PText("");
		nv.addChild(t);
		t.setPickable(false);

//		nv.addLayout(new YMatrixLayout());

		// Binds views with the model
		piccoloBinder.bind(nv, td);
		piccoloBinder.bindWithTemplate(t, td,
				"${self.containerClass?.name}.${self.containerStructuralFeature?.name} : ${self.theClass?.name} --> ${self.template?.name}");
		// of the element

		return nv;
	}

	@SuppressWarnings("unused")
	private PNode visualize(CSText t, PNode parent) {
		PBounds b = new PBounds(0, 0, 100, 20);
		assignDefaultTransform(t);
		// Create the views
		TextView tv = viewFactory.createText("", parent);

		// Binds views with the model
		piccoloBinder.bind(tv, t, "text");

		return tv;
	}

	// FIXME Must take into account if the object has more than one
	// containment relation
	// FIXME Optimize performance
	public void visualizeChildren(EObject obj, PNode view) {
		for (EObject child : obj.eContents()) {
			if (child instanceof CSElement) {
				PNode n = visualize(child, view);
				visualizeChildren(child, n);
			}
		}

	}

	public void visualizeConnections(CSRoot csRoot, PNode parent) {
		// TODO Optimize performance
		for (CSElement e : csRoot.getChildren()) {
			if (e instanceof CSConnection) {
				visualize((CSConnection) e, parent);
			}
		}

	}

	public void visualizeRoot(EObject root) {
		csManager.bindRoot(root);
	}

	public void visualizeRootCso(CSRoot csRoot) {
		piccoloBinder.unbindAll();
		piccoloBinder.bind(rootView, csRoot);
	}

}
