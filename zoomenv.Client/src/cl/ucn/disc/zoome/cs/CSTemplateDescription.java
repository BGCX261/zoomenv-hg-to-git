/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getContainerClass <em>Container Class</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getTheClass <em>The Class</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getContainerStructuralFeature <em>Container Structural Feature</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getScale <em>Scale</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSTemplateDescription()
 * @model
 * @generated
 */
public interface CSTemplateDescription extends CSNode {
	/**
	 * Returns the value of the '<em><b>Container Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Class</em>' reference.
	 * @see #setContainerClass(EClass)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSTemplateDescription_ContainerClass()
	 * @model
	 * @generated
	 */
	EClass getContainerClass();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getContainerClass <em>Container Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Class</em>' reference.
	 * @see #getContainerClass()
	 * @generated
	 */
	void setContainerClass(EClass value);

	/**
	 * Returns the value of the '<em><b>The Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Class</em>' reference.
	 * @see #setTheClass(EClass)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSTemplateDescription_TheClass()
	 * @model
	 * @generated
	 */
	EClass getTheClass();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getTheClass <em>The Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Class</em>' reference.
	 * @see #getTheClass()
	 * @generated
	 */
	void setTheClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Container Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Structural Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Structural Feature</em>' reference.
	 * @see #setContainerStructuralFeature(EStructuralFeature)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSTemplateDescription_ContainerStructuralFeature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getContainerStructuralFeature();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getContainerStructuralFeature <em>Container Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Structural Feature</em>' reference.
	 * @see #getContainerStructuralFeature()
	 * @generated
	 */
	void setContainerStructuralFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSTemplateDescription_Scale()
	 * @model default="1"
	 * @generated
	 */
	double getScale();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(double value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(CSElement)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSTemplateDescription_Template()
	 * @model
	 * @generated
	 */
	CSElement getTemplate();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSTemplateDescription#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(CSElement value);

} // CSTemplateDescription
