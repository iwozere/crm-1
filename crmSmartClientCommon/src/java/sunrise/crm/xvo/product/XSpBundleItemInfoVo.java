package sunrise.crm.xvo.product;

import java.util.Calendar;
import java.util.Objects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;

public class XSpBundleItemInfoVo {
	private String objid;
	private String status;
	private Calendar bundlingStartDate;
	private Calendar bundlingEndDate;
	private String topSitePartObjid;
	private boolean isMainSubscription = false;
	private boolean isOrderedAsMain = false;
	private String bundleObjid;
	private static Log log = LogFactory.getLog(XSpBundleItemInfoVo.class);

	public XSpBundleItemInfoVo() {
	}

	public XSpBundleItemInfoVo(XSpBundleItemInfoVo item) {
		this.objid = item.getObjid();
		this.status = item.getStatus();
		this.bundlingStartDate = item.getBundlingStartDate();
		this.bundlingEndDate = item.getBundlingEndDate();
		this.topSitePartObjid = item.getTopSitePartObjid();
		this.isMainSubscription = item.isMainSubscription();
		this.isOrderedAsMain = item.isOrderedAsMain();
		this.bundleObjid = item.getBundleObjid();
	}

    public String getBundleObjid() {
		return bundleObjid;
	}
	public void setBundleObjid(String bundleObjid) {
		this.bundleObjid = bundleObjid;
	}
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Calendar getBundlingStartDate() {
		return bundlingStartDate;
	}
	public void setBundlingStartDate(Calendar bundlingStartDate) {
		this.bundlingStartDate = bundlingStartDate;
	}
	public Calendar getBundlingEndDate() {
		return bundlingEndDate;
	}
	public void setBundlingEndDate(Calendar bundlingEndDate) {
		this.bundlingEndDate = bundlingEndDate;
	}
	public String getTopSitePartObjid() {
		return topSitePartObjid;
	}
	public void setTopSitePartObjid(String topSitePartObjid) {
		this.topSitePartObjid = topSitePartObjid;
	}
	
	/**
	 * If currently this subscription is main or not.
	 * Can be only one in the bundle.
	 * @return
	 */
	public boolean isMainSubscription() {
		return isMainSubscription;
	}
	
	/**
	 * If currently this subscription is main or not.
	 * Can be only one in the bundle. If more than one, then others should be reset to false.
	 * @param isMainSubscription
	 */
	public void setMainSubscription(boolean isMainSubscription) {
		this.isMainSubscription = isMainSubscription;
	}
	
	/**
	 * Whether this subscription was ordered as first or not.
	 * Can be max one in the bundle. Error is thrown, when more than 1 is set.
	 * @return
	 */
	public boolean isOrderedAsMain() {
		return isOrderedAsMain;
	}
	
	/**
	 * Whether this subscription was ordered as first or not.
	 * Can be max one in the bundle. Error is thrown, when more than 1 is set.
	 * @param isOrderedAsMain
	 */
	public void setOrderedAsMain(boolean isOrderedAsMain) {
		this.isOrderedAsMain = isOrderedAsMain;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		XSpBundleItemInfoVo xSpBundleItemInfoVo = (XSpBundleItemInfoVo) o;

		if (!Objects.equals(this.isMainSubscription, xSpBundleItemInfoVo.isMainSubscription)) {
			//log.debug("IsMainSubscription is not equal.");
			return false;
		}
		if (!Objects.equals(this.isOrderedAsMain, xSpBundleItemInfoVo.isOrderedAsMain)) {
			//log.debug("IsOrderedAsMain is not equal.");
			return false;
		}
		if (!Objects.equals(this.status, xSpBundleItemInfoVo.status)) {
			//log.debug("Status is not equal.");
			return false;
		}
		 return true;
	}

	@Override
    public int hashCode() {
        return Objects.hash(isMainSubscription, isOrderedAsMain, status, topSitePartObjid);
    }

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
	
}
