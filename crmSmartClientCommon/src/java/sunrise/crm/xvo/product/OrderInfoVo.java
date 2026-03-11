package sunrise.crm.xvo.product;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;

public class OrderInfoVo {
	
	private static final Log log = LogFactory.getLog(OrderInfoVo.class);

    private String objid;
    private String orderId;
    private String status;
    private String type;
    private String partnerObjid;
    private Calendar createDate;
    private Calendar scheduledDate;
	private String orderSubaction;
    private String origin;
    private String ipContractObjid;
	private String addIpContractObjid;
	private String billingStatus;
    private String contrScheduleObjid;
    private String quotationOrderId;
	private String oldProductName;
	private String newProductName;
	private boolean processDirectionRollback;
	
	// Line item objid as a key, Line item
	private Map<String, ProductOptionInfoVo> lineItems = new HashMap<>();
	
	// Order attribute name, order attribute
	private Map<String, ProductAttributeInfoVo> orderAttributes = new HashMap<>();
	
	public OrderInfoVo(){}
    
    public OrderInfoVo(OrderInfoVo vo){
    	this.setCreateDate(vo.getCreateDate());
    	this.setScheduledDate(vo.getScheduledDate());
    	this.setIpContractObjid(vo.getIpContractObjid());
    	this.setObjid(vo.getObjid());
    	this.setOrderId(vo.getOrderId());
    	this.setOrderSubaction(vo.getOrderSubaction());
    	this.setOrigin(vo.getOrigin());
    	this.setPartnerObjid(vo.getPartnerObjid());
    	this.setStatus(vo.getStatus());
    	this.setType(vo.getType());
    	this.setBillingStatus(vo.getBillingStatus());
    	this.setContrScheduleObjid(vo.getContrScheduleObjid());
    	this.setQuotationOrderId(vo.getQuotationOrderId());
    	this.setAddIpContractObjid(vo.getAddIpContractObjid());
    	this.setOldProductName(vo.getOldProductName());
    	this.setNewProductName(vo.getNewProductName());
    	
    	// Line items are only populated in case of PEC call
    	if (vo.getLineItems() != null && !vo.getLineItems().isEmpty()){
    		vo.getLineItems().entrySet().forEach(li -> {
    			String key = li.getKey();
    			ProductOptionInfoVo value = new ProductOptionInfoVo(li.getValue());
    			this.lineItems.put(key, value);
    		});
    	}
    	
    	// Order attributes are only populated in case of PEC call
    	if (vo.getOrderAttributes() != null && !vo.getOrderAttributes().isEmpty()){
    		vo.getOrderAttributes().entrySet().forEach(attr -> {
    			String key = attr.getKey();
    			ProductAttributeInfoVo value = new ProductAttributeInfoVo(attr.getValue());
    			this.orderAttributes.put(key, value);
    		});
    	}
    }

	public Map<String, ProductAttributeInfoVo> getOrderAttributes() {
		return orderAttributes;
	}

	public Map<String, ProductOptionInfoVo> getLineItems() {
		return lineItems;
	}
    
