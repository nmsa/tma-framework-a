package eubrazil.atmosphere.qualitymodel;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the preference database table.
 * 
 */
@Entity(name="preference")
@NamedQuery(name="preference.findAll", query="SELECT p FROM preference p")
public class Preference implements Serializable {

	private static final long serialVersionUID = 4897045709573210431L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int attributeId;

	private double threshold;

	private double weight;

	//bi-directional many-to-one association to Configurationprofile
	@ManyToOne
	@JoinColumn(name="configurationprofileId")
	private ConfigurationProfile configurationprofile;

	//bi-directional one-to-one association to Attribute
	@OneToOne
	@JoinColumn(name="attributeId")
	private Attribute attribute;

	public Preference() {
	}

	public Preference(double threshold, double weight) {
		this.threshold = threshold;
		this.weight = weight;
	}
	
	public int getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public double getThreshold() {
		return this.threshold;
	}

	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ConfigurationProfile getConfigurationprofile() {
		return this.configurationprofile;
	}

	public void setConfigurationprofile(ConfigurationProfile configurationprofile) {
		this.configurationprofile = configurationprofile;
	}

	public Attribute getAttribute() {
		return this.attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

}