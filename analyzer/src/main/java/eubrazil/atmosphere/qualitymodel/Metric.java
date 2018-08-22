/**
 */
package eubrazil.atmosphere.qualitymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.Metric#getProbe <em>Probe</em>}</li>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.Metric#getDescription <em>Description</em>}</li>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.Metric#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Metric {
	/**
	 * Returns the value of the '<em><b>Probe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probe</em>' attribute.
	 * @see #setProbe(int)
	 * @model required="true"
	 * @generated
	 */
	int getProbe();

	/**
	 * Sets the value of the '{@link eubrazil.atmosphere.qualitymodel.Metric#getProbe <em>Probe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probe</em>' attribute.
	 * @see #getProbe()
	 * @generated
	 */
	void setProbe(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link eubrazil.atmosphere.qualitymodel.Metric#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(int)
	 * @model required="true"
	 * @generated
	 */
	int getResource();

	/**
	 * Sets the value of the '{@link eubrazil.atmosphere.qualitymodel.Metric#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(int value);

} // Metric
