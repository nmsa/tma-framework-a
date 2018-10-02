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
	
	private String vtest1;
	private String vtest2;

	public String getVtest1() {
		return vtest1;
	}
	
	public void setVtest1(String vtest1) {
		this.vtest1 = vtest1;
	}
	
	public String getVtest2() {
		return vtest2;
	}
	
	public void setVtest2(String vtest2) {
		this.vtest2 = vtest2;
	}
	
	@Override
	public String toString() {
		return "Properties [id=" + id + ", vtest1=" + vtest1 + ", vtest2=" + vtest2 + "]";
	}
	
}
