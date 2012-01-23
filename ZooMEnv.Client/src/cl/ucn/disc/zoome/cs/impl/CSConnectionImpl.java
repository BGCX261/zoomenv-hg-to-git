/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import cl.ucn.disc.zoome.cs.CSConnection;
import cl.ucn.disc.zoome.cs.CSConnectionEnd;
import cl.ucn.disc.zoome.cs.CSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSConnectionImpl#getConnectionEnds <em>Connection Ends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSConnectionImpl extends CSElementImpl implements CSConnection {
	/**
	 * The cached value of the '{@link #getConnectionEnds() <em>Connection Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<CSConnectionEnd> connectionEnds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSPackage.Literals.CS_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSConnectionEnd> getConnectionEnds() {
		if (connectionEnds == null) {
			connectionEnds = new EObjectContainmentEList<CSConnectionEnd>(CSConnectionEnd.class, this, CSPackage.CS_CONNECTION__CONNECTION_ENDS);
		}
		return connectionEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CSPackage.CS_CONNECTION__CONNECTION_ENDS:
				return ((InternalEList<?>)getConnectionEnds()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSPackage.CS_CONNECTION__CONNECTION_ENDS:
				return getConnectionEnds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CSPackage.CS_CONNECTION__CONNECTION_ENDS:
				getConnectionEnds().clear();
				getConnectionEnds().addAll((Collection<? extends CSConnectionEnd>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CSPackage.CS_CONNECTION__CONNECTION_ENDS:
				getConnectionEnds().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CSPackage.CS_CONNECTION__CONNECTION_ENDS:
				return connectionEnds != null && !connectionEnds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CSConnectionImpl
