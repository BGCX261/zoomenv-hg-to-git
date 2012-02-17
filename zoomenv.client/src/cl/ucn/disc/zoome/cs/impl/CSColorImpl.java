/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import cl.ucn.disc.zoome.cs.CSColor;
import cl.ucn.disc.zoome.cs.CSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSColorImpl#getR <em>R</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSColorImpl#getG <em>G</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSColorImpl#getB <em>B</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSColorImpl#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSColorImpl extends EObjectImpl implements CSColor {
	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final double R_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected double r = R_EDEFAULT;

	/**
	 * The default value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected static final double G_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected double g = G_EDEFAULT;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final double B_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected double b = B_EDEFAULT;

	/**
	 * The default value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected static final double A_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected double a = A_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSPackage.Literals.CS_COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(double newR) {
		double oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_COLOR__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getG() {
		return g;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(double newG) {
		double oldG = g;
		g = newG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_COLOR__G, oldG, g));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(double newB) {
		double oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_COLOR__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(double newA) {
		double oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_COLOR__A, oldA, a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSPackage.CS_COLOR__R:
				return getR();
			case CSPackage.CS_COLOR__G:
				return getG();
			case CSPackage.CS_COLOR__B:
				return getB();
			case CSPackage.CS_COLOR__A:
				return getA();
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
			case CSPackage.CS_COLOR__R:
				setR((Double)newValue);
				return;
			case CSPackage.CS_COLOR__G:
				setG((Double)newValue);
				return;
			case CSPackage.CS_COLOR__B:
				setB((Double)newValue);
				return;
			case CSPackage.CS_COLOR__A:
				setA((Double)newValue);
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
			case CSPackage.CS_COLOR__R:
				setR(R_EDEFAULT);
				return;
			case CSPackage.CS_COLOR__G:
				setG(G_EDEFAULT);
				return;
			case CSPackage.CS_COLOR__B:
				setB(B_EDEFAULT);
				return;
			case CSPackage.CS_COLOR__A:
				setA(A_EDEFAULT);
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
			case CSPackage.CS_COLOR__R:
				return r != R_EDEFAULT;
			case CSPackage.CS_COLOR__G:
				return g != G_EDEFAULT;
			case CSPackage.CS_COLOR__B:
				return b != B_EDEFAULT;
			case CSPackage.CS_COLOR__A:
				return a != A_EDEFAULT;
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
		result.append(" (r: ");
		result.append(r);
		result.append(", g: ");
		result.append(g);
		result.append(", b: ");
		result.append(b);
		result.append(", a: ");
		result.append(a);
		result.append(')');
		return result.toString();
	}

} //CSColorImpl
