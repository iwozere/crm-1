package sunrise.crm.xvo.order;

import java.io.Serializable;
import java.util.Date;

public class XDevicePlanInfoVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2331204883983366296L;

	private String instalmentId;
	private Date installDate;
	private String sitePartObjid;
	
	public String getInstalmentId() {
		return instalmentId;
	}
	public void setInstalmentId(String instalmentId) {
		this.instalmentId = instalmentId;
	}
	public Date getInstallDate() {
		return installDate;
	}
	public void setInstallDate(Date installDate) {
		this.installDate = installDate;
	}
	public String getSitePartObjid() {
		return sitePartObjid;
	}
	public void setSitePartObjid(String sitePartObjid) {
		this.sitePartObjid = sitePartObjid;
	}
	
	
}
