/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.util.ArrayList;
import java.util.List;

/**
 * @generated
 */
public class UserProfile {
	/**
	 * @generated
	 */
	protected List<Preference> preference;

	/**
	 * @generated
	 */
	protected static final int USER_ID_EDEFAULT = 0;

	/**
	 * @generated
	 */
	protected int userID = USER_ID_EDEFAULT;

	/**
	 * @generated
	 */
	public UserProfile() {
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
	public int getUserID() {
		return userID;
	}

	/**
	 * @generated
	 */
	public void setUserID(int newUserID) {
		userID = newUserID;
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (userID: ");
		result.append(userID);
		result.append(')');
		return result.toString();
	}

} // UserProfile
