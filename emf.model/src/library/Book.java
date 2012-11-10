/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package library;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link library.Book#getAuthor <em>Author</em>}</li>
 *   <li>{@link library.Book#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see library.LibraryPackage#getBook()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Book extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference list.
	 * The list contents are of type {@link library.Author}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference list.
	 * @see library.LibraryPackage#getBook_Author()
	 * @model type="library.Author"
	 * @generated
	 */
	EList getAuthor();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see library.LibraryPackage#getBook_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link library.Book#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Book
