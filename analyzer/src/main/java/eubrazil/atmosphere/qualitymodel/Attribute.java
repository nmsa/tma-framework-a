package eubrazil.atmosphere.qualitymodel;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
	@GeneratedValue
	private int attributeId;

	private String name;

	//bi-directional one-to-one association to Historicaldata
	@OneToOne(mappedBy="attribute")
	private HistoricalData historicaldata;

	//bi-directional one-to-one association to Preference
	@OneToOne(mappedBy="attribute")
	private Preference preference;

	//bi-directional many-to-one association to compositeattribute
	@ManyToOne
	@JoinColumn(name="compositeattributeId")
	private CompositeAttribute compositeattribute;
	
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

	public void setHistoricaldata(HistoricalData historicaldata) {
		this.historicaldata = historicaldata;
	}

	public Preference getPreference() {
		return this.preference;
	}

	public void setPreference(Preference preference) {
		this.preference = preference;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attributeId;
		result = prime * result + ((compositeattribute == null) ? 0 : compositeattribute.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((preference == null) ? 0 : preference.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attribute other = (Attribute) obj;
		if (attributeId != other.attributeId)
			return false;
		if (compositeattribute == null) {
			if (other.compositeattribute != null)
				return false;
		} else if (!compositeattribute.equals(other.compositeattribute))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (preference == null) {
			if (other.preference != null)
				return false;
		} else if (!preference.equals(other.preference))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Attribute [attributeId=" + attributeId + ", name=" + name + ", historicaldata=" + historicaldata
				+ ", preference=" + preference + ", compositeattribute=" + compositeattribute + "]";
	}

}