package eubrazil.atmosphere.qualitymodel;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import eubrazil.atmosphere.entity.Data;


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
	private int attributeId;

	private Timestamp data;

	private String descriptionName;

	private String probeName;

	private String resourceName;

	//bi-directional many-to-one association to Configurationprofile
	@ManyToOne
	@JoinColumn(name="configurationprofileId")
	private ConfigurationProfile configurationprofile;

	//bi-directional one-to-one association to Leafattribute
	@OneToOne
	@JoinColumn(name="attributeId")
	private Leafattribute attribute;

	public Metric() {
	}

	public int getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	//	public List<Data> getData() {
//		if (this.data == null) {
//			this.data = new ArrayList<Data>();
//		}
//		return this.data;
//	}
//
	public List<Data> updateData(){
		return null;
	}

	public Timestamp getData() {
		return data;
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

	public ConfigurationProfile getConfigurationprofile() {
		return this.configurationprofile;
	}

	public void setConfigurationprofile(ConfigurationProfile configurationprofile) {
		this.configurationprofile = configurationprofile;
	}

	public Leafattribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Leafattribute attribute) {
		this.attribute = attribute;
	}

}