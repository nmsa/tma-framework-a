/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.sql.Timestamp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Historical Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.HistoricalData#getInstant <em>Instant</em>}</li>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.HistoricalData#getValue <em>Value</em>}</li>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.HistoricalData#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface HistoricalData {
	/**
	 * Returns the value of the '<em><b>Instant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instant</em>' attribute.
	 * @see #setInstant(Timestamp)
	 * @model dataType="eubrazil.atmosphere.qualitymodel.Timestamp" required="true"
	 * @generated
	 */
	Timestamp getInstant();

	/**
	 * Sets the value of the '{@link eubrazil.atmosphere.qualitymodel.HistoricalData#getInstant <em>Instant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instant</em>' attribute.
	 * @see #getInstant()
	 * @generated
	 */
	void setInstant(Timestamp value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link eubrazil.atmosphere.qualitymodel.HistoricalData#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link eubrazil.atmosphere.qualitymodel.HistoricalData#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // HistoricalData
