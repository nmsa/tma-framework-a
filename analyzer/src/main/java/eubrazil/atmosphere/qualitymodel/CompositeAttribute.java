/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.CompositeAttribute#getChildren <em>Children</em>}</li>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.CompositeAttribute#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface CompositeAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link eubrazil.atmosphere.qualitymodel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<Attribute> getChildren();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link eubrazil.atmosphere.qualitymodel.AttributeAggregationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see eubrazil.atmosphere.qualitymodel.AttributeAggregationOperator
	 * @see #setOperator(AttributeAggregationOperator)
	 * @model required="true"
	 * @generated
	 */
	AttributeAggregationOperator getOperator();

	/**
	 * Sets the value of the '{@link eubrazil.atmosphere.qualitymodel.CompositeAttribute#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see eubrazil.atmosphere.qualitymodel.AttributeAggregationOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(AttributeAggregationOperator value);

} // CompositeAttribute
