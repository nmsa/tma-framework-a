package eubrazil.atmosphere.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the configuration database table.
 * 
 */
@Entity(name="configuration")
@NamedQuery(name="configuration.findAll", query="SELECT c FROM configuration c")
public class Configuration implements Serializable {

	private static final long serialVersionUID = -3957332871685467946L;

	@Id
	private int actionId;

	private String domain;

	private String keyName;

	//bi-directional one-to-one association to Action
	@OneToOne
	@JoinColumn(name="actionId")
	private Action action;

	public Configuration() {
	}

	public int getActionId() {
		return this.actionId;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getKeyName() {
		return this.keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public Action getAction() {
		return this.action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

}