package eubrazil.atmosphere.qualitymodel.persist;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the leafattribute database table.
 * 
 */
@Entity(name="leafattribute")
@NamedQuery(name="leafattribute.findAll", query="SELECT l FROM leafattribute l")
public class Leafattribute implements Serializable {

	private static final long serialVersionUID = 5498567272022007160L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int leafattributeId;

	private int normalizationKind;

	private double normalizationMax;

	private double normalizationMin;

	private int numSamples;

	private int operator;

	//bi-directional one-to-one association to Metric
	@OneToOne(mappedBy="leafattribute")
	private Metric metric;

	public Leafattribute() {
	}

	public int getLeafattributeId() {
		return this.leafattributeId;
	}

	public void setLeafattributeId(int leafattributeId) {
		this.leafattributeId = leafattributeId;
	}

	public int getNormalizationKind() {
		return this.normalizationKind;
	}

	public void setNormalizationKind(int normalizationKind) {
		this.normalizationKind = normalizationKind;
	}

	public double getNormalizationMax() {
		return this.normalizationMax;
	}

	public void setNormalizationMax(double normalizationMax) {
		this.normalizationMax = normalizationMax;
	}

	public double getNormalizationMin() {
		return this.normalizationMin;
	}

	public void setNormalizationMin(double normalizationMin) {
		this.normalizationMin = normalizationMin;
	}

	public int getNumSamples() {
		return this.numSamples;
	}

	public void setNumSamples(int numSamples) {
		this.numSamples = numSamples;
	}

	public int getOperator() {
		return this.operator;
	}

	public void setOperator(int operator) {
		this.operator = operator;
	}

	public Metric getMetric() {
		return this.metric;
	}

	public void setMetric(Metric metric) {
		this.metric = metric;
	}

}