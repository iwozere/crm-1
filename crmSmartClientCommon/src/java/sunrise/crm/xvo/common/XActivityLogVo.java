package sunrise.crm.xvo.common;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class XActivityLogVo {

	private String action;
	private Date createDate;
	private String user;
	private String additionalInfo;
	private Map<String, String> linkedObject = new HashMap<String, String>();
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public Map<String, String> getLinkedObject() {
		return linkedObject;
	}
	public void setLinkedObject(Map<String, String> linkedObject) {
		this.linkedObject = linkedObject;
	}
}
