/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSConnection#getConnectionEnds <em>Connection Ends</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSConnection()
 * @model
 * @generated
 */
public interface CSConnection extends CSElement {
	/**
	 * Returns the value of the '<em><b>Connection Ends</b></em>' containment reference list.
	 * The list contents are of type {@link cl.ucn.disc.zoome.cs.CSConnectionEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Ends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Ends</em>' containment reference list.
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSConnection_ConnectionEnds()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<CSConnectionEnd> getConnectionEnds();

} // CSConnection