    public String getIpContractObjid() {
		return ipContractObjid;
	}
	public void setIpContractObjid(String ipContractObjid) {
		this.ipContractObjid = ipContractObjid;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getOrderSubaction() {
		return orderSubaction;
	}
	public void setOrderSubaction(String xOrderSubaction) {
		this.orderSubaction = xOrderSubaction;
	}
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPartnerObjid() {
		return partnerObjid;
	}
	public void setPartnerObjid(String partnerObjid) {
		this.partnerObjid = partnerObjid;
	}
	public Calendar getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}
    public Calendar getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(Calendar scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	
	/**
	 * Actually it is not a billing status anymore. From R25.2 it is a CRM Provisioning status.
	 * @return
	 */
	public String getBillingStatus() {
		return billingStatus;
	}
	
	/**
	 * Actually it is not a billing status anymore. From R25.2 it is a CRM Provisioning status.
	 * @param billingStatus
	 */
	public void setBillingStatus(String billingStatus) {
		this.billingStatus = billingStatus;
	}
	
	/**
	 * Actually it is not a billing status anymore. From R25.2 it is a CRM Provisioning status.
	 * @return
	 */
	public boolean isBillingProvisioningDone() {
		return "DONE".equalsIgnoreCase(this.billingStatus);
	}

	public String getAddIpContractObjid() {
		return addIpContractObjid;
	}

	public void setAddIpContractObjid(String addIpContractObjid) {
		this.addIpContractObjid = addIpContractObjid;
	}

	public String getContrScheduleObjid() {
		return contrScheduleObjid;
	}

	public void setContrScheduleObjid(String contrScheduleObjid) {
		this.contrScheduleObjid = contrScheduleObjid;
	}

	public String getQuotationOrderId() {
		return quotationOrderId;
	}

	public void setQuotationOrderId(String quotationOrderId) {
		this.quotationOrderId = quotationOrderId;
	}
	public void setOldProductName(String oldProductName) {
		this.oldProductName = oldProductName;
	}

	public String getOldProductName() {
		return oldProductName;
	}

	public void setNewProductName(String newProductName) {
		this.newProductName = newProductName;
	}

	public String getNewProductName() {
		return newProductName;
	}

	public boolean isProcessDirectionRollback() {
		return processDirectionRollback;
	}

	public void setProcessDirectionRollback(boolean orderDirectionRollback) {
		this.processDirectionRollback = orderDirectionRollback;
	}

	/**
	 * Checks if order is a RatePlan change order.
	 *
	 * @return <code>true</code>
	 */
	public boolean isRateplanChange() {
		return !Objects.equals(this.getOldProductName(), this.getNewProductName());
	}

	@Override
	public String toString() {
		return (new Gson()).toJson(this);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		OrderInfoVo  orderInfoVo = (OrderInfoVo) o;

		if (!Objects.equals(this.objid, orderInfoVo.objid)) {
			//log.debug("Objid is not equal.");
			return false;
		}
		if (!Objects.equals(this.orderId, orderInfoVo.orderId)) {
			//log.debug("OrderId is not equal.");
			return false;
		}
		if (!Objects.equals(this.status, orderInfoVo.status)) {
			//log.debug("Status is not equal.");
			return false;
		}
		if (!Objects.equals(this.type, orderInfoVo.type)) {
			//log.debug("Type is not equal.");
			return false;
		}
		if (!Objects.equals(this.partnerObjid, orderInfoVo.partnerObjid)) {
			//log.debug("PartnerObjid is not equal.");
			return false;
		}
		if (!Objects.equals(this.createDate, orderInfoVo.createDate)) {
			//log.debug("CreateDate is not equal.");
			return false;
		}
		if (!Objects.equals(this.orderSubaction, orderInfoVo.orderSubaction)) {
			//log.debug("OrderSubaction is not equal.");
			return false;
		}
		if (!Objects.equals(this.origin, orderInfoVo.origin)) {
			//log.debug("Origin is not equal.");
			return false;
		}
		if (!Objects.equals(this.ipContractObjid, orderInfoVo.ipContractObjid)) {
			//log.debug("IpContractObjid is not equal.");
			return false;
		}
		if (!Objects.equals(this.addIpContractObjid, orderInfoVo.addIpContractObjid)) {
			//log.debug("AddIpContractObjid is not equal.");
			return false;
		}
		if (!Objects.equals(this.billingStatus, orderInfoVo.billingStatus)) {
			//log.debug("BillingStatus is not equal.");
			return false;
		}
		if (!Objects.equals(this.contrScheduleObjid, orderInfoVo.contrScheduleObjid)) {
			//log.debug("ContrScheduleObjid is not equal.");
			return false;
		}
		if (!Objects.equals(this.quotationOrderId, orderInfoVo.quotationOrderId)) {
			//log.debug("quotationOrderId is not equal.");
			return false;
		}
		if (!Objects.equals(this.oldProductName, orderInfoVo.oldProductName)) {
			//log.debug("oldProductName is not equal.");
			return false;
		}
		if (!Objects.equals(this.newProductName, orderInfoVo.newProductName)) {
			//log.debug("newProductName is not equal.");
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(objid, orderId, status, type, partnerObjid, createDate
				, orderSubaction, origin, ipContractObjid, addIpContractObjid
				, billingStatus, contrScheduleObjid, quotationOrderId, oldProductName, newProductName);
	}

}
