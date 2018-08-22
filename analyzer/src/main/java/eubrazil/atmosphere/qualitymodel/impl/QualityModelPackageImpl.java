/**
 */
package eubrazil.atmosphere.qualitymodel.impl;

import eubrazil.atmosphere.qualitymodel.Attribute;
import eubrazil.atmosphere.qualitymodel.AttributeAggregationOperator;
import eubrazil.atmosphere.qualitymodel.CompositeAttribute;
import eubrazil.atmosphere.qualitymodel.HistoricalData;
import eubrazil.atmosphere.qualitymodel.LeafAttribute;
import eubrazil.atmosphere.qualitymodel.Metric;
import eubrazil.atmosphere.qualitymodel.MetricAggregationOperator;
import eubrazil.atmosphere.qualitymodel.Preference;
import eubrazil.atmosphere.qualitymodel.QualityModelFactory;
import eubrazil.atmosphere.qualitymodel.UserProfile;

import java.sql.Timestamp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eubrazil.atmosphere.qualitymodel.QualityModelFactory
 * @model kind="package"
 * @generated
 */
public class QualityModelPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "qualitymodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "https://www.atmosphere-eubrazil.eu/analyzer/qualitymodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "qm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QualityModelPackageImpl eINSTANCE = eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link eubrazil.atmosphere.qualitymodel.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eubrazil.atmosphere.qualitymodel.impl.MetricImpl
	 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getMetric()
	 * @generated
	 */
	public static final int METRIC = 0;

	/**
	 * The feature id for the '<em><b>Probe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METRIC__PROBE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METRIC__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METRIC__RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METRIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eubrazil.atmosphere.qualitymodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eubrazil.atmosphere.qualitymodel.impl.AttributeImpl
	 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getAttribute()
	 * @generated
	 */
	public static final int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE__CURRENT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE___CALCULATE__USERPROFILE = 0;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link eubrazil.atmosphere.qualitymodel.impl.CompositeAttributeImpl <em>Composite Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eubrazil.atmosphere.qualitymodel.impl.CompositeAttributeImpl
	 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getCompositeAttribute()
	 * @generated
	 */
	public static final int COMPOSITE_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_ATTRIBUTE__CURRENT_VALUE = ATTRIBUTE__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_ATTRIBUTE__CHILDREN = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_ATTRIBUTE__OPERATOR = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_ATTRIBUTE___CALCULATE__USERPROFILE = ATTRIBUTE___CALCULATE__USERPROFILE;

	/**
	 * The number of operations of the '<em>Composite Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eubrazil.atmosphere.qualitymodel.impl.LeafAttributeImpl <em>Leaf Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eubrazil.atmosphere.qualitymodel.impl.LeafAttributeImpl
	 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getLeafAttribute()
	 * @generated
	 */
	public static final int LEAF_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_ATTRIBUTE__CURRENT_VALUE = ATTRIBUTE__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_ATTRIBUTE__MIN = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_ATTRIBUTE__MAX = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_ATTRIBUTE__METRIC = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_ATTRIBUTE__OPERATOR = ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Leaf Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_ATTRIBUTE___CALCULATE__USERPROFILE = ATTRIBUTE___CALCULATE__USERPROFILE;

	/**
	 * The number of operations of the '<em>Leaf Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eubrazil.atmosphere.qualitymodel.impl.HistoricalDataImpl <em>Historical Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eubrazil.atmosphere.qualitymodel.impl.HistoricalDataImpl
	 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getHistoricalData()
	 * @generated
	 */
	public static final int HISTORICAL_DATA = 4;

	/**
	 * The feature id for the '<em><b>Instant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HISTORICAL_DATA__INSTANT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HISTORICAL_DATA__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HISTORICAL_DATA__ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Historical Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HISTORICAL_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Historical Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HISTORICAL_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eubrazil.atmosphere.qualitymodel.impl.PreferenceImpl <em>Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eubrazil.atmosphere.qualitymodel.impl.PreferenceImpl
	 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getPreference()
	 * @generated
	 */
	public static final int PREFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PREFERENCE__WEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PREFERENCE__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PREFERENCE__THRESHOLD = 2;

	/**
	 * The number of structural features of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PREFERENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PREFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eubrazil.atmosphere.qualitymodel.impl.UserProfileImpl <em>User Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eubrazil.atmosphere.qualitymodel.impl.UserProfileImpl
	 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getUserProfile()
	 * @generated
	 */
	public static final int USER_PROFILE = 6;

	/**
	 * The feature id for the '<em><b>Preference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_PROFILE__PREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_PROFILE__USER_ID = 1;

	/**
	 * The number of structural features of the '<em>User Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_PROFILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eubrazil.atmosphere.qualitymodel.MetricAggregationOperator <em>Metric Aggregation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eubrazil.atmosphere.qualitymodel.MetricAggregationOperator
	 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getMetricAggregationOperator()
	 * @generated
	 */
	public static final int METRIC_AGGREGATION_OPERATOR = 7;

	/**
	 * The meta object id for the '{@link eubrazil.atmosphere.qualitymodel.AttributeAggregationOperator <em>Attribute Aggregation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eubrazil.atmosphere.qualitymodel.AttributeAggregationOperator
	 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getAttributeAggregationOperator()
	 * @generated
	 */
	public static final int ATTRIBUTE_AGGREGATION_OPERATOR = 8;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Timestamp
	 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getTimestamp()
	 * @generated
	 */
	public static final int TIMESTAMP = 9;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricAggregationOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeAggregationOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timestampEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QualityModelPackageImpl() {
		super(eNS_URI, ((EFactory)QualityModelFactory.INSTANCE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QualityModelPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QualityModelPackageImpl init() {
		if (isInited) return (QualityModelPackageImpl)EPackage.Registry.INSTANCE.getEPackage(QualityModelPackageImpl.eNS_URI);

		// Obtain or create and register package
		QualityModelPackageImpl theQualityModelPackage = (QualityModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QualityModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QualityModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theQualityModelPackage.createPackageContents();

		// Initialize created meta-data
		theQualityModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQualityModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QualityModelPackageImpl.eNS_URI, theQualityModelPackage);
		return theQualityModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link eubrazil.atmosphere.qualitymodel.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.Metric
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.Metric#getProbe <em>Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probe</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.Metric#getProbe()
	 * @see #getMetric()
	 * @generated
	 */
	public EAttribute getMetric_Probe() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.Metric#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.Metric#getDescription()
	 * @see #getMetric()
	 * @generated
	 */
	public EAttribute getMetric_Description() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.Metric#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.Metric#getResource()
	 * @see #getMetric()
	 * @generated
	 */
	public EAttribute getMetric_Resource() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link eubrazil.atmosphere.qualitymodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.Attribute
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.Attribute#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.Attribute#getCurrentValue()
	 * @see #getAttribute()
	 * @generated
	 */
	public EAttribute getAttribute_CurrentValue() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the '{@link eubrazil.atmosphere.qualitymodel.Attribute#calculate(eubrazil.atmosphere.qualitymodel.UserProfile) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see eubrazil.atmosphere.qualitymodel.Attribute#calculate(eubrazil.atmosphere.qualitymodel.UserProfile)
	 * @generated
	 */
	public EOperation getAttribute__Calculate__UserProfile() {
		return attributeEClass.getEOperations().get(0);
	}

	/**
	 * Returns the meta object for class '{@link eubrazil.atmosphere.qualitymodel.CompositeAttribute <em>Composite Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Attribute</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.CompositeAttribute
	 * @generated
	 */
	public EClass getCompositeAttribute() {
		return compositeAttributeEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link eubrazil.atmosphere.qualitymodel.CompositeAttribute#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.CompositeAttribute#getChildren()
	 * @see #getCompositeAttribute()
	 * @generated
	 */
	public EReference getCompositeAttribute_Children() {
		return (EReference)compositeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.CompositeAttribute#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.CompositeAttribute#getOperator()
	 * @see #getCompositeAttribute()
	 * @generated
	 */
	public EAttribute getCompositeAttribute_Operator() {
		return (EAttribute)compositeAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link eubrazil.atmosphere.qualitymodel.LeafAttribute <em>Leaf Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Attribute</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.LeafAttribute
	 * @generated
	 */
	public EClass getLeafAttribute() {
		return leafAttributeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.LeafAttribute#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.LeafAttribute#getMin()
	 * @see #getLeafAttribute()
	 * @generated
	 */
	public EAttribute getLeafAttribute_Min() {
		return (EAttribute)leafAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.LeafAttribute#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.LeafAttribute#getMax()
	 * @see #getLeafAttribute()
	 * @generated
	 */
	public EAttribute getLeafAttribute_Max() {
		return (EAttribute)leafAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link eubrazil.atmosphere.qualitymodel.LeafAttribute#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metric</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.LeafAttribute#getMetric()
	 * @see #getLeafAttribute()
	 * @generated
	 */
	public EReference getLeafAttribute_Metric() {
		return (EReference)leafAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.LeafAttribute#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.LeafAttribute#getOperator()
	 * @see #getLeafAttribute()
	 * @generated
	 */
	public EAttribute getLeafAttribute_Operator() {
		return (EAttribute)leafAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link eubrazil.atmosphere.qualitymodel.HistoricalData <em>Historical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Data</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.HistoricalData
	 * @generated
	 */
	public EClass getHistoricalData() {
		return historicalDataEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.HistoricalData#getInstant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instant</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.HistoricalData#getInstant()
	 * @see #getHistoricalData()
	 * @generated
	 */
	public EAttribute getHistoricalData_Instant() {
		return (EAttribute)historicalDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.HistoricalData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.HistoricalData#getValue()
	 * @see #getHistoricalData()
	 * @generated
	 */
	public EAttribute getHistoricalData_Value() {
		return (EAttribute)historicalDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link eubrazil.atmosphere.qualitymodel.HistoricalData#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.HistoricalData#getAttribute()
	 * @see #getHistoricalData()
	 * @generated
	 */
	public EReference getHistoricalData_Attribute() {
		return (EReference)historicalDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link eubrazil.atmosphere.qualitymodel.Preference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preference</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.Preference
	 * @generated
	 */
	public EClass getPreference() {
		return preferenceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.Preference#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.Preference#getWeight()
	 * @see #getPreference()
	 * @generated
	 */
	public EAttribute getPreference_Weight() {
		return (EAttribute)preferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link eubrazil.atmosphere.qualitymodel.Preference#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.Preference#getAttribute()
	 * @see #getPreference()
	 * @generated
	 */
	public EReference getPreference_Attribute() {
		return (EReference)preferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.Preference#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.Preference#getThreshold()
	 * @see #getPreference()
	 * @generated
	 */
	public EAttribute getPreference_Threshold() {
		return (EAttribute)preferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link eubrazil.atmosphere.qualitymodel.UserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Profile</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.UserProfile
	 * @generated
	 */
	public EClass getUserProfile() {
		return userProfileEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link eubrazil.atmosphere.qualitymodel.UserProfile#getPreference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preference</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.UserProfile#getPreference()
	 * @see #getUserProfile()
	 * @generated
	 */
	public EReference getUserProfile_Preference() {
		return (EReference)userProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link eubrazil.atmosphere.qualitymodel.UserProfile#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.UserProfile#getUserID()
	 * @see #getUserProfile()
	 * @generated
	 */
	public EAttribute getUserProfile_UserID() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for enum '{@link eubrazil.atmosphere.qualitymodel.MetricAggregationOperator <em>Metric Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric Aggregation Operator</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.MetricAggregationOperator
	 * @generated
	 */
	public EEnum getMetricAggregationOperator() {
		return metricAggregationOperatorEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link eubrazil.atmosphere.qualitymodel.AttributeAggregationOperator <em>Attribute Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Aggregation Operator</em>'.
	 * @see eubrazil.atmosphere.qualitymodel.AttributeAggregationOperator
	 * @generated
	 */
	public EEnum getAttributeAggregationOperator() {
		return attributeAggregationOperatorEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link java.sql.Timestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timestamp</em>'.
	 * @see java.sql.Timestamp
	 * @model instanceClass="java.sql.Timestamp"
	 * @generated
	 */
	public EDataType getTimestamp() {
		return timestampEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public QualityModelFactory getQualityModelFactory() {
		return (QualityModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__PROBE);
		createEAttribute(metricEClass, METRIC__DESCRIPTION);
		createEAttribute(metricEClass, METRIC__RESOURCE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__CURRENT_VALUE);
		createEOperation(attributeEClass, ATTRIBUTE___CALCULATE__USERPROFILE);

		compositeAttributeEClass = createEClass(COMPOSITE_ATTRIBUTE);
		createEReference(compositeAttributeEClass, COMPOSITE_ATTRIBUTE__CHILDREN);
		createEAttribute(compositeAttributeEClass, COMPOSITE_ATTRIBUTE__OPERATOR);

		leafAttributeEClass = createEClass(LEAF_ATTRIBUTE);
		createEAttribute(leafAttributeEClass, LEAF_ATTRIBUTE__MIN);
		createEAttribute(leafAttributeEClass, LEAF_ATTRIBUTE__MAX);
		createEReference(leafAttributeEClass, LEAF_ATTRIBUTE__METRIC);
		createEAttribute(leafAttributeEClass, LEAF_ATTRIBUTE__OPERATOR);

		historicalDataEClass = createEClass(HISTORICAL_DATA);
		createEAttribute(historicalDataEClass, HISTORICAL_DATA__INSTANT);
		createEAttribute(historicalDataEClass, HISTORICAL_DATA__VALUE);
		createEReference(historicalDataEClass, HISTORICAL_DATA__ATTRIBUTE);

		preferenceEClass = createEClass(PREFERENCE);
		createEAttribute(preferenceEClass, PREFERENCE__WEIGHT);
		createEReference(preferenceEClass, PREFERENCE__ATTRIBUTE);
		createEAttribute(preferenceEClass, PREFERENCE__THRESHOLD);

		userProfileEClass = createEClass(USER_PROFILE);
		createEReference(userProfileEClass, USER_PROFILE__PREFERENCE);
		createEAttribute(userProfileEClass, USER_PROFILE__USER_ID);

		// Create enums
		metricAggregationOperatorEEnum = createEEnum(METRIC_AGGREGATION_OPERATOR);
		attributeAggregationOperatorEEnum = createEEnum(ATTRIBUTE_AGGREGATION_OPERATOR);

		// Create data types
		timestampEDataType = createEDataType(TIMESTAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeAttributeEClass.getESuperTypes().add(this.getAttribute());
		leafAttributeEClass.getESuperTypes().add(this.getAttribute());

		// Initialize classes, features, and operations; add parameters
		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Probe(), ecorePackage.getEInt(), "probe", null, 1, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Description(), ecorePackage.getEString(), "description", null, 1, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Resource(), ecorePackage.getEInt(), "resource", null, 1, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_CurrentValue(), ecorePackage.getEDouble(), "currentValue", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAttribute__Calculate__UserProfile(), ecorePackage.getEDouble(), "calculate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUserProfile(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositeAttributeEClass, CompositeAttribute.class, "CompositeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeAttribute_Children(), this.getAttribute(), null, "children", null, 1, -1, CompositeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeAttribute_Operator(), this.getAttributeAggregationOperator(), "operator", null, 1, 1, CompositeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leafAttributeEClass, LeafAttribute.class, "LeafAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeafAttribute_Min(), ecorePackage.getEDouble(), "min", null, 0, 1, LeafAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeafAttribute_Max(), ecorePackage.getEDouble(), "max", "1.0", 0, 1, LeafAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeafAttribute_Metric(), this.getMetric(), null, "metric", null, 1, -1, LeafAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeafAttribute_Operator(), this.getMetricAggregationOperator(), "operator", null, 1, 1, LeafAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(historicalDataEClass, HistoricalData.class, "HistoricalData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistoricalData_Instant(), this.getTimestamp(), "instant", null, 1, 1, HistoricalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistoricalData_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, HistoricalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistoricalData_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, HistoricalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preferenceEClass, Preference.class, "Preference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreference_Weight(), ecorePackage.getEDouble(), "weight", "1.0", 1, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreference_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreference_Threshold(), ecorePackage.getEDouble(), "threshold", "1.0", 1, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userProfileEClass, UserProfile.class, "UserProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserProfile_Preference(), this.getPreference(), null, "preference", null, 0, -1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProfile_UserID(), ecorePackage.getEInt(), "userID", null, 1, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(metricAggregationOperatorEEnum, MetricAggregationOperator.class, "MetricAggregationOperator");
		addEEnumLiteral(metricAggregationOperatorEEnum, MetricAggregationOperator.AVERAGE);
		addEEnumLiteral(metricAggregationOperatorEEnum, MetricAggregationOperator.MINIMUM);
		addEEnumLiteral(metricAggregationOperatorEEnum, MetricAggregationOperator.MAXIMUM);
		addEEnumLiteral(metricAggregationOperatorEEnum, MetricAggregationOperator.SUM);

		initEEnum(attributeAggregationOperatorEEnum, AttributeAggregationOperator.class, "AttributeAggregationOperator");
		addEEnumLiteral(attributeAggregationOperatorEEnum, AttributeAggregationOperator.NEUTRALITY);
		addEEnumLiteral(attributeAggregationOperatorEEnum, AttributeAggregationOperator.SIMULTANEITY);
		addEEnumLiteral(attributeAggregationOperatorEEnum, AttributeAggregationOperator.REPLACEABILITY);

		// Initialize data types
		initEDataType(timestampEDataType, Timestamp.class, "Timestamp", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link eubrazil.atmosphere.qualitymodel.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eubrazil.atmosphere.qualitymodel.impl.MetricImpl
		 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getMetric()
		 * @generated
		 */
		public static final EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Probe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute METRIC__PROBE = eINSTANCE.getMetric_Probe();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute METRIC__DESCRIPTION = eINSTANCE.getMetric_Description();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute METRIC__RESOURCE = eINSTANCE.getMetric_Resource();

		/**
		 * The meta object literal for the '{@link eubrazil.atmosphere.qualitymodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eubrazil.atmosphere.qualitymodel.impl.AttributeImpl
		 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getAttribute()
		 * @generated
		 */
		public static final EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ATTRIBUTE__CURRENT_VALUE = eINSTANCE.getAttribute_CurrentValue();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation ATTRIBUTE___CALCULATE__USERPROFILE = eINSTANCE.getAttribute__Calculate__UserProfile();

		/**
		 * The meta object literal for the '{@link eubrazil.atmosphere.qualitymodel.impl.CompositeAttributeImpl <em>Composite Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eubrazil.atmosphere.qualitymodel.impl.CompositeAttributeImpl
		 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getCompositeAttribute()
		 * @generated
		 */
		public static final EClass COMPOSITE_ATTRIBUTE = eINSTANCE.getCompositeAttribute();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPOSITE_ATTRIBUTE__CHILDREN = eINSTANCE.getCompositeAttribute_Children();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPOSITE_ATTRIBUTE__OPERATOR = eINSTANCE.getCompositeAttribute_Operator();

		/**
		 * The meta object literal for the '{@link eubrazil.atmosphere.qualitymodel.impl.LeafAttributeImpl <em>Leaf Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eubrazil.atmosphere.qualitymodel.impl.LeafAttributeImpl
		 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getLeafAttribute()
		 * @generated
		 */
		public static final EClass LEAF_ATTRIBUTE = eINSTANCE.getLeafAttribute();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LEAF_ATTRIBUTE__MIN = eINSTANCE.getLeafAttribute_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LEAF_ATTRIBUTE__MAX = eINSTANCE.getLeafAttribute_Max();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LEAF_ATTRIBUTE__METRIC = eINSTANCE.getLeafAttribute_Metric();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LEAF_ATTRIBUTE__OPERATOR = eINSTANCE.getLeafAttribute_Operator();

		/**
		 * The meta object literal for the '{@link eubrazil.atmosphere.qualitymodel.impl.HistoricalDataImpl <em>Historical Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eubrazil.atmosphere.qualitymodel.impl.HistoricalDataImpl
		 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getHistoricalData()
		 * @generated
		 */
		public static final EClass HISTORICAL_DATA = eINSTANCE.getHistoricalData();

		/**
		 * The meta object literal for the '<em><b>Instant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HISTORICAL_DATA__INSTANT = eINSTANCE.getHistoricalData_Instant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HISTORICAL_DATA__VALUE = eINSTANCE.getHistoricalData_Value();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HISTORICAL_DATA__ATTRIBUTE = eINSTANCE.getHistoricalData_Attribute();

		/**
		 * The meta object literal for the '{@link eubrazil.atmosphere.qualitymodel.impl.PreferenceImpl <em>Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eubrazil.atmosphere.qualitymodel.impl.PreferenceImpl
		 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getPreference()
		 * @generated
		 */
		public static final EClass PREFERENCE = eINSTANCE.getPreference();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PREFERENCE__WEIGHT = eINSTANCE.getPreference_Weight();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PREFERENCE__ATTRIBUTE = eINSTANCE.getPreference_Attribute();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PREFERENCE__THRESHOLD = eINSTANCE.getPreference_Threshold();

		/**
		 * The meta object literal for the '{@link eubrazil.atmosphere.qualitymodel.impl.UserProfileImpl <em>User Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eubrazil.atmosphere.qualitymodel.impl.UserProfileImpl
		 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getUserProfile()
		 * @generated
		 */
		public static final EClass USER_PROFILE = eINSTANCE.getUserProfile();

		/**
		 * The meta object literal for the '<em><b>Preference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USER_PROFILE__PREFERENCE = eINSTANCE.getUserProfile_Preference();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute USER_PROFILE__USER_ID = eINSTANCE.getUserProfile_UserID();

		/**
		 * The meta object literal for the '{@link eubrazil.atmosphere.qualitymodel.MetricAggregationOperator <em>Metric Aggregation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eubrazil.atmosphere.qualitymodel.MetricAggregationOperator
		 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getMetricAggregationOperator()
		 * @generated
		 */
		public static final EEnum METRIC_AGGREGATION_OPERATOR = eINSTANCE.getMetricAggregationOperator();

		/**
		 * The meta object literal for the '{@link eubrazil.atmosphere.qualitymodel.AttributeAggregationOperator <em>Attribute Aggregation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eubrazil.atmosphere.qualitymodel.AttributeAggregationOperator
		 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getAttributeAggregationOperator()
		 * @generated
		 */
		public static final EEnum ATTRIBUTE_AGGREGATION_OPERATOR = eINSTANCE.getAttributeAggregationOperator();

		/**
		 * The meta object literal for the '<em>Timestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Timestamp
		 * @see eubrazil.atmosphere.qualitymodel.impl.QualityModelPackageImpl#getTimestamp()
		 * @generated
		 */
		public static final EDataType TIMESTAMP = eINSTANCE.getTimestamp();

	}

} //QualityModelPackageImpl
