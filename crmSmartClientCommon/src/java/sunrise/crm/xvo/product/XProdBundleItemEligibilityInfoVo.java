package sunrise.crm.xvo.product;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;

/**
 * Defines which product/rateplan combination is eligible for some particular product bundle item.
 * @author Kosyrev
 *
 */
public class XProdBundleItemEligibilityInfoVo {
	
	private static Log log = LogFactory.getLog(XProdBundleItemEligibilityInfoVo.class);

	private String objid;
	private String productName;
	private String ratePlan;

	public XProdBundleItemEligibilityInfoVo() {}

	public XProdBundleItemEligibilityInfoVo(XProdBundleItemEligibilityInfoVo item) {
		this.objid = item.getObjid();
		this.productName = item.getProductName();
		this.ratePlan = item.getRatePlan();
	}

    public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
    public String getRatePlan() {
		return ratePlan;
	}
	public void setRatePlan(String ratePlan) {
		this.ratePlan = ratePlan;
	}
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
