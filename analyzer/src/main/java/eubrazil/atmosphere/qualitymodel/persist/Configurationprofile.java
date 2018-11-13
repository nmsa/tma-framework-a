package eubrazil.atmosphere.qualitymodel.persist;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the configurationprofile database table.
 * 
 */
@Entity(name="configurationprofile")
@NamedQuery(name="configurationprofile.findAll", query="SELECT c FROM configurationprofile c")
public class Configurationprofile implements Serializable {

	private static final long serialVersionUID = 726009967174063732L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int configurationprofileId;

	//bi-directional many-to-one association to Metric
	@OneToMany(mappedBy="configurationprofile")
	private List<Metric> metrics;

	//bi-directional many-to-one association to Preference
	@OneToMany(mappedBy="configurationprofile")
	private List<Preference> preferences;

	public Configurationprofile() {
	}

	public int getConfigurationprofileId() {
		return this.configurationprofileId;
	}

	public void setConfigurationprofileId(int configurationprofileId) {
		this.configurationprofileId = configurationprofileId;
	}

	public List<Metric> getMetrics() {
		return this.metrics;
	}

	public void setMetrics(List<Metric> metrics) {
		this.metrics = metrics;
	}

	public Metric addMetric(Metric metric) {
		getMetrics().add(metric);
		metric.setConfigurationprofile(this);

		return metric;
	}

	public Metric removeMetric(Metric metric) {
		getMetrics().remove(metric);
		metric.setConfigurationprofile(null);

		return metric;
	}

	public List<Preference> getPreferences() {
		return this.preferences;
	}

	public void setPreferences(List<Preference> preferences) {
		this.preferences = preferences;
	}

	public Preference addPreference(Preference preference) {
		getPreferences().add(preference);
		preference.setConfigurationprofile(this);

		return preference;
	}

	public Preference removePreference(Preference preference) {
		getPreferences().remove(preference);
		preference.setConfigurationprofile(null);

		return preference;
	}

}