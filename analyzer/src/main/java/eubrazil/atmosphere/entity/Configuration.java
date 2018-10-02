package eubrazil.atmosphere.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity(name="configuration")
public class Configuration implements Serializable {

	private static final long serialVersionUID = -6214835008278090144L;
	
//	@Id
//	@GeneratedValue
	private Long actionId;
	
    private String keyName;
    private String domain;
    
	public String getKeyName() {
		return keyName;
	}
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

}
