/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import eubrazil.atmosphere.exceptions.UndefinedMetricException;

/**
 * @generated
 */
public class LeafAttribute extends Attribute {
	/**
	 * @generated
	 */
	protected static final double NORMALIZATION_MIN_EDEFAULT = 0.0;

	/**
	 * @generated
	 */
	protected double normalizationMin = NORMALIZATION_MIN_EDEFAULT;

	/**
	 * @generated
	 */
	protected boolean normalizationMinESet;

	/**
	 * @generated
	 */
	protected static final double NORMALIZATION_MAX_EDEFAULT = 1.0;

	/**
	 * @generated
	 */
	protected double normalizationMax = NORMALIZATION_MAX_EDEFAULT;

	/**
	 * @generated
	 */
	protected boolean normalizationMaxESet;

	/**
	 * @generated
	 */
	protected static final MetricAggregationOperator OPERATOR_EDEFAULT = MetricAggregationOperator.AVERAGE;

	/**
	 * @generated
	 */
	protected MetricAggregationOperator operator = OPERATOR_EDEFAULT;

	/**
	 * @generated
	 */
	protected static final int NUM_SAMPLES_EDEFAULT = 1;

	/**
	 * @generated
	 */
	protected int numSamples = NUM_SAMPLES_EDEFAULT;

	/**
	 * @generated
	 */
	protected static final MetricNormalizationKind NORMALIZATION_KIND_EDEFAULT = MetricNormalizationKind.BENEFIT;

	/**
	 * @generated
	 */
	protected MetricNormalizationKind normalizationKind = NORMALIZATION_KIND_EDEFAULT;

	/**
	 * @generated
	 */
	public LeafAttribute() {
		super();
	}

	/**
	 * @generated
	 */
	public double getNormalizationMin() {
		return normalizationMin;
	}

	/**
	 * @generated
	 */
	public void setNormalizationMin(double newNormalizationMin) {
		normalizationMin = newNormalizationMin;
		normalizationMinESet = true;
	}

	/**
	 * @generated
	 */
	public void unsetNormalizationMin() {
		normalizationMin = NORMALIZATION_MIN_EDEFAULT;
		normalizationMinESet = false;
	}

	/**
	 * @generated
	 */
	public boolean isSetNormalizationMin() {
		return normalizationMinESet;
	}

	/**
	 * @generated
	 */
	public double getNormalizationMax() {
		return normalizationMax;
	}

	/**
	 * @generated
	 */
	public void setNormalizationMax(double newNormalizationMax) {
		normalizationMax = newNormalizationMax;
		normalizationMaxESet = true;
	}

	/**
	 * @generated
	 */
	public void unsetNormalizationMax() {
		normalizationMax = NORMALIZATION_MAX_EDEFAULT;
		normalizationMaxESet = false;
	}

	/**
	 * @generated
	 */
	public boolean isSetNormalizationMax() {
		return normalizationMaxESet;
	}

	/**
	 * @generated
	 */
	public MetricAggregationOperator getOperator() {
		return operator;
	}

	/**
	 * @generated
	 */
	public void setOperator(MetricAggregationOperator newOperator) {
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
	}

	/**
	 * @generated
	 */
	public int getNumSamples() {
		return numSamples;
	}

	/**
	 * @generated
	 */
	public void setNumSamples(int newNumSamples) {
		numSamples = newNumSamples;
	}

	/**
	 * @generated
	 */
	public MetricNormalizationKind getNormalizationKind() {
		return normalizationKind;
	}

	/**
	 * @generated
	 */
	public void setNormalizationKind(MetricNormalizationKind newNormalizationKind) {
		normalizationKind = newNormalizationKind == null ? NORMALIZATION_KIND_EDEFAULT : newNormalizationKind;
	}

	/**
	 * @throws Exception 
	 * @generated NOT
	 */
	protected double calculateAverage(ConfigurationProfile profile) {
				
		double average = 0;
		double amount = 0;
		// TODO in case the attribute has more than one metric, what to do? Average of average?
		Iterator<Metric> iterMetric = profile.getMetric().iterator();
		while (iterMetric.hasNext()) {
			Metric metric = iterMetric.next();
			List<Data> data = metric.updateData();
			amount += (double)data.size();
			Iterator<Data> iterData = data.iterator();
			while (iterData.hasNext()) {
				Data measure = iterData.next();
				average += measure.getValue();
			}
		}

		return average/amount;
	}

	/**
	 * @generated NOT
	 */
	protected double calculateMinimum(ConfigurationProfile profile) {

		double minimum = 0;
		// TODO in case the attribute has more than one metric, what to do? Minimum of minimum?
		Iterator<Metric> iterMetric = profile.getMetric().iterator();
		while (iterMetric.hasNext()) {
			Metric metric = iterMetric.next();
			List<Data> data = metric.updateData();
			Iterator<Data> iterData = data.iterator();
			while (iterData.hasNext()) {
				Data measure = iterData.next();
				if (measure.getValue() < minimum)
					minimum = measure.getValue();
			}
		}

		return minimum;
	}

	/**
	 * @generated
	 */
	protected double calculateMaximum(ConfigurationProfile profile) {
		double maximum = 0;
		// TODO in case the attribute has more than one metric, what to do? Maximum of maximum?
		Iterator<Metric> iterMetric = profile.getMetric().iterator();
		while (iterMetric.hasNext()) {
			Metric metric = iterMetric.next();
			List<Data> data = metric.updateData();
			Iterator<Data> iterData = data.iterator();
			while (iterData.hasNext()) {
				Data measure = iterData.next();
				if (measure.getValue() > maximum)
					maximum = measure.getValue();
			}
		}

		return maximum;
	}

	/**
	 * @generated
	 */
	protected double calculateSum(ConfigurationProfile profile) {
		double sum = 0;
		// TODO in case the attribute has more than one metric, what to do? Minimum of minimum?
		Iterator<Metric> iterMetric = profile.getMetric().iterator();
		while (iterMetric.hasNext()) {
			Metric metric = iterMetric.next();
			List<Data> data = metric.updateData();
			Iterator<Data> iterData = data.iterator();
			while (iterData.hasNext()) {
				Data measure = iterData.next();
				sum += measure.getValue();
			}
		}

		return sum;
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (normalizationMin: ");
		if (normalizationMinESet) result.append(normalizationMin); else result.append("<unset>");
		result.append(", normalizationMax: ");
		if (normalizationMaxESet) result.append(normalizationMax); else result.append("<unset>");
		result.append(", operator: ");
		result.append(operator);
		result.append(", numSamples: ");
		result.append(numSamples);
		result.append(", normalizationKind: ");
		result.append(normalizationKind);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public HistoricalData calculate(ConfigurationProfile profile) throws UndefinedMetricException {

		if (profile == null || profile.getMetric().isEmpty()) 
			throw new UndefinedMetricException("No defined metric for leaf atribute "+this.name);

		HistoricalData d = new HistoricalData();
		d.setInstant(new Timestamp(System.currentTimeMillis()));
		d.attribute = this;
		
		switch (operator) {
		case AVERAGE:
			d.value = calculateAverage(profile);
			break;
		case MINIMUM:
			d.value = calculateMinimum(profile);
			break;
		case MAXIMUM:
			d.value = calculateMaximum(profile);
			break;
		case SUM:
			d.value = calculateSum(profile);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return d;
	}

} // LeafAttribute
