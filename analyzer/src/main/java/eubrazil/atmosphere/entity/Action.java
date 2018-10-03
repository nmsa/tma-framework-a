package eubrazil.atmosphere.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the action database table.
 * 
 */
@Entity(name="action")
@NamedQuery(name="action.findAll", query="SELECT a FROM action a")
public class Action implements Serializable {

	private static final long serialVersionUID = -6724051405118187323L;

	@Id
	@GeneratedValue
	private int actionId;

	private String actionName;

	//bi-directional many-to-one association to Actuator
	@ManyToOne
	@JoinColumn(name="actuatorId")
	private Actuator actuator;

	//bi-directional many-to-one association to Resource
	@ManyToOne
	@JoinColumn(name="resourceId")
	private Resource resource;

	//bi-directional one-to-one association to Configuration
	@OneToOne(mappedBy="action")
	private Configuration configuration;

	public Action() {
	}

	public int getActionId() {
		return this.actionId;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public Actuator getActuator() {
		return this.actuator;
	}

	public void setActuator(Actuator actuator) {
		this.actuator = actuator;
	}

	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Configuration getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

}
