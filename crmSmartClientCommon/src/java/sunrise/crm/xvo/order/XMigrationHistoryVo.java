package sunrise.crm.xvo.order;

import java.io.Serializable;
import java.util.Date;

public class XMigrationHistoryVo implements Serializable {

	/**
	 * 
	 */

	private String orderObjid;
	private String ipContractId;
	private String orderId;
	private String orderStatus;
	private Date orderCreateDate;
	private Date orderCloseDate;
	private String serialNo;
	private String siteId;
	private String orderAction;
	private String fromProductName;
	private String fromProductPrice;
	private String toProductName;
	private String toProductPrice;
	private Date toBillingDate;
	
	
	public String getOrderObjid() {
		return orderObjid;
	}
	public void setOrderObjid(String orderObjid) {
		this.orderObjid = orderObjid;
	}
	public String getIpContractId() {
		return ipContractId;
	}
	public void setIpContractId(String ipContractId) {
		this.ipContractId = ipContractId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getOrderCreateDate() {
		return orderCreateDate;
	}
	public void setOrderCreateDate(Date orderCreateDate) {
		this.orderCreateDate = orderCreateDate;
	}
	public Date getOrderCloseDate() {
		return orderCloseDate;
	}
	public void setOrderCloseDate(Date orderCloseDate) {
		this.orderCloseDate = orderCloseDate;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getOrderAction() {
		return orderAction;
	}
	public void setOrderAction(String orderAction) {
		this.orderAction = orderAction;
	}
	public String getFromProductName() {
		return fromProductName;
	}
	public void setFromProductName(String fromProductName) {
		this.fromProductName = fromProductName;
	}
	public String getFromProductPrice() {
		return fromProductPrice;
	}
	public void setFromProductPrice(String fromProductPrice) {
		this.fromProductPrice = fromProductPrice;
	}
	public String getToProductName() {
		return toProductName;
	}
	public void setToProductName(String toProductName) {
		this.toProductName = toProductName;
	}
	public String getToProductPrice() {
		return toProductPrice;
	}
	public void setToProductPrice(String toProductPrice) {
		this.toProductPrice = toProductPrice;
	}
	public Date getToBillingDate() {
		return toBillingDate;
	}
	public void setToBillingDate(Date toBillingDate) {
		this.toBillingDate = toBillingDate;
	}
	
}
