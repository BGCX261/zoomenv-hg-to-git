package cl.ucn.disc.zoome.cs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import cl.ucn.disc.zoome.Application;
import cl.ucn.disc.zoome.binding.Binding;
import cl.ucn.disc.zoome.binding.CSBinder;
import cl.ucn.disc.zoome.util.CSEcoreUtil;
import cl.ucn.disc.zoome.util.MultiMap;

public class ConcreteSyntaxManager {

	private static final String FILE_EXT = "ycsml";

	private CSFactory csmlFactory = CSFactory.eINSTANCE;

	public IDManager idManager = new IDManager();

	private CSRoot csRoot;

	@SuppressWarnings("unused")
	private class TemplateIndex {
		public EClass containerClass;
		public EStructuralFeature containerSF;
		public EClass theClass;
		private String str;

		public TemplateIndex(EClass containerClass,
				EStructuralFeature containerSF, EClass theClass) {
			super();
			this.containerClass = containerClass;
			this.containerSF = containerSF;
			this.theClass = theClass;
			this.str = CSEcoreUtil.getFullName(containerClass) + " , " +
					containerSF.getName() + " , " +
					CSEcoreUtil.getFullName(theClass);
		}

		@Override
		public String toString() {
			return str;
		}

		@Override
		public int hashCode() {
			return str.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof TemplateIndex) {
				TemplateIndex ti = (TemplateIndex)obj;
				return this.str.equals(ti.str);
			}  else {
				return false;
			}
		}

