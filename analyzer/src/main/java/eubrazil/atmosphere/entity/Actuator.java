package eubrazil.atmosphere.entity;

import java.io.Serializable;

//@Entity(name="actuator")
public class Actuator implements Serializable {

	private static final long serialVersionUID = -5363152539663531515L;

//	@Id
//	@GeneratedValue
	private Long actuatorId;
	
    private String address;
    private String pubKey;
    
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPubKey() {
		return pubKey;
	}
	public void setPubKey(String pubKey) {
		this.pubKey = pubKey;
	}
	
}
