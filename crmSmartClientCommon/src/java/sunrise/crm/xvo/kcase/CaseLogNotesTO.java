package sunrise.crm.xvo.kcase;

import java.util.Date;

public class CaseLogNotesTO {
	
	private Date processingDate;
	
	private String userName;
	
	private String description;
	
	private int sequence;		
	
	public Date getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(Date processingDate) {
		this.processingDate = processingDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		return "RoutingCaseHistTO [processingDate=" + processingDate + ", userName=" + userName + ", description="
				+ description + ", sequence=" + sequence + "]";
	}
	
	

}
