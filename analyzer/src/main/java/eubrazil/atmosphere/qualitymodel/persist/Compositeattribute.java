package eubrazil.atmosphere.qualitymodel.persist;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the compositeattribute database table.
 * 
 */
@Entity(name="compositeattribute")
@NamedQuery(name="compositeattribute.findAll", query="SELECT c FROM compositeattribute c")
public class Compositeattribute implements Serializable {

	private static final long serialVersionUID = -833533561010795503L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int compositeattributeId;

	private int operator;

	//bi-directional many-to-one association to Attribute
	@OneToMany(mappedBy="compositeattribute")
	private List<Attribute> attributes;

	public Compositeattribute() {
	}

	public int getCompositeattributeId() {
		return this.compositeattributeId;
	}

	public void setCompositeattributeId(int compositeattributeId) {
		this.compositeattributeId = compositeattributeId;
	}

	public int getOperator() {
		return this.operator;
	}

	public void setOperator(int operator) {
		this.operator = operator;
	}

	public List<Attribute> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public Attribute addAttribute(Attribute attribute) {
		getAttributes().add(attribute);
		attribute.setCompositeattribute(this);

		return attribute;
	}

	public Attribute removeAttribute(Attribute attribute) {
		getAttributes().remove(attribute);
		attribute.setCompositeattribute(null);

		return attribute;
	}

}