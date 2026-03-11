package sunrise.crm.xvo.bbfMigration;

import java.util.Date;

public class XBbfMigrationInfoVo {
	
	private String siteId;
	private String oldBillCycle;
	private String newBillCycle;
	private String migrationStatus;
	private String failureReason;
	private String notes;
	private Date executionDate;
	
	public XBbfMigrationInfoVo(){}
	
	public XBbfMigrationInfoVo(String siteId, String oldBillCycle, String newBillCycle, String migrationStatus, String failureReason, String notes){
		this.siteId = siteId;
		this.oldBillCycle = oldBillCycle;
		this.newBillCycle = newBillCycle;
		this.migrationStatus = migrationStatus;
		this.failureReason = failureReason;
		this.notes = notes;
		this.executionDate = new Date();
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getOldBillCycle() {
		return oldBillCycle;
	}

	public void setOldBillCycle(String oldBillCycle) {
		this.oldBillCycle = oldBillCycle;
	}

	public String getNewBillCycle() {
		return newBillCycle;
	}

	public void setNewBillCycle(String newBillCycle) {
		this.newBillCycle = newBillCycle;
	}

	public String getMigrationStatus() {
		return migrationStatus;
	}

	public void setMigrationStatus(String migrationStatus) {
		this.migrationStatus = migrationStatus;
	}

	public String getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}
	
}
