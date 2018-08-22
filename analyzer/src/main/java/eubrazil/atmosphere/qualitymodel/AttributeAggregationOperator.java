/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Aggregation Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eubrazil.atmosphere.qualitymodel.QualityModelPackage#getAttributeAggregationOperator()
 * @generated
 */
public enum AttributeAggregationOperator {
	/**
	 * The '<em><b>NEUTRALITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEUTRALITY_VALUE
	 * @generated
	 * @ordered
	 */
	NEUTRALITY(0, "NEUTRALITY", "NEUTRALITY"),

	/**
	 * The '<em><b>SIMULTANEITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMULTANEITY_VALUE
	 * @generated
	 * @ordered
	 */
	SIMULTANEITY(0, "SIMULTANEITY", "SIMULTANEITY"),

	/**
	 * The '<em><b>REPLACEABILITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACEABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACEABILITY(0, "REPLACEABILITY", "REPLACEABILITY");

	/**
	 * The '<em><b>NEUTRALITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEUTRALITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEUTRALITY
	 * @generated
	 * @ordered
	 */
	public static final int NEUTRALITY_VALUE = 0;

	/**
	 * The '<em><b>SIMULTANEITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIMULTANEITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMULTANEITY
	 * @generated
	 * @ordered
	 */
	public static final int SIMULTANEITY_VALUE = 0;

	/**
	 * The '<em><b>REPLACEABILITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REPLACEABILITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPLACEABILITY
	 * @generated
	 * @ordered
	 */
	public static final int REPLACEABILITY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Attribute Aggregation Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AttributeAggregationOperator[] VALUES_ARRAY =
		new AttributeAggregationOperator[] {
			NEUTRALITY,
			SIMULTANEITY,
			REPLACEABILITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Attribute Aggregation Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AttributeAggregationOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attribute Aggregation Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeAggregationOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeAggregationOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Aggregation Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeAggregationOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeAggregationOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Aggregation Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeAggregationOperator get(int value) {
		switch (value) {
			case NEUTRALITY_VALUE: return NEUTRALITY;
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
	private AttributeAggregationOperator(int value, String name, String literal) {
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
	
} //AttributeAggregationOperator
