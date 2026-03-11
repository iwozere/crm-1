package sunrise.crm.xvo.bizOrder;

import java.io.Serializable;

public class XBizOrderUserDataVo implements Serializable {

	private static final long serialVersionUID = 2400754216201051748L;

	//User
	private String workgroup;
	private String employeePath;
	private String language;

    // ************************************************************************
    // GETTERS & SETTERS
    // ************************************************************************
	
	public String getWorkgroup() {
		return workgroup;
	}

	public void setWorkgroup(String workgroup) {
		this.workgroup = workgroup;
	}

	public String getEmployeePath() {
		return employeePath;
	}

	public void setEmployeePath(String employeePath) {
		this.employeePath = employeePath;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
