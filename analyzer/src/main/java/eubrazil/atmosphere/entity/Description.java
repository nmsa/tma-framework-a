package eubrazil.atmosphere.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the description database table.
 * 
 */
@Entity(name="description")
@NamedQuery(name="description.findAll", query="SELECT d FROM description d")
public class Description implements Serializable {

	private static final long serialVersionUID = 2863133573821037388L;

	@Id
	@GeneratedValue
	@Column(name="descriptionId")
	private int descriptionId;

	@Column(name="dataType")
	private String dataType;

	@Column(name="descriptionName")
	private String descriptionName;

	@Column(name="unit")
	private String unit;

	//bi-directional many-to-one association to Data
	@OneToMany(mappedBy="description")
	private List<Data> data;

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

	public List<Data> getData() {
		return this.data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public Data addData(Data data) {
		getData().add(data);
		data.setDescription(this);

		return data;
	}

	public Data removeData(Data data) {
		getData().remove(data);
		data.setDescription(null);

		return data;
	}

}
