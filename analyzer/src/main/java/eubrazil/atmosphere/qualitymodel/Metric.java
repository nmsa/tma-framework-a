/**
 */
package eubrazil.atmosphere.qualitymodel;

/**
 * @generated
 */
public class Metric {
	/**
	 * @generated
	 */
	protected static final int PROBE_EDEFAULT = 0;

	/**
	 * @generated
	 */
	protected int probe = PROBE_EDEFAULT;

	/**
	 * @generated
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * @generated
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * @generated
	 */
	protected static final int RESOURCE_EDEFAULT = 0;

	/**
	 * @generated
	 */
	protected int resource = RESOURCE_EDEFAULT;

	/**
	 * @generated
	 */
	public Metric() {
		super();
	}

	/**
	 * @generated
	 */
	public int getProbe() {
		return probe;
	}

	/**
	 * @generated
	 */
	public void setProbe(int newProbe) {
		probe = newProbe;
	}

	/**
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * @generated
	 */
	public int getResource() {
		return resource;
	}

	/**
	 * @generated
	 */
	public void setResource(int newResource) {
		resource = newResource;
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (probe: ");
		result.append(probe);
		result.append(", description: ");
		result.append(description);
		result.append(", resource: ");
		result.append(resource);
		result.append(')');
		return result.toString();
	}

} // Metric
