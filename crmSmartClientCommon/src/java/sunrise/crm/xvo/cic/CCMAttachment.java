package sunrise.crm.xvo.cic;

/**
 * Holds information as in ccc_attachment table in CCM database.
 * Project Q8590 . Smart Client.
 * 
 * @author kosyrev
 * @since R17.2
 *
 */
public class CCMAttachment {
    
	private String objid;
	private String fileName;
	private String contentAsString;
	
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContentAsString() {
		return contentAsString;
	}
	public void setContentAsString(String contentAsString) {
		this.contentAsString = contentAsString;
	}
}
