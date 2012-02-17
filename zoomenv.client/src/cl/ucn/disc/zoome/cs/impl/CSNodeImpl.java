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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import cl.ucn.disc.zoome.cs.CSConnection;
import cl.ucn.disc.zoome.cs.CSNode;
import cl.ucn.disc.zoome.cs.CSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl#getX <em>X</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl#getY <em>Y</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl#getHorizontalAlign <em>Horizontal Align</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl#getVerticalAlign <em>Vertical Align</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl#getWidthRatioToParent <em>Width Ratio To Parent</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl#getHeightRatioToParent <em>Height Ratio To Parent</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSNodeImpl#getMaxWidth <em>Max Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSNodeImpl extends CSElementImpl implements CSNode {
	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<CSConnection> connections;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double HEIGHT_EDEFAULT = new Double(50.0);

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Double WIDTH_EDEFAULT = new Double(100.0);

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Double X_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Double Y_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalAlign() <em>Horizontal Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlign()
	 * @generated
	 * @ordered
	 */
	protected static final Double HORIZONTAL_ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalAlign() <em>Horizontal Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlign()
	 * @generated
	 * @ordered
	 */
	protected Double horizontalAlign = HORIZONTAL_ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalAlign() <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected static final Double VERTICAL_ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalAlign() <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected Double verticalAlign = VERTICAL_ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidthRatioToParent() <em>Width Ratio To Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthRatioToParent()
	 * @generated
	 * @ordered
	 */
	protected static final Double WIDTH_RATIO_TO_PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidthRatioToParent() <em>Width Ratio To Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthRatioToParent()
	 * @generated
	 * @ordered
	 */
	protected Double widthRatioToParent = WIDTH_RATIO_TO_PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeightRatioToParent() <em>Height Ratio To Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightRatioToParent()
	 * @generated
	 * @ordered
	 */
	protected static final Double HEIGHT_RATIO_TO_PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeightRatioToParent() <em>Height Ratio To Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightRatioToParent()
	 * @generated
	 * @ordered
	 */
	protected Double heightRatioToParent = HEIGHT_RATIO_TO_PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinHeight() <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double MIN_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinHeight() <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected Double minHeight = MIN_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAX_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected Double maxHeight = MAX_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinWidth() <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Double MIN_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinWidth() <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected Double minWidth = MIN_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAX_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected Double maxWidth = MAX_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSPackage.Literals.CS_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectResolvingEList<CSConnection>(CSConnection.class, this, CSPackage.CS_NODE__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Double newHeight) {
		Double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_NODE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Double newWidth) {
		Double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_NODE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Double newX) {
		Double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_NODE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Double newY) {
		Double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_NODE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHorizontalAlign() {
		return horizontalAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalAlign(Double newHorizontalAlign) {
		Double oldHorizontalAlign = horizontalAlign;
		horizontalAlign = newHorizontalAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_NODE__HORIZONTAL_ALIGN, oldHorizontalAlign, horizontalAlign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVerticalAlign() {
		return verticalAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalAlign(Double newVerticalAlign) {
		Double oldVerticalAlign = verticalAlign;
		verticalAlign = newVerticalAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_NODE__VERTICAL_ALIGN, oldVerticalAlign, verticalAlign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWidthRatioToParent() {
		return widthRatioToParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidthRatioToParent(Double newWidthRatioToParent) {
		Double oldWidthRatioToParent = widthRatioToParent;
		widthRatioToParent = newWidthRatioToParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_NODE__WIDTH_RATIO_TO_PARENT, oldWidthRatioToParent, widthRatioToParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeightRatioToParent() {
		return heightRatioToParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeightRatioToParent(Double newHeightRatioToParent) {
		Double oldHeightRatioToParent = heightRatioToParent;
		heightRatioToParent = newHeightRatioToParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_NODE__HEIGHT_RATIO_TO_PARENT, oldHeightRatioToParent, heightRatioToParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinHeight() {
		return minHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinHeight(Double newMinHeight) {
		Double oldMinHeight = minHeight;
		minHeight = newMinHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_NODE__MIN_HEIGHT, oldMinHeight, minHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinWidth() {
		return minWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinWidth(Double newMinWidth) {
		Double oldMinWidth = minWidth;
		minWidth = newMinWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_NODE__MIN_WIDTH, oldMinWidth, minWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaxHeight() {
		return maxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxHeight(Double newMaxHeight) {
		Double oldMaxHeight = maxHeight;
		maxHeight = newMaxHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_NODE__MAX_HEIGHT, oldMaxHeight, maxHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaxWidth() {
		return maxWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxWidth(Double newMaxWidth) {
		Double oldMaxWidth = maxWidth;
		maxWidth = newMaxWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_NODE__MAX_WIDTH, oldMaxWidth, maxWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSPackage.CS_NODE__CONNECTIONS:
				return getConnections();
			case CSPackage.CS_NODE__HEIGHT:
				return getHeight();
			case CSPackage.CS_NODE__WIDTH:
				return getWidth();
			case CSPackage.CS_NODE__X:
				return getX();
			case CSPackage.CS_NODE__Y:
				return getY();
			case CSPackage.CS_NODE__HORIZONTAL_ALIGN:
				return getHorizontalAlign();
			case CSPackage.CS_NODE__VERTICAL_ALIGN:
				return getVerticalAlign();
			case CSPackage.CS_NODE__WIDTH_RATIO_TO_PARENT:
				return getWidthRatioToParent();
			case CSPackage.CS_NODE__HEIGHT_RATIO_TO_PARENT:
				return getHeightRatioToParent();
			case CSPackage.CS_NODE__MIN_HEIGHT:
				return getMinHeight();
			case CSPackage.CS_NODE__MAX_HEIGHT:
				return getMaxHeight();
			case CSPackage.CS_NODE__MIN_WIDTH:
				return getMinWidth();
			case CSPackage.CS_NODE__MAX_WIDTH:
				return getMaxWidth();
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
			case CSPackage.CS_NODE__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends CSConnection>)newValue);
				return;
			case CSPackage.CS_NODE__HEIGHT:
				setHeight((Double)newValue);
				return;
			case CSPackage.CS_NODE__WIDTH:
				setWidth((Double)newValue);
				return;
			case CSPackage.CS_NODE__X:
				setX((Double)newValue);
				return;
			case CSPackage.CS_NODE__Y:
				setY((Double)newValue);
				return;
			case CSPackage.CS_NODE__HORIZONTAL_ALIGN:
				setHorizontalAlign((Double)newValue);
				return;
			case CSPackage.CS_NODE__VERTICAL_ALIGN:
				setVerticalAlign((Double)newValue);
				return;
			case CSPackage.CS_NODE__WIDTH_RATIO_TO_PARENT:
				setWidthRatioToParent((Double)newValue);
				return;
			case CSPackage.CS_NODE__HEIGHT_RATIO_TO_PARENT:
				setHeightRatioToParent((Double)newValue);
				return;
			case CSPackage.CS_NODE__MIN_HEIGHT:
				setMinHeight((Double)newValue);
				return;
			case CSPackage.CS_NODE__MAX_HEIGHT:
				setMaxHeight((Double)newValue);
				return;
			case CSPackage.CS_NODE__MIN_WIDTH:
				setMinWidth((Double)newValue);
				return;
			case CSPackage.CS_NODE__MAX_WIDTH:
				setMaxWidth((Double)newValue);
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
			case CSPackage.CS_NODE__CONNECTIONS:
				getConnections().clear();
				return;
			case CSPackage.CS_NODE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case CSPackage.CS_NODE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case CSPackage.CS_NODE__X:
				setX(X_EDEFAULT);
				return;
			case CSPackage.CS_NODE__Y:
				setY(Y_EDEFAULT);
				return;
			case CSPackage.CS_NODE__HORIZONTAL_ALIGN:
				setHorizontalAlign(HORIZONTAL_ALIGN_EDEFAULT);
				return;
			case CSPackage.CS_NODE__VERTICAL_ALIGN:
				setVerticalAlign(VERTICAL_ALIGN_EDEFAULT);
				return;
			case CSPackage.CS_NODE__WIDTH_RATIO_TO_PARENT:
				setWidthRatioToParent(WIDTH_RATIO_TO_PARENT_EDEFAULT);
				return;
			case CSPackage.CS_NODE__HEIGHT_RATIO_TO_PARENT:
				setHeightRatioToParent(HEIGHT_RATIO_TO_PARENT_EDEFAULT);
				return;
			case CSPackage.CS_NODE__MIN_HEIGHT:
				setMinHeight(MIN_HEIGHT_EDEFAULT);
				return;
			case CSPackage.CS_NODE__MAX_HEIGHT:
				setMaxHeight(MAX_HEIGHT_EDEFAULT);
				return;
			case CSPackage.CS_NODE__MIN_WIDTH:
				setMinWidth(MIN_WIDTH_EDEFAULT);
				return;
			case CSPackage.CS_NODE__MAX_WIDTH:
				setMaxWidth(MAX_WIDTH_EDEFAULT);
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
			case CSPackage.CS_NODE__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case CSPackage.CS_NODE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case CSPackage.CS_NODE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case CSPackage.CS_NODE__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case CSPackage.CS_NODE__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case CSPackage.CS_NODE__HORIZONTAL_ALIGN:
				return HORIZONTAL_ALIGN_EDEFAULT == null ? horizontalAlign != null : !HORIZONTAL_ALIGN_EDEFAULT.equals(horizontalAlign);
			case CSPackage.CS_NODE__VERTICAL_ALIGN:
				return VERTICAL_ALIGN_EDEFAULT == null ? verticalAlign != null : !VERTICAL_ALIGN_EDEFAULT.equals(verticalAlign);
			case CSPackage.CS_NODE__WIDTH_RATIO_TO_PARENT:
				return WIDTH_RATIO_TO_PARENT_EDEFAULT == null ? widthRatioToParent != null : !WIDTH_RATIO_TO_PARENT_EDEFAULT.equals(widthRatioToParent);
			case CSPackage.CS_NODE__HEIGHT_RATIO_TO_PARENT:
				return HEIGHT_RATIO_TO_PARENT_EDEFAULT == null ? heightRatioToParent != null : !HEIGHT_RATIO_TO_PARENT_EDEFAULT.equals(heightRatioToParent);
			case CSPackage.CS_NODE__MIN_HEIGHT:
				return MIN_HEIGHT_EDEFAULT == null ? minHeight != null : !MIN_HEIGHT_EDEFAULT.equals(minHeight);
			case CSPackage.CS_NODE__MAX_HEIGHT:
				return MAX_HEIGHT_EDEFAULT == null ? maxHeight != null : !MAX_HEIGHT_EDEFAULT.equals(maxHeight);
			case CSPackage.CS_NODE__MIN_WIDTH:
				return MIN_WIDTH_EDEFAULT == null ? minWidth != null : !MIN_WIDTH_EDEFAULT.equals(minWidth);
			case CSPackage.CS_NODE__MAX_WIDTH:
				return MAX_WIDTH_EDEFAULT == null ? maxWidth != null : !MAX_WIDTH_EDEFAULT.equals(maxWidth);
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
		result.append(" (height: ");
		result.append(height);
		result.append(", width: ");
		result.append(width);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", horizontalAlign: ");
		result.append(horizontalAlign);
		result.append(", verticalAlign: ");
		result.append(verticalAlign);
		result.append(", widthRatioToParent: ");
		result.append(widthRatioToParent);
		result.append(", heightRatioToParent: ");
		result.append(heightRatioToParent);
		result.append(", minHeight: ");
		result.append(minHeight);
		result.append(", maxHeight: ");
		result.append(maxHeight);
		result.append(", minWidth: ");
		result.append(minWidth);
		result.append(", maxWidth: ");
		result.append(maxWidth);
		result.append(')');
		return result.toString();
	}

} //CSNodeImpl
