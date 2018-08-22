/**
 */
package eubrazil.atmosphere.qualitymodel;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.UserProfile#getPreference <em>Preference</em>}</li>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.UserProfile#getUserID <em>User ID</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface UserProfile {
	/**
	 * Returns the value of the '<em><b>Preference</b></em>' containment reference list.
	 * The list contents are of type {@link eubrazil.atmosphere.qualitymodel.Preference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preference</em>' containment reference list.
	 * @model containment="true"
	 * @generated
	 */
	List<Preference> getPreference();

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(int)
	 * @model required="true"
	 * @generated
	 */
	int getUserID();

	/**
	 * Sets the value of the '{@link eubrazil.atmosphere.qualitymodel.UserProfile#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(int value);

} // UserProfile
