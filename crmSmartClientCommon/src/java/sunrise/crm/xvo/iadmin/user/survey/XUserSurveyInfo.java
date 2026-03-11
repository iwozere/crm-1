package sunrise.crm.xvo.iadmin.user.survey;

import java.util.Date;

public class XUserSurveyInfo {
	
	private String employeeObjid;
	private String userObjid;
	private String loginName;
	private String firstName;
	private String lastName;
	private String participantObjid;
	private Date scheduledDate;
	private Date answerdDate;
	
	public String getEmployeeObjid() {
		return employeeObjid;
	}
	public void setEmployeeObjid(String employeeObjid) {
		this.employeeObjid = employeeObjid;
	}
	public String getUserObjid() {
		return userObjid;
	}
	public void setUserObjid(String userObjid) {
		this.userObjid = userObjid;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getParticipantObjid() {
		return participantObjid;
	}
	public void setParticipantObjid(String xUserInfoObjid) {
		this.participantObjid = xUserInfoObjid;
	}
	public Date getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	public Date getAnswerDate() {
		return answerdDate;
	}
	public void setAnswerDate(Date answerdDate) {
		this.answerdDate = answerdDate;
	}
	
	
	@Override
	public String toString() {
		return "XUserSurveyInfo [employeeObjid=" + employeeObjid + ", userObjid=" + userObjid + ", loginName="
				+ loginName + ", firstName=" + firstName + ", lastName=" + lastName + ", xUserInfoObjid="
				+ participantObjid + ", scheduledDate=" + scheduledDate + ", answerdDate=" + answerdDate  + "]";
	}
	

}
