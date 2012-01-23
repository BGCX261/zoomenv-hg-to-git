/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import cl.ucn.disc.zoome.cs.CSPackage;
import cl.ucn.disc.zoome.cs.CSStroke;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stroke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSStrokeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSStrokeImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSStrokeImpl#getCap <em>Cap</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSStrokeImpl#getMiterlimit <em>Miterlimit</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSStrokeImpl#getDash <em>Dash</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSStrokeImpl#getDash_phase <em>Dash phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSStrokeImpl extends EObjectImpl implements CSStroke {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getJoin() <em>Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoin()
	 * @generated
	 * @ordered
	 */
	protected static final int JOIN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getJoin() <em>Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoin()
	 * @generated
	 * @ordered
	 */
	protected int join = JOIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCap() <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
	protected static final int CAP_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCap() <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
	protected int cap = CAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiterlimit() <em>Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiterlimit()
	 * @generated
	 * @ordered
	 */
	protected static final float MITERLIMIT_EDEFAULT = 10.0F;

	/**
	 * The cached value of the '{@link #getMiterlimit() <em>Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiterlimit()
	 * @generated
	 * @ordered
	 */
	protected float miterlimit = MITERLIMIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDash() <em>Dash</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDash()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> dash;

	/**
	 * The default value of the '{@link #getDash_phase() <em>Dash phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDash_phase()
	 * @generated
	 * @ordered
	 */
	protected static final float DASH_PHASE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDash_phase() <em>Dash phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDash_phase()
	 * @generated
	 * @ordered
	 */
	protected float dash_phase = DASH_PHASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSStrokeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSPackage.Literals.CS_STROKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_STROKE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJoin() {
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoin(int newJoin) {
		int oldJoin = join;
		join = newJoin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_STROKE__JOIN, oldJoin, join));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCap() {
		return cap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCap(int newCap) {
		int oldCap = cap;
		cap = newCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_STROKE__CAP, oldCap, cap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMiterlimit() {
		return miterlimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiterlimit(float newMiterlimit) {
		float oldMiterlimit = miterlimit;
		miterlimit = newMiterlimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_STROKE__MITERLIMIT, oldMiterlimit, miterlimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getDash() {
		if (dash == null) {
			dash = new EDataTypeUniqueEList<Float>(Float.class, this, CSPackage.CS_STROKE__DASH);
		}
		return dash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDash_phase() {
		return dash_phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDash_phase(float newDash_phase) {
		float oldDash_phase = dash_phase;
		dash_phase = newDash_phase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_STROKE__DASH_PHASE, oldDash_phase, dash_phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSPackage.CS_STROKE__WIDTH:
				return getWidth();
			case CSPackage.CS_STROKE__JOIN:
				return getJoin();
			case CSPackage.CS_STROKE__CAP:
				return getCap();
			case CSPackage.CS_STROKE__MITERLIMIT:
				return getMiterlimit();
			case CSPackage.CS_STROKE__DASH:
				return getDash();
			case CSPackage.CS_STROKE__DASH_PHASE:
				return getDash_phase();
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
			case CSPackage.CS_STROKE__WIDTH:
				setWidth((Float)newValue);
				return;
			case CSPackage.CS_STROKE__JOIN:
				setJoin((Integer)newValue);
				return;
			case CSPackage.CS_STROKE__CAP:
				setCap((Integer)newValue);
				return;
			case CSPackage.CS_STROKE__MITERLIMIT:
				setMiterlimit((Float)newValue);
				return;
			case CSPackage.CS_STROKE__DASH:
				getDash().clear();
				getDash().addAll((Collection<? extends Float>)newValue);
				return;
			case CSPackage.CS_STROKE__DASH_PHASE:
				setDash_phase((Float)newValue);
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
			case CSPackage.CS_STROKE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case CSPackage.CS_STROKE__JOIN:
				setJoin(JOIN_EDEFAULT);
				return;
			case CSPackage.CS_STROKE__CAP:
				setCap(CAP_EDEFAULT);
				return;
			case CSPackage.CS_STROKE__MITERLIMIT:
				setMiterlimit(MITERLIMIT_EDEFAULT);
				return;
			case CSPackage.CS_STROKE__DASH:
				getDash().clear();
				return;
			case CSPackage.CS_STROKE__DASH_PHASE:
				setDash_phase(DASH_PHASE_EDEFAULT);
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
			case CSPackage.CS_STROKE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case CSPackage.CS_STROKE__JOIN:
				return join != JOIN_EDEFAULT;
			case CSPackage.CS_STROKE__CAP:
				return cap != CAP_EDEFAULT;
			case CSPackage.CS_STROKE__MITERLIMIT:
				return miterlimit != MITERLIMIT_EDEFAULT;
			case CSPackage.CS_STROKE__DASH:
				return dash != null && !dash.isEmpty();
			case CSPackage.CS_STROKE__DASH_PHASE:
				return dash_phase != DASH_PHASE_EDEFAULT;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", join: ");
		result.append(join);
		result.append(", cap: ");
		result.append(cap);
		result.append(", miterlimit: ");
		result.append(miterlimit);
		result.append(", dash: ");
		result.append(dash);
		result.append(", dash_phase: ");
		result.append(dash_phase);
		result.append(')');
		return result.toString();
	}

} //CSStrokeImpl
