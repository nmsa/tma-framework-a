package eubrazil.atmosphere.qualitymodel;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import eubrazil.atmosphere.exceptions.UndefinedMetricException;

/**
 * The persistent class for the attribute database table.
 * 
 */
@Entity(name="attribute")
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQuery(name="attribute.findAll", query="SELECT a FROM attribute a")
public abstract class Attribute implements Serializable {

	private static final long serialVersionUID = 4884416721621562261L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int attributeId;

	private String name;

	//bi-directional many-to-one association to Compositeattribute
	@ManyToOne
	@JoinColumn(name="compositeattributeId")
	private CompositeAttribute compositeattribute;

	//bi-directional one-to-one association to Historicaldata
	@OneToOne(mappedBy="attribute")
	private HistoricalData historicaldata;

	//bi-directional one-to-one association to Preference
	@OneToOne(mappedBy="attribute")
	private Preference preference;

	public abstract HistoricalData calculate(ConfigurationProfile user) throws UndefinedMetricException;
	
	public Attribute() {
	}

	public int getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CompositeAttribute getCompositeattribute() {
		return this.compositeattribute;
	}

	public void setCompositeattribute(CompositeAttribute compositeattribute) {
		this.compositeattribute = compositeattribute;
	}

	public HistoricalData getHistoricaldata() {
		return this.historicaldata;
	}

	public void setHistoricaldata(HistoricalData historicaldata) {
		this.historicaldata = historicaldata;
	}

	public Preference getPreference() {
		return this.preference;
	}

	public void setPreference(Preference preference) {
		this.preference = preference;
	}

}