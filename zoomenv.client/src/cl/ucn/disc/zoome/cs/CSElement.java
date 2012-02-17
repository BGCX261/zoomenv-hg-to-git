/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#getSelectable <em>Selectable</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#getStroke <em>Stroke</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#getChildren <em>Children</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#getParent <em>Parent</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#isDraggable <em>Draggable</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#isResizable <em>Resizable</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#getForeground <em>Foreground</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#getBackground <em>Background</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#isTemplateRoot <em>Template Root</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#getShape <em>Shape</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#getTransform <em>Transform</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#getObject <em>Object</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#getDisplayedStructuralFeatures <em>Displayed Structural Features</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#getLayout <em>Layout</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#getMinZoom <em>Min Zoom</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSElement#getMaxZoom <em>Max Zoom</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement()
 * @model
 * @generated
 */
public interface CSElement extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Selectable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectable</em>' attribute.
	 * @see #setSelectable(Boolean)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_Selectable()
	 * @model default="true"
	 * @generated
	 */
	Boolean getSelectable();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#getSelectable <em>Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectable</em>' attribute.
	 * @see #getSelectable()
	 * @generated
	 */
	void setSelectable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' containment reference.
	 * @see #setStroke(CSStroke)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_Stroke()
	 * @model containment="true"
	 * @generated
	 */
	CSStroke getStroke();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#getStroke <em>Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' containment reference.
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(CSStroke value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link cl.ucn.disc.zoome.cs.CSElement}.
	 * It is bidirectional and its opposite is '{@link cl.ucn.disc.zoome.cs.CSElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_Children()
	 * @see cl.ucn.disc.zoome.cs.CSElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<CSElement> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cl.ucn.disc.zoome.cs.CSElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(CSElement)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_Parent()
	 * @see cl.ucn.disc.zoome.cs.CSElement#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	CSElement getParent();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CSElement value);

	/**
	 * Returns the value of the '<em><b>Draggable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Draggable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draggable</em>' attribute.
	 * @see #setDraggable(boolean)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_Draggable()
	 * @model default="true"
	 * @generated
	 */
	boolean isDraggable();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#isDraggable <em>Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draggable</em>' attribute.
	 * @see #isDraggable()
	 * @generated
	 */
	void setDraggable(boolean value);

	/**
	 * Returns the value of the '<em><b>Resizable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resizable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resizable</em>' attribute.
	 * @see #setResizable(boolean)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_Resizable()
	 * @model default="true"
	 * @generated
	 */
	boolean isResizable();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#isResizable <em>Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resizable</em>' attribute.
	 * @see #isResizable()
	 * @generated
	 */
	void setResizable(boolean value);

	/**
	 * Returns the value of the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground</em>' containment reference.
	 * @see #setForeground(CSColor)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_Foreground()
	 * @model containment="true"
	 * @generated
	 */
	CSColor getForeground();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#getForeground <em>Foreground</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground</em>' containment reference.
	 * @see #getForeground()
	 * @generated
	 */
	void setForeground(CSColor value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' containment reference.
	 * @see #setBackground(CSColor)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_Background()
	 * @model containment="true"
	 * @generated
	 */
	CSColor getBackground();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#getBackground <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' containment reference.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(CSColor value);

	/**
	 * Returns the value of the '<em><b>Template Root</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Root</em>' attribute.
	 * @see #setTemplateRoot(boolean)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_TemplateRoot()
	 * @model default="false"
	 * @generated
	 */
	boolean isTemplateRoot();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#isTemplateRoot <em>Template Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Root</em>' attribute.
	 * @see #isTemplateRoot()
	 * @generated
	 */
	void setTemplateRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference.
	 * @see #setShape(CSShape)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_Shape()
	 * @model containment="true"
	 * @generated
	 */
	CSShape getShape();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#getShape <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' containment reference.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(CSShape value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(CSTransform)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_Transform()
	 * @model containment="true"
	 * @generated
	 */
	CSTransform getTransform();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(CSTransform value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(EObject)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_Object()
	 * @model
	 * @generated
	 */
	EObject getObject();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Displayed Structural Features</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displayed Structural Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displayed Structural Features</em>' reference list.
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_DisplayedStructuralFeatures()
	 * @model
	 * @generated
	 */
	EList<EStructuralFeature> getDisplayedStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' reference.
	 * @see #setLayout(CSLayout)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_Layout()
	 * @model
	 * @generated
	 */
	CSLayout getLayout();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#getLayout <em>Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(CSLayout value);

	/**
	 * Returns the value of the '<em><b>Min Zoom</b></em>' attribute.
	 * The default value is <code>"-1.7976931348623157e+308"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Zoom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Zoom</em>' attribute.
	 * @see #setMinZoom(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_MinZoom()
	 * @model default="-1.7976931348623157e+308"
	 * @generated
	 */
	Double getMinZoom();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#getMinZoom <em>Min Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Zoom</em>' attribute.
	 * @see #getMinZoom()
	 * @generated
	 */
	void setMinZoom(Double value);

	/**
	 * Returns the value of the '<em><b>Max Zoom</b></em>' attribute.
	 * The default value is <code>"1.7976931348623157e+308"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Zoom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Zoom</em>' attribute.
	 * @see #setMaxZoom(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSElement_MaxZoom()
	 * @model default="1.7976931348623157e+308"
	 * @generated
	 */
	Double getMaxZoom();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSElement#getMaxZoom <em>Max Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Zoom</em>' attribute.
	 * @see #getMaxZoom()
	 * @generated
	 */
	void setMaxZoom(Double value);

} // CSElement
