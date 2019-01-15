package eubrazil.atmosphere.qualitymodel;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 * The persistent class for the historicaldata database table.
 */
@Entity(name="historicaldata")
@NamedQuery(name="historicaldata.findAll", query="SELECT h FROM historicaldata h")
public class HistoricalData implements Serializable {

	private static final long serialVersionUID = 467016496297144958L;

//	@Id
//	@GeneratedValue
//	private int historicalDataId;
//
//	private Timestamp instant;
	
	@EmbeddedId
	private HistoricalDataPK id;

	private double value;

	//bi-directional one-to-one association to Attribute
	@OneToOne
	@JoinColumn(name="attributeId")
	private Attribute attribute;

	public HistoricalData() {
	}

	public HistoricalData(Timestamp instant, double value) {
		super();
		this.setInstant(instant);
		this.value = value;
	}

	public HistoricalDataPK getId() {
		return id;
	}

	public void setId(HistoricalDataPK id) {
		this.id = id;
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

	public void setInstant(java.util.Date instant) {
		if (this.id == null) {
			this.id = new HistoricalDataPK();
		}
		this.id.setInstant(instant);
	}
	
	public void setHistoricalDataId(int historicalDataId) {
		if (this.id == null) {
			this.id = new HistoricalDataPK();
		}
		this.id.setHistoricalDataId(historicalDataId);
	}
	
	@Override
	public String toString() {
		return "HistoricalData [id=" + id + ", value=" + value + ", attribute=" + attribute + "]";
	}
	
}