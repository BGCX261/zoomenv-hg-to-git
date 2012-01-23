package cl.ucn.disc.zoome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.script.Bindings;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import cl.ucn.disc.zoome.cs.CSConnection;
import cl.ucn.disc.zoome.cs.CSElement;
import cl.ucn.disc.zoome.cs.CSNode;
import cl.ucn.disc.zoome.cs.CSTemplateDescription;
import cl.ucn.disc.zoome.cs.CSText;
import cl.ucn.disc.zoome.services.LoggerUtil;
import cl.ucn.disc.zoome.zui.ApplicationWindow;
import cl.ucn.disc.zoome.zui.ConcreteSyntaxEditorWindow;
import cl.ucn.disc.zoome.zui.view.NodeView;
import edu.umd.cs.piccolo.PNode;

/** Main application controller class. Contain references to the main classes
 * and actions that control the GUI and models.
 * @author jpavlich
 *
 */
public class ConcreteSyntaxEditor extends Application {
	
	

	// TODO Add CS data to bind elements' structural features to the association ends
	public void createConnection() {
		
		PNode parent = canvas.getCamera().getLayer(Application.GRAPH_LAYER);

		if (selection.getView().size() >= 2) {
			Iterator<PNode> it = selection.getView().iterator();
			List<CSNode> nodes = new ArrayList<CSNode>();
			while (it.hasNext()) {
				PNode nodeView = it.next();
				CSElement nodeCsObject = viewManager.getCsObjectOfView(nodeView);
				if (nodeCsObject != null && nodeCsObject instanceof CSNode) {
					nodes.add((CSNode) nodeCsObject);
				} else {
					throw new RuntimeException("Selected nodes cannot be connected by a connection");
				}
			}
			CSConnection c = csManager.createConnection(nodes);
			csManager.getCsRoot().getChildren().add(c); // All connections are contained by csRoot
			viewManager.visualize(c, parent);
		} else {
			throw new RuntimeException("You must select at least two nodes to create the connection");
		}

	}
	
	
	
	@Override
	public Bindings getGroovyVariables() {
//		The tweak is that we add this map to a Groovy
//		Binding (@see {@link #initialize(YModel))}), to let groovy access the IDs
//		of model components, in addition to the above variables.
//		csManager.idManager.getCsElementIndex().putAll(getGroovyVariables());
		Bindings b = super.getGroovyVariables();
		b.putAll(csManager.idManager.getCsElementIndex());
		
		return b;
	}



	public void createTemplate(EClass containerClass, 
			String containerSFName, EClass theClass, CSElement template) {

		PNode parent = canvas.getCamera().getLayer(Application.GRAPH_LAYER);
		// Finds the parent model for the new element
		EObject cso = viewManager.getCsObjectOfView(parent);
		// Creates the model component
		EStructuralFeature containerSF = containerClass.getEStructuralFeature(containerSFName);
		if (cso != null && cso instanceof CSElement && containerSF != null) {
			CSElement p = (CSElement)cso;
			CSTemplateDescription td = csManager.createTemplateDescription(containerClass, containerSF, theClass, template);
			p.getChildren().add(td);
			viewManager.visualize(td, parent);
		} else {
			throw new RuntimeException("View " + parent + " is not bound to a model.");
		}
		
	}	
	
	public void createNode() {
		PNode parent;
		if (selection.getView().size() == 1 && 
				selection.getView().iterator().next() instanceof NodeView) {
			parent = selection.getView().iterator().next();
		} else if (selection.getView().size() == 0) {
			parent = canvas.getCamera().getLayer(Application.GRAPH_LAYER);
		} else {
			throw new RuntimeException("Only 0 or 1 nodes must be selected");
		}
		// Finds the parent model for the new element
		EObject cso = viewManager.getCsObjectOfView(parent);
		// Creates the model component
		if (cso != null && cso instanceof CSElement) {
			CSElement p = (CSElement)cso;
			CSNode n = csManager.createNode();
			p.getChildren().add(n);
			viewManager.visualize(n, parent);
			
		} else {
			LoggerUtil.instance.error("View " + parent + " is not bound to a model.");
		}
		
	}
	
	public void createText() {
		PNode parent;
		if (selection.getView().size() == 1) {
			parent = selection.getView().iterator().next();
		} else if (selection.getView().size() == 0) {
			parent = canvas.getCamera().getLayer(Application.GRAPH_LAYER);
		} else {
			throw new RuntimeException("Only 0 or 1 nodes must be selected");
		}
		// Finds the parent model for the new element
		EObject cso = viewManager.getCsObjectOfView(parent);
		// Creates the model component
		if (cso != null && cso instanceof CSElement) {
			CSElement p = (CSElement)cso;
//			YNode n = csManager.createNode();
			CSText t = csManager.createText();
			t.setText("< New Text >");
			p.getChildren().add(t);
			viewManager.visualize(t, parent);
			
		} else {
			LoggerUtil.instance.error("View " + parent + " is not bound to a model.");
		}
	}

	@Override
	public ApplicationWindow getWindow() {
		if (window == null) {
			window = new ConcreteSyntaxEditorWindow(this);
		}
		return window;
	}

	
	




	public static void main(String[] args) {
		new ConcreteSyntaxEditor().run();
	}


	
}
