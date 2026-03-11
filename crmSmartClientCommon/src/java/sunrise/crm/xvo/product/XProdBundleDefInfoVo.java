package sunrise.crm.xvo.product;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;

/**
 * Product bundles. Project 715663, R26.1 OTT decoupling. 
 * @author Kosyrev
 *
 */
public class XProdBundleDefInfoVo {
	
    private static Log LOG = LogFactory.getLog(XProdBundleDefInfoVo.class);
	
	private String objid;
	private String bundleId;
	private String status;
	private String description;
	private Calendar startDate;
	private Calendar createDate;
	private Calendar endDate;
	
	
	private List<XProdBundleItemDefInfoVo> items = new ArrayList<>();

    public XProdBundleDefInfoVo(XProdBundleDefInfoVo b) {
    	this.objid = b.getObjid();
    	this.description = b.getDescription();
    	this.status = b.getStatus();
    	this.startDate = b.getStartDate();
    	this.createDate = b.getCreateDate();
    	this.bundleId = b.getBundleId();
    	b.getItems().forEach(item -> {
    		this.getItems().add(new XProdBundleItemDefInfoVo(item));
		});
    }

	public XProdBundleDefInfoVo() {

	}
	    
	public String getBundleId() {
		return bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	public List<XProdBundleItemDefInfoVo> getItems() {
		return items;
	}
	public void setItems(List<XProdBundleItemDefInfoVo> items) {
		this.items = items;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		XProdBundleDefInfoVo toVo = (XProdBundleDefInfoVo) o;
		if (!Objects.equals(this.bundleId, toVo.getBundleId())) {
			return false;
		}
		if (!Objects.equals(this.status, toVo.status)) {
			return false;
		}

		if (!Objects.equals(this.items, toVo.items)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bundleId, status, items);
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}

