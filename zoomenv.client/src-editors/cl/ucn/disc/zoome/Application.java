package cl.ucn.disc.zoome;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.SimpleBindings;

import org.codehaus.groovy.jsr223.GroovyScriptEngineImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import cl.ucn.disc.zoome.cs.CSColor;
import cl.ucn.disc.zoome.cs.CSFactory;
import cl.ucn.disc.zoome.cs.CSRoot;
import cl.ucn.disc.zoome.cs.CSShape;
import cl.ucn.disc.zoome.cs.ConcreteSyntaxManager;
import cl.ucn.disc.zoome.services.LoggerUtil;
import cl.ucn.disc.zoome.util.CSEcoreUtil;
import cl.ucn.disc.zoome.zui.ApplicationWindow;
import cl.ucn.disc.zoome.zui.Console;
import cl.ucn.disc.zoome.zui.event.CanvasHandler;
import cl.ucn.disc.zoome.zui.event.EditionManager;
import cl.ucn.disc.zoome.zui.event.ScrollWheelZoomHandler;
import cl.ucn.disc.zoome.zui.event.SelectionManager;
import cl.ucn.disc.zoome.zui.layout.ElementView;
import cl.ucn.disc.zoome.zui.view.CanvasView;
import cl.ucn.disc.zoome.zui.view.RootView;
import cl.ucn.disc.zoome.zui.view.ViewFactory;
import cl.ucn.disc.zoome.zui.view.ViewManager;
import edu.umd.cs.piccolo.PCamera;
import edu.umd.cs.piccolo.PLayer;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.PRoot;
import edu.umd.cs.piccolo.event.PBasicInputEventHandler;
import edu.umd.cs.piccolo.event.PInputEvent;
import edu.umd.cs.piccolo.event.PInputEventFilter;
import edu.umd.cs.piccolo.event.PPanEventHandler;
import edu.umd.cs.piccolo.util.PBounds;

// FIXME Dynamic EObjects cannot inherit from EClasses from resources other than their own

public abstract class Application {

	public final class DeleteYElementHandler extends PBasicInputEventHandler {
		@Override
		public void keyPressed(PInputEvent event) {
			if (event.isKeyEvent()) {
				if (event.getKeyCode() == KeyEvent.VK_DELETE) {
					viewManager.delete(selection.getView());
					selection.unselectAll();
				}
			}
		}
	}

	/**
	 * Location of the concrete syntax (ycsml) files
	 * 
	 */
	public static URI csRepositoryURI = URI.createFileURI(new File("template").getAbsolutePath());

	public static final String ECORE = "http://www.eclipse.org/emf/2002/Ecore";
	public static final int GRAPH_LAYER = 0;
	public static final cl.ucn.disc.zoome.cs.CSLayout LAYOUT = CSFactory.eINSTANCE.createCSLayout();

	public static final CSShape getRECTANGLE() {
		CSShape sh = CSFactory.eINSTANCE.createCSShape();
		sh.setName("rectangle");
		return sh;
	}

	public static final CSShape getROUND_RECTANGLE() {
		CSShape sh = CSFactory.eINSTANCE.createCSShape();
		sh.setName("rounded rectangle");
		return sh;
	}

	public static final CSShape getELLIPSE() {
		CSShape sh = CSFactory.eINSTANCE.createCSShape();
		sh.setName("ellipse");
		return sh;
	}

	public static final CSShape getNO_SHAPE() {
		CSShape sh = CSFactory.eINSTANCE.createCSShape();
		sh.setName("none");
		return sh;
	}


	protected static final String METAMODEL_FILE_EXT = "ecore";
	/**
	 * Location of the metamodel (ecore) files
	 * 
	 */
	public static URI mmRepositoryURI = URI.createFileURI(new File("model").getAbsolutePath());
	protected static final String CS_FILE_EXT = "ycsml";
	protected CanvasView canvas;
	/**
	 * The command line console
	 * 
	 */
	Console console;
	/**
	 * Manages all of the concrete syntax objects that underlie the views
	 * 
	 */
	protected ConcreteSyntaxManager csManager;
	/**
	 * The currently opened concrete syntax model
	 * 
	 */
	Resource csModel;
	private PBasicInputEventHandler deleteHandler;
	/**
	 * Manages the edition of text boxes
	 * 
	 */
	EditionManager edition;

	protected Map<String, EClassifier> metaClasses = new HashMap<String, EClassifier>();
	protected Resource metamodel;
	protected String metamodelName;
	/**
	 * Provides access to all of the models currently opened
	 * 
	 */
	protected ResourceSet resourceSet;
	/**
	 * Allows access to selected nodes in the screen
	 * 
	 */
	protected SelectionManager selection;
	/**
	 * Keeps views and models up-to-date (see MVC pattern)
	 * 
	 */
	protected ViewManager viewManager;
	/**
	 * The main GUI window
	 * 
	 */
	protected ApplicationWindow window;

	public CSColor color(double r, double g, double b, double a) {
		return csManager.createColor(r, g, b, a);
	}

	public void delete(EObject o) {
		viewManager.delete(viewManager.getViewsOfCsObject(o));
	}

	public void fitAll() {
		viewManager.fitToAll();

	}

	public void fitOneLevelUp() {
		// TODO implement

	}

	/**
	 * @see cl.ucn.disc.zoome.Application#getCanvas()
	 */
	public CanvasView getCanvas() {
		return canvas;
	}

	/**
	 * @see cl.ucn.disc.zoome.Application#getConsole()
	 */
	public Console getConsole() {
		return console;
	}

	/**
	 * @see cl.ucn.disc.zoome.Application#getCsManager()
	 */
	public ConcreteSyntaxManager getCsManager() {
		return csManager;
	}

	public Resource getCsModel() {
		return csModel;
	}

	/**
	 * @see cl.ucn.disc.zoome.Application#getEdition()
	 */
	public EditionManager getEdition() {
		return edition;
	}

	/**
	 * This method generates the variables to use in groovy.
	 * 
	 * @return
	 */


	public Bindings getGroovyVariables() {
		Bindings variables = new SimpleBindings();
		variables.put("s", selection);
		variables.put("y", this);
		variables.put("mc", metaClasses);
//		variables.put("sf", sfs);
		// ScriptContext sc = new SimpleScriptContext();
		// sc.setBindings(variables, ScriptContext.ENGINE_SCOPE);
		return variables;
	}

	/**
	 * @see cl.ucn.disc.zoome.Application#getSelection()
	 */
	public SelectionManager getSelection() {
		return selection;
	}

	/**
	 * @see cl.ucn.disc.zoome.Application#getViewManager()
	 */
	public ViewManager getViewManager() {
		return viewManager;
	}

	/**
	 * @see cl.ucn.disc.zoome.Application#getWindow()
	 */
	public abstract ApplicationWindow getWindow();

	public void initCS(String name) {
//		csManager.reset();

		csModel = resourceSet.createResource(csRepositoryURI.appendSegment(name).appendFileExtension(CS_FILE_EXT));
		csModel.getContents().clear();
		csModel.getContents().add(csManager.getCsRoot());
	}

	protected void initDataManagement() {
		resourceSet = new ResourceSetImpl();
		
		csManager = new ConcreteSyntaxManager(resourceSet);
		ViewFactory f = new ViewFactory(canvas, this);
		viewManager = new ViewManager(f, csManager);
		// Allows the resource set to load ecore files in standalone
		// (eclipse-less) mode
		// resourceSet
		// .getResourceFactoryRegistry()
		// .getExtensionToFactoryMap()
		// .put(
		// METAMODEL_FILE_EXT,
		// new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(METAMODEL_FILE_EXT, new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new EcoreResourceFactoryImpl());
//		resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap().put(Registry.DEFAULT_CONTENT_TYPE_IDENTIFIER, new XMIResourceFactoryImpl());
		// resourceSet.getResource(URI.createURI(ECORE),true); // Loads the
		// ecore metamodel by default
	}

	/**
	 * Initializes main GUI elements. Must only be called once
	 * 
	 */
	protected void initGUI() {
		window = getWindow();
		window.setLocation(100, 100);
		console = window.getYConsole();

		canvas = window.getYCanvas();
		// The canvas must clear the selection when clicked
		canvas.addInputEventListener(new CanvasHandler(this));

		// Zooms with the mouse wheel
		canvas.setZoomEventHandler(new ScrollWheelZoomHandler());

		// Adds handler to delete objects when pressing the DELETE key
		deleteHandler = new DeleteYElementHandler();

		canvas.addInputEventListener(deleteHandler);
		canvas.getRoot().getDefaultInputManager().setKeyboardFocus(deleteHandler);

		// Pans when dragging the canvas with the left button
		PPanEventHandler panHandler = new PPanEventHandler();
		panHandler.setAutopan(false);
		panHandler.setEventFilter(new PInputEventFilter(InputEvent.BUTTON2_MASK));
		canvas.setPanEventHandler(panHandler);

	}

	protected void initMetaClasses() {
		List<EClassifier> eClasses = CSEcoreUtil.getConcreteClasses(metamodel);
		metaClasses.clear();
//		sfs.clear();
		for (EClassifier c : eClasses) {
			metaClasses.put(c.getName(), c);

			// Adds structural features to map sfs (this is to use it in Groovy)
//			for (EStructuralFeature sf : c.getEStructuralFeatures()) {
//				Map<String, EStructuralFeature> m = sfs.get(c.getName());
//				if (m == null) {
//					m = new HashMap<String, EStructuralFeature>();
//					sfs.put(c.getName(), m);
//				}
//				m.put(sf.getName(), sf);
//			}
		}
		LoggerUtil.instance.info("Loaded: " + metamodel.getURI());
	}

	public void layout() {
		if (!selection.getView().isEmpty()) {
			for (PNode e : selection.getView()) {
				((ElementView) e).getLayoutManager().updateGraphLayout();
			}
		} else {
			viewManager.getRootView().getLayoutManager().updateGraphLayout();
		}
	}

	public void loadCS(String filename) {
		csModel = resourceSet.getResource(csRepositoryURI.appendSegment(filename).appendFileExtension(CS_FILE_EXT), true);

		if (csModel.getContents() != null && !csModel.getContents().isEmpty()) {
			csManager.setCsRoot((CSRoot) csModel.getContents().get(0));
			resetApplication();
			LoggerUtil.instance.info("Loaded: " + csModel.getURI());
		}
		// TODO What happens if csModel.getContents == NULL?
	}

	public void loadMM(String mmURI) {
		URI uri;
		if (mmURI.startsWith("http")) { // It's an url
			uri = URI.createURI(mmURI);
		} else {
			uri = mmRepositoryURI.appendSegment(mmURI).appendFileExtension(METAMODEL_FILE_EXT);
		}
		
		metamodel = resourceSet.getResource(uri, true);
		if (metamodel.getContents() != null && !metamodel.getContents().isEmpty()) {
			initMetaClasses();
			EcoreUtil.resolveAll(metamodel);
		} else {
			throw new RuntimeException("Can't load" + uri);
		}
	}

	/**
	 * Resets the application, so it can display a new diagram. This must always
	 * be called after loading a new diagram or after clearing the current
	 * diagram.
	 * 
	 */
	public void resetApplication() {
		selection.unselectAll();

		// Sets up the piccolo canvas, camera, and layers
		PCamera cam = canvas.getCamera();
		PRoot root = canvas.getRoot();
		PLayer layer = cam.getLayer(GRAPH_LAYER);
		root.removeChild(layer);
		cam.removeLayer(layer);
		RootView rootView = new RootView();
		root.addChild(rootView);
		cam.addLayer(GRAPH_LAYER, rootView);

		viewManager.setRootView(rootView);
		viewManager.visualizeRootCso(csManager.getCsRoot());
		viewManager.visualizeChildren(csManager.getCsRoot(), rootView);
		viewManager.visualizeConnections(csManager.getCsRoot(), rootView);

		if (rootView.getChildrenCount() > 0) {
			viewManager.fitToAll();
		}

		// Creates the groovy shell
		ScriptEngine se = new GroovyScriptEngineImpl();
		console.setScriptEngine(se);
	}

	public void run() {
		initGUI();

		initDataManagement();

		selection = new SelectionManager(window.getYCanvas(), viewManager);
		edition = new EditionManager();

		resetApplication();

		window.setVisible(true);
		viewManager.fitToBounds(new PBounds(0, 0, 1000, 1000)); // Default view
		// bounds
	}

	public void saveCS() {
		try {
			if (csModel == null) {
				// csModel =
				// resourceSet.createResource(csRepositoryURI.appendSegment("newCSModel").appendFileExtension(CS_FILE_EXT));
				// csModel.getContents().add(csManager.getCsRoot());
				initCS("newCSModel");
			}
			// FIXME THIS IS TEMPORARY
			csModel.getContents().add(LAYOUT);
			// /----

			csModel.save(Collections.EMPTY_MAP);
			LoggerUtil.instance.info("Saved: " + csModel.getURI());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void saveCS(String filename) {
		if (csModel != null) {
			try {
				csModel.delete(Collections.EMPTY_MAP);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		initCS(filename);
		saveCS();
	}

}