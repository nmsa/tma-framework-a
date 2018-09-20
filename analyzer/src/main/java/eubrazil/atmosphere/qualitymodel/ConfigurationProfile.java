/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.util.ArrayList;
import java.util.List;

/**
 * @generated
 */
public class ConfigurationProfile {
	/**
	 * @generated
	 */
	protected List<Preference> preference;

	/**
	 * @generated
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * @generated
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * @generated
	 */
	protected List<Metric> metric;

	/**
	 * @generated
	 */
	public ConfigurationProfile() {
		super();
	}

	/**
	 * @generated
	 */
	public List<Preference> getPreference() {
		if (preference == null) {
			preference = new ArrayList<Preference>();
		}
		return preference;
	}

	/**
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * @generated
	 */
	public void setID(int newID) {
		id = newID;
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
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // ConfigurationProfile
