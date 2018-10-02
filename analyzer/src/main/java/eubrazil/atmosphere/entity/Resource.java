package eubrazil.atmosphere.entity;

import java.io.Serializable;

//@Entity(name="resource")
public class Resource implements Serializable {

	private static final long serialVersionUID = 527049684120978309L;

//	@Id
//	@GeneratedValue
	private Long resourceId;
	
    private String resourceName;
    private String resourceType;
    private String resourceAddress;
    
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getResourceAddress() {
		return resourceAddress;
	}
	public void setResourceAddress(String resourceAddress) {
		this.resourceAddress = resourceAddress;
	}
	
}
