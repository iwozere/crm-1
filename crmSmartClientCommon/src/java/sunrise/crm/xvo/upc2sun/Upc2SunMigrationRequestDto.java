package sunrise.crm.xvo.upc2sun;

import com.google.gson.Gson;

import sunrise.crm.util.CrmStringUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Upc2SunMigrationRequestDto {

	private String objid;
	private String upcProductId;
	private String upcCustomerId;
	private Date migrationDate;
	private Date migrationDateChangedByCustomer;
	private Upc2SunMassMigrationStatus status;
	private String targetProductName;
	private String sunriseSiteId;
	private String orderId;
	private String logMsg;
	private String cancellationReason;
	private BigDecimal migrationPrice;
	private String upcProductName;
	private List<Upc2SunMigrationLineItemDto> lineItems = new ArrayList<>();
	private List<Upc2SunMigrationAttributeDto> attributes = new ArrayList<>();
	private String processIdentification;
	private String migrationSegment;
	private String commercialOffer;
	private String existingProduct;
	private BigDecimal expectedPrice;

	private BigDecimal calculatedPrice;

	private boolean isLineCheckFromCache = false;

	public boolean isLineCheckFromCache() {
		return isLineCheckFromCache;
	}
	public void setLineCheckFromCache(boolean isLineCheckFromCache) {
		this.isLineCheckFromCache = isLineCheckFromCache;
	}
	public void addLineItem(Upc2SunMigrationLineItemDto lineItem) {
		lineItems.add(lineItem);
	}
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	public String getUpcProductId() {
		return upcProductId;
	}
	public void setUpcProductId(String upcProductId) {
		this.upcProductId = upcProductId;
	}
	public String getUpcCustomerId() {
		return upcCustomerId;
	}
	public void setUpcCustomerId(String upcCustomerId) {
		this.upcCustomerId = upcCustomerId;
	}
	public Date getMigrationDate() {
		return migrationDate;
	}
	public void setMigrationDate(Date migrationDate) {
		this.migrationDate = migrationDate;
	}
	public Date getMigrationDateChangedByCustomer() {
		return migrationDateChangedByCustomer;
	}
	public void setMigrationDateChangedByCustomer(Date migrationDateChangedByCustomer) {
		this.migrationDateChangedByCustomer = migrationDateChangedByCustomer;
	}
	public Upc2SunMassMigrationStatus getStatus() {
		return status;
	}
	public void setStatus(Upc2SunMassMigrationStatus status) {
		this.status = status;
	}
	public String getTargetProductName() {
		return targetProductName;
	}
	public void setTargetProductName(String targetProductName) {
		this.targetProductName = targetProductName;
	}
	public List<Upc2SunMigrationLineItemDto> getLineItems() {
		return lineItems;
	}
	public void setLineItems(List<Upc2SunMigrationLineItemDto> lineItems) {
		this.lineItems = lineItems;
	}
	public List<Upc2SunMigrationAttributeDto> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<Upc2SunMigrationAttributeDto> attributes) {
		this.attributes = attributes;
	}
	public String getSunriseSiteId() {
		return sunriseSiteId;
	}
	public void setSunriseSiteId(String sunriseSiteId) {
		this.sunriseSiteId = sunriseSiteId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getLogMsg() { return logMsg; }
	public void setLogMsg(String logMsg) { this.logMsg = logMsg; }
	public String getCancellationReason() {
		return cancellationReason;
	}
	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}
	public BigDecimal getMigrationPrice() {
		return migrationPrice;
	}
	public void setMigrationPrice(BigDecimal migrationPrice) {
	    this.migrationPrice = migrationPrice;
	}
	public String getProcessIdentification() {
		return processIdentification;
	}
	public void setProcessIdentification(String processIdentification) {
		this.processIdentification = processIdentification;
	}
	public String getMigrationSegment() {
		return migrationSegment;
	}
	public void setMigrationSegment(String migrationSegment) {
		this.migrationSegment = migrationSegment;
	}
	public String getCommercialOffer() {
		return commercialOffer;
	}
	public void setCommercialOffer(String commercialOffer) {
		this.commercialOffer = commercialOffer;
	}
	public String getExistingProduct() {
		return existingProduct;
	}
    public void setExistingProduct(String existingProduct) {
        this.existingProduct = existingProduct;
    }
    public String getUpcProductName() {
        return upcProductName;
    }
    public void setUpcProductName(String upcProductName) {
        this.upcProductName = upcProductName;
    }
    public BigDecimal getExpectedPrice() {
        return expectedPrice;
    }
    public void setExpectedPrice(BigDecimal expectedPrice) {
        this.expectedPrice = expectedPrice;
    }

	public BigDecimal getCalculatedPrice() { return calculatedPrice; }

	public void setCalculatedPrice(BigDecimal calculatedPrice) { this.calculatedPrice = calculatedPrice; }
	
	/**
	 * Returns true, when process is delivering new STB box and modem is taken over. Project 678584.
	 * @return
	 */
	public boolean isStbOnlyRequest(){
		return CrmStringUtil.isNotBlank(getProcessIdentification()) && getProcessIdentification().startsWith("05");
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}



}
