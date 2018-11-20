package eubrazil.atmosphere.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="privacy")
public class Privacy implements Serializable {

	private static final long serialVersionUID = 1268053155224941067L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Long risk;
	private Long utility;
	private Long k;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_hora;

	public Privacy() {
	}

	public Long getRisk() {
		return risk;
	}
	
	public void setRisk(Long risk) {
		this.risk = risk;
	}

	public Long getUtility() {
		return utility;
	}

	public void setUtility(Long utility) {
		this.utility = utility;
	}

	public Long getK() {
		return k;
	}

	public void setK(Long k) {
		this.k = k;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}

	@Override
	public String toString() {
		return "Privacy [id=" + id + ", risk=" + risk + ", utility=" + utility + ", k=" + k + ", data_hora=" + data_hora
				+ "]";
	}
	
}
