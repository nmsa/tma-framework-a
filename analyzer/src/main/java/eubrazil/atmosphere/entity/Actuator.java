package eubrazil.atmosphere.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * The persistent class for the actuator database table.
 * 
 */
@Entity(name="actuator")
@NamedQuery(name="actuator.findAll", query="SELECT a FROM actuator a")
public class Actuator implements Serializable {

	private static final long serialVersionUID = 3115394927250495019L;

	@Id
	@GeneratedValue
	private int actuatorId;

	private String address;

	private String pubKey;

	//bi-directional many-to-one association to Action
	@OneToMany(mappedBy="actuator")
	private List<Action> actions;

	public Actuator() {
	}

	public int getActuatorId() {
		return this.actuatorId;
	}

	public void setActuatorId(int actuatorId) {
		this.actuatorId = actuatorId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPubKey() {
		return this.pubKey;
	}

	public void setPubKey(String pubKey) {
		this.pubKey = pubKey;
	}

	public List<Action> getActions() {
		return this.actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public Action addAction(Action action) {
		getActions().add(action);
		action.setActuator(this);

		return action;
	}

	public Action removeAction(Action action) {
		getActions().remove(action);
		action.setActuator(null);

		return action;
	}
	
}
