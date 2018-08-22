/**
 */
package eubrazil.atmosphere.qualitymodel.impl;

import eubrazil.atmosphere.qualitymodel.*;

import java.sql.Timestamp;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityModelFactoryImpl extends EFactoryImpl implements QualityModelFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QualityModelFactoryImpl eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualityModelFactoryImpl init() {
		try {
			QualityModelFactoryImpl theQualityModelFactory = (QualityModelFactoryImpl)EPackage.Registry.INSTANCE.getEFactory(QualityModelPackageImpl.eNS_URI);
			if (theQualityModelFactory != null) {
				return theQualityModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QualityModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QualityModelPackageImpl.METRIC: return (EObject)createMetric();
			case QualityModelPackageImpl.COMPOSITE_ATTRIBUTE: return (EObject)createCompositeAttribute();
			case QualityModelPackageImpl.LEAF_ATTRIBUTE: return (EObject)createLeafAttribute();
			case QualityModelPackageImpl.HISTORICAL_DATA: return (EObject)createHistoricalData();
			case QualityModelPackageImpl.PREFERENCE: return (EObject)createPreference();
			case QualityModelPackageImpl.USER_PROFILE: return (EObject)createUserProfile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QualityModelPackageImpl.METRIC_AGGREGATION_OPERATOR:
				return createMetricAggregationOperatorFromString(eDataType, initialValue);
			case QualityModelPackageImpl.ATTRIBUTE_AGGREGATION_OPERATOR:
				return createAttributeAggregationOperatorFromString(eDataType, initialValue);
			case QualityModelPackageImpl.TIMESTAMP:
				return createTimestampFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QualityModelPackageImpl.METRIC_AGGREGATION_OPERATOR:
				return convertMetricAggregationOperatorToString(eDataType, instanceValue);
			case QualityModelPackageImpl.ATTRIBUTE_AGGREGATION_OPERATOR:
				return convertAttributeAggregationOperatorToString(eDataType, instanceValue);
			case QualityModelPackageImpl.TIMESTAMP:
				return convertTimestampToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeAttribute createCompositeAttribute() {
		CompositeAttributeImpl compositeAttribute = new CompositeAttributeImpl();
		return compositeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafAttribute createLeafAttribute() {
		LeafAttributeImpl leafAttribute = new LeafAttributeImpl();
		return leafAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoricalData createHistoricalData() {
		HistoricalDataImpl historicalData = new HistoricalDataImpl();
		return historicalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preference createPreference() {
		PreferenceImpl preference = new PreferenceImpl();
		return preference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfile createUserProfile() {
		UserProfileImpl userProfile = new UserProfileImpl();
		return userProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricAggregationOperator createMetricAggregationOperatorFromString(EDataType eDataType, String initialValue) {
		MetricAggregationOperator result = MetricAggregationOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricAggregationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAggregationOperator createAttributeAggregationOperatorFromString(EDataType eDataType, String initialValue) {
		AttributeAggregationOperator result = AttributeAggregationOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeAggregationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timestamp createTimestampFromString(EDataType eDataType, String initialValue) {
		return (Timestamp)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimestampToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityModelPackageImpl getQualityModelPackage() {
		return (QualityModelPackageImpl)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QualityModelPackageImpl getPackage() {
		return QualityModelPackageImpl.eINSTANCE;
	}

} //QualityModelFactoryImpl
