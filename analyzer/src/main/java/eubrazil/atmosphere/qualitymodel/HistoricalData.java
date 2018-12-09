package eubrazil.atmosphere.qualitymodel;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the historicaldata database table.
 * 
 */
@Entity(name="historicaldata")
@NamedQuery(name="historicaldata.findAll", query="SELECT h FROM historicaldata h")
public class HistoricalData implements Serializable {

	private static final long serialVersionUID = 467016496297144958L;

	@Id
	@GeneratedValue
	private int attributeId;

	private Timestamp instant;

	private double value;

	//bi-directional one-to-one association to Attribute
	@OneToOne
	@JoinColumn(name="attributeId")
	private Attribute attribute;

	public HistoricalData() {
	}

	public HistoricalData(Timestamp instant, double value) {
		super();
		this.instant = instant;
		this.value = value;
	}

	public int getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public Timestamp getInstant() {
		return this.instant;
	}

	public void setInstant(Timestamp instant) {
		this.instant = instant;
	}

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Attribute getAttribute() {
		return this.attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	@Override
	public String toString() {
		return "HistoricalData [instant=" + instant + ", value=" + value + ", attribute=" + attribute + "]";
	}

}