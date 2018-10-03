package eubrazil.atmosphere.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the data database table.
 * 
 */
@Entity(name="data")
@NamedQuery(name="data.findAll", query="SELECT d FROM data d")
public class Data implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DataPK id;

	private double value;

	//bi-directional many-to-one association to Description
	@ManyToOne
	@JoinColumn(name="descriptionId", insertable=false, updatable=false)
	private Description description;

	//bi-directional many-to-one association to Probe
	@ManyToOne
	@JoinColumn(name="probeId", insertable=false, updatable=false)
	private Probe probe;

	//bi-directional many-to-one association to Resource
	@ManyToOne
	@JoinColumn(name="resourceId", insertable=false, updatable=false)
	private Resource resource;

	public Data() {
	}

	public DataPK getId() {
		return this.id;
	}

	public void setId(DataPK id) {
		this.id = id;
	}

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Description getDescription() {
		return this.description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public Probe getProbe() {
		return this.probe;
	}

	public void setProbe(Probe probe) {
		this.probe = probe;
	}

	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

}