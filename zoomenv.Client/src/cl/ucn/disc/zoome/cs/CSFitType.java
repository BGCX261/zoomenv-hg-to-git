/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cl.ucn.disc.zoome.cs.CSPackage#getCSFitType()
 * @model
 * @generated
 */
public enum CSFitType implements Enumerator {
	/**
	 * The '<em><b>AUTO EXPAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_EXPAND_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_EXPAND(0, "AUTO_EXPAND", ""),

	/**
	 * The '<em><b>FIT TO CHILDREN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIT_TO_CHILDREN_VALUE
	 * @generated
	 * @ordered
	 */
	FIT_TO_CHILDREN(1, "FIT_TO_CHILDREN", "FIT_TO_CHILDREN");

	/**
	 * The '<em><b>AUTO EXPAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTO EXPAND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO_EXPAND
	 * @model literal=""
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_EXPAND_VALUE = 0;

	/**
	 * The '<em><b>FIT TO CHILDREN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIT TO CHILDREN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIT_TO_CHILDREN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIT_TO_CHILDREN_VALUE = 1;

	/**
	 * An array of all the '<em><b>Fit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CSFitType[] VALUES_ARRAY =
		new CSFitType[] {
			AUTO_EXPAND,
			FIT_TO_CHILDREN,
		};

	/**
	 * A public read-only list of all the '<em><b>Fit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CSFitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CSFitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CSFitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CSFitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CSFitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CSFitType get(int value) {
		switch (value) {
			case AUTO_EXPAND_VALUE: return AUTO_EXPAND;
			case FIT_TO_CHILDREN_VALUE: return FIT_TO_CHILDREN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CSFitType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CSFitType
