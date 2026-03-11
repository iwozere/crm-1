package sunrise.crm.xvo.m4mdc;

import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class M4mdcMigrationRequestDto {

    private String objid;
    private String offerId;
    private String processType;
    private String msisdn;
    private Date creationDate;
    private Date migrationDate;
    private String migrationStatus;
    private String logMsg;
    private BigDecimal currentPrice;
    private BigDecimal newPrice;
    private boolean isValidationNeeded;
    private Date expirationDate;
    private String targetProduct;
    private String siteId;
    private String orderId;
    private String originalProduct;

	private List<M4mdcMigrationLineItemDto> lineItems = new ArrayList<>();

    public void addLineItem(M4mdcMigrationLineItemDto lineItem) {
        lineItems.add(lineItem);
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getMigrationDate() {
        return migrationDate;
    }

    public void setMigrationDate(Date migrationDate) {
        this.migrationDate = migrationDate;
    }

    public String getMigrationStatus() {
        return migrationStatus;
    }

    public void setMigrationStatus(String migrationStatus) {
        this.migrationStatus = migrationStatus;
    }

    public String getLogMsg() {
        return logMsg;
    }

    public void setLogMsg(String logMsg) {
        this.logMsg = logMsg;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public BigDecimal getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(BigDecimal newPrice) {
        this.newPrice = newPrice;
    }

    public boolean isValidationNeeded() {
        return isValidationNeeded;
    }

    public void setValidationNeeded(boolean validationNeeded) {
        isValidationNeeded = validationNeeded;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getTargetProduct() {
        return targetProduct;
    }

    public void setTargetProduct(String targetProduct) {
        this.targetProduct = targetProduct;
    }

    public List<M4mdcMigrationLineItemDto> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<M4mdcMigrationLineItemDto> lineItems) {
        this.lineItems = lineItems;
    }

	public String getSiteId() {
		return siteId;
	}

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getOrderId() { return orderId; }

    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getOriginalProduct() {
		return originalProduct;
	}

	public void setOriginalProduct(String originalProduct) {
		this.originalProduct = originalProduct;
	}

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
