package eubrazil.atmosphere.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity(name="probe")
public class Probe implements Serializable{

	private static final long serialVersionUID = -9100799710706054316L;

//	@Id
//	@GeneratedValue
	private Long probeId;

    private String probeName;
    
    private String password;
    private String salt;
    private String token;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date tokenExpiration;

	public String getProbeName() {
		return probeName;
	}

	public void setProbeName(String probeName) {
		this.probeName = probeName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getTokenExpiration() {
		return tokenExpiration;
	}

	public void setTokenExpiration(Date tokenExpiration) {
		this.tokenExpiration = tokenExpiration;
	}

}
