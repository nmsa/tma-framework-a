package eubrazil.atmosphere.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Description database table.
 *
 */
@Entity(name="Description")
@NamedQuery(name="Description.findAll", query="SELECT d FROM Description d")
public class Description implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int descriptionId;

	@Column(columnDefinition = "char")
	private String dataType;

	@Column(columnDefinition = "char")
	private String descriptionName;

	@Column(columnDefinition = "char")
	private String unit;

	public Description() {
	}

	public int getDescriptionId() {
		return this.descriptionId;
	}

	public void setDescriptionId(int descriptionId) {
		this.descriptionId = descriptionId;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDescriptionName() {
		return this.descriptionName;
	}

	public void setDescriptionName(String descriptionName) {
		this.descriptionName = descriptionName;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}