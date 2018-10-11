package eubrazil.atmosphere.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="properties")
public class Properties implements Serializable {

	private static final long serialVersionUID = -1502290920411817303L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private float relevance;
	private float threshold;
	private float periodicity;
	
	public String getNome() {
		return name;
	}
	public void setNome(String nome) {
		this.name = nome;
	}
	public float getRelevance() {
		return relevance;
	}
	public void setRelevance(float relevance) {
		this.relevance = relevance;
	}
	public float getThreshold() {
		return threshold;
	}
	public void setThreshold(float threshold) {
		this.threshold = threshold;
	}
	public float getPeriodicity() {
		return periodicity;
	}
	public void setPeriodicity(float periodicity) {
		this.periodicity = periodicity;
	}
	@Override
	public String toString() {
		return "Properties [id=" + id + ", nome=" + name + ", relevance=" + relevance + ", threshold=" + threshold
				+ ", periodicity=" + periodicity + "]";
	}
	
}
