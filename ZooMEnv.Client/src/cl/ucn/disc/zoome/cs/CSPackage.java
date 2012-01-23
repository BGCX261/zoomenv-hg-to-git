/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cl.ucn.disc.zoome.cs.CSFactory
 * @model kind="package"
 * @generated
 */
public interface CSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://disc.ucn.cl/ycsml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CSPackage eINSTANCE = cl.ucn.disc.zoome.cs.impl.CSPackageImpl.init();

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.impl.CSElementImpl
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSElement()
	 * @generated
	 */
	int CS_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__EANNOTATIONS = EcorePackage.ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__NAME = EcorePackage.ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Selectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__SELECTABLE = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__STROKE = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__CHILDREN = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__PARENT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__DRAGGABLE = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__RESIZABLE = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__FOREGROUND = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__BACKGROUND = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Template Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__TEMPLATE_ROOT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__SHAPE = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__TRANSFORM = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__OBJECT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Displayed Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__DISPLAYED_STRUCTURAL_FEATURES = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__LAYOUT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Min Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__MIN_ZOOM = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Max Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT__MAX_ZOOM = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ELEMENT_FEATURE_COUNT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.impl.CSRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.impl.CSRootImpl
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSRoot()
	 * @generated
	 */
	int CS_ROOT = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__EANNOTATIONS = CS_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__NAME = CS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Selectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__SELECTABLE = CS_ELEMENT__SELECTABLE;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__STROKE = CS_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__CHILDREN = CS_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__PARENT = CS_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__DRAGGABLE = CS_ELEMENT__DRAGGABLE;

	/**
	 * The feature id for the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__RESIZABLE = CS_ELEMENT__RESIZABLE;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__FOREGROUND = CS_ELEMENT__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__BACKGROUND = CS_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Template Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__TEMPLATE_ROOT = CS_ELEMENT__TEMPLATE_ROOT;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__SHAPE = CS_ELEMENT__SHAPE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__TRANSFORM = CS_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__OBJECT = CS_ELEMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Displayed Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__DISPLAYED_STRUCTURAL_FEATURES = CS_ELEMENT__DISPLAYED_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__LAYOUT = CS_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Min Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__MIN_ZOOM = CS_ELEMENT__MIN_ZOOM;

	/**
	 * The feature id for the '<em><b>Max Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT__MAX_ZOOM = CS_ELEMENT__MAX_ZOOM;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_ROOT_FEATURE_COUNT = CS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.impl.CSNodeImpl
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSNode()
	 * @generated
	 */
	int CS_NODE = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__EANNOTATIONS = CS_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__NAME = CS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Selectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__SELECTABLE = CS_ELEMENT__SELECTABLE;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__STROKE = CS_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__CHILDREN = CS_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__PARENT = CS_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__DRAGGABLE = CS_ELEMENT__DRAGGABLE;

	/**
	 * The feature id for the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__RESIZABLE = CS_ELEMENT__RESIZABLE;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__FOREGROUND = CS_ELEMENT__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__BACKGROUND = CS_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Template Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__TEMPLATE_ROOT = CS_ELEMENT__TEMPLATE_ROOT;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__SHAPE = CS_ELEMENT__SHAPE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__TRANSFORM = CS_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__OBJECT = CS_ELEMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Displayed Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__DISPLAYED_STRUCTURAL_FEATURES = CS_ELEMENT__DISPLAYED_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__LAYOUT = CS_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Min Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__MIN_ZOOM = CS_ELEMENT__MIN_ZOOM;

	/**
	 * The feature id for the '<em><b>Max Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__MAX_ZOOM = CS_ELEMENT__MAX_ZOOM;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__CONNECTIONS = CS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__HEIGHT = CS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__WIDTH = CS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__X = CS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__Y = CS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Horizontal Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__HORIZONTAL_ALIGN = CS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vertical Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__VERTICAL_ALIGN = CS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Width Ratio To Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__WIDTH_RATIO_TO_PARENT = CS_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Height Ratio To Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__HEIGHT_RATIO_TO_PARENT = CS_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__MIN_HEIGHT = CS_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__MAX_HEIGHT = CS_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__MIN_WIDTH = CS_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE__MAX_WIDTH = CS_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_NODE_FEATURE_COUNT = CS_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.impl.CSConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.impl.CSConnectionImpl
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSConnection()
	 * @generated
	 */
	int CS_CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__EANNOTATIONS = CS_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__NAME = CS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Selectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__SELECTABLE = CS_ELEMENT__SELECTABLE;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__STROKE = CS_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__CHILDREN = CS_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__PARENT = CS_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__DRAGGABLE = CS_ELEMENT__DRAGGABLE;

	/**
	 * The feature id for the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__RESIZABLE = CS_ELEMENT__RESIZABLE;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__FOREGROUND = CS_ELEMENT__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__BACKGROUND = CS_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Template Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__TEMPLATE_ROOT = CS_ELEMENT__TEMPLATE_ROOT;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__SHAPE = CS_ELEMENT__SHAPE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__TRANSFORM = CS_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__OBJECT = CS_ELEMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Displayed Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__DISPLAYED_STRUCTURAL_FEATURES = CS_ELEMENT__DISPLAYED_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__LAYOUT = CS_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Min Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__MIN_ZOOM = CS_ELEMENT__MIN_ZOOM;

	/**
	 * The feature id for the '<em><b>Max Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__MAX_ZOOM = CS_ELEMENT__MAX_ZOOM;

	/**
	 * The feature id for the '<em><b>Connection Ends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION__CONNECTION_ENDS = CS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION_FEATURE_COUNT = CS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.impl.CSTextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.impl.CSTextImpl
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSText()
	 * @generated
	 */
	int CS_TEXT = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__EANNOTATIONS = CS_NODE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__NAME = CS_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Selectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__SELECTABLE = CS_NODE__SELECTABLE;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__STROKE = CS_NODE__STROKE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__CHILDREN = CS_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__PARENT = CS_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__DRAGGABLE = CS_NODE__DRAGGABLE;

	/**
	 * The feature id for the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__RESIZABLE = CS_NODE__RESIZABLE;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__FOREGROUND = CS_NODE__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__BACKGROUND = CS_NODE__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Template Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__TEMPLATE_ROOT = CS_NODE__TEMPLATE_ROOT;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__SHAPE = CS_NODE__SHAPE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__TRANSFORM = CS_NODE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__OBJECT = CS_NODE__OBJECT;

	/**
	 * The feature id for the '<em><b>Displayed Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__DISPLAYED_STRUCTURAL_FEATURES = CS_NODE__DISPLAYED_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__LAYOUT = CS_NODE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Min Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__MIN_ZOOM = CS_NODE__MIN_ZOOM;

	/**
	 * The feature id for the '<em><b>Max Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__MAX_ZOOM = CS_NODE__MAX_ZOOM;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__CONNECTIONS = CS_NODE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__HEIGHT = CS_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__WIDTH = CS_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__X = CS_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__Y = CS_NODE__Y;

	/**
	 * The feature id for the '<em><b>Horizontal Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__HORIZONTAL_ALIGN = CS_NODE__HORIZONTAL_ALIGN;

	/**
	 * The feature id for the '<em><b>Vertical Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__VERTICAL_ALIGN = CS_NODE__VERTICAL_ALIGN;

	/**
	 * The feature id for the '<em><b>Width Ratio To Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__WIDTH_RATIO_TO_PARENT = CS_NODE__WIDTH_RATIO_TO_PARENT;

	/**
	 * The feature id for the '<em><b>Height Ratio To Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__HEIGHT_RATIO_TO_PARENT = CS_NODE__HEIGHT_RATIO_TO_PARENT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__MIN_HEIGHT = CS_NODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__MAX_HEIGHT = CS_NODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__MIN_WIDTH = CS_NODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__MAX_WIDTH = CS_NODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT__TEXT = CS_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEXT_FEATURE_COUNT = CS_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.impl.CSStrokeImpl <em>Stroke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.impl.CSStrokeImpl
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSStroke()
	 * @generated
	 */
	int CS_STROKE = 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_STROKE__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_STROKE__JOIN = 1;

	/**
	 * The feature id for the '<em><b>Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_STROKE__CAP = 2;

	/**
	 * The feature id for the '<em><b>Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_STROKE__MITERLIMIT = 3;

	/**
	 * The feature id for the '<em><b>Dash</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_STROKE__DASH = 4;

	/**
	 * The feature id for the '<em><b>Dash phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_STROKE__DASH_PHASE = 5;

	/**
	 * The number of structural features of the '<em>Stroke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_STROKE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.impl.CSColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.impl.CSColorImpl
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSColor()
	 * @generated
	 */
	int CS_COLOR = 6;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_COLOR__R = 0;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_COLOR__G = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_COLOR__B = 2;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_COLOR__A = 3;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_COLOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.impl.CSShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.impl.CSShapeImpl
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSShape()
	 * @generated
	 */
	int CS_SHAPE = 7;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_SHAPE__EANNOTATIONS = EcorePackage.ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_SHAPE__NAME = EcorePackage.ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_SHAPE__POINTS = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_SHAPE__CLOSED = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_SHAPE_FEATURE_COUNT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.impl.CSPointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.impl.CSPointImpl
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSPoint()
	 * @generated
	 */
	int CS_POINT = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_POINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.impl.CSTransformImpl <em>Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.impl.CSTransformImpl
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSTransform()
	 * @generated
	 */
	int CS_TRANSFORM = 9;

	/**
	 * The feature id for the '<em><b>M00</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TRANSFORM__M00 = 0;

	/**
	 * The feature id for the '<em><b>M01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TRANSFORM__M01 = 1;

	/**
	 * The feature id for the '<em><b>M02</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TRANSFORM__M02 = 2;

	/**
	 * The feature id for the '<em><b>M10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TRANSFORM__M10 = 3;

	/**
	 * The feature id for the '<em><b>M11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TRANSFORM__M11 = 4;

	/**
	 * The feature id for the '<em><b>M12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TRANSFORM__M12 = 5;

	/**
	 * The feature id for the '<em><b>M20</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TRANSFORM__M20 = 6;

	/**
	 * The feature id for the '<em><b>M21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TRANSFORM__M21 = 7;

	/**
	 * The feature id for the '<em><b>M22</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TRANSFORM__M22 = 8;

	/**
	 * The number of structural features of the '<em>Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TRANSFORM_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.impl.CSTemplateDescriptionImpl <em>Template Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.impl.CSTemplateDescriptionImpl
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSTemplateDescription()
	 * @generated
	 */
	int CS_TEMPLATE_DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__EANNOTATIONS = CS_NODE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__NAME = CS_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Selectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__SELECTABLE = CS_NODE__SELECTABLE;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__STROKE = CS_NODE__STROKE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__CHILDREN = CS_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__PARENT = CS_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__DRAGGABLE = CS_NODE__DRAGGABLE;

	/**
	 * The feature id for the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__RESIZABLE = CS_NODE__RESIZABLE;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__FOREGROUND = CS_NODE__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__BACKGROUND = CS_NODE__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Template Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__TEMPLATE_ROOT = CS_NODE__TEMPLATE_ROOT;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__SHAPE = CS_NODE__SHAPE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__TRANSFORM = CS_NODE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__OBJECT = CS_NODE__OBJECT;

	/**
	 * The feature id for the '<em><b>Displayed Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__DISPLAYED_STRUCTURAL_FEATURES = CS_NODE__DISPLAYED_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__LAYOUT = CS_NODE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Min Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__MIN_ZOOM = CS_NODE__MIN_ZOOM;

	/**
	 * The feature id for the '<em><b>Max Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__MAX_ZOOM = CS_NODE__MAX_ZOOM;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__CONNECTIONS = CS_NODE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__HEIGHT = CS_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__WIDTH = CS_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__X = CS_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__Y = CS_NODE__Y;

	/**
	 * The feature id for the '<em><b>Horizontal Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__HORIZONTAL_ALIGN = CS_NODE__HORIZONTAL_ALIGN;

	/**
	 * The feature id for the '<em><b>Vertical Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__VERTICAL_ALIGN = CS_NODE__VERTICAL_ALIGN;

	/**
	 * The feature id for the '<em><b>Width Ratio To Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__WIDTH_RATIO_TO_PARENT = CS_NODE__WIDTH_RATIO_TO_PARENT;

	/**
	 * The feature id for the '<em><b>Height Ratio To Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__HEIGHT_RATIO_TO_PARENT = CS_NODE__HEIGHT_RATIO_TO_PARENT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__MIN_HEIGHT = CS_NODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__MAX_HEIGHT = CS_NODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__MIN_WIDTH = CS_NODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__MAX_WIDTH = CS_NODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Container Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__CONTAINER_CLASS = CS_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__THE_CLASS = CS_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__CONTAINER_STRUCTURAL_FEATURE = CS_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__SCALE = CS_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION__TEMPLATE = CS_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Template Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_TEMPLATE_DESCRIPTION_FEATURE_COUNT = CS_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.impl.CSLayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.impl.CSLayoutImpl
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSLayout()
	 * @generated
	 */
	int CS_LAYOUT = 11;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_LAYOUT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.impl.CSConnectionEndImpl <em>Connection End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.impl.CSConnectionEndImpl
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSConnectionEnd()
	 * @generated
	 */
	int CS_CONNECTION_END = 12;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION_END__NODE = 0;

	/**
	 * The feature id for the '<em><b>Conn Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION_END__CONN_STRUCTURAL_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Node Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION_END__NODE_STRUCTURAL_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Tip Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION_END__TIP_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Connection End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CONNECTION_END_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.CSOrientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.CSOrientation
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSOrientation()
	 * @generated
	 */
	int CS_ORIENTATION = 13;

	/**
	 * The meta object id for the '{@link cl.ucn.disc.zoome.cs.CSFitType <em>Fit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cl.ucn.disc.zoome.cs.CSFitType
	 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSFitType()
	 * @generated
	 */
	int CS_FIT_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link cl.ucn.disc.zoome.cs.CSRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSRoot
	 * @generated
	 */
	EClass getCSRoot();

	/**
	 * Returns the meta object for class '{@link cl.ucn.disc.zoome.cs.CSElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement
	 * @generated
	 */
	EClass getCSElement();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSElement#getSelectable <em>Selectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selectable</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#getSelectable()
	 * @see #getCSElement()
	 * @generated
	 */
	EAttribute getCSElement_Selectable();

	/**
	 * Returns the meta object for the containment reference '{@link cl.ucn.disc.zoome.cs.CSElement#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stroke</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#getStroke()
	 * @see #getCSElement()
	 * @generated
	 */
	EReference getCSElement_Stroke();

	/**
	 * Returns the meta object for the containment reference list '{@link cl.ucn.disc.zoome.cs.CSElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#getChildren()
	 * @see #getCSElement()
	 * @generated
	 */
	EReference getCSElement_Children();

	/**
	 * Returns the meta object for the container reference '{@link cl.ucn.disc.zoome.cs.CSElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#getParent()
	 * @see #getCSElement()
	 * @generated
	 */
	EReference getCSElement_Parent();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSElement#isDraggable <em>Draggable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draggable</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#isDraggable()
	 * @see #getCSElement()
	 * @generated
	 */
	EAttribute getCSElement_Draggable();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSElement#isResizable <em>Resizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resizable</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#isResizable()
	 * @see #getCSElement()
	 * @generated
	 */
	EAttribute getCSElement_Resizable();

	/**
	 * Returns the meta object for the containment reference '{@link cl.ucn.disc.zoome.cs.CSElement#getForeground <em>Foreground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreground</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#getForeground()
	 * @see #getCSElement()
	 * @generated
	 */
	EReference getCSElement_Foreground();

	/**
	 * Returns the meta object for the containment reference '{@link cl.ucn.disc.zoome.cs.CSElement#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#getBackground()
	 * @see #getCSElement()
	 * @generated
	 */
	EReference getCSElement_Background();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSElement#isTemplateRoot <em>Template Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Root</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#isTemplateRoot()
	 * @see #getCSElement()
	 * @generated
	 */
	EAttribute getCSElement_TemplateRoot();

	/**
	 * Returns the meta object for the containment reference '{@link cl.ucn.disc.zoome.cs.CSElement#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#getShape()
	 * @see #getCSElement()
	 * @generated
	 */
	EReference getCSElement_Shape();

	/**
	 * Returns the meta object for the containment reference '{@link cl.ucn.disc.zoome.cs.CSElement#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#getTransform()
	 * @see #getCSElement()
	 * @generated
	 */
	EReference getCSElement_Transform();

	/**
	 * Returns the meta object for the reference '{@link cl.ucn.disc.zoome.cs.CSElement#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#getObject()
	 * @see #getCSElement()
	 * @generated
	 */
	EReference getCSElement_Object();

	/**
	 * Returns the meta object for the reference list '{@link cl.ucn.disc.zoome.cs.CSElement#getDisplayedStructuralFeatures <em>Displayed Structural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Displayed Structural Features</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#getDisplayedStructuralFeatures()
	 * @see #getCSElement()
	 * @generated
	 */
	EReference getCSElement_DisplayedStructuralFeatures();

	/**
	 * Returns the meta object for the reference '{@link cl.ucn.disc.zoome.cs.CSElement#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#getLayout()
	 * @see #getCSElement()
	 * @generated
	 */
	EReference getCSElement_Layout();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSElement#getMinZoom <em>Min Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Zoom</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#getMinZoom()
	 * @see #getCSElement()
	 * @generated
	 */
	EAttribute getCSElement_MinZoom();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSElement#getMaxZoom <em>Max Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Zoom</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSElement#getMaxZoom()
	 * @see #getCSElement()
	 * @generated
	 */
	EAttribute getCSElement_MaxZoom();

	/**
	 * Returns the meta object for class '{@link cl.ucn.disc.zoome.cs.CSNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode
	 * @generated
	 */
	EClass getCSNode();

	/**
	 * Returns the meta object for the reference list '{@link cl.ucn.disc.zoome.cs.CSNode#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode#getConnections()
	 * @see #getCSNode()
	 * @generated
	 */
	EReference getCSNode_Connections();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSNode#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode#getHeight()
	 * @see #getCSNode()
	 * @generated
	 */
	EAttribute getCSNode_Height();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSNode#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode#getWidth()
	 * @see #getCSNode()
	 * @generated
	 */
	EAttribute getCSNode_Width();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSNode#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode#getX()
	 * @see #getCSNode()
	 * @generated
	 */
	EAttribute getCSNode_X();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSNode#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode#getY()
	 * @see #getCSNode()
	 * @generated
	 */
	EAttribute getCSNode_Y();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSNode#getHorizontalAlign <em>Horizontal Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Align</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode#getHorizontalAlign()
	 * @see #getCSNode()
	 * @generated
	 */
	EAttribute getCSNode_HorizontalAlign();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSNode#getVerticalAlign <em>Vertical Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Align</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode#getVerticalAlign()
	 * @see #getCSNode()
	 * @generated
	 */
	EAttribute getCSNode_VerticalAlign();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSNode#getWidthRatioToParent <em>Width Ratio To Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Ratio To Parent</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode#getWidthRatioToParent()
	 * @see #getCSNode()
	 * @generated
	 */
	EAttribute getCSNode_WidthRatioToParent();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSNode#getHeightRatioToParent <em>Height Ratio To Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height Ratio To Parent</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode#getHeightRatioToParent()
	 * @see #getCSNode()
	 * @generated
	 */
	EAttribute getCSNode_HeightRatioToParent();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSNode#getMinHeight <em>Min Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Height</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode#getMinHeight()
	 * @see #getCSNode()
	 * @generated
	 */
	EAttribute getCSNode_MinHeight();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSNode#getMinWidth <em>Min Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Width</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode#getMinWidth()
	 * @see #getCSNode()
	 * @generated
	 */
	EAttribute getCSNode_MinWidth();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSNode#getMaxHeight <em>Max Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Height</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode#getMaxHeight()
	 * @see #getCSNode()
	 * @generated
	 */
	EAttribute getCSNode_MaxHeight();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSNode#getMaxWidth <em>Max Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Width</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSNode#getMaxWidth()
	 * @see #getCSNode()
	 * @generated
	 */
	EAttribute getCSNode_MaxWidth();

	/**
	 * Returns the meta object for class '{@link cl.ucn.disc.zoome.cs.CSConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSConnection
	 * @generated
	 */
	EClass getCSConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link cl.ucn.disc.zoome.cs.CSConnection#getConnectionEnds <em>Connection Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Ends</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSConnection#getConnectionEnds()
	 * @see #getCSConnection()
	 * @generated
	 */
	EReference getCSConnection_ConnectionEnds();

	/**
	 * Returns the meta object for class '{@link cl.ucn.disc.zoome.cs.CSText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSText
	 * @generated
	 */
	EClass getCSText();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSText#getText()
	 * @see #getCSText()
	 * @generated
	 */
	EAttribute getCSText_Text();

	/**
	 * Returns the meta object for class '{@link cl.ucn.disc.zoome.cs.CSStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stroke</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSStroke
	 * @generated
	 */
	EClass getCSStroke();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSStroke#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSStroke#getWidth()
	 * @see #getCSStroke()
	 * @generated
	 */
	EAttribute getCSStroke_Width();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSStroke#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSStroke#getJoin()
	 * @see #getCSStroke()
	 * @generated
	 */
	EAttribute getCSStroke_Join();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSStroke#getCap <em>Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cap</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSStroke#getCap()
	 * @see #getCSStroke()
	 * @generated
	 */
	EAttribute getCSStroke_Cap();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSStroke#getMiterlimit <em>Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Miterlimit</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSStroke#getMiterlimit()
	 * @see #getCSStroke()
	 * @generated
	 */
	EAttribute getCSStroke_Miterlimit();

	/**
	 * Returns the meta object for the attribute list '{@link cl.ucn.disc.zoome.cs.CSStroke#getDash <em>Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dash</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSStroke#getDash()
	 * @see #getCSStroke()
	 * @generated
	 */
	EAttribute getCSStroke_Dash();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSStroke#getDash_phase <em>Dash phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dash phase</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSStroke#getDash_phase()
	 * @see #getCSStroke()
	 * @generated
	 */
	EAttribute getCSStroke_Dash_phase();

	/**
	 * Returns the meta object for class '{@link cl.ucn.disc.zoome.cs.CSColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSColor
	 * @generated
	 */
	EClass getCSColor();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSColor#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSColor#getR()
	 * @see #getCSColor()
	 * @generated
	 */
	EAttribute getCSColor_R();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSColor#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSColor#getG()
	 * @see #getCSColor()
	 * @generated
	 */
	EAttribute getCSColor_G();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSColor#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSColor#getB()
	 * @see #getCSColor()
	 * @generated
	 */
	EAttribute getCSColor_B();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSColor#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSColor#getA()
	 * @see #getCSColor()
	 * @generated
	 */
	EAttribute getCSColor_A();

	/**
	 * Returns the meta object for class '{@link cl.ucn.disc.zoome.cs.CSShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSShape
	 * @generated
	 */
	EClass getCSShape();

	/**
	 * Returns the meta object for the containment reference list '{@link cl.ucn.disc.zoome.cs.CSShape#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSShape#getPoints()
	 * @see #getCSShape()
	 * @generated
	 */
	EReference getCSShape_Points();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSShape#isClosed <em>Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSShape#isClosed()
	 * @see #getCSShape()
	 * @generated
	 */
	EAttribute getCSShape_Closed();

	/**
	 * Returns the meta object for class '{@link cl.ucn.disc.zoome.cs.CSPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSPoint
	 * @generated
	 */
	EClass getCSPoint();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSPoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSPoint#getX()
	 * @see #getCSPoint()
	 * @generated
	 */
	EAttribute getCSPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSPoint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSPoint#getY()
	 * @see #getCSPoint()
	 * @generated
	 */
	EAttribute getCSPoint_Y();

	/**
	 * Returns the meta object for class '{@link cl.ucn.disc.zoome.cs.CSTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTransform
	 * @generated
	 */
	EClass getCSTransform();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSTransform#getM00 <em>M00</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M00</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTransform#getM00()
	 * @see #getCSTransform()
	 * @generated
	 */
	EAttribute getCSTransform_M00();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSTransform#getM01 <em>M01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M01</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTransform#getM01()
	 * @see #getCSTransform()
	 * @generated
	 */
	EAttribute getCSTransform_M01();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSTransform#getM02 <em>M02</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M02</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTransform#getM02()
	 * @see #getCSTransform()
	 * @generated
	 */
	EAttribute getCSTransform_M02();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSTransform#getM10 <em>M10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M10</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTransform#getM10()
	 * @see #getCSTransform()
	 * @generated
	 */
	EAttribute getCSTransform_M10();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSTransform#getM11 <em>M11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M11</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTransform#getM11()
	 * @see #getCSTransform()
	 * @generated
	 */
	EAttribute getCSTransform_M11();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSTransform#getM12 <em>M12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M12</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTransform#getM12()
	 * @see #getCSTransform()
	 * @generated
	 */
	EAttribute getCSTransform_M12();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSTransform#getM20 <em>M20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M20</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTransform#getM20()
	 * @see #getCSTransform()
	 * @generated
	 */
	EAttribute getCSTransform_M20();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSTransform#getM21 <em>M21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M21</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTransform#getM21()
	 * @see #getCSTransform()
	 * @generated
	 */
	EAttribute getCSTransform_M21();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSTransform#getM22 <em>M22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M22</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTransform#getM22()
	 * @see #getCSTransform()
	 * @generated
	 */
	EAttribute getCSTransform_M22();

	/**
	 * Returns the meta object for class '{@link cl.ucn.disc.zoome.cs.CSTemplateDescription <em>Template Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Description</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTemplateDescription
	 * @generated
	 */
	EClass getCSTemplateDescription();

	/**
	 * Returns the meta object for the reference '{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getContainerClass <em>Container Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Class</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTemplateDescription#getContainerClass()
	 * @see #getCSTemplateDescription()
	 * @generated
	 */
	EReference getCSTemplateDescription_ContainerClass();

	/**
	 * Returns the meta object for the reference '{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getTheClass <em>The Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Class</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTemplateDescription#getTheClass()
	 * @see #getCSTemplateDescription()
	 * @generated
	 */
	EReference getCSTemplateDescription_TheClass();

	/**
	 * Returns the meta object for the reference '{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getContainerStructuralFeature <em>Container Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Structural Feature</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTemplateDescription#getContainerStructuralFeature()
	 * @see #getCSTemplateDescription()
	 * @generated
	 */
	EReference getCSTemplateDescription_ContainerStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTemplateDescription#getScale()
	 * @see #getCSTemplateDescription()
	 * @generated
	 */
	EAttribute getCSTemplateDescription_Scale();

	/**
	 * Returns the meta object for the reference '{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSTemplateDescription#getTemplate()
	 * @see #getCSTemplateDescription()
	 * @generated
	 */
	EReference getCSTemplateDescription_Template();

	/**
	 * Returns the meta object for class '{@link cl.ucn.disc.zoome.cs.CSLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSLayout
	 * @generated
	 */
	EClass getCSLayout();

	/**
	 * Returns the meta object for class '{@link cl.ucn.disc.zoome.cs.CSConnectionEnd <em>Connection End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection End</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSConnectionEnd
	 * @generated
	 */
	EClass getCSConnectionEnd();

	/**
	 * Returns the meta object for the attribute '{@link cl.ucn.disc.zoome.cs.CSConnectionEnd#getTipType <em>Tip Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tip Type</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSConnectionEnd#getTipType()
	 * @see #getCSConnectionEnd()
	 * @generated
	 */
	EAttribute getCSConnectionEnd_TipType();

	/**
	 * Returns the meta object for the reference '{@link cl.ucn.disc.zoome.cs.CSConnectionEnd#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSConnectionEnd#getNode()
	 * @see #getCSConnectionEnd()
	 * @generated
	 */
	EReference getCSConnectionEnd_Node();

	/**
	 * Returns the meta object for the reference '{@link cl.ucn.disc.zoome.cs.CSConnectionEnd#getConnStructuralFeature <em>Conn Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conn Structural Feature</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSConnectionEnd#getConnStructuralFeature()
	 * @see #getCSConnectionEnd()
	 * @generated
	 */
	EReference getCSConnectionEnd_ConnStructuralFeature();

	/**
	 * Returns the meta object for the reference '{@link cl.ucn.disc.zoome.cs.CSConnectionEnd#getNodeStructuralFeature <em>Node Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Structural Feature</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSConnectionEnd#getNodeStructuralFeature()
	 * @see #getCSConnectionEnd()
	 * @generated
	 */
	EReference getCSConnectionEnd_NodeStructuralFeature();

	/**
	 * Returns the meta object for enum '{@link cl.ucn.disc.zoome.cs.CSOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSOrientation
	 * @generated
	 */
	EEnum getCSOrientation();

	/**
	 * Returns the meta object for enum '{@link cl.ucn.disc.zoome.cs.CSFitType <em>Fit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fit Type</em>'.
	 * @see cl.ucn.disc.zoome.cs.CSFitType
	 * @generated
	 */
	EEnum getCSFitType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CSFactory getCSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.impl.CSRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.impl.CSRootImpl
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSRoot()
		 * @generated
		 */
		EClass CS_ROOT = eINSTANCE.getCSRoot();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.impl.CSElementImpl
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSElement()
		 * @generated
		 */
		EClass CS_ELEMENT = eINSTANCE.getCSElement();

		/**
		 * The meta object literal for the '<em><b>Selectable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_ELEMENT__SELECTABLE = eINSTANCE.getCSElement_Selectable();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_ELEMENT__STROKE = eINSTANCE.getCSElement_Stroke();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_ELEMENT__CHILDREN = eINSTANCE.getCSElement_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_ELEMENT__PARENT = eINSTANCE.getCSElement_Parent();

		/**
		 * The meta object literal for the '<em><b>Draggable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_ELEMENT__DRAGGABLE = eINSTANCE.getCSElement_Draggable();

		/**
		 * The meta object literal for the '<em><b>Resizable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_ELEMENT__RESIZABLE = eINSTANCE.getCSElement_Resizable();

		/**
		 * The meta object literal for the '<em><b>Foreground</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_ELEMENT__FOREGROUND = eINSTANCE.getCSElement_Foreground();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_ELEMENT__BACKGROUND = eINSTANCE.getCSElement_Background();

		/**
		 * The meta object literal for the '<em><b>Template Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_ELEMENT__TEMPLATE_ROOT = eINSTANCE.getCSElement_TemplateRoot();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_ELEMENT__SHAPE = eINSTANCE.getCSElement_Shape();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_ELEMENT__TRANSFORM = eINSTANCE.getCSElement_Transform();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_ELEMENT__OBJECT = eINSTANCE.getCSElement_Object();

		/**
		 * The meta object literal for the '<em><b>Displayed Structural Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_ELEMENT__DISPLAYED_STRUCTURAL_FEATURES = eINSTANCE.getCSElement_DisplayedStructuralFeatures();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_ELEMENT__LAYOUT = eINSTANCE.getCSElement_Layout();

		/**
		 * The meta object literal for the '<em><b>Min Zoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_ELEMENT__MIN_ZOOM = eINSTANCE.getCSElement_MinZoom();

		/**
		 * The meta object literal for the '<em><b>Max Zoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_ELEMENT__MAX_ZOOM = eINSTANCE.getCSElement_MaxZoom();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.impl.CSNodeImpl
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSNode()
		 * @generated
		 */
		EClass CS_NODE = eINSTANCE.getCSNode();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_NODE__CONNECTIONS = eINSTANCE.getCSNode_Connections();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_NODE__HEIGHT = eINSTANCE.getCSNode_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_NODE__WIDTH = eINSTANCE.getCSNode_Width();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_NODE__X = eINSTANCE.getCSNode_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_NODE__Y = eINSTANCE.getCSNode_Y();

		/**
		 * The meta object literal for the '<em><b>Horizontal Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_NODE__HORIZONTAL_ALIGN = eINSTANCE.getCSNode_HorizontalAlign();

		/**
		 * The meta object literal for the '<em><b>Vertical Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_NODE__VERTICAL_ALIGN = eINSTANCE.getCSNode_VerticalAlign();

		/**
		 * The meta object literal for the '<em><b>Width Ratio To Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_NODE__WIDTH_RATIO_TO_PARENT = eINSTANCE.getCSNode_WidthRatioToParent();

		/**
		 * The meta object literal for the '<em><b>Height Ratio To Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_NODE__HEIGHT_RATIO_TO_PARENT = eINSTANCE.getCSNode_HeightRatioToParent();

		/**
		 * The meta object literal for the '<em><b>Min Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_NODE__MIN_HEIGHT = eINSTANCE.getCSNode_MinHeight();

		/**
		 * The meta object literal for the '<em><b>Min Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_NODE__MIN_WIDTH = eINSTANCE.getCSNode_MinWidth();

		/**
		 * The meta object literal for the '<em><b>Max Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_NODE__MAX_HEIGHT = eINSTANCE.getCSNode_MaxHeight();

		/**
		 * The meta object literal for the '<em><b>Max Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_NODE__MAX_WIDTH = eINSTANCE.getCSNode_MaxWidth();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.impl.CSConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.impl.CSConnectionImpl
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSConnection()
		 * @generated
		 */
		EClass CS_CONNECTION = eINSTANCE.getCSConnection();

		/**
		 * The meta object literal for the '<em><b>Connection Ends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONNECTION__CONNECTION_ENDS = eINSTANCE.getCSConnection_ConnectionEnds();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.impl.CSTextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.impl.CSTextImpl
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSText()
		 * @generated
		 */
		EClass CS_TEXT = eINSTANCE.getCSText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_TEXT__TEXT = eINSTANCE.getCSText_Text();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.impl.CSStrokeImpl <em>Stroke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.impl.CSStrokeImpl
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSStroke()
		 * @generated
		 */
		EClass CS_STROKE = eINSTANCE.getCSStroke();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_STROKE__WIDTH = eINSTANCE.getCSStroke_Width();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_STROKE__JOIN = eINSTANCE.getCSStroke_Join();

		/**
		 * The meta object literal for the '<em><b>Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_STROKE__CAP = eINSTANCE.getCSStroke_Cap();

		/**
		 * The meta object literal for the '<em><b>Miterlimit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_STROKE__MITERLIMIT = eINSTANCE.getCSStroke_Miterlimit();

		/**
		 * The meta object literal for the '<em><b>Dash</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_STROKE__DASH = eINSTANCE.getCSStroke_Dash();

		/**
		 * The meta object literal for the '<em><b>Dash phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_STROKE__DASH_PHASE = eINSTANCE.getCSStroke_Dash_phase();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.impl.CSColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.impl.CSColorImpl
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSColor()
		 * @generated
		 */
		EClass CS_COLOR = eINSTANCE.getCSColor();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_COLOR__R = eINSTANCE.getCSColor_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_COLOR__G = eINSTANCE.getCSColor_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_COLOR__B = eINSTANCE.getCSColor_B();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_COLOR__A = eINSTANCE.getCSColor_A();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.impl.CSShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.impl.CSShapeImpl
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSShape()
		 * @generated
		 */
		EClass CS_SHAPE = eINSTANCE.getCSShape();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_SHAPE__POINTS = eINSTANCE.getCSShape_Points();

		/**
		 * The meta object literal for the '<em><b>Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_SHAPE__CLOSED = eINSTANCE.getCSShape_Closed();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.impl.CSPointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.impl.CSPointImpl
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSPoint()
		 * @generated
		 */
		EClass CS_POINT = eINSTANCE.getCSPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_POINT__X = eINSTANCE.getCSPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_POINT__Y = eINSTANCE.getCSPoint_Y();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.impl.CSTransformImpl <em>Transform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.impl.CSTransformImpl
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSTransform()
		 * @generated
		 */
		EClass CS_TRANSFORM = eINSTANCE.getCSTransform();

		/**
		 * The meta object literal for the '<em><b>M00</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_TRANSFORM__M00 = eINSTANCE.getCSTransform_M00();

		/**
		 * The meta object literal for the '<em><b>M01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_TRANSFORM__M01 = eINSTANCE.getCSTransform_M01();

		/**
		 * The meta object literal for the '<em><b>M02</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_TRANSFORM__M02 = eINSTANCE.getCSTransform_M02();

		/**
		 * The meta object literal for the '<em><b>M10</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_TRANSFORM__M10 = eINSTANCE.getCSTransform_M10();

		/**
		 * The meta object literal for the '<em><b>M11</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_TRANSFORM__M11 = eINSTANCE.getCSTransform_M11();

		/**
		 * The meta object literal for the '<em><b>M12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_TRANSFORM__M12 = eINSTANCE.getCSTransform_M12();

		/**
		 * The meta object literal for the '<em><b>M20</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_TRANSFORM__M20 = eINSTANCE.getCSTransform_M20();

		/**
		 * The meta object literal for the '<em><b>M21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_TRANSFORM__M21 = eINSTANCE.getCSTransform_M21();

		/**
		 * The meta object literal for the '<em><b>M22</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_TRANSFORM__M22 = eINSTANCE.getCSTransform_M22();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.impl.CSTemplateDescriptionImpl <em>Template Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.impl.CSTemplateDescriptionImpl
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSTemplateDescription()
		 * @generated
		 */
		EClass CS_TEMPLATE_DESCRIPTION = eINSTANCE.getCSTemplateDescription();

		/**
		 * The meta object literal for the '<em><b>Container Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_TEMPLATE_DESCRIPTION__CONTAINER_CLASS = eINSTANCE.getCSTemplateDescription_ContainerClass();

		/**
		 * The meta object literal for the '<em><b>The Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_TEMPLATE_DESCRIPTION__THE_CLASS = eINSTANCE.getCSTemplateDescription_TheClass();

		/**
		 * The meta object literal for the '<em><b>Container Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_TEMPLATE_DESCRIPTION__CONTAINER_STRUCTURAL_FEATURE = eINSTANCE.getCSTemplateDescription_ContainerStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_TEMPLATE_DESCRIPTION__SCALE = eINSTANCE.getCSTemplateDescription_Scale();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_TEMPLATE_DESCRIPTION__TEMPLATE = eINSTANCE.getCSTemplateDescription_Template();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.impl.CSLayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.impl.CSLayoutImpl
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSLayout()
		 * @generated
		 */
		EClass CS_LAYOUT = eINSTANCE.getCSLayout();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.impl.CSConnectionEndImpl <em>Connection End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.impl.CSConnectionEndImpl
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSConnectionEnd()
		 * @generated
		 */
		EClass CS_CONNECTION_END = eINSTANCE.getCSConnectionEnd();

		/**
		 * The meta object literal for the '<em><b>Tip Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_CONNECTION_END__TIP_TYPE = eINSTANCE.getCSConnectionEnd_TipType();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONNECTION_END__NODE = eINSTANCE.getCSConnectionEnd_Node();

		/**
		 * The meta object literal for the '<em><b>Conn Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONNECTION_END__CONN_STRUCTURAL_FEATURE = eINSTANCE.getCSConnectionEnd_ConnStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Node Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CONNECTION_END__NODE_STRUCTURAL_FEATURE = eINSTANCE.getCSConnectionEnd_NodeStructuralFeature();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.CSOrientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.CSOrientation
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSOrientation()
		 * @generated
		 */
		EEnum CS_ORIENTATION = eINSTANCE.getCSOrientation();

		/**
		 * The meta object literal for the '{@link cl.ucn.disc.zoome.cs.CSFitType <em>Fit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cl.ucn.disc.zoome.cs.CSFitType
		 * @see cl.ucn.disc.zoome.cs.impl.CSPackageImpl#getCSFitType()
		 * @generated
		 */
		EEnum CS_FIT_TYPE = eINSTANCE.getCSFitType();

	}

} //CSPackage
