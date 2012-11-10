/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package library.impl;

import library.Library;
import library.LibraryPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link library.impl.LibraryImpl#getListAuthor <em>List Author</em>}</li>
 *   <li>{@link library.impl.LibraryImpl#getListBook <em>List Book</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryImpl extends CDOObjectImpl implements Library {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getListAuthor() {
		return (EList)eGet(LibraryPackage.Literals.LIBRARY__LIST_AUTHOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getListBook() {
		return (EList)eGet(LibraryPackage.Literals.LIBRARY__LIST_BOOK, true);
	}

} //LibraryImpl
