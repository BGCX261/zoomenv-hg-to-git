/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stroke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSStroke#getWidth <em>Width</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSStroke#getJoin <em>Join</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSStroke#getCap <em>Cap</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSStroke#getMiterlimit <em>Miterlimit</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSStroke#getDash <em>Dash</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSStroke#getDash_phase <em>Dash phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSStroke()
 * @model
 * @generated
 */
public interface CSStroke extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSStroke_Width()
	 * @model default="1.0"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSStroke#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Join</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' attribute.
	 * @see #setJoin(int)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSStroke_Join()
	 * @model default="1"
	 * @generated
	 */
	int getJoin();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSStroke#getJoin <em>Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join</em>' attribute.
	 * @see #getJoin()
	 * @generated
	 */
	void setJoin(int value);

	/**
	 * Returns the value of the '<em><b>Cap</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap</em>' attribute.
	 * @see #setCap(int)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSStroke_Cap()
	 * @model default="1"
	 * @generated
	 */
	int getCap();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSStroke#getCap <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap</em>' attribute.
	 * @see #getCap()
	 * @generated
	 */
	void setCap(int value);

	/**
	 * Returns the value of the '<em><b>Miterlimit</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Miterlimit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miterlimit</em>' attribute.
	 * @see #setMiterlimit(float)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSStroke_Miterlimit()
	 * @model default="10.0"
	 * @generated
	 */
	float getMiterlimit();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSStroke#getMiterlimit <em>Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Miterlimit</em>' attribute.
	 * @see #getMiterlimit()
	 * @generated
	 */
	void setMiterlimit(float value);

	/**
	 * Returns the value of the '<em><b>Dash</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dash</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dash</em>' attribute list.
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSStroke_Dash()
	 * @model
	 * @generated
	 */
	EList<Float> getDash();

	/**
	 * Returns the value of the '<em><b>Dash phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dash phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dash phase</em>' attribute.
	 * @see #setDash_phase(float)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSStroke_Dash_phase()
	 * @model
	 * @generated
	 */
	float getDash_phase();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSStroke#getDash_phase <em>Dash phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dash phase</em>' attribute.
	 * @see #getDash_phase()
	 * @generated
	 */
	void setDash_phase(float value);

} // CSStroke
