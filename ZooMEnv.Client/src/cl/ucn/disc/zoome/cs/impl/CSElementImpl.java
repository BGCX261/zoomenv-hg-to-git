/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENamedElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import cl.ucn.disc.zoome.cs.CSColor;
import cl.ucn.disc.zoome.cs.CSElement;
import cl.ucn.disc.zoome.cs.CSLayout;
import cl.ucn.disc.zoome.cs.CSPackage;
import cl.ucn.disc.zoome.cs.CSShape;
import cl.ucn.disc.zoome.cs.CSStroke;
import cl.ucn.disc.zoome.cs.CSTransform;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#getSelectable <em>Selectable</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#isDraggable <em>Draggable</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#isResizable <em>Resizable</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#isTemplateRoot <em>Template Root</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#getObject <em>Object</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#getDisplayedStructuralFeatures <em>Displayed Structural Features</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#getMinZoom <em>Min Zoom</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSElementImpl#getMaxZoom <em>Max Zoom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSElementImpl extends ENamedElementImpl implements CSElement {
	/**
	 * The default value of the '{@link #getSelectable() <em>Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SELECTABLE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSelectable() <em>Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectable()
	 * @generated
	 * @ordered
	 */
	protected Boolean selectable = SELECTABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected CSStroke stroke;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<CSElement> children;

	/**
	 * The default value of the '{@link #isDraggable() <em>Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDraggable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DRAGGABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDraggable() <em>Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDraggable()
	 * @generated
	 * @ordered
	 */
	protected boolean draggable = DRAGGABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isResizable() <em>Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResizable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESIZABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isResizable() <em>Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResizable()
	 * @generated
	 * @ordered
	 */
	protected boolean resizable = RESIZABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForeground() <em>Foreground</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected CSColor foreground;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected CSColor background;

	/**
	 * The default value of the '{@link #isTemplateRoot() <em>Template Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemplateRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEMPLATE_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTemplateRoot() <em>Template Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemplateRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean templateRoot = TEMPLATE_ROOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected CSShape shape;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected CSTransform transform;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EObject object;

	/**
	 * The cached value of the '{@link #getDisplayedStructuralFeatures() <em>Displayed Structural Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayedStructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> displayedStructuralFeatures;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected CSLayout layout;

	/**
	 * The default value of the '{@link #getMinZoom() <em>Min Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinZoom()
	 * @generated
	 * @ordered
	 */
	protected static final Double MIN_ZOOM_EDEFAULT = new Double(-1.7976931348623157E308);

	/**
	 * The cached value of the '{@link #getMinZoom() <em>Min Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinZoom()
	 * @generated
	 * @ordered
	 */
	protected Double minZoom = MIN_ZOOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxZoom() <em>Max Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxZoom()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAX_ZOOM_EDEFAULT = new Double(1.7976931348623157E308);

	/**
	 * The cached value of the '{@link #getMaxZoom() <em>Max Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxZoom()
	 * @generated
	 * @ordered
	 */
	protected Double maxZoom = MAX_ZOOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSPackage.Literals.CS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSelectable() {
		return selectable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectable(Boolean newSelectable) {
		Boolean oldSelectable = selectable;
		selectable = newSelectable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__SELECTABLE, oldSelectable, selectable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSStroke getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStroke(CSStroke newStroke, NotificationChain msgs) {
		CSStroke oldStroke = stroke;
		stroke = newStroke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__STROKE, oldStroke, newStroke);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(CSStroke newStroke) {
		if (newStroke != stroke) {
			NotificationChain msgs = null;
			if (stroke != null)
				msgs = ((InternalEObject)stroke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSPackage.CS_ELEMENT__STROKE, null, msgs);
			if (newStroke != null)
				msgs = ((InternalEObject)newStroke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSPackage.CS_ELEMENT__STROKE, null, msgs);
			msgs = basicSetStroke(newStroke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__STROKE, newStroke, newStroke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSElement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<CSElement>(CSElement.class, this, CSPackage.CS_ELEMENT__CHILDREN, CSPackage.CS_ELEMENT__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSElement getParent() {
		if (eContainerFeatureID() != CSPackage.CS_ELEMENT__PARENT) return null;
		return (CSElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(CSElement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, CSPackage.CS_ELEMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(CSElement newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != CSPackage.CS_ELEMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, CSPackage.CS_ELEMENT__CHILDREN, CSElement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDraggable() {
		return draggable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDraggable(boolean newDraggable) {
		boolean oldDraggable = draggable;
		draggable = newDraggable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__DRAGGABLE, oldDraggable, draggable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResizable() {
		return resizable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResizable(boolean newResizable) {
		boolean oldResizable = resizable;
		resizable = newResizable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__RESIZABLE, oldResizable, resizable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSColor getForeground() {
		return foreground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeground(CSColor newForeground, NotificationChain msgs) {
		CSColor oldForeground = foreground;
		foreground = newForeground;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__FOREGROUND, oldForeground, newForeground);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeground(CSColor newForeground) {
		if (newForeground != foreground) {
			NotificationChain msgs = null;
			if (foreground != null)
				msgs = ((InternalEObject)foreground).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSPackage.CS_ELEMENT__FOREGROUND, null, msgs);
			if (newForeground != null)
				msgs = ((InternalEObject)newForeground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSPackage.CS_ELEMENT__FOREGROUND, null, msgs);
			msgs = basicSetForeground(newForeground, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__FOREGROUND, newForeground, newForeground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSColor getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackground(CSColor newBackground, NotificationChain msgs) {
		CSColor oldBackground = background;
		background = newBackground;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__BACKGROUND, oldBackground, newBackground);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(CSColor newBackground) {
		if (newBackground != background) {
			NotificationChain msgs = null;
			if (background != null)
				msgs = ((InternalEObject)background).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSPackage.CS_ELEMENT__BACKGROUND, null, msgs);
			if (newBackground != null)
				msgs = ((InternalEObject)newBackground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSPackage.CS_ELEMENT__BACKGROUND, null, msgs);
			msgs = basicSetBackground(newBackground, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__BACKGROUND, newBackground, newBackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplateRoot() {
		return templateRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateRoot(boolean newTemplateRoot) {
		boolean oldTemplateRoot = templateRoot;
		templateRoot = newTemplateRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__TEMPLATE_ROOT, oldTemplateRoot, templateRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSShape getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShape(CSShape newShape, NotificationChain msgs) {
		CSShape oldShape = shape;
		shape = newShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__SHAPE, oldShape, newShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(CSShape newShape) {
		if (newShape != shape) {
			NotificationChain msgs = null;
			if (shape != null)
				msgs = ((InternalEObject)shape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSPackage.CS_ELEMENT__SHAPE, null, msgs);
			if (newShape != null)
				msgs = ((InternalEObject)newShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSPackage.CS_ELEMENT__SHAPE, null, msgs);
			msgs = basicSetShape(newShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__SHAPE, newShape, newShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSTransform getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(CSTransform newTransform, NotificationChain msgs) {
		CSTransform oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__TRANSFORM, oldTransform, newTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(CSTransform newTransform) {
		if (newTransform != transform) {
			NotificationChain msgs = null;
			if (transform != null)
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSPackage.CS_ELEMENT__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSPackage.CS_ELEMENT__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__TRANSFORM, newTransform, newTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject)object;
			object = eResolveProxy(oldObject);
			if (object != oldObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSPackage.CS_ELEMENT__OBJECT, oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(EObject newObject) {
		EObject oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStructuralFeature> getDisplayedStructuralFeatures() {
		if (displayedStructuralFeatures == null) {
			displayedStructuralFeatures = new EObjectResolvingEList<EStructuralFeature>(EStructuralFeature.class, this, CSPackage.CS_ELEMENT__DISPLAYED_STRUCTURAL_FEATURES);
		}
		return displayedStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSLayout getLayout() {
		if (layout != null && layout.eIsProxy()) {
			InternalEObject oldLayout = (InternalEObject)layout;
			layout = (CSLayout)eResolveProxy(oldLayout);
			if (layout != oldLayout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSPackage.CS_ELEMENT__LAYOUT, oldLayout, layout));
			}
		}
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSLayout basicGetLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(CSLayout newLayout) {
		CSLayout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__LAYOUT, oldLayout, layout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinZoom() {
		return minZoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinZoom(Double newMinZoom) {
		Double oldMinZoom = minZoom;
		minZoom = newMinZoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__MIN_ZOOM, oldMinZoom, minZoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaxZoom() {
		return maxZoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxZoom(Double newMaxZoom) {
		Double oldMaxZoom = maxZoom;
		maxZoom = newMaxZoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_ELEMENT__MAX_ZOOM, oldMaxZoom, maxZoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CSPackage.CS_ELEMENT__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case CSPackage.CS_ELEMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((CSElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CSPackage.CS_ELEMENT__STROKE:
				return basicSetStroke(null, msgs);
			case CSPackage.CS_ELEMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case CSPackage.CS_ELEMENT__PARENT:
				return basicSetParent(null, msgs);
			case CSPackage.CS_ELEMENT__FOREGROUND:
				return basicSetForeground(null, msgs);
			case CSPackage.CS_ELEMENT__BACKGROUND:
				return basicSetBackground(null, msgs);
			case CSPackage.CS_ELEMENT__SHAPE:
				return basicSetShape(null, msgs);
			case CSPackage.CS_ELEMENT__TRANSFORM:
				return basicSetTransform(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CSPackage.CS_ELEMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, CSPackage.CS_ELEMENT__CHILDREN, CSElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSPackage.CS_ELEMENT__SELECTABLE:
				return getSelectable();
			case CSPackage.CS_ELEMENT__STROKE:
				return getStroke();
			case CSPackage.CS_ELEMENT__CHILDREN:
				return getChildren();
			case CSPackage.CS_ELEMENT__PARENT:
				return getParent();
			case CSPackage.CS_ELEMENT__DRAGGABLE:
				return isDraggable();
			case CSPackage.CS_ELEMENT__RESIZABLE:
				return isResizable();
			case CSPackage.CS_ELEMENT__FOREGROUND:
				return getForeground();
			case CSPackage.CS_ELEMENT__BACKGROUND:
				return getBackground();
			case CSPackage.CS_ELEMENT__TEMPLATE_ROOT:
				return isTemplateRoot();
			case CSPackage.CS_ELEMENT__SHAPE:
				return getShape();
			case CSPackage.CS_ELEMENT__TRANSFORM:
				return getTransform();
			case CSPackage.CS_ELEMENT__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
			case CSPackage.CS_ELEMENT__DISPLAYED_STRUCTURAL_FEATURES:
				return getDisplayedStructuralFeatures();
			case CSPackage.CS_ELEMENT__LAYOUT:
				if (resolve) return getLayout();
				return basicGetLayout();
			case CSPackage.CS_ELEMENT__MIN_ZOOM:
				return getMinZoom();
			case CSPackage.CS_ELEMENT__MAX_ZOOM:
				return getMaxZoom();
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
			case CSPackage.CS_ELEMENT__SELECTABLE:
				setSelectable((Boolean)newValue);
				return;
			case CSPackage.CS_ELEMENT__STROKE:
				setStroke((CSStroke)newValue);
				return;
			case CSPackage.CS_ELEMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends CSElement>)newValue);
				return;
			case CSPackage.CS_ELEMENT__PARENT:
				setParent((CSElement)newValue);
				return;
			case CSPackage.CS_ELEMENT__DRAGGABLE:
				setDraggable((Boolean)newValue);
				return;
			case CSPackage.CS_ELEMENT__RESIZABLE:
				setResizable((Boolean)newValue);
				return;
			case CSPackage.CS_ELEMENT__FOREGROUND:
				setForeground((CSColor)newValue);
				return;
			case CSPackage.CS_ELEMENT__BACKGROUND:
				setBackground((CSColor)newValue);
				return;
			case CSPackage.CS_ELEMENT__TEMPLATE_ROOT:
				setTemplateRoot((Boolean)newValue);
				return;
			case CSPackage.CS_ELEMENT__SHAPE:
				setShape((CSShape)newValue);
				return;
			case CSPackage.CS_ELEMENT__TRANSFORM:
				setTransform((CSTransform)newValue);
				return;
			case CSPackage.CS_ELEMENT__OBJECT:
				setObject((EObject)newValue);
				return;
			case CSPackage.CS_ELEMENT__DISPLAYED_STRUCTURAL_FEATURES:
				getDisplayedStructuralFeatures().clear();
				getDisplayedStructuralFeatures().addAll((Collection<? extends EStructuralFeature>)newValue);
				return;
			case CSPackage.CS_ELEMENT__LAYOUT:
				setLayout((CSLayout)newValue);
				return;
			case CSPackage.CS_ELEMENT__MIN_ZOOM:
				setMinZoom((Double)newValue);
				return;
			case CSPackage.CS_ELEMENT__MAX_ZOOM:
				setMaxZoom((Double)newValue);
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
			case CSPackage.CS_ELEMENT__SELECTABLE:
				setSelectable(SELECTABLE_EDEFAULT);
				return;
			case CSPackage.CS_ELEMENT__STROKE:
				setStroke((CSStroke)null);
				return;
			case CSPackage.CS_ELEMENT__CHILDREN:
				getChildren().clear();
				return;
			case CSPackage.CS_ELEMENT__PARENT:
				setParent((CSElement)null);
				return;
			case CSPackage.CS_ELEMENT__DRAGGABLE:
				setDraggable(DRAGGABLE_EDEFAULT);
				return;
			case CSPackage.CS_ELEMENT__RESIZABLE:
				setResizable(RESIZABLE_EDEFAULT);
				return;
			case CSPackage.CS_ELEMENT__FOREGROUND:
				setForeground((CSColor)null);
				return;
			case CSPackage.CS_ELEMENT__BACKGROUND:
				setBackground((CSColor)null);
				return;
			case CSPackage.CS_ELEMENT__TEMPLATE_ROOT:
				setTemplateRoot(TEMPLATE_ROOT_EDEFAULT);
				return;
			case CSPackage.CS_ELEMENT__SHAPE:
				setShape((CSShape)null);
				return;
			case CSPackage.CS_ELEMENT__TRANSFORM:
				setTransform((CSTransform)null);
				return;
			case CSPackage.CS_ELEMENT__OBJECT:
				setObject((EObject)null);
				return;
			case CSPackage.CS_ELEMENT__DISPLAYED_STRUCTURAL_FEATURES:
				getDisplayedStructuralFeatures().clear();
				return;
			case CSPackage.CS_ELEMENT__LAYOUT:
				setLayout((CSLayout)null);
				return;
			case CSPackage.CS_ELEMENT__MIN_ZOOM:
				setMinZoom(MIN_ZOOM_EDEFAULT);
				return;
			case CSPackage.CS_ELEMENT__MAX_ZOOM:
				setMaxZoom(MAX_ZOOM_EDEFAULT);
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
			case CSPackage.CS_ELEMENT__SELECTABLE:
				return SELECTABLE_EDEFAULT == null ? selectable != null : !SELECTABLE_EDEFAULT.equals(selectable);
			case CSPackage.CS_ELEMENT__STROKE:
				return stroke != null;
			case CSPackage.CS_ELEMENT__CHILDREN:
				return children != null && !children.isEmpty();
			case CSPackage.CS_ELEMENT__PARENT:
				return getParent() != null;
			case CSPackage.CS_ELEMENT__DRAGGABLE:
				return draggable != DRAGGABLE_EDEFAULT;
			case CSPackage.CS_ELEMENT__RESIZABLE:
				return resizable != RESIZABLE_EDEFAULT;
			case CSPackage.CS_ELEMENT__FOREGROUND:
				return foreground != null;
			case CSPackage.CS_ELEMENT__BACKGROUND:
				return background != null;
			case CSPackage.CS_ELEMENT__TEMPLATE_ROOT:
				return templateRoot != TEMPLATE_ROOT_EDEFAULT;
			case CSPackage.CS_ELEMENT__SHAPE:
				return shape != null;
			case CSPackage.CS_ELEMENT__TRANSFORM:
				return transform != null;
			case CSPackage.CS_ELEMENT__OBJECT:
				return object != null;
			case CSPackage.CS_ELEMENT__DISPLAYED_STRUCTURAL_FEATURES:
				return displayedStructuralFeatures != null && !displayedStructuralFeatures.isEmpty();
			case CSPackage.CS_ELEMENT__LAYOUT:
				return layout != null;
			case CSPackage.CS_ELEMENT__MIN_ZOOM:
				return MIN_ZOOM_EDEFAULT == null ? minZoom != null : !MIN_ZOOM_EDEFAULT.equals(minZoom);
			case CSPackage.CS_ELEMENT__MAX_ZOOM:
				return MAX_ZOOM_EDEFAULT == null ? maxZoom != null : !MAX_ZOOM_EDEFAULT.equals(maxZoom);
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
		result.append(" (selectable: ");
		result.append(selectable);
		result.append(", draggable: ");
		result.append(draggable);
		result.append(", resizable: ");
		result.append(resizable);
		result.append(", templateRoot: ");
		result.append(templateRoot);
		result.append(", minZoom: ");
		result.append(minZoom);
		result.append(", maxZoom: ");
		result.append(maxZoom);
		result.append(')');
		return result.toString();
	}

} //CSElementImpl
