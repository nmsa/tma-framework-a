/**
 */
package eubrazil.atmosphere.qualitymodel;

/**
 * @generated
 */
public class Preference {
	/**
	 * @generated
	 */
	protected static final double WEIGHT_EDEFAULT = 1.0;

	/**
	 * @generated
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * @generated
	 */
	protected Attribute attribute;

	/**
	 * @generated
	 */
	protected static final double THRESHOLD_EDEFAULT = 1.0;

	/**
	 * @generated
	 */
	protected double threshold = THRESHOLD_EDEFAULT;

	/**
	 * @generated
	 */
	public Preference() {
		super();
	}

	/**
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @generated
	 */
	public void setWeight(double newWeight) {
		weight = newWeight;
	}

	/**
	 * @generated
	 */
	public Attribute getAttribute() {
		return attribute;
	}

	/**
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		attribute = newAttribute;
	}

	/**
	 * @generated
	 */
	public double getThreshold() {
		return threshold;
	}

	/**
	 * @generated
	 */
	public void setThreshold(double newThreshold) {
		threshold = newThreshold;
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (weight: ");
		result.append(weight);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(')');
		return result.toString();
	}

} // Preference
