package sunrise.crm.xvo.kcase;

import java.util.Date;

/**
 * Class is used to describe the routing case task. Displayed on the XCasesCockpit form.
 * @author bogojev
 *
 */

public class XRoutingCaseTaskVo {

    private String caseObjid;
    private String caseId;
    private String rcTaskDefObjid;
    private String rcTaskInstObjid;
    private String routCaseTaskName;
    private Date dueDate;
    private String status;
    private String manualComment;
    private String automaticComment;
    private String cellStyle; // frontend attribute only
    private boolean taskActive; // frontend attribute only
    private boolean dueDateActive; // frontend attribute only
    private String rcTaskInstCause;
    private String rcTaskInstReason;
  

    public String getCaseObjid() {
        return caseObjid;
    }

    public void setCaseObjid(String caseObjid) {
        this.caseObjid = caseObjid;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getRcTaskDefObjid() {
        return rcTaskDefObjid;
    }

    public void setRcTaskDefObjid(String rcTaskDefObjid) {
        this.rcTaskDefObjid = rcTaskDefObjid;
    }

    public String getRcTaskInstObjid() {
        return rcTaskInstObjid;
    }

    public void setRcTaskInstObjid(String rcTaskInstObjid) {
        this.rcTaskInstObjid = rcTaskInstObjid;
    }

    public String getRoutCaseTaskName() {
        return routCaseTaskName;
    }

    public void setRoutCaseTaskName(String routCaseTaskName) {
        this.routCaseTaskName = routCaseTaskName;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getManualComment() {
        return manualComment;
    }

    public void setManualComment(String manualComment) {
        this.manualComment = manualComment;
    }
    
    public String getAutomaticComment() {
        return automaticComment;
    }

    public void setAutomaticComment(String automaticComment) {
        this.automaticComment = automaticComment;
    }

    public String getCellStyle() {
        return cellStyle;
    }

    public void setCellStyle(String cellStyle) {
        this.cellStyle = cellStyle;
    }

    public boolean isTaskActive() {
        return taskActive;
    }

    public void setTaskActive(boolean taskActive) {
        this.taskActive = taskActive;
    }

    public boolean isDueDateActive() {
        return dueDateActive;
    }

    public void setDueDateActive(boolean dueDateActive) {
        this.dueDateActive = dueDateActive;
    }

    public String getRcTaskInstCause() {
		return rcTaskInstCause;
	}

	public void setRcTaskInstCause(String rcTaskInstCause) {
		this.rcTaskInstCause = rcTaskInstCause;
	}

	public String getRcTaskInstReason() {
		return rcTaskInstReason;
	}

	public void setRcTaskInstReason(String rcTaskInstReason) {
		this.rcTaskInstReason = rcTaskInstReason;
	}


	@Override
	public String toString() {
		return "XRoutingCaseTaskVo [caseObjid=" + caseObjid + ", caseId=" + caseId + ", rcTaskDefObjid="
				+ rcTaskDefObjid + ", rcTaskInstObjid=" + rcTaskInstObjid + ", routCaseTaskName=" + routCaseTaskName
				+ ", dueDate=" + dueDate + ", status=" + status + ", manualComment=" + manualComment
				+ ", automaticComment=" + automaticComment + ", cellStyle=" + cellStyle + ", taskActive=" + taskActive
				+ ", dueDateActive=" + dueDateActive + ", rcTaskInstCause=" + rcTaskInstCause 
				+ ", rcTaskInstReason=" + rcTaskInstReason + "]";
	}
}
