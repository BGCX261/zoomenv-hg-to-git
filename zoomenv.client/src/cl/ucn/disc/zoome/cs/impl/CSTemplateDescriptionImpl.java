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

import cl.ucn.disc.zoome.cs.CSElement;
import cl.ucn.disc.zoome.cs.CSPackage;
import cl.ucn.disc.zoome.cs.CSTemplateDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSTemplateDescriptionImpl#getContainerClass <em>Container Class</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSTemplateDescriptionImpl#getTheClass <em>The Class</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSTemplateDescriptionImpl#getContainerStructuralFeature <em>Container Structural Feature</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSTemplateDescriptionImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.impl.CSTemplateDescriptionImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSTemplateDescriptionImpl extends CSNodeImpl implements CSTemplateDescription {
	/**
	 * The cached value of the '{@link #getContainerClass() <em>Container Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerClass()
	 * @generated
	 * @ordered
	 */
	protected EClass containerClass;

	/**
	 * The cached value of the '{@link #getTheClass() <em>The Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheClass()
	 * @generated
	 * @ordered
	 */
	protected EClass theClass;

	/**
	 * The cached value of the '{@link #getContainerStructuralFeature() <em>Container Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerStructuralFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature containerStructuralFeature;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected double scale = SCALE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected CSElement template;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSTemplateDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSPackage.Literals.CS_TEMPLATE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerClass() {
		if (containerClass != null && containerClass.eIsProxy()) {
			InternalEObject oldContainerClass = (InternalEObject)containerClass;
			containerClass = (EClass)eResolveProxy(oldContainerClass);
			if (containerClass != oldContainerClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSPackage.CS_TEMPLATE_DESCRIPTION__CONTAINER_CLASS, oldContainerClass, containerClass));
			}
		}
		return containerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetContainerClass() {
		return containerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerClass(EClass newContainerClass) {
		EClass oldContainerClass = containerClass;
		containerClass = newContainerClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_TEMPLATE_DESCRIPTION__CONTAINER_CLASS, oldContainerClass, containerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheClass() {
		if (theClass != null && theClass.eIsProxy()) {
			InternalEObject oldTheClass = (InternalEObject)theClass;
			theClass = (EClass)eResolveProxy(oldTheClass);
			if (theClass != oldTheClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSPackage.CS_TEMPLATE_DESCRIPTION__THE_CLASS, oldTheClass, theClass));
			}
		}
		return theClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetTheClass() {
		return theClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheClass(EClass newTheClass) {
		EClass oldTheClass = theClass;
		theClass = newTheClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_TEMPLATE_DESCRIPTION__THE_CLASS, oldTheClass, theClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getContainerStructuralFeature() {
		if (containerStructuralFeature != null && containerStructuralFeature.eIsProxy()) {
			InternalEObject oldContainerStructuralFeature = (InternalEObject)containerStructuralFeature;
			containerStructuralFeature = (EStructuralFeature)eResolveProxy(oldContainerStructuralFeature);
			if (containerStructuralFeature != oldContainerStructuralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSPackage.CS_TEMPLATE_DESCRIPTION__CONTAINER_STRUCTURAL_FEATURE, oldContainerStructuralFeature, containerStructuralFeature));
			}
		}
		return containerStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetContainerStructuralFeature() {
		return containerStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerStructuralFeature(EStructuralFeature newContainerStructuralFeature) {
		EStructuralFeature oldContainerStructuralFeature = containerStructuralFeature;
		containerStructuralFeature = newContainerStructuralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_TEMPLATE_DESCRIPTION__CONTAINER_STRUCTURAL_FEATURE, oldContainerStructuralFeature, containerStructuralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(double newScale) {
		double oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_TEMPLATE_DESCRIPTION__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSElement getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (CSElement)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSPackage.CS_TEMPLATE_DESCRIPTION__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSElement basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(CSElement newTemplate) {
		CSElement oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSPackage.CS_TEMPLATE_DESCRIPTION__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSPackage.CS_TEMPLATE_DESCRIPTION__CONTAINER_CLASS:
				if (resolve) return getContainerClass();
				return basicGetContainerClass();
			case CSPackage.CS_TEMPLATE_DESCRIPTION__THE_CLASS:
				if (resolve) return getTheClass();
				return basicGetTheClass();
			case CSPackage.CS_TEMPLATE_DESCRIPTION__CONTAINER_STRUCTURAL_FEATURE:
				if (resolve) return getContainerStructuralFeature();
				return basicGetContainerStructuralFeature();
			case CSPackage.CS_TEMPLATE_DESCRIPTION__SCALE:
				return getScale();
			case CSPackage.CS_TEMPLATE_DESCRIPTION__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
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
			case CSPackage.CS_TEMPLATE_DESCRIPTION__CONTAINER_CLASS:
				setContainerClass((EClass)newValue);
				return;
			case CSPackage.CS_TEMPLATE_DESCRIPTION__THE_CLASS:
				setTheClass((EClass)newValue);
				return;
			case CSPackage.CS_TEMPLATE_DESCRIPTION__CONTAINER_STRUCTURAL_FEATURE:
				setContainerStructuralFeature((EStructuralFeature)newValue);
				return;
			case CSPackage.CS_TEMPLATE_DESCRIPTION__SCALE:
				setScale((Double)newValue);
				return;
			case CSPackage.CS_TEMPLATE_DESCRIPTION__TEMPLATE:
				setTemplate((CSElement)newValue);
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
			case CSPackage.CS_TEMPLATE_DESCRIPTION__CONTAINER_CLASS:
				setContainerClass((EClass)null);
				return;
			case CSPackage.CS_TEMPLATE_DESCRIPTION__THE_CLASS:
				setTheClass((EClass)null);
				return;
			case CSPackage.CS_TEMPLATE_DESCRIPTION__CONTAINER_STRUCTURAL_FEATURE:
				setContainerStructuralFeature((EStructuralFeature)null);
				return;
			case CSPackage.CS_TEMPLATE_DESCRIPTION__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case CSPackage.CS_TEMPLATE_DESCRIPTION__TEMPLATE:
				setTemplate((CSElement)null);
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
			case CSPackage.CS_TEMPLATE_DESCRIPTION__CONTAINER_CLASS:
				return containerClass != null;
			case CSPackage.CS_TEMPLATE_DESCRIPTION__THE_CLASS:
				return theClass != null;
			case CSPackage.CS_TEMPLATE_DESCRIPTION__CONTAINER_STRUCTURAL_FEATURE:
				return containerStructuralFeature != null;
			case CSPackage.CS_TEMPLATE_DESCRIPTION__SCALE:
				return scale != SCALE_EDEFAULT;
			case CSPackage.CS_TEMPLATE_DESCRIPTION__TEMPLATE:
				return template != null;
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
		result.append(" (scale: ");
		result.append(scale);
		result.append(')');
		return result.toString();
	}

} //CSTemplateDescriptionImpl
