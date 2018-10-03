/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.sql.Timestamp;

/**
 * @generated
 */
public class Data {
	/**
	 * @generated
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * @generated
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * @generated
	 */
	protected static final Timestamp VALUE_TIME_EDEFAULT = null;

	/**
	 * @generated
	 */
	protected Timestamp valueTime = VALUE_TIME_EDEFAULT;

	/**
	 * @generated
	 */
	public Data() {
		super();
	}

	/**
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @generated
	 */
	public void setValue(double newValue) {
		value = newValue;
	}

	/**
	 * @generated
	 */
	public Timestamp getValueTime() {
		return valueTime;
	}

	/**
	 * @generated
	 */
	public void setValueTime(Timestamp newValueTime) {
		valueTime = newValueTime;
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", valueTime: ");
		result.append(valueTime);
		result.append(')');
		return result.toString();
	}

} // Data
