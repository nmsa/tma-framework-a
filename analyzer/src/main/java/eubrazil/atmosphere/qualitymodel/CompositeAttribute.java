package eubrazil.atmosphere.qualitymodel;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import eubrazil.atmosphere.commons.utils.ListUtils;
import eubrazil.atmosphere.exceptions.UndefinedMetricException;

/**
 * The persistent class for the compositeattribute database table.
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
	private List<Attribute> children;

	public CompositeAttribute() {
	}

	protected double calculateNeutrality(ConfigurationProfile profile) {
		double score = 0.0;
		if (ListUtils.isNotEmpty(this.children)) {
//			System.out.println("children :" + children);
			for (Attribute child : children) {
				Preference childPref = profile.getPreference(child);
				System.out.println("childPref: " + childPref);
				try {
					System.out.println("child calculate: " + child.calculate(profile).getValue());
					System.out.println("preference weight for child: " + childPref.getWeight());
					score += child.calculate(profile).getValue() * childPref.getWeight();
				} catch (UndefinedMetricException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Score Neutrality: " + score);
		return score;
	}

	protected double calculateSimultaneity(ConfigurationProfile profile) {
		double score = 0.0;
		if (ListUtils.isNotEmpty(this.children)) {
			for (Attribute child : children) {
				Preference childPref = profile.getPreference(child);
				try {
					double scoreAux = child.calculate(profile).getValue() * childPref.getWeight();
					if (scoreAux < childPref.getThreshold()) {
						score = 0.0;
						break;
					}
					score += scoreAux;
				} catch (UndefinedMetricException e) {
					e.printStackTrace();
				}
			}
		}
		return score;
	}

	protected double calculateReplaceability(ConfigurationProfile profile) {
		double score = 0.0;
		if (ListUtils.isNotEmpty(this.children)) {
			for (Attribute child : children) {
				Preference childPref = profile.getPreference(child);
				try {
					double scoreAux = child.calculate(profile).getValue() * childPref.getWeight();
					if (scoreAux > childPref.getThreshold()) {
						score += scoreAux;
					}
				} catch (UndefinedMetricException e) {
					e.printStackTrace();
				}
			}
		}
		return score;
	}
	
	public HistoricalData calculate(ConfigurationProfile profile) {
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

		// Armazena o score calculado em HistoricalDate
//		PrivacyService privacyService = SpringContextBridge.services().getPrivacyService();
//		d.setAttributeId(this.getAttributeId());
//		privacyService.save(d);
		
		return d;
	}

	public AttributeAggregationOperator getOperator() {
		return operator;
	}

	public void setOperator(AttributeAggregationOperator operator) {
		this.operator = operator;
	}

	public List<Attribute> getChildren() {
		if (children == null) {
			children = new ArrayList<Attribute>();
		}
		return children;
	}

	public void setChildren(List<Attribute> children) {
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

	@Override
	public HistoricalData getHistoricaldata() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
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
		CompositeAttribute other = (CompositeAttribute) obj;
		if (operator != other.operator)
			return false;
		return true;
	}

}