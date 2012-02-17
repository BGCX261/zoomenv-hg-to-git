/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSFactoryImpl extends EFactoryImpl implements CSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CSFactory init() {
		try {
			CSFactory theCSFactory = (CSFactory)EPackage.Registry.INSTANCE.getEFactory("http://disc.ucn.cl/ycsml"); 
			if (theCSFactory != null) {
				return theCSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CSPackage.CS_ROOT: return createCSRoot();
			case CSPackage.CS_ELEMENT: return createCSElement();
			case CSPackage.CS_NODE: return createCSNode();
			case CSPackage.CS_CONNECTION: return createCSConnection();
			case CSPackage.CS_TEXT: return createCSText();
			case CSPackage.CS_STROKE: return createCSStroke();
			case CSPackage.CS_COLOR: return createCSColor();
			case CSPackage.CS_SHAPE: return createCSShape();
			case CSPackage.CS_POINT: return createCSPoint();
			case CSPackage.CS_TRANSFORM: return createCSTransform();
			case CSPackage.CS_TEMPLATE_DESCRIPTION: return createCSTemplateDescription();
			case CSPackage.CS_LAYOUT: return createCSLayout();
			case CSPackage.CS_CONNECTION_END: return createCSConnectionEnd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CSPackage.CS_ORIENTATION:
				return createCSOrientationFromString(eDataType, initialValue);
			case CSPackage.CS_FIT_TYPE:
				return createCSFitTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CSPackage.CS_ORIENTATION:
				return convertCSOrientationToString(eDataType, instanceValue);
			case CSPackage.CS_FIT_TYPE:
				return convertCSFitTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSRoot createCSRoot() {
		CSRootImpl csRoot = new CSRootImpl();
		return csRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSElement createCSElement() {
		CSElementImpl csElement = new CSElementImpl();
		return csElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSNode createCSNode() {
		CSNodeImpl csNode = new CSNodeImpl();
		return csNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSConnection createCSConnection() {
		CSConnectionImpl csConnection = new CSConnectionImpl();
		return csConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSText createCSText() {
		CSTextImpl csText = new CSTextImpl();
		return csText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSStroke createCSStroke() {
		CSStrokeImpl csStroke = new CSStrokeImpl();
		return csStroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSColor createCSColor() {
		CSColorImpl csColor = new CSColorImpl();
		return csColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSShape createCSShape() {
		CSShapeImpl csShape = new CSShapeImpl();
		return csShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSPoint createCSPoint() {
		CSPointImpl csPoint = new CSPointImpl();
		return csPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSTransform createCSTransform() {
		CSTransformImpl csTransform = new CSTransformImpl();
		return csTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSTemplateDescription createCSTemplateDescription() {
		CSTemplateDescriptionImpl csTemplateDescription = new CSTemplateDescriptionImpl();
		return csTemplateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSLayout createCSLayout() {
		CSLayoutImpl csLayout = new CSLayoutImpl();
		return csLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSConnectionEnd createCSConnectionEnd() {
		CSConnectionEndImpl csConnectionEnd = new CSConnectionEndImpl();
		return csConnectionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSOrientation createCSOrientationFromString(EDataType eDataType, String initialValue) {
		CSOrientation result = CSOrientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCSOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSFitType createCSFitTypeFromString(EDataType eDataType, String initialValue) {
		CSFitType result = CSFitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCSFitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSPackage getCSPackage() {
		return (CSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CSPackage getPackage() {
		return CSPackage.eINSTANCE;
	}

} //CSFactoryImpl
