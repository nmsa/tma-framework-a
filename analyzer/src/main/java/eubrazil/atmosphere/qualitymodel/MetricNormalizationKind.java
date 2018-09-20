/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Metric Normalization Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eubrazil.atmosphere.qualitymodel.QualityModelPackage#getMetricNormalizationKind()
 * @generated
 */
public enum MetricNormalizationKind {
	/**
	 * The '<em><b>BENEFIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BENEFIT_VALUE
	 * @generated
	 * @ordered
	 */
	BENEFIT(0, "BENEFIT", "BENEFIT"),

	/**
	 * The '<em><b>COST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COST_VALUE
	 * @generated
	 * @ordered
	 */
	COST(0, "COST", "COST");

	/**
	 * The '<em><b>BENEFIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BENEFIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BENEFIT
	 * @generated
	 * @ordered
	 */
	public static final int BENEFIT_VALUE = 0;

	/**
	 * The '<em><b>COST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COST
	 * @generated
	 * @ordered
	 */
	public static final int COST_VALUE = 0;

	/**
	 * An array of all the '<em><b>Metric Normalization Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MetricNormalizationKind[] VALUES_ARRAY =
		new MetricNormalizationKind[] {
			BENEFIT,
			COST,
		};

	/**
	 * A public read-only list of all the '<em><b>Metric Normalization Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MetricNormalizationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Metric Normalization Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MetricNormalizationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MetricNormalizationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric Normalization Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MetricNormalizationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MetricNormalizationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric Normalization Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MetricNormalizationKind get(int value) {
		switch (value) {
			case BENEFIT_VALUE: return BENEFIT;
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
	private MetricNormalizationKind(int value, String name, String literal) {
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
	
} //MetricNormalizationKind
