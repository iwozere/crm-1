package sunrise.crm.xvo.product;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;

public class XProdBundleItemDefInfoVo {
	
	private static Log log = LogFactory.getLog(XProdBundleItemDefInfoVo.class);

	private String objid;
	private String status;
	private Calendar createDate;
	private boolean isMain = false;
	private String description;
	private String promoName;
	private String productGroup;
	
	private List<XProdBundleItemEligibilityInfoVo> eligibility = new ArrayList<>();
	
	public XProdBundleItemDefInfoVo() {}

	public XProdBundleItemDefInfoVo(XProdBundleItemDefInfoVo item) {
		this.objid = item.getObjid();
		this.status = item.getStatus();
		this.createDate = item.getBundlingStartDate();
		this.productGroup = item.getProductGroup();
		this.isMain = item.isMain();
		this.description = item.getDescription();
		this.promoName  = item.getPromoName();
    	item.getEligibility().forEach(i -> this.getEligibility().add(new XProdBundleItemEligibilityInfoVo(i)));
	}

	public List<XProdBundleItemEligibilityInfoVo> getEligibility() {
		return eligibility;
	}
	public void setEligibility(List<XProdBundleItemEligibilityInfoVo> eligibility) {
		this.eligibility = eligibility;
	}
    public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    public String getPromoName() {
		return promoName;
	}
	public void setPromoName(String promoName) {
		this.promoName = promoName;
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
		return createDate;
	}
	public void setBundlingStartDate(Calendar createDate) {
		this.createDate = createDate;
	}
	
	public String getProductGroup() {
		return productGroup;
	}
	
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	
	/**
	 * If currently this subscription is main or not.
	 * Can be only one in the bundle.
	 * Main subscription is responsible for sending the consolidated OC/OA
	 * @return
	 */
	public boolean isMain() {
		return isMain;
	}
	
	/**
	 * If currently this subscription is main or not.
	 * Can be only one in the bundle. If more than one, then others should be reset to false.
	 * @param isMainSubscription
	 */
	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		XProdBundleItemDefInfoVo toVo = (XProdBundleItemDefInfoVo) o;

		if (!Objects.equals(this.isMain, toVo.isMain)) {
			return false;
		}
		if (!Objects.equals(this.status, toVo.status)) {
			return false;
		}
		 return true;
	}

	@Override
    public int hashCode() {
        return Objects.hash(isMain, status, objid);
    }

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}