package sunrise.crm.xvo.iadmin.user;

import java.util.Date;


public class XWorkObjectsVo {
    
	private int elmObjid;
	private int objectType;
	private String title;
	private String idNumber;
	private String workFolder;
	private String queue;
	private Date xCreationDate;
	private String xAgeStr;
	private String condition;
	private String status;
	private String priority;
	private Date dueDate;
	private String caseType;
	private String language;
	private String firstName;
	private String lastName;
	private String relatedOrderStatus;
	private int countOfOpenFaultCase;
	private String faultCaseLinkedToProductStatus;
    
	public int getElmObjid() {
		return elmObjid;
	}
	public void setElmObjid(int elmObjid) {
		this.elmObjid = elmObjid;
	}
	public int getObjectType() {
		return objectType;
	}
	public void setObjectType(int objectType) {
		this.objectType = objectType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getWorkFolder() {
		return workFolder;
	}
	public void setWorkFolder(String workFolder) {
		this.workFolder = workFolder;
	}
	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
	public Date getxCreationDate() {
		return xCreationDate;
	}
	public void setxCreationDate(Date xCreationDate) {
		this.xCreationDate = xCreationDate;
	}
	public String getxAgeStr() {
		return xAgeStr;
	}
	public void setxAgeStr(String xAgeStr) {
		this.xAgeStr = xAgeStr;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getCaseType() {
		return caseType;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
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
	public String getRelatedOrderStatus() {
		return relatedOrderStatus;
	}
	public void setRelatedOrderStatus(String relatedOrderStatus) {
		this.relatedOrderStatus = relatedOrderStatus;
	}
	public int getCountOfOpenFaultCase() {
		return countOfOpenFaultCase;
	}
	public void setCountOfOpenFaultCase(int countOfOpenFaultCase) {
		this.countOfOpenFaultCase = countOfOpenFaultCase;
	}
	
	public String getFaultCaseLinkedToProductStatus() {
		return faultCaseLinkedToProductStatus;
	}
	public void setFaultCaseLinkedToProductStatus(String faultCaseLinkedToProductStatus) {
		this.faultCaseLinkedToProductStatus = faultCaseLinkedToProductStatus;
	}
	@Override
	public String toString() {
		return "XWorkObjectsVo [elmObjid=" + elmObjid + ", objectType="
				+ objectType + ", title=" + title + ", idNumber=" + idNumber
				+ ", workFolder=" + workFolder + ", queue=" + queue
				+ ", xCreationDate=" + xCreationDate + ", xAgeStr=" + xAgeStr
				+ ", condition=" + condition + ", status=" + status
				+ ", priority=" + priority + ", dueDate=" + dueDate
				+ ", caseType=" + caseType + ", language=" + language 
				+", firstName=" + firstName + ", lastName=" + lastName +"]";
	}    
}
