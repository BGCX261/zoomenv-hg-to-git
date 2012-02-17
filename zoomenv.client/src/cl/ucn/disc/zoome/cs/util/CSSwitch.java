/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

import cl.ucn.disc.zoome.cs.CSColor;
import cl.ucn.disc.zoome.cs.CSConnection;
import cl.ucn.disc.zoome.cs.CSConnectionEnd;
import cl.ucn.disc.zoome.cs.CSElement;
import cl.ucn.disc.zoome.cs.CSLayout;
import cl.ucn.disc.zoome.cs.CSNode;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cl.ucn.disc.zoome.cs.CSPackage
 * @generated
 */
public class CSSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSSwitch() {
		if (modelPackage == null) {
			modelPackage = CSPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CSPackage.CS_ROOT: {
				CSRoot csRoot = (CSRoot)theEObject;
				T result = caseCSRoot(csRoot);
				if (result == null) result = caseCSElement(csRoot);
				if (result == null) result = caseENamedElement(csRoot);
				if (result == null) result = caseEModelElement(csRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSPackage.CS_ELEMENT: {
				CSElement csElement = (CSElement)theEObject;
				T result = caseCSElement(csElement);
				if (result == null) result = caseENamedElement(csElement);
				if (result == null) result = caseEModelElement(csElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSPackage.CS_NODE: {
				CSNode csNode = (CSNode)theEObject;
				T result = caseCSNode(csNode);
				if (result == null) result = caseCSElement(csNode);
				if (result == null) result = caseENamedElement(csNode);
				if (result == null) result = caseEModelElement(csNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSPackage.CS_CONNECTION: {
				CSConnection csConnection = (CSConnection)theEObject;
				T result = caseCSConnection(csConnection);
				if (result == null) result = caseCSElement(csConnection);
				if (result == null) result = caseENamedElement(csConnection);
				if (result == null) result = caseEModelElement(csConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSPackage.CS_TEXT: {
				CSText csText = (CSText)theEObject;
				T result = caseCSText(csText);
				if (result == null) result = caseCSNode(csText);
				if (result == null) result = caseCSElement(csText);
				if (result == null) result = caseENamedElement(csText);
				if (result == null) result = caseEModelElement(csText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSPackage.CS_STROKE: {
				CSStroke csStroke = (CSStroke)theEObject;
				T result = caseCSStroke(csStroke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSPackage.CS_COLOR: {
				CSColor csColor = (CSColor)theEObject;
				T result = caseCSColor(csColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSPackage.CS_SHAPE: {
				CSShape csShape = (CSShape)theEObject;
				T result = caseCSShape(csShape);
				if (result == null) result = caseENamedElement(csShape);
				if (result == null) result = caseEModelElement(csShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSPackage.CS_POINT: {
				CSPoint csPoint = (CSPoint)theEObject;
				T result = caseCSPoint(csPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSPackage.CS_TRANSFORM: {
				CSTransform csTransform = (CSTransform)theEObject;
				T result = caseCSTransform(csTransform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSPackage.CS_TEMPLATE_DESCRIPTION: {
				CSTemplateDescription csTemplateDescription = (CSTemplateDescription)theEObject;
				T result = caseCSTemplateDescription(csTemplateDescription);
				if (result == null) result = caseCSNode(csTemplateDescription);
				if (result == null) result = caseCSElement(csTemplateDescription);
				if (result == null) result = caseENamedElement(csTemplateDescription);
				if (result == null) result = caseEModelElement(csTemplateDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSPackage.CS_LAYOUT: {
				CSLayout csLayout = (CSLayout)theEObject;
				T result = caseCSLayout(csLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSPackage.CS_CONNECTION_END: {
				CSConnectionEnd csConnectionEnd = (CSConnectionEnd)theEObject;
				T result = caseCSConnectionEnd(csConnectionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSRoot(CSRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSElement(CSElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSNode(CSNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSConnection(CSConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSText(CSText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSStroke(CSStroke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSColor(CSColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSShape(CSShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSPoint(CSPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSTransform(CSTransform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSTemplateDescription(CSTemplateDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSLayout(CSLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSConnectionEnd(CSConnectionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENamedElement(ENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //CSSwitch
