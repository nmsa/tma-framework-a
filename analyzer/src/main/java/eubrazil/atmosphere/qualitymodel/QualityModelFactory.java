/**
 */
package eubrazil.atmosphere.qualitymodel;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface QualityModelFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualityModelFactory INSTANCE = eubrazil.atmosphere.qualitymodel.impl.QualityModelFactoryImpl.eINSTANCE;

	/**
	 * Returns a new object of class '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric</em>'.
	 * @generated
	 */
	Metric createMetric();

	/**
	 * Returns a new object of class '<em>Composite Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Attribute</em>'.
	 * @generated
	 */
	CompositeAttribute createCompositeAttribute();

	/**
	 * Returns a new object of class '<em>Leaf Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf Attribute</em>'.
	 * @generated
	 */
	LeafAttribute createLeafAttribute();

	/**
	 * Returns a new object of class '<em>Historical Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Data</em>'.
	 * @generated
	 */
	HistoricalData createHistoricalData();

	/**
	 * Returns a new object of class '<em>Preference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preference</em>'.
	 * @generated
	 */
	Preference createPreference();

	/**
	 * Returns a new object of class '<em>User Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Profile</em>'.
	 * @generated
	 */
	UserProfile createUserProfile();

} //QualityModelFactory
