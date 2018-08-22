/**
 */
package eubrazil.atmosphere.qualitymodel;

/**
 * @generated
 */
public abstract class Attribute {
	/**
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * @generated
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * @generated
	 */
	public Attribute() {
		super();
	}

	/**
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * @generated NOT
	 */
	public abstract HistoricalData calculate(UserProfile user);

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // Attribute
