package sunrise.crm.xvo.order;

import java.io.Serializable;


/**
 * Holds information, shows the Grid on the Access List.
 * @author bansalg
 * sunrise.crm.xvo.order.XAccessTypeVo
 */

public class XAccessTypeVo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6623752448604493039L;
	public String accessType;
	public String accessName;
	public String accessDescription;

	public String getAccessType() {
		return accessType;
	}


	public String getAccessName() {
		return accessName;
	}

	public String getAccessDescription() {
		return accessDescription;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}


	public void setAccessName(String accessName) {
		this.accessName = accessName;
	}

	public void setAccessDescription(String accessDescription) {
		this.accessDescription = accessDescription;
	}

}
