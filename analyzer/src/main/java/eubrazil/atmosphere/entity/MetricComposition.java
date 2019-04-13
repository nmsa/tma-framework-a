package eubrazil.atmosphere.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MetricComposition database table.
 *
 */
@Entity(name="MetricComposition")
@NamedQuery(name="MetricComposition.findAll", query="SELECT m FROM MetricComposition m")
public class MetricComposition implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MetricCompositionPK id;

	public MetricComposition() {
	}

	public MetricCompositionPK getId() {
		return this.id;
	}

	public void setId(MetricCompositionPK id) {
		this.id = id;
	}

}