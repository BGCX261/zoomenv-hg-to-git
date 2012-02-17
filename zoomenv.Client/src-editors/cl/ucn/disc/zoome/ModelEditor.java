package cl.ucn.disc.zoome;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import javax.script.Bindings;
import javax.swing.JMenuItem;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import cl.ucn.disc.zoome.cs.CSRoot;
import cl.ucn.disc.zoome.cs.ConcreteSyntaxManager;
import cl.ucn.disc.zoome.services.LoggerUtil;
import cl.ucn.disc.zoome.util.CSEcoreUtil;
import cl.ucn.disc.zoome.zui.ApplicationWindow;
import cl.ucn.disc.zoome.zui.ModelEditorMainWindow;

/** Main class of the framework. Contain references to the main classes
 * and actions that control the GUI.
 * {@link #viewManager} Keeps views and models up-to-date (see MVC pattern)
 * {@link #csManager} Manages all of the concrete syntax objects that underlie the views
 * {@link #selection} Allows access to selected nodes in the screen
 * {@link #edition} Manages the edition of text boxes
 * {@link #csRoot} Is the root element of the current displayed diagram
 * {@link #console} The command line console
 * @author jpavlich
 *
 */

/**
 * @author Jaime_Pavlich
 *
 */
/**
 * @author Jaime_Pavlich
 * 
 */
public class ModelEditor extends Application {
	private Resource templateModel;
	private ConcreteSyntaxManager templateManager;
	private Resource model;
	private EObject root;
	
//	private IDManager idManager = new IDManager();

	public EObject getRoot() {
		return root;
	}

	@Override
	public void resetApplication() {
		super.resetApplication();
		for (final EClassifier c : metaClasses.values()) {
			JMenuItem mi = new JMenuItem(c.getName());
			mi.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent evt) {
					// TODO Write action for button
				}
			});
			window.getMetamodelMenu().add(mi);

		}
	}

	@Override
	public Bindings getGroovyVariables() {

		Bindings vars = super.getGroovyVariables();
		// Adds the EObject names as variables that can be accessed through Groovy
//		vars.putAll(idManager.getCsElementIndex()); 
		
		return vars;
	}

	private URI modelRepositoryURI = URI.createFileURI(new File("repository")
			.getAbsolutePath());

	public static void main(String[] args) {
		new ModelEditor().run();
	}

	private void initModel(String name) {
		setResourceFactoryForMetamodel(metamodelName);
		
		model = resourceSet.createResource(modelRepositoryURI.appendSegment(
				name).appendFileExtension(metamodelName));
		model.getContents().clear();
		model.getContents().add(root);
//		idManager.unregisterAll();
	}

	public void createModel(String name, String metamodelName, String mmURI,
			String templName, String rootEClassName) {
		this.metamodelName = metamodelName;

		loadMM(mmURI);
		EClass rootEClass = (EClass) metaClasses.get(rootEClassName); // TODO Check type
		root = CSEcoreUtil.create(rootEClass);
		loadTemplate(templName);
		initModel(name);

		initCS(name);
		viewManager.visualizeRoot(root);
		resetApplication();
	}

	public void loadModel(String name, String metamodelName, String templName) {
		setResourceFactoryForMetamodel(metamodelName);

//		String mmURI = root.eClass().eResource().getURI().toString();
 
		this.metamodelName = metamodelName;

		loadMM(metamodelName);
		EPackage metamodelRoot = (EPackage) metamodel.getContents().get(0); 
		resourceSet.getPackageRegistry().put(metamodelRoot.getNsURI(), metamodelRoot);
		
		model = resourceSet.getResource(modelRepositoryURI.appendSegment(name)
				.appendFileExtension(metamodelName), true);
		if (model.getContents().size() > 0) {
			root = model.getContents().get(0);

			loadTemplate(templName);
			loadCS(name);
			viewManager.visualizeRoot(root);
			resetApplication();
		}
	}

	private void setResourceFactoryForMetamodel(String metamodelName) {
		//Adds the resource factory for the metamodel's file extension
		// The file extension is the same as the metamodel's name
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		 .put(metamodelName, new XMIResourceFactoryImpl());
	}

	public void saveModel() {
		if (root == null)
			throw new RuntimeException("Must create a model first");

		try {
			if (model == null) {
				initModel("newModel");
				initCS("newCSModel");
			}
			model.save(Collections.EMPTY_MAP);
			saveCS();
			LoggerUtil.instance.info("Saved: " + model.getURI());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void saveModel(String filename) {
		if (root == null)
			throw new RuntimeException("Must create a model first");

		if (model != null) {
			try {
				model.delete(Collections.EMPTY_MAP);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		initModel(filename);
		initCS(filename);
		saveModel();
	}

	@Override
	public ApplicationWindow getWindow() {
		if (window == null) {
			window = new ModelEditorMainWindow(this);
		}
		return window;

	}

	public EObject createNewEObject(EClass c, EObject parent,
			String parentSfName) {
		EObject o = c.getEPackage().getEFactoryInstance().create(c);
		if (parent == null) {
			parent = root;
		}
		CSEcoreUtil.associate(parent, parentSfName, o);
		if (o.eContainer() == null) {
			model.getContents().add(o);
		}
		return o;
	}

	public EObject create(EClass c, EObject parent, String parentSfName) {
		return create(c, parent, parentSfName, null,null);
	}

	public EObject create(EClass c, EObject parent, String parentSfName , Map<String,EObject> eObjectSfAssignments) {
		return create(c, parent, parentSfName, eObjectSfAssignments,null);
	}

	/**
	 * Creates an EObject initializing it with several parameters
	 * 
	 * @param c
	 *            The class of the EObject
	 * @param eObjectSfAssignments
	 *            A map from the names of the structural features of the newly 
	 *            created EObject to the corresponding initialization values
	 * @param otherEObjectSfAssignments 
	 * 			  A map from existing objects to the names of their structural
	 * 		      features that will be initialized with the value of the
	 *            newly created object           
	 * @return The initialized EObject
	 */
	public EObject create(EClass c, EObject parent, String parentSfName, Map<String,EObject> eObjectSfAssignments, Map<EObject, String> otherEObjectSfAssignments) {
			EObject obj = createNewEObject(c, parent, parentSfName);
			if (eObjectSfAssignments != null) {
				Iterator<String> it = eObjectSfAssignments.keySet().iterator();
				while (it.hasNext()) {
					String sfName = it.next();
					Object arg = eObjectSfAssignments.get(sfName);
					CSEcoreUtil.associate(obj, sfName , arg);
				}
			}
			if (otherEObjectSfAssignments != null) {
				Iterator<EObject> it = otherEObjectSfAssignments.keySet().iterator();
				while (it.hasNext()) {
					EObject otherEObject = it.next();
					String sfName = otherEObjectSfAssignments.get(otherEObject);
					CSEcoreUtil.associate(otherEObject, sfName , obj);
				}
				
			}
//			idManager.register(obj);

			viewManager.visualize(obj, parent,parentSfName);
			return obj;
		
	}

	@Override
	protected void initDataManagement() {
		super.initDataManagement();
		templateManager = new ConcreteSyntaxManager(resourceSet);
		viewManager.setTemplateManager(templateManager);
	}

	public void loadTemplate(String filename) {
		templateModel = resourceSet.getResource(csRepositoryURI.appendSegment(
				filename).appendFileExtension(CS_FILE_EXT), true);

		if (templateModel.getContents() != null
				&& !templateModel.getContents().isEmpty()) {
			templateManager.setCsRoot((CSRoot) templateModel.getContents()
					.get(0));

			LoggerUtil.instance.info("Loaded: " + templateModel.getURI());
		} else {
			// TODO implement
		}
	}
}
