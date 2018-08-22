/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @generated
 */
public class LeafAttribute extends Attribute {
	/**
	 * @generated
	 */
	protected static final double LOWER_BOUND_EDEFAULT = 0.0;

	/**
	 * @generated
	 */
	protected double lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * @generated
	 */
	protected boolean lowerBoundESet;

	/**
	 * @generated
	 */
	protected static final double UPPER_BOUND_EDEFAULT = 1.0;

	/**
	 * @generated
	 */
	protected double upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * @generated
	 */
	protected boolean upperBoundESet;

	/**
	 * @generated
	 */
	protected List<Metric> metric;

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
	public LeafAttribute() {
		super();
	}

	/**
	 * @generated
	 */
	public double getLowerBound() {
		return lowerBound;
	}

	/**
	 * @generated
	 */
	public void setLowerBound(double newLowerBound) {
		lowerBound = newLowerBound;
		lowerBoundESet = true;
	}

	/**
	 * @generated
	 */
	public void unsetLowerBound() {
		lowerBound = LOWER_BOUND_EDEFAULT;
		lowerBoundESet = false;
	}

	/**
	 * @generated
	 */
	public boolean isSetLowerBound() {
		return lowerBoundESet;
	}

	/**
	 * @generated
	 */
	public double getUpperBound() {
		return upperBound;
	}

	/**
	 * @generated
	 */
	public void setUpperBound(double newUpperBound) {
		upperBound = newUpperBound;
		upperBoundESet = true;
	}

	/**
	 * @generated
	 */
	public void unsetUpperBound() {
		upperBound = UPPER_BOUND_EDEFAULT;
		upperBoundESet = false;
	}

	/**
	 * @generated
	 */
	public boolean isSetUpperBound() {
		return upperBoundESet;
	}

	/**
	 * @generated
	 */
	public List<Metric> getMetric() {
		if (metric == null) {
			metric = new ArrayList<Metric>();
		}
		return metric;
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
	protected double calculateAverage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected double calculateMinimum() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected double calculateMaximum() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected double calculateSum() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lowerBound: ");
		if (lowerBoundESet) result.append(lowerBound); else result.append("<unset>");
		result.append(", upperBound: ");
		if (upperBoundESet) result.append(upperBound); else result.append("<unset>");
		result.append(", operator: ");
		result.append(operator);
		result.append(", numSamples: ");
		result.append(numSamples);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public HistoricalData calculate(UserProfile user) {
		HistoricalData d = new HistoricalData();
		d.setInstant(new Timestamp(System.currentTimeMillis()));
		d.attribute = this;
		
		switch (operator) {
		case AVERAGE:
			d.value = calculateAverage();
			break;
		case MINIMUM:
			d.value = calculateMinimum();
			break;
		case MAXIMUM:
			d.value = calculateMaximum();
			break;
		case SUM:
			d.value = calculateSum();
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return d;
	}

} // LeafAttribute
