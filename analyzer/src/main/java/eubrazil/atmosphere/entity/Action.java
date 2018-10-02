package eubrazil.atmosphere.entity;

import java.io.Serializable;

//@Entity(name="action")
public class Action implements Serializable {

	private static final long serialVersionUID = -8813733846389273819L;

//	@Id
//	@GeneratedValue
	private Long actionId;
	
    private Integer actuatorId;
    private Integer resourceId;
    private String actionName;
    
	public Integer getActuatorId() {
		return actuatorId;
	}
	public void setActuatorId(Integer actuatorId) {
		this.actuatorId = actuatorId;
	}
	public Integer getResourceId() {
		return resourceId;
	}
	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
    
}
