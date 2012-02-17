/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSNode#getConnections <em>Connections</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSNode#getHeight <em>Height</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSNode#getWidth <em>Width</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSNode#getX <em>X</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSNode#getY <em>Y</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSNode#getHorizontalAlign <em>Horizontal Align</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSNode#getVerticalAlign <em>Vertical Align</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSNode#getWidthRatioToParent <em>Width Ratio To Parent</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSNode#getHeightRatioToParent <em>Height Ratio To Parent</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSNode#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSNode#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSNode#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link cl.ucn.disc.zoome.cs.CSNode#getMaxWidth <em>Max Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode()
 * @model
 * @generated
 */
public interface CSNode extends CSElement {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link cl.ucn.disc.zoome.cs.CSConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode_Connections()
	 * @model
	 * @generated
	 */
	EList<CSConnection> getConnections();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode_Height()
	 * @model default="50"
	 * @generated
	 */
	Double getHeight();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSNode#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Double value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode_Width()
	 * @model default="100"
	 * @generated
	 */
	Double getWidth();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSNode#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Double value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode_X()
	 * @model default="0"
	 * @generated
	 */
	Double getX();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSNode#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode_Y()
	 * @model default="0"
	 * @generated
	 */
	Double getY();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSNode#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Double value);

	/**
	 * Returns the value of the '<em><b>Horizontal Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Align</em>' attribute.
	 * @see #setHorizontalAlign(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode_HorizontalAlign()
	 * @model
	 * @generated
	 */
	Double getHorizontalAlign();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSNode#getHorizontalAlign <em>Horizontal Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Align</em>' attribute.
	 * @see #getHorizontalAlign()
	 * @generated
	 */
	void setHorizontalAlign(Double value);

	/**
	 * Returns the value of the '<em><b>Vertical Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Align</em>' attribute.
	 * @see #setVerticalAlign(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode_VerticalAlign()
	 * @model
	 * @generated
	 */
	Double getVerticalAlign();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSNode#getVerticalAlign <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Align</em>' attribute.
	 * @see #getVerticalAlign()
	 * @generated
	 */
	void setVerticalAlign(Double value);

	/**
	 * Returns the value of the '<em><b>Width Ratio To Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width Ratio To Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Ratio To Parent</em>' attribute.
	 * @see #setWidthRatioToParent(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode_WidthRatioToParent()
	 * @model
	 * @generated
	 */
	Double getWidthRatioToParent();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSNode#getWidthRatioToParent <em>Width Ratio To Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Ratio To Parent</em>' attribute.
	 * @see #getWidthRatioToParent()
	 * @generated
	 */
	void setWidthRatioToParent(Double value);

	/**
	 * Returns the value of the '<em><b>Height Ratio To Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height Ratio To Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height Ratio To Parent</em>' attribute.
	 * @see #setHeightRatioToParent(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode_HeightRatioToParent()
	 * @model
	 * @generated
	 */
	Double getHeightRatioToParent();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSNode#getHeightRatioToParent <em>Height Ratio To Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height Ratio To Parent</em>' attribute.
	 * @see #getHeightRatioToParent()
	 * @generated
	 */
	void setHeightRatioToParent(Double value);

	/**
	 * Returns the value of the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Height</em>' attribute.
	 * @see #setMinHeight(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode_MinHeight()
	 * @model
	 * @generated
	 */
	Double getMinHeight();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSNode#getMinHeight <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Height</em>' attribute.
	 * @see #getMinHeight()
	 * @generated
	 */
	void setMinHeight(Double value);

	/**
	 * Returns the value of the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Width</em>' attribute.
	 * @see #setMinWidth(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode_MinWidth()
	 * @model
	 * @generated
	 */
	Double getMinWidth();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSNode#getMinWidth <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Width</em>' attribute.
	 * @see #getMinWidth()
	 * @generated
	 */
	void setMinWidth(Double value);

	/**
	 * Returns the value of the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Height</em>' attribute.
	 * @see #setMaxHeight(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode_MaxHeight()
	 * @model
	 * @generated
	 */
	Double getMaxHeight();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSNode#getMaxHeight <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Height</em>' attribute.
	 * @see #getMaxHeight()
	 * @generated
	 */
	void setMaxHeight(Double value);

	/**
	 * Returns the value of the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Width</em>' attribute.
	 * @see #setMaxWidth(Double)
	 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSNode_MaxWidth()
	 * @model
	 * @generated
	 */
	Double getMaxWidth();

	/**
	 * Sets the value of the '{@link cl.ucn.disc.zoome.cs.CSNode#getMaxWidth <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Width</em>' attribute.
	 * @see #getMaxWidth()
	 * @generated
	 */
	void setMaxWidth(Double value);

} // CSNode
