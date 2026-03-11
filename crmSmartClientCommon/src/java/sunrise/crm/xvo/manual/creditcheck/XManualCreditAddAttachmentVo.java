package sunrise.crm.xvo.manual.creditcheck;

public class XManualCreditAddAttachmentVo {
	  private String filename;
	  private String referenceId;
	  private String timestamp;
	  private String description;
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "XManualCreditAddAttachmentVo [filename=" + filename + ", referenceId=" + referenceId + ", timestamp="
				+ timestamp + ", description=" + description + "]";
	}
	  
	  
}
