package eubrazil.atmosphere.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity(name="data")
public class Data implements Serializable {

	private static final long serialVersionUID = 5212838079422055278L;
	
//	@Id
//	@GeneratedValue
	private Long dataId;
	
	private Long probeId;
    private Integer descriptionId;
    private Integer resourceId;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date valueTime;
    
    private double value;
    
	public Long getProbeId() {
		return probeId;
	}
	public void setProbeId(Long probeId) {
		this.probeId = probeId;
	}
	public Integer getDescriptionId() {
		return descriptionId;
	}
	public void setDescriptionId(Integer descriptionId) {
		this.descriptionId = descriptionId;
	}
	public Integer getResourceId() {
		return resourceId;
	}
	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}
	public Date getValueTime() {
		return valueTime;
	}
	public void setValueTime(Date valueTime) {
		this.valueTime = valueTime;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
    
}
