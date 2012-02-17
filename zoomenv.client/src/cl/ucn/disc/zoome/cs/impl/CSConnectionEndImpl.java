/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import cl.ucn.disc.zoome.cs.CSConnectionEnd;
import cl.ucn.disc.zoome.cs.CSNode;
import cl.ucn.disc.zoome.cs.CSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSConnectionEndImpl#getNode <em>Node</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSConnectionEndImpl#getConnStructuralFeature <em>Conn Structural Feature</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSConnectionEndImpl#getNodeStructuralFeature <em>Node Structural Feature</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSConnectionEndImpl#getTipType <em>Tip Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSConnectionEndImpl extends EObjectImpl implements CSConnectionEnd {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected CSNode node;

	/**
	 * The cached value of the '{@link #getConnStructuralFeature() <em>Conn Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnStructuralFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature connStructuralFeature;

	/**
	 * The cached value of the '{@link #getNodeStructuralFeature() <em>Node Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeStructuralFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature nodeStructuralFeature;

	/**
	 * The default value of the '{@link #getTipType() <em>Tip Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipType()
	 * @generated
	 * @ordered
	 */
	protected static final int TIP_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTipType() <em>Tip Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipType()
	 * @generated
	 * @ordered
	 */
	protected int tipType = TIP_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSConnectionEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSPackage.Literals.CS_CONNECTION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTipType() {
		return tipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipType(int newTipType) {
		int oldTipType = tipType;
		tipType = newTipType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_CONNECTION_END__TIP_TYPE, oldTipType, tipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSNode getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (CSNode)eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSPackage.CS_CONNECTION_END__NODE, oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSNode basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(CSNode newNode) {
		CSNode oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_CONNECTION_END__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getConnStructuralFeature() {
		if (connStructuralFeature != null && connStructuralFeature.eIsProxy()) {
			InternalEObject oldConnStructuralFeature = (InternalEObject)connStructuralFeature;
			connStructuralFeature = (EStructuralFeature)eResolveProxy(oldConnStructuralFeature);
			if (connStructuralFeature != oldConnStructuralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSPackage.CS_CONNECTION_END__CONN_STRUCTURAL_FEATURE, oldConnStructuralFeature, connStructuralFeature));
			}
		}
		return connStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetConnStructuralFeature() {
		return connStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnStructuralFeature(EStructuralFeature newConnStructuralFeature) {
		EStructuralFeature oldConnStructuralFeature = connStructuralFeature;
		connStructuralFeature = newConnStructuralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_CONNECTION_END__CONN_STRUCTURAL_FEATURE, oldConnStructuralFeature, connStructuralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getNodeStructuralFeature() {
		if (nodeStructuralFeature != null && nodeStructuralFeature.eIsProxy()) {
			InternalEObject oldNodeStructuralFeature = (InternalEObject)nodeStructuralFeature;
			nodeStructuralFeature = (EStructuralFeature)eResolveProxy(oldNodeStructuralFeature);
			if (nodeStructuralFeature != oldNodeStructuralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSPackage.CS_CONNECTION_END__NODE_STRUCTURAL_FEATURE, oldNodeStructuralFeature, nodeStructuralFeature));
			}
		}
		return nodeStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetNodeStructuralFeature() {
		return nodeStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeStructuralFeature(EStructuralFeature newNodeStructuralFeature) {
		EStructuralFeature oldNodeStructuralFeature = nodeStructuralFeature;
		nodeStructuralFeature = newNodeStructuralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_CONNECTION_END__NODE_STRUCTURAL_FEATURE, oldNodeStructuralFeature, nodeStructuralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSPackage.CS_CONNECTION_END__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case CSPackage.CS_CONNECTION_END__CONN_STRUCTURAL_FEATURE:
				if (resolve) return getConnStructuralFeature();
				return basicGetConnStructuralFeature();
			case CSPackage.CS_CONNECTION_END__NODE_STRUCTURAL_FEATURE:
				if (resolve) return getNodeStructuralFeature();
				return basicGetNodeStructuralFeature();
			case CSPackage.CS_CONNECTION_END__TIP_TYPE:
				return getTipType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CSPackage.CS_CONNECTION_END__NODE:
				setNode((CSNode)newValue);
				return;
			case CSPackage.CS_CONNECTION_END__CONN_STRUCTURAL_FEATURE:
				setConnStructuralFeature((EStructuralFeature)newValue);
				return;
			case CSPackage.CS_CONNECTION_END__NODE_STRUCTURAL_FEATURE:
				setNodeStructuralFeature((EStructuralFeature)newValue);
				return;
			case CSPackage.CS_CONNECTION_END__TIP_TYPE:
				setTipType((Integer)newValue);
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
			case CSPackage.CS_CONNECTION_END__NODE:
				setNode((CSNode)null);
				return;
			case CSPackage.CS_CONNECTION_END__CONN_STRUCTURAL_FEATURE:
				setConnStructuralFeature((EStructuralFeature)null);
				return;
			case CSPackage.CS_CONNECTION_END__NODE_STRUCTURAL_FEATURE:
				setNodeStructuralFeature((EStructuralFeature)null);
				return;
			case CSPackage.CS_CONNECTION_END__TIP_TYPE:
				setTipType(TIP_TYPE_EDEFAULT);
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
			case CSPackage.CS_CONNECTION_END__NODE:
				return node != null;
			case CSPackage.CS_CONNECTION_END__CONN_STRUCTURAL_FEATURE:
				return connStructuralFeature != null;
			case CSPackage.CS_CONNECTION_END__NODE_STRUCTURAL_FEATURE:
				return nodeStructuralFeature != null;
			case CSPackage.CS_CONNECTION_END__TIP_TYPE:
				return tipType != TIP_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tipType: ");
		result.append(tipType);
		result.append(')');
		return result.toString();
	}

} //CSConnectionEndImpl
