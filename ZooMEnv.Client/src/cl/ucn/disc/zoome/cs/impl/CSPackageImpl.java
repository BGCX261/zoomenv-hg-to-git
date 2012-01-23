/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import cl.ucn.disc.zoome.cs.CSColor;
import cl.ucn.disc.zoome.cs.CSConnection;
import cl.ucn.disc.zoome.cs.CSConnectionEnd;
import cl.ucn.disc.zoome.cs.CSElement;
import cl.ucn.disc.zoome.cs.CSFactory;
import cl.ucn.disc.zoome.cs.CSFitType;
import cl.ucn.disc.zoome.cs.CSLayout;
import cl.ucn.disc.zoome.cs.CSNode;
import cl.ucn.disc.zoome.cs.CSOrientation;
import cl.ucn.disc.zoome.cs.CSPackage;
import cl.ucn.disc.zoome.cs.CSPoint;
import cl.ucn.disc.zoome.cs.CSRoot;
import cl.ucn.disc.zoome.cs.CSShape;
import cl.ucn.disc.zoome.cs.CSStroke;
import cl.ucn.disc.zoome.cs.CSTemplateDescription;
import cl.ucn.disc.zoome.cs.CSText;
import cl.ucn.disc.zoome.cs.CSTransform;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSPackageImpl extends EPackageImpl implements CSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csStrokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csTransformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csTemplateDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csConnectionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum csOrientationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum csFitTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cl.ucn.disc.zoome.cs.CSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CSPackageImpl() {
		super(eNS_URI, CSFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CSPackage init() {
		if (isInited) return (CSPackage)EPackage.Registry.INSTANCE.getEPackage(CSPackage.eNS_URI);

		// Obtain or create and register package
		CSPackageImpl theCSPackage = (CSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CSPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCSPackage.createPackageContents();

		// Initialize created meta-data
		theCSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCSPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CSPackage.eNS_URI, theCSPackage);
		return theCSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSRoot() {
		return csRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSElement() {
		return csElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSElement_Selectable() {
		return (EAttribute)csElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSElement_Stroke() {
		return (EReference)csElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSElement_Children() {
		return (EReference)csElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSElement_Parent() {
		return (EReference)csElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSElement_Draggable() {
		return (EAttribute)csElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSElement_Resizable() {
		return (EAttribute)csElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSElement_Foreground() {
		return (EReference)csElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSElement_Background() {
		return (EReference)csElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSElement_TemplateRoot() {
		return (EAttribute)csElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSElement_Shape() {
		return (EReference)csElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSElement_Transform() {
		return (EReference)csElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSElement_Object() {
		return (EReference)csElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSElement_DisplayedStructuralFeatures() {
		return (EReference)csElementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSElement_Layout() {
		return (EReference)csElementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSElement_MinZoom() {
		return (EAttribute)csElementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSElement_MaxZoom() {
		return (EAttribute)csElementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSNode() {
		return csNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSNode_Connections() {
		return (EReference)csNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSNode_Height() {
		return (EAttribute)csNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSNode_Width() {
		return (EAttribute)csNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSNode_X() {
		return (EAttribute)csNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSNode_Y() {
		return (EAttribute)csNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSNode_HorizontalAlign() {
		return (EAttribute)csNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSNode_VerticalAlign() {
		return (EAttribute)csNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSNode_WidthRatioToParent() {
		return (EAttribute)csNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSNode_HeightRatioToParent() {
		return (EAttribute)csNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSNode_MinHeight() {
		return (EAttribute)csNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSNode_MinWidth() {
		return (EAttribute)csNodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSNode_MaxHeight() {
		return (EAttribute)csNodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSNode_MaxWidth() {
		return (EAttribute)csNodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSConnection() {
		return csConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConnection_ConnectionEnds() {
		return (EReference)csConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSText() {
		return csTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSText_Text() {
		return (EAttribute)csTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSStroke() {
		return csStrokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSStroke_Width() {
		return (EAttribute)csStrokeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSStroke_Join() {
		return (EAttribute)csStrokeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSStroke_Cap() {
		return (EAttribute)csStrokeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSStroke_Miterlimit() {
		return (EAttribute)csStrokeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSStroke_Dash() {
		return (EAttribute)csStrokeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSStroke_Dash_phase() {
		return (EAttribute)csStrokeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSColor() {
		return csColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSColor_R() {
		return (EAttribute)csColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSColor_G() {
		return (EAttribute)csColorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSColor_B() {
		return (EAttribute)csColorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSColor_A() {
		return (EAttribute)csColorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSShape() {
		return csShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSShape_Points() {
		return (EReference)csShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSShape_Closed() {
		return (EAttribute)csShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSPoint() {
		return csPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSPoint_X() {
		return (EAttribute)csPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSPoint_Y() {
		return (EAttribute)csPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSTransform() {
		return csTransformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSTransform_M00() {
		return (EAttribute)csTransformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSTransform_M01() {
		return (EAttribute)csTransformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSTransform_M02() {
		return (EAttribute)csTransformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSTransform_M10() {
		return (EAttribute)csTransformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSTransform_M11() {
		return (EAttribute)csTransformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSTransform_M12() {
		return (EAttribute)csTransformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSTransform_M20() {
		return (EAttribute)csTransformEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSTransform_M21() {
		return (EAttribute)csTransformEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSTransform_M22() {
		return (EAttribute)csTransformEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSTemplateDescription() {
		return csTemplateDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSTemplateDescription_ContainerClass() {
		return (EReference)csTemplateDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSTemplateDescription_TheClass() {
		return (EReference)csTemplateDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSTemplateDescription_ContainerStructuralFeature() {
		return (EReference)csTemplateDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSTemplateDescription_Scale() {
		return (EAttribute)csTemplateDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSTemplateDescription_Template() {
		return (EReference)csTemplateDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSLayout() {
		return csLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSConnectionEnd() {
		return csConnectionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSConnectionEnd_TipType() {
		return (EAttribute)csConnectionEndEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConnectionEnd_Node() {
		return (EReference)csConnectionEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConnectionEnd_ConnStructuralFeature() {
		return (EReference)csConnectionEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSConnectionEnd_NodeStructuralFeature() {
		return (EReference)csConnectionEndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCSOrientation() {
		return csOrientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCSFitType() {
		return csFitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSFactory getCSFactory() {
		return (CSFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		csRootEClass = createEClass(CS_ROOT);

		csElementEClass = createEClass(CS_ELEMENT);
		createEAttribute(csElementEClass, CS_ELEMENT__SELECTABLE);
		createEReference(csElementEClass, CS_ELEMENT__STROKE);
		createEReference(csElementEClass, CS_ELEMENT__CHILDREN);
		createEReference(csElementEClass, CS_ELEMENT__PARENT);
		createEAttribute(csElementEClass, CS_ELEMENT__DRAGGABLE);
		createEAttribute(csElementEClass, CS_ELEMENT__RESIZABLE);
		createEReference(csElementEClass, CS_ELEMENT__FOREGROUND);
		createEReference(csElementEClass, CS_ELEMENT__BACKGROUND);
		createEAttribute(csElementEClass, CS_ELEMENT__TEMPLATE_ROOT);
		createEReference(csElementEClass, CS_ELEMENT__SHAPE);
		createEReference(csElementEClass, CS_ELEMENT__TRANSFORM);
		createEReference(csElementEClass, CS_ELEMENT__OBJECT);
		createEReference(csElementEClass, CS_ELEMENT__DISPLAYED_STRUCTURAL_FEATURES);
		createEReference(csElementEClass, CS_ELEMENT__LAYOUT);
		createEAttribute(csElementEClass, CS_ELEMENT__MIN_ZOOM);
		createEAttribute(csElementEClass, CS_ELEMENT__MAX_ZOOM);

		csNodeEClass = createEClass(CS_NODE);
		createEReference(csNodeEClass, CS_NODE__CONNECTIONS);
		createEAttribute(csNodeEClass, CS_NODE__HEIGHT);
		createEAttribute(csNodeEClass, CS_NODE__WIDTH);
		createEAttribute(csNodeEClass, CS_NODE__X);
		createEAttribute(csNodeEClass, CS_NODE__Y);
		createEAttribute(csNodeEClass, CS_NODE__HORIZONTAL_ALIGN);
		createEAttribute(csNodeEClass, CS_NODE__VERTICAL_ALIGN);
		createEAttribute(csNodeEClass, CS_NODE__WIDTH_RATIO_TO_PARENT);
		createEAttribute(csNodeEClass, CS_NODE__HEIGHT_RATIO_TO_PARENT);
		createEAttribute(csNodeEClass, CS_NODE__MIN_HEIGHT);
		createEAttribute(csNodeEClass, CS_NODE__MAX_HEIGHT);
		createEAttribute(csNodeEClass, CS_NODE__MIN_WIDTH);
		createEAttribute(csNodeEClass, CS_NODE__MAX_WIDTH);

		csConnectionEClass = createEClass(CS_CONNECTION);
		createEReference(csConnectionEClass, CS_CONNECTION__CONNECTION_ENDS);

		csTextEClass = createEClass(CS_TEXT);
		createEAttribute(csTextEClass, CS_TEXT__TEXT);

		csStrokeEClass = createEClass(CS_STROKE);
		createEAttribute(csStrokeEClass, CS_STROKE__WIDTH);
		createEAttribute(csStrokeEClass, CS_STROKE__JOIN);
		createEAttribute(csStrokeEClass, CS_STROKE__CAP);
		createEAttribute(csStrokeEClass, CS_STROKE__MITERLIMIT);
		createEAttribute(csStrokeEClass, CS_STROKE__DASH);
		createEAttribute(csStrokeEClass, CS_STROKE__DASH_PHASE);

		csColorEClass = createEClass(CS_COLOR);
		createEAttribute(csColorEClass, CS_COLOR__R);
		createEAttribute(csColorEClass, CS_COLOR__G);
		createEAttribute(csColorEClass, CS_COLOR__B);
		createEAttribute(csColorEClass, CS_COLOR__A);

		csShapeEClass = createEClass(CS_SHAPE);
		createEReference(csShapeEClass, CS_SHAPE__POINTS);
		createEAttribute(csShapeEClass, CS_SHAPE__CLOSED);

		csPointEClass = createEClass(CS_POINT);
		createEAttribute(csPointEClass, CS_POINT__X);
		createEAttribute(csPointEClass, CS_POINT__Y);

		csTransformEClass = createEClass(CS_TRANSFORM);
		createEAttribute(csTransformEClass, CS_TRANSFORM__M00);
		createEAttribute(csTransformEClass, CS_TRANSFORM__M01);
		createEAttribute(csTransformEClass, CS_TRANSFORM__M02);
		createEAttribute(csTransformEClass, CS_TRANSFORM__M10);
		createEAttribute(csTransformEClass, CS_TRANSFORM__M11);
		createEAttribute(csTransformEClass, CS_TRANSFORM__M12);
		createEAttribute(csTransformEClass, CS_TRANSFORM__M20);
		createEAttribute(csTransformEClass, CS_TRANSFORM__M21);
		createEAttribute(csTransformEClass, CS_TRANSFORM__M22);

		csTemplateDescriptionEClass = createEClass(CS_TEMPLATE_DESCRIPTION);
		createEReference(csTemplateDescriptionEClass, CS_TEMPLATE_DESCRIPTION__CONTAINER_CLASS);
		createEReference(csTemplateDescriptionEClass, CS_TEMPLATE_DESCRIPTION__THE_CLASS);
		createEReference(csTemplateDescriptionEClass, CS_TEMPLATE_DESCRIPTION__CONTAINER_STRUCTURAL_FEATURE);
		createEAttribute(csTemplateDescriptionEClass, CS_TEMPLATE_DESCRIPTION__SCALE);
		createEReference(csTemplateDescriptionEClass, CS_TEMPLATE_DESCRIPTION__TEMPLATE);

		csLayoutEClass = createEClass(CS_LAYOUT);

		csConnectionEndEClass = createEClass(CS_CONNECTION_END);
		createEReference(csConnectionEndEClass, CS_CONNECTION_END__NODE);
		createEReference(csConnectionEndEClass, CS_CONNECTION_END__CONN_STRUCTURAL_FEATURE);
		createEReference(csConnectionEndEClass, CS_CONNECTION_END__NODE_STRUCTURAL_FEATURE);
		createEAttribute(csConnectionEndEClass, CS_CONNECTION_END__TIP_TYPE);

		// Create enums
		csOrientationEEnum = createEEnum(CS_ORIENTATION);
		csFitTypeEEnum = createEEnum(CS_FIT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		csRootEClass.getESuperTypes().add(this.getCSElement());
		csElementEClass.getESuperTypes().add(theEcorePackage.getENamedElement());
		csNodeEClass.getESuperTypes().add(this.getCSElement());
		csConnectionEClass.getESuperTypes().add(this.getCSElement());
		csTextEClass.getESuperTypes().add(this.getCSNode());
		csShapeEClass.getESuperTypes().add(theEcorePackage.getENamedElement());
		csTemplateDescriptionEClass.getESuperTypes().add(this.getCSNode());

		// Initialize classes and features; add operations and parameters
		initEClass(csRootEClass, CSRoot.class, "CSRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(csElementEClass, CSElement.class, "CSElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSElement_Selectable(), ecorePackage.getEBooleanObject(), "selectable", "true", 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSElement_Stroke(), this.getCSStroke(), null, "stroke", null, 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSElement_Children(), this.getCSElement(), this.getCSElement_Parent(), "children", null, 0, -1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSElement_Parent(), this.getCSElement(), this.getCSElement_Children(), "parent", null, 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSElement_Draggable(), theEcorePackage.getEBoolean(), "draggable", "true", 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSElement_Resizable(), theEcorePackage.getEBoolean(), "resizable", "true", 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSElement_Foreground(), this.getCSColor(), null, "foreground", null, 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSElement_Background(), this.getCSColor(), null, "background", null, 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSElement_TemplateRoot(), theEcorePackage.getEBoolean(), "templateRoot", "false", 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSElement_Shape(), this.getCSShape(), null, "shape", null, 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSElement_Transform(), this.getCSTransform(), null, "transform", null, 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSElement_Object(), theEcorePackage.getEObject(), null, "object", null, 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSElement_DisplayedStructuralFeatures(), theEcorePackage.getEStructuralFeature(), null, "displayedStructuralFeatures", null, 0, -1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSElement_Layout(), this.getCSLayout(), null, "layout", null, 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSElement_MinZoom(), ecorePackage.getEDoubleObject(), "minZoom", "-1.7976931348623157e+308", 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSElement_MaxZoom(), ecorePackage.getEDoubleObject(), "maxZoom", "1.7976931348623157e+308", 0, 1, CSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csNodeEClass, CSNode.class, "CSNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSNode_Connections(), this.getCSConnection(), null, "connections", null, 0, -1, CSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSNode_Height(), ecorePackage.getEDoubleObject(), "height", "50", 0, 1, CSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSNode_Width(), ecorePackage.getEDoubleObject(), "width", "100", 0, 1, CSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSNode_X(), ecorePackage.getEDoubleObject(), "x", "0", 0, 1, CSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSNode_Y(), ecorePackage.getEDoubleObject(), "y", "0", 0, 1, CSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSNode_HorizontalAlign(), ecorePackage.getEDoubleObject(), "horizontalAlign", null, 0, 1, CSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSNode_VerticalAlign(), ecorePackage.getEDoubleObject(), "verticalAlign", null, 0, 1, CSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSNode_WidthRatioToParent(), ecorePackage.getEDoubleObject(), "widthRatioToParent", null, 0, 1, CSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSNode_HeightRatioToParent(), ecorePackage.getEDoubleObject(), "heightRatioToParent", null, 0, 1, CSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSNode_MinHeight(), ecorePackage.getEDoubleObject(), "minHeight", null, 0, 1, CSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSNode_MaxHeight(), ecorePackage.getEDoubleObject(), "maxHeight", null, 0, 1, CSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSNode_MinWidth(), ecorePackage.getEDoubleObject(), "minWidth", null, 0, 1, CSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSNode_MaxWidth(), ecorePackage.getEDoubleObject(), "maxWidth", null, 0, 1, CSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csConnectionEClass, CSConnection.class, "CSConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSConnection_ConnectionEnds(), this.getCSConnectionEnd(), null, "connectionEnds", null, 2, -1, CSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csTextEClass, CSText.class, "CSText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSText_Text(), ecorePackage.getEString(), "text", null, 0, 1, CSText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csStrokeEClass, CSStroke.class, "CSStroke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSStroke_Width(), theEcorePackage.getEFloat(), "width", "1.0", 0, 1, CSStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSStroke_Join(), theEcorePackage.getEInt(), "join", "1", 0, 1, CSStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSStroke_Cap(), theEcorePackage.getEInt(), "cap", "1", 0, 1, CSStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSStroke_Miterlimit(), theEcorePackage.getEFloat(), "miterlimit", "10.0", 0, 1, CSStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSStroke_Dash(), ecorePackage.getEFloat(), "dash", null, 0, -1, CSStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSStroke_Dash_phase(), theEcorePackage.getEFloat(), "dash_phase", null, 0, 1, CSStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csColorEClass, CSColor.class, "CSColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSColor_R(), theEcorePackage.getEDouble(), "r", null, 0, 1, CSColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSColor_G(), theEcorePackage.getEDouble(), "g", null, 0, 1, CSColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSColor_B(), ecorePackage.getEDouble(), "b", null, 0, 1, CSColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSColor_A(), ecorePackage.getEDouble(), "a", null, 0, 1, CSColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csShapeEClass, CSShape.class, "CSShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSShape_Points(), this.getCSPoint(), null, "points", null, 0, -1, CSShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSShape_Closed(), ecorePackage.getEBoolean(), "closed", "false", 0, 1, CSShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csPointEClass, CSPoint.class, "CSPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSPoint_X(), theEcorePackage.getEDouble(), "x", null, 0, 1, CSPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSPoint_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, CSPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csTransformEClass, CSTransform.class, "CSTransform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSTransform_M00(), theEcorePackage.getEDouble(), "m00", null, 0, 1, CSTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSTransform_M01(), theEcorePackage.getEDouble(), "m01", null, 0, 1, CSTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSTransform_M02(), theEcorePackage.getEDouble(), "m02", null, 0, 1, CSTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSTransform_M10(), theEcorePackage.getEDouble(), "m10", null, 0, 1, CSTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSTransform_M11(), theEcorePackage.getEDouble(), "m11", null, 0, 1, CSTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSTransform_M12(), theEcorePackage.getEDouble(), "m12", null, 0, 1, CSTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSTransform_M20(), theEcorePackage.getEDouble(), "m20", null, 0, 1, CSTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSTransform_M21(), theEcorePackage.getEDouble(), "m21", null, 0, 1, CSTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSTransform_M22(), theEcorePackage.getEDouble(), "m22", null, 0, 1, CSTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csTemplateDescriptionEClass, CSTemplateDescription.class, "CSTemplateDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSTemplateDescription_ContainerClass(), theEcorePackage.getEClass(), null, "containerClass", null, 0, 1, CSTemplateDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSTemplateDescription_TheClass(), theEcorePackage.getEClass(), null, "theClass", null, 0, 1, CSTemplateDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSTemplateDescription_ContainerStructuralFeature(), theEcorePackage.getEStructuralFeature(), null, "containerStructuralFeature", null, 0, 1, CSTemplateDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSTemplateDescription_Scale(), theEcorePackage.getEDouble(), "scale", "1", 0, 1, CSTemplateDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSTemplateDescription_Template(), this.getCSElement(), null, "template", null, 0, 1, CSTemplateDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csLayoutEClass, CSLayout.class, "CSLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(csConnectionEndEClass, CSConnectionEnd.class, "CSConnectionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSConnectionEnd_Node(), this.getCSNode(), null, "node", null, 0, 1, CSConnectionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSConnectionEnd_ConnStructuralFeature(), theEcorePackage.getEStructuralFeature(), null, "connStructuralFeature", null, 0, 1, CSConnectionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSConnectionEnd_NodeStructuralFeature(), theEcorePackage.getEStructuralFeature(), null, "nodeStructuralFeature", null, 0, 1, CSConnectionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSConnectionEnd_TipType(), theEcorePackage.getEInt(), "tipType", null, 0, 1, CSConnectionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(csOrientationEEnum, CSOrientation.class, "CSOrientation");
		addEEnumLiteral(csOrientationEEnum, CSOrientation.VERTICAL);
		addEEnumLiteral(csOrientationEEnum, CSOrientation.HORIZONTAL);

		initEEnum(csFitTypeEEnum, CSFitType.class, "CSFitType");
		addEEnumLiteral(csFitTypeEEnum, CSFitType.AUTO_EXPAND);
		addEEnumLiteral(csFitTypeEEnum, CSFitType.FIT_TO_CHILDREN);

		// Create resource
		createResource(eNS_URI);
	}

} //CSPackageImpl