		private ConcreteSyntaxManager getOuterType() {
			return ConcreteSyntaxManager.this;
		}
	}

	private Map<TemplateIndex, CSTemplateDescription> templateIndex = new HashMap<TemplateIndex, CSTemplateDescription>();

	private CSBinder csBinder = new CSBinder();

	public CSRoot getCsRoot() {
		return csRoot;
	}

	public ConcreteSyntaxManager(ResourceSet rs) {
		initResourceSet(rs);
		reset();
	}

	private void initResourceSet(ResourceSet rs) {
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				FILE_EXT, new CSResourceFactoryImpl());
	}
	

	public CSConnection createConnection(List<CSNode> nodes) {
		if (nodes.size() >= 2) {
			final CSConnection c = csmlFactory.createCSConnection();
			for (CSNode n : nodes) {
				CSConnectionEnd ce = csmlFactory.createCSConnectionEnd();
				ce.setNode(n);
				c.getConnectionEnds().add(ce);
			}
			idManager.register(c);
			return c;
		} else {
			return null;
		}
	}

	public CSNode createNode() {
		CSNode n = csmlFactory.createCSNode();
		idManager.register(n);
		

		n.setLayout(Application.LAYOUT);
		setDefaultColors(n);

		// Temporary solution (see FIXMEs in YViewManager)
		n.setWidthRatioToParent(1.0);
		return n;
	}

	private void setDefaultColors(CSElement n) {
		CSColor fc = csmlFactory.createCSColor();
		CSColor bc = csmlFactory.createCSColor();
		bc.setR(1);
		bc.setG(1);
		bc.setB(1);
		bc.setA(1);
		fc.setA(1);
		n.setForeground(fc);
		n.setBackground(bc);
	}
	
	public CSText createText() {
		CSText t = csmlFactory.createCSText();
		setDefaultColors(t);
		idManager.register(t);

		return t;
	}
	
	public CSColor createColor(double r, double g, double b, double a) {
		CSColor c = csmlFactory.createCSColor();
		c.setR(r);
		c.setG(g);
		c.setB(b);
		c.setA(a);
		return c;
	}

	public void setCsRoot(CSRoot csRoot) {
		this.csRoot = csRoot;
		idManager.unregisterAll();
		idManager.registerAll(csRoot);
		templateIndex.clear();
		registerTemplates(csRoot);
	}


	private void registerTemplates(CSRoot csRoot) {
		TreeIterator<EObject> it = csRoot.eAllContents();
		while (it.hasNext()) {
			EObject o = it.next();
			if (o instanceof CSTemplateDescription) {
				CSTemplateDescription td = (CSTemplateDescription) o;
				templateIndex.put(new TemplateIndex(td.getContainerClass(), td.getContainerStructuralFeature(), td.getTheClass()), td);
			}
		}
	}

	public void delete(EObject eObject) {
		if (eObject instanceof CSElement) {
			idManager.unregister((CSElement) eObject);
			EcoreUtil.delete(eObject, true);
			if (eObject instanceof CSTemplateDescription) {
				CSTemplateDescription td = (CSTemplateDescription) eObject;
				templateIndex.remove(new TemplateIndex(td.getContainerClass(),
						td.getContainerStructuralFeature(), td.getTheClass()));
			}
		}

	}

	/**
	 * Creates a template description
	 * 
	 * @param containerClass
	 * @param containerSF
	 * @param theClass
	 *            The class to visualize using template
	 * @param template
	 * @return
	 */
	public CSTemplateDescription createTemplateDescription(
			EClass containerClass, EStructuralFeature containerSF,
			EClass theClass, CSElement template) {
		CSTemplateDescription td = csmlFactory.createCSTemplateDescription();
		td.setContainerClass(containerClass);
		td.setContainerStructuralFeature(containerSF);
		td.setTheClass(theClass);
		td.setTemplate(template);
		idManager.register(td);
		templateIndex.put(new TemplateIndex(containerClass, containerSF,
				theClass), td);

		setDefaultColors(td);
		
		return td;
	}

	public CSTemplateDescription getTemplateDescription(EClass containerClass,
			EStructuralFeature containerSF, EClass theClass) {
		// Breadth-first search the supertype c of containerClass for which 
		// two conditions are met:
		// 		- containerSF is a SF of c
		// 		- there is a template for [c, containerSF, theClass]
		TemplateIndex ti = new TemplateIndex(containerClass, containerSF, theClass);
		CSTemplateDescription templateDescription = templateIndex.get(ti);
		List<EClass> typesToVisit = new ArrayList<EClass>();
		typesToVisit.add(containerClass);
		while (!typesToVisit.isEmpty() && templateDescription == null) {
			EClass c = typesToVisit.remove(0);
			if (c.getEStructuralFeature(containerSF.getName()) != null) {
				ti = new TemplateIndex(c, containerSF, theClass);
				templateDescription = templateIndex.get(ti);
				typesToVisit.addAll(c.getESuperTypes());
			}
			
		}
		if (templateDescription != null && templateDescription.getTemplate()!= null) {
			return templateDescription;
		} else {
			throw new RuntimeException("No template for:  " + theClass.getName());
		}
	}

	public CSElement createFromTemplate(CSTemplateDescription templateDescription) {
		CSElement t = (CSElement) EcoreUtil.copy(templateDescription.getTemplate());
		if (t instanceof CSNode || t instanceof CSText) {
			CSNode n = (CSNode) t;
			n.setTransform(null);
		}
		t.setTemplateRoot(true); // This means that the CS Object t is the root of this template
		return t;
	}

	public List<CSNode> getNodes(CSConnection c) {
		List<CSNode> nodes = new ArrayList<CSNode>();
		for (CSConnectionEnd ce : c.getConnectionEnds()) {
			nodes.add(ce.getNode());
		}

		return nodes;
	}


	public void assignYNodesToYConnection(CSConnection c, EObject obj) {
		// Obtains the elements associated with obj using the information in the
		// YConnectionEnds of c, and then assigns the corresponding
		// CS objects to c
		MultiMap<EStructuralFeature, Object> visitedConnEndObjs = new MultiMap<EStructuralFeature, Object>();
		for (CSConnectionEnd ce : c.getConnectionEnds()) {
			// The assumption is that only connSF or otherSF are != null, but not both 
			EStructuralFeature connSF = ce.getConnStructuralFeature();
			EStructuralFeature otherSF = ce.getNodeStructuralFeature();
			EObject associatedEObject;
			if (connSF != null) { 
				// Finds the EObject referenced by obj through connSF and associates its corresponding
				// CS object to the connection end ce
				Object referencedObject = null;
				if (connSF.isMany()) {
					// Finds the first object referenced through connSF
					// that has not been previously assigned to another YConnectionEnd
					Collection<?> objs = (Collection<? extends Object>) obj.eGet(connSF);
					for (Object objInCollection : objs) {
						if (!visitedConnEndObjs.get(connSF).contains(objInCollection)) {
							referencedObject = objInCollection;
							visitedConnEndObjs.add(connSF, objInCollection);
							break;
						}
					}
				} else {
					referencedObject = obj.eGet(connSF);
				}
				if (referencedObject== null) {
					throw new RuntimeException("Cannot find Object associated to connection end" + ce);
				}
					
				if (referencedObject instanceof EObject) {
					associatedEObject = (EObject) referencedObject;
				
				} else {
					throw new RuntimeException(obj.eClass().getName() + "." + connSF.getName() + " is not of type EObject");
				}
				
			} else if (otherSF != null) {
				// Find the EObject that references obj through otherSF 
				Set<EObject> referencingEObjects = CSEcoreUtil.findReferencingEObjects(otherSF, obj);
				if (referencingEObjects.size() == 1) { // The assumption is that referencingEObjects must always contain one element
					associatedEObject = referencingEObjects.iterator().next();
					
				} else {
					throw new RuntimeException("There must be only one referencing EObject");
				}
				
			} else {
				throw new RuntimeException("Connection End not set");
			}
			
			// Finds the YNode corresponding to the found EObject and associates it
			// to the connection end ce 
			Set<EObject> connectableYNodes = findConnectableYNodes(associatedEObject); 
			// The assumption is that always connectableYNodes.size() == 1
			if (connectableYNodes.size() == 1) {
				ce.setNode((CSNode) connectableYNodes.iterator().next());
			} else {
				throw new RuntimeException("There must be exactly one connectable YNode associated to " + obj.eClass().getName() + "." + connSF.getName());
			}
		}
	}

	/** Finds all of the YNodes depicting obj that can be connected
	 * with other YNodes through a YConnection
	 * @param obj
	 */
	private Set<EObject> findConnectableYNodes(EObject obj) {
		Set<EObject> connectableYNodes = new HashSet<EObject>();
		Set<CSElement> otherCsObjects = getCsObjectsOfEObject(obj);
		for (CSElement e : otherCsObjects) {
			if (e.isTemplateRoot()  && e instanceof CSNode) {// This indicates that the element is the root 
															// element of a template and is also a YNode
															// Both conditions are required to insure that
															// the element can be connected to other nodes
															// through a YConnection
				connectableYNodes.add((CSNode) e);
			}
		}

		return connectableYNodes;
	}

	/**
	 * Obtains the concrete syntax objects that describe the undelying object
	 * obj
	 * 
	 * @param obj
	 *            The underlying object
	 * @return The concrete syntax object that describes obj
	 */
	public Set<CSElement> getCsObjectsOfEObject(EObject obj) {
		Set<CSElement> csObjects = new HashSet<CSElement>();
		if (csBinder.modelBindings.containsKey(obj)) {
			for (Binding<? extends CSElement, ? extends EObject> b : csBinder.modelBindings.get(obj)) {
				csObjects.add(b.getView());
			}
		}
		return csObjects;
	}

	/**
	 * Obtains the underlying EObject described by the concrete syntax object
	 * csObject
	 * 
	 * @param csObject
	 *            The concrete syntax object
	 * @return The underlying EObject described by csObject
	 */
	public EObject getEObjectOfCsObject(EObject csObject) {
		if (csBinder.viewBindings.containsKey(csObject)) {
			return csBinder.viewBindings.get(csObject).getModel();
		} else {
			return null;
		}
	}

	public void bindRecursively(CSElement elem, EObject obj) {
		csBinder.bindRecursively(elem, obj);
		
	}

	/** Binds the CS root with an EObject
	 * @param obj The EObject to be bound to the CS root
	 */
	public void bindRoot(EObject obj) {
		csBinder.unbindAll();
		csBinder.bind(getCsRoot(), obj);
	}

	public void reset() {
		setCsRoot(csmlFactory.createCSRoot());
		
	}

	public void addYElementToParentCsObjects(EObject parent, EStructuralFeature parentSf, CSElement t) {
		if (t instanceof CSConnection) {
			getCsRoot().getChildren().add(t);
		} else {
			Set<CSElement> parentCsObjects = getCsObjectsOfEObject(parent);
			for (CSElement p : parentCsObjects) {
				if (p.getDisplayedStructuralFeatures().contains(parentSf) || p instanceof CSRoot) {
					// FIXME This should create and bind a separate instance of
					// t for each parent
					p.getChildren().add(t);
				}
			}
		}
	}

	public Set<CSElement> findParentCsos(CSElement cso, EStructuralFeature parentSf) {
		Set<CSElement> objs = new HashSet<CSElement>();
		if (cso instanceof CSRoot) {
			objs.add(cso);
			return objs;
		}
		if ((parentSf != null && cso.getDisplayedStructuralFeatures().contains(parentSf))) {
			objs.add(cso);
		}
		for (CSElement ch : cso.getChildren()) {
			if (!ch.isTemplateRoot()) {
					objs.addAll(findParentCsos(ch, parentSf));
			}
		}
		return objs;
	}
}
