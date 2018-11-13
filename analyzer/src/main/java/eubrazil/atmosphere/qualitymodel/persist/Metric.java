package eubrazil.atmosphere.qualitymodel.persist;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the metric database table.
 * 
 */
@Entity(name="metric")
@NamedQuery(name="metric.findAll", query="SELECT m FROM metric m")
public class Metric implements Serializable {

	private static final long serialVersionUID = -4308693747910041479L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int leafattributeId;

	private Timestamp data;

	private String descriptionName;

	private String probeName;

	private String resourceName;

	//bi-directional many-to-one association to Configurationprofile
	@ManyToOne
	@JoinColumn(name="configurationprofileId")
	private Configurationprofile configurationprofile;

	//bi-directional one-to-one association to Leafattribute
	@OneToOne
	@JoinColumn(name="leafattributeId")
	private Leafattribute leafattribute;

	public Metric() {
	}

	public int getLeafattributeId() {
		return this.leafattributeId;
	}

	public void setLeafattributeId(int leafattributeId) {
		this.leafattributeId = leafattributeId;
	}

	public Timestamp getData() {
		return this.data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public String getDescriptionName() {
		return this.descriptionName;
	}

	public void setDescriptionName(String descriptionName) {
		this.descriptionName = descriptionName;
	}

	public String getProbeName() {
		return this.probeName;
	}

	public void setProbeName(String probeName) {
		this.probeName = probeName;
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public Configurationprofile getConfigurationprofile() {
		return this.configurationprofile;
	}

	public void setConfigurationprofile(Configurationprofile configurationprofile) {
		this.configurationprofile = configurationprofile;
	}

	public Leafattribute getLeafattribute() {
		return this.leafattribute;
	}

	public void setLeafattribute(Leafattribute leafattribute) {
		this.leafattribute = leafattribute;
	}

}