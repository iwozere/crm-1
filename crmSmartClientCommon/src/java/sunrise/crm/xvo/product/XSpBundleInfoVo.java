package sunrise.crm.xvo.product;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sunrise.crm.util.CrmStringUtil;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class XSpBundleInfoVo {
	
    private static Log LOG = LogFactory.getLog(XSpBundleInfoVo.class);
	
	private String objid;
	private String bundleType;
	private String status;
	private Calendar startDate;
	private Calendar createDate;
	private Calendar endDate;
	private String bundleId;
	private String siteObjid;
	private String packLevel;
	private List<XSpBundleItemInfoVo> items = new ArrayList<>();
	private static Log log = LogFactory.getLog(XSpBundleInfoVo.class);

    public XSpBundleInfoVo(XSpBundleInfoVo b) {
    	this.objid = b.getObjid();
    	this.bundleType = b.getBundleType();
    	this.status = b.getStatus();
    	this.startDate = b.getStartDate();
    	this.createDate = b.getCreateDate();
    	this.bundleId = b.getBundleId();
    	this.siteObjid = b.getSiteObjid();
    	this.packLevel = b.getPackLevel();
    	b.getItems().forEach(item -> {
    		this.getItems().add(new XSpBundleItemInfoVo(item));
		});
    }

	public XSpBundleInfoVo() {

	}
	
	
    /**
     * It returns true when bundle has at least one active or pending subscription.
     * @return
     */
    public boolean hasActiveOrPendingProduct(){
        for (XSpBundleItemInfoVo itm : items){
            if (!"INACTIVE".equalsIgnoreCase(itm.getStatus())){
                return true;
            }
        }
        return false;
    }
	
    public String getMainTopSitePartObjid(){
        for (XSpBundleItemInfoVo itm : items){
            if (itm.isMainSubscription()){
                return itm.getTopSitePartObjid();
            }
        }
        return null;
    }
    
    public String getOrderedAsMainTopSitePartObjid(){
        for (XSpBundleItemInfoVo itm : items){
            if (itm.isOrderedAsMain()){
                return itm.getTopSitePartObjid();
            }
        }
        return null;
    }
    
    /**
     * If given sp objid is for bundle item, which is a real main - return true.
     * If it belongs to ordered as a first product and no real main - return true.
     * Otherwise false.
     * @param topSpObjid
     * @return
     */
    public boolean isMainProduct(String topSpObjid){
        String mainProductTopSpObjid = getMainTopSitePartObjid();
        String orderedAsFirstTopSpObjid = getOrderedAsMainTopSitePartObjid();
        LOG.debug(String.format("topSpObjid: %s, mainProductTopSpObjid: %s, orderedAsFirstTopSpObjid: %s", topSpObjid, mainProductTopSpObjid, orderedAsFirstTopSpObjid));
        
        // This product in bundle items, it is not inactive, it is not a main product and not an ordered as first.
        // Ordered as first flag count only when is main is not set.
        for (XSpBundleItemInfoVo item : getItems()){
            if (topSpObjid.equals(item.getTopSitePartObjid())
                    && !"INACTIVE".equalsIgnoreCase(item.getStatus())){
                if (topSpObjid.equals(mainProductTopSpObjid)
                		|| topSpObjid.equals(orderedAsFirstTopSpObjid) && mainProductTopSpObjid == null){
                    // Main product - allowed.
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /**
     * Analyze only NOT-INACTIVE bundle items.
     * If there is ordered-as-first OR (exists main and does not exists ordered-as-first)
     * @return
     */
    public boolean hasMainProduct(){
        String mainProductTopSpObjid = getMainTopSitePartObjid();
        String orderedAsFirstTopSpObjid = getOrderedAsMainTopSitePartObjid();
        LOG.debug(String.format("mainProductTopSpObjid: %s, orderedAsFirstTopSpObjid: %s", mainProductTopSpObjid, orderedAsFirstTopSpObjid));
        return CrmStringUtil.isNotEmpty(orderedAsFirstTopSpObjid) || CrmStringUtil.isNotEmpty(mainProductTopSpObjid);
    }

    public String getSiteObjid() {
		return siteObjid;
	}
	public void setSiteObjid(String siteObjid) {
		this.siteObjid = siteObjid;
	}
	public String getBundleId() {
		return bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	public List<XSpBundleItemInfoVo> getItems() {
		return items;
	}
	public void setItems(List<XSpBundleItemInfoVo> items) {
		this.items = items;
	}
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	public String getBundleType() {
		return bundleType;
	}
	public void setBundleType(String bundleType) {
		this.bundleType = bundleType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	public Calendar getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}
	public Calendar getEndDate() {
		return endDate;
	}
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	public String getPackLevel() {
		return packLevel;
	}
	public void setPackLevel(String packLevel) {
		this.packLevel = packLevel;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		XSpBundleInfoVo xSpBundleInfoVo = (XSpBundleInfoVo) o;
		if (!Objects.equals(this.bundleType, xSpBundleInfoVo.bundleType)) {
			//log.debug("BundleType is not equal.");
			return false;
		}
		if (!Objects.equals(this.status, xSpBundleInfoVo.status)) {
			//log.debug("Status is not equal.");
			return false;
		}
		if (!Objects.equals(this.packLevel, xSpBundleInfoVo.packLevel)) {
			//log.debug("PackLevel is not equal.");
			return false;
		}
		if (!Objects.equals(this.items, xSpBundleInfoVo.items)) {
			//log.debug("Items are not equal.");
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bundleType, status, packLevel, items);
	}
}
