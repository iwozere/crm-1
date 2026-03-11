package sunrise.crm.xvo.product;

import java.io.Serializable;
import java.util.Date;

public class XSiteLvlOptionVo implements Serializable{

	private static final long serialVersionUID = -263591715609640087L;
	
	private String sitePartObjid;
	private String instanceName;
	private String partStatus;
	private Date activationDt;
	private Date deActivationDt;
	private String price; //frontent attribute only
	private String ChkDeinstall;
	
	public String getSitePartObjid() {
		return sitePartObjid;
	}
	public void setSitePartObjid(String sitePartObjid) {
		this.sitePartObjid = sitePartObjid;
	}
	public String getInstanceName() {
		return instanceName;
	}
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}
	public String getPartStatus() {
		return partStatus;
	}
	public void setPartStatus(String partStatus) {
		this.partStatus = partStatus;
	}
	public Date getActivationDt() {
		return activationDt;
	}
	public void setActivationDt(Date activationDt) {
		this.activationDt = activationDt;
	}
	public Date getDeActivationDt() {
		return deActivationDt;
	}
	public void setDeActivationDt(Date deActivationDt) {
		this.deActivationDt = deActivationDt;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getChkDeinstall() {
		return ChkDeinstall;
	}
	public void setChkDeinstall(String chkDeinstall) {
		ChkDeinstall = chkDeinstall;
	}
		

}

