/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @generated
 */
public class CompositeAttribute extends Attribute {
	/**
	 * @generated
	 */
	protected List<Attribute> children;

	/**
	 * @generated
	 */
	protected static final AttributeAggregationOperator OPERATOR_EDEFAULT = AttributeAggregationOperator.NEUTRALITY;

	/**
	 * @generated
	 */
	protected AttributeAggregationOperator operator = OPERATOR_EDEFAULT;

	/**
	 * @generated
	 */
	public CompositeAttribute() {
		super();
	}

	/**
	 * @generated
	 */
	public List<Attribute> getChildren() {
		if (children == null) {
			children = new ArrayList<Attribute>();
		}
		return children;
	}

	/**
	 * @generated
	 */
	public AttributeAggregationOperator getOperator() {
		return operator;
	}

	/**
	 * @generated
	 */
	public void setOperator(AttributeAggregationOperator newOperator) {
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
	}

	/**
	 * @generated
	 */
	protected double calculateNeutrality(ConfigurationProfile profile) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected double calculateSimultaneity(ConfigurationProfile profile) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected double calculateReplaceability(ConfigurationProfile profile) {
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public HistoricalData calculate(ConfigurationProfile profile) {
		HistoricalData d = new HistoricalData();
		d.setInstant(new Timestamp(System.currentTimeMillis()));
		d.attribute = this;
		
		switch (operator) {
		case NEUTRALITY:
			d.value = calculateNeutrality(profile);
			break;
		case REPLACEABILITY:
			d.value = calculateReplaceability(profile);
			break;
		case SIMULTANEITY:
			d.value = calculateSimultaneity(profile);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return d;
	}

} // CompositeAttribute
