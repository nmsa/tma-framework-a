package eubrazil.atmosphere.qualitymodel;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import eubrazil.atmosphere.commons.utils.ListUtils;
import eubrazil.atmosphere.entity.Data;

/**
 * The persistent class for the compositeattribute database table.
 * 
 */
@Entity(name="compositeattribute")
@NamedQuery(name="compositeattribute.findAll", query="SELECT c FROM compositeattribute c")
public class CompositeAttribute extends Attribute implements Serializable {

	private static final long serialVersionUID = -833533561010795503L;

	@Enumerated(EnumType.ORDINAL)
	private AttributeAggregationOperator operator = AttributeAggregationOperator.NEUTRALITY;

	// bi-directional many-to-one association to Attribute
	@OneToMany(mappedBy="compositeattribute")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<Attribute> children;

	public CompositeAttribute() {
	}

	protected double calculateNeutrality(ConfigurationProfile profile) {
		double score = 0.0;
		if (ListUtils.isNotEmpty(this.children)) {
			
		}
		return score;
	}

	protected double calculateSimultaneity(ConfigurationProfile profile) {
		throw new UnsupportedOperationException();
	}

	protected double calculateReplaceability(ConfigurationProfile profile) {
		throw new UnsupportedOperationException();
	}
	
	public HistoricalData calculate(ConfigurationProfile profile, List<Data> data) {
		HistoricalData d = new HistoricalData();
		d.setInstant(new Timestamp(System.currentTimeMillis()));
		d.setAttribute(this);

		switch (operator) {
		case NEUTRALITY:
			d.setValue(calculateNeutrality(profile));
			break;
		case REPLACEABILITY:
			d.setValue(calculateReplaceability(profile));
			break;
		case SIMULTANEITY:
			d.setValue(calculateSimultaneity(profile));
			break;
		default:
			throw new UnsupportedOperationException();
		}

		return d;
	}

	public AttributeAggregationOperator getOperator() {
		return operator;
	}

	public void setOperator(AttributeAggregationOperator operator) {
		this.operator = operator;
	}

	public Set<Attribute> getChildren() {
		return children;
	}

	public void setChildren(Set<Attribute> children) {
		this.children = children;
	}

	public Attribute addAttribute(Attribute attribute) {
		getChildren().add(attribute);
		attribute.setCompositeattribute(this);

		return attribute;
	}

	public Attribute removeAttribute(Attribute attribute) {
		getChildren().remove(attribute);
		attribute.setCompositeattribute(null);

		return attribute;
	}

}