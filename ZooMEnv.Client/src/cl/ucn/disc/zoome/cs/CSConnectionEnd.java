/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSConnectionEnd#getNode <em>Node</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSConnectionEnd#getConnStructuralFeature <em>Conn Structural Feature</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSConnectionEnd#getNodeStructuralFeature <em>Node Structural Feature</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSConnectionEnd#getTipType <em>Tip Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSConnectionEnd()
 * @model
 * @generated
 */
public interface CSConnectionEnd extends EObject {
	/**
	 * Returns the value of the '<em><b>Tip Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tip Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tip Type</em>' attribute.
	 * @see #setTipType(int)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSConnectionEnd_TipType()
	 * @model
	 * @generated
	 */
	int getTipType();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSConnectionEnd#getTipType <em>Tip Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tip Type</em>' attribute.
	 * @see #getTipType()
	 * @generated
	 */
	void setTipType(int value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(CSNode)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSConnectionEnd_Node()
	 * @model
	 * @generated
	 */
	CSNode getNode();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSConnectionEnd#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(CSNode value);

	/**
	 * Returns the value of the '<em><b>Conn Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conn Structural Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn Structural Feature</em>' reference.
	 * @see #setConnStructuralFeature(EStructuralFeature)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSConnectionEnd_ConnStructuralFeature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getConnStructuralFeature();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSConnectionEnd#getConnStructuralFeature <em>Conn Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn Structural Feature</em>' reference.
	 * @see #getConnStructuralFeature()
	 * @generated
	 */
	void setConnStructuralFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Node Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Structural Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Structural Feature</em>' reference.
	 * @see #setNodeStructuralFeature(EStructuralFeature)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSConnectionEnd_NodeStructuralFeature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getNodeStructuralFeature();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSConnectionEnd#getNodeStructuralFeature <em>Node Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Structural Feature</em>' reference.
	 * @see #getNodeStructuralFeature()
	 * @generated
	 */
	void setNodeStructuralFeature(EStructuralFeature value);

} // CSConnectionEnd
