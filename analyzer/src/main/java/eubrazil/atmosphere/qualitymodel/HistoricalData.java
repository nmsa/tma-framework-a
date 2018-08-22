/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.sql.Timestamp;

/**
 * @generated
 */
public class HistoricalData {
	/**
	 * @generated
	 */
	protected static final Timestamp INSTANT_EDEFAULT = null;

	/**
	 * @generated
	 */
	protected Timestamp instant = INSTANT_EDEFAULT;

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
	protected Attribute attribute;

	/**
	 * @generated
	 */
	public HistoricalData() {
		super();
	}

	/**
	 * @generated
	 */
	public Timestamp getInstant() {
		return instant;
	}

	/**
	 * @generated
	 */
	public void setInstant(Timestamp newInstant) {
		instant = newInstant;
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
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (instant: ");
		result.append(instant);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} // HistoricalData
