package eubrazil.atmosphere.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the resource database table.
 * 
 */
@Entity(name="resource")
@NamedQuery(name="resource.findAll", query="SELECT r FROM resource r")
public class Resource implements Serializable {

	private static final long serialVersionUID = 3640146752300144988L;

	@Id
	@GeneratedValue
	@Column(name="resourceId")
	private int resourceId;

	private String resourceAddress;

	private String resourceName;

	private String resourceType;

	//bi-directional many-to-one association to Action
	@OneToMany(mappedBy="resource")
	private List<Action> actions;

	//bi-directional many-to-one association to Data
	@OneToMany(mappedBy="resource")
	private List<Data> data;

	public Resource() {
	}

	public int getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceAddress() {
		return this.resourceAddress;
	}

	public void setResourceAddress(String resourceAddress) {
		this.resourceAddress = resourceAddress;
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public List<Action> getActions() {
		return this.actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public Action addAction(Action action) {
		getActions().add(action);
		action.setResource(this);

		return action;
	}

	public Action removeAction(Action action) {
		getActions().remove(action);
		action.setResource(null);

		return action;
	}

	public List<Data> getData() {
		return this.data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public Data addData(Data data) {
		getData().add(data);
		data.setResource(this);

		return data;
	}

	public Data removeData(Data data) {
		getData().remove(data);
		data.setResource(null);

		return data;
	}

}