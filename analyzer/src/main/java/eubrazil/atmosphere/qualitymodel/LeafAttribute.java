/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.LeafAttribute#getMin <em>Min</em>}</li>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.LeafAttribute#getMax <em>Max</em>}</li>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.LeafAttribute#getMetric <em>Metric</em>}</li>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.LeafAttribute#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface LeafAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(double)
	 * @model
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link eubrazil.atmosphere.qualitymodel.LeafAttribute#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(double value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(double)
	 * @model default="1.0"
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link eubrazil.atmosphere.qualitymodel.LeafAttribute#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(double value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference list.
	 * The list contents are of type {@link eubrazil.atmosphere.qualitymodel.Metric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference list.
	 * @model required="true"
	 * @generated
	 */
	List<Metric> getMetric();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link eubrazil.atmosphere.qualitymodel.MetricAggregationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see eubrazil.atmosphere.qualitymodel.MetricAggregationOperator
	 * @see #setOperator(MetricAggregationOperator)
	 * @model required="true"
	 * @generated
	 */
	MetricAggregationOperator getOperator();

	/**
	 * Sets the value of the '{@link eubrazil.atmosphere.qualitymodel.LeafAttribute#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see eubrazil.atmosphere.qualitymodel.MetricAggregationOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(MetricAggregationOperator value);

} // LeafAttribute
