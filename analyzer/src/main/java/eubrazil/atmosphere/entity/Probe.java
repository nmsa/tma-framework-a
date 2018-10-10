package eubrazil.atmosphere.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the probe database table.
 * 
 */
@Entity(name="probe")
@NamedQuery(name="probe.findAll", query="SELECT p FROM probe p")
public class Probe implements Serializable {

	private static final long serialVersionUID = 2643037970739109066L;

	@Id
	@GeneratedValue
	@Column(name="probeId")
	private int probeId;

	@Column(name="password")
	private String password;

	@Column(name="probeName")
	private String probeName;

	@Column(name="salt")
	private String salt;

	@Column(name="token")
	private String token;

	@Column(name="tokenExpiration")
	private Timestamp tokenExpiration;

	//bi-directional many-to-one association to Data
	@OneToMany(mappedBy="probe")
	private List<Data> data;

	public Probe() {
	}

	public int getProbeId() {
		return this.probeId;
	}

	public void setProbeId(int probeId) {
		this.probeId = probeId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProbeName() {
		return this.probeName;
	}

	public void setProbeName(String probeName) {
		this.probeName = probeName;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Timestamp getTokenExpiration() {
		return this.tokenExpiration;
	}

	public void setTokenExpiration(Timestamp tokenExpiration) {
		this.tokenExpiration = tokenExpiration;
	}

	public List<Data> getData() {
		return this.data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public Data addData(Data data) {
		getData().add(data);
		data.setProbe(this);

		return data;
	}

	public Data removeData(Data data) {
		getData().remove(data);
		data.setProbe(null);

		return data;
	}
	
}
