/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.util.ArrayList;
import java.util.List;

/**
 * @generated
 */
public class Metric {
	/**
	 * @generated
	 */
	protected static final String PROBE_NAME_EDEFAULT = null;

	/**
	 * @generated
	 */
	protected String probeName = PROBE_NAME_EDEFAULT;

	/**
	 * @generated
	 */
	protected static final String DESCRIPTION_NAME_EDEFAULT = null;

	/**
	 * @generated
	 */
	protected String descriptionName = DESCRIPTION_NAME_EDEFAULT;

	/**
	 * @generated
	 */
	protected static final String RESOURCE_NAME_EDEFAULT = null;

	/**
	 * @generated
	 */
	protected String resourceName = RESOURCE_NAME_EDEFAULT;

	/**
	 * @generated
	 */
	protected LeafAttribute attribute;

	/**
	 * @generated
	 */
	protected List<Data> data;

	/**
	 * @generated
	 */
	public Metric() {
		super();
	}

	/**
	 * @generated
	 */
	public String getProbeName() {
		return probeName;
	}

	/**
	 * @generated
	 */
	public void setProbeName(String newProbeName) {
		probeName = newProbeName;
	}

	/**
	 * @generated
	 */
	public String getDescriptionName() {
		return descriptionName;
	}

	/**
	 * @generated
	 */
	public void setDescriptionName(String newDescriptionName) {
		descriptionName = newDescriptionName;
	}

	/**
	 * @generated
	 */
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * @generated
	 */
	public void setResourceName(String newResourceName) {
		resourceName = newResourceName;
	}

	/**
	 * @generated
	 */
	public LeafAttribute getAttribute() {
		return attribute;
	}

	/**
	 * @generated
	 */
	public void setAttribute(LeafAttribute newAttribute) {
		attribute = newAttribute;
	}

	/**
	 * @generated
	 */
	public List<Data> getData() {
		if (data == null) {
			data = new ArrayList<Data>();
		}
		return data;
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (probeName: ");
		result.append(probeName);
		result.append(", descriptionName: ");
		result.append(descriptionName);
		result.append(", resourceName: ");
		result.append(resourceName);
		result.append(')');
		return result.toString();
	}

} // Metric
