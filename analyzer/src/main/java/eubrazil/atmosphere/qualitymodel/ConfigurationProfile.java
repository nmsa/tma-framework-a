package eubrazil.atmosphere.qualitymodel;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


/**
 * The persistent class for the configurationprofile database table.
 *
 */
@Entity(name="configurationprofile")
@NamedQuery(name="configurationprofile.findAll", query="SELECT c FROM configurationprofile c")
public class ConfigurationProfile implements Serializable {

	private static final long serialVersionUID = 726009967174063732L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int configurationprofileId;

	//bi-directional many-to-one association to Metric
	@OneToMany(mappedBy="configurationprofile")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<Metric> metrics;

	//bi-directional many-to-one association to Preference
	@OneToMany(mappedBy="configurationprofile")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<Preference> preferences;

	public ConfigurationProfile() {
	}

	public int getConfigurationprofileId() {
		return this.configurationprofileId;
	}

	public void setConfigurationprofileId(int configurationprofileId) {
		this.configurationprofileId = configurationprofileId;
	}

	public Set<Metric> getMetrics() {
		return metrics;
	}

	public void setMetrics(Set<Metric> metrics) {
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

	public Set<Preference> getPreferences() {
		return preferences;
	}

	public void setPreferences(Set<Preference> preferences) {
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

	@Override
	public String toString() {
		return "ConfigurationProfile [configurationprofileId=" + configurationprofileId + ", metrics=" + metrics
				+ ", preferences=" + preferences + "]";
	}

}