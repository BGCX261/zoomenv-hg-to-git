/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSText#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSText()
 * @model
 * @generated
 */
public interface CSText extends CSNode {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSText_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSText#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // CSText
