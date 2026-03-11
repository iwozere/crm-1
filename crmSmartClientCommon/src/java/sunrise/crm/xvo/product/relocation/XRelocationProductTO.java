package sunrise.crm.xvo.product.relocation;

import com.clarify.xvobase.Xvo;

public class XRelocationProductTO {
	
	private String siteId;
	private String productName;
	private String serial;
	private String zipCode;
	private String address;	
	private String streetNumber;
	private String accessType;
	private String newAccessType;
	private String status;
	private String orderId;
	private String productType;
	private boolean tvProduct;
	private Xvo productVo;
	private String ipContractId;
	
	
	/**
	 * @return the productName
	 */
	public final String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public final void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the serial
	 */
	public final String getSerial() {
		return serial;
	}
	/**
	 * @param serial the serial to set
	 */
	public final void setSerial(String serial) {
		this.serial = serial;
	}
	/**
	 * @return the zipCode
	 */
	public final String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public final void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the address
	 */
	public final String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public final void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the accessType
	 */
	public final String getAccessType() {
		return accessType;
	}
	/**
	 * @param accessType the accessType to set
	 */
	public final void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	/**
	 * @return the newAccessType
	 */
	public final String getNewAccessType() {
		return newAccessType;
	}
	/**
	 * @param newAccessType the newAccessType to set
	 */
	public final void setNewAccessType(String newAccessType) {
		this.newAccessType = newAccessType;
	}
	/**
	 * @return the status
	 */
	public final String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public final void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the orderId
	 */
	public final String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public final void setOrderId(String orderId) {
		this.orderId = orderId;
	}
		
	/**
	 * @return the siteId
	 */
	public final String getSiteId() {
		return siteId;
	}
	/**
	 * @param siteId the siteId to set
	 */
	public final void setSiteId(String siteId) {
		this.siteId = siteId;
	}	
	
	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}
	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}	
	/**
	 * @return the tvProduct
	 */
	public Boolean isTvProduct() {
		return tvProduct;
	}
	/**
	 * @param tvProduct the tvProduct to set
	 */
	public void setTvProduct(Boolean tvProduct) {
		this.tvProduct = tvProduct;
	}
		
	/**
	 * @return the productVo
	 */
	public Xvo getProductVo() {
		return productVo;
	}
	/**
	 * @param productVo the productVo to set
	 */
	public void setProductVo(Xvo productVo) {
		this.productVo = productVo;
	}
	/**
	 * @return the streetNumber
	 */
	public String getStreetNumber() {
		return streetNumber;
	}
	/**
	 * @param streetNumber the streetNumber to set
	 */
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XRelocationProductTO [siteId=" + siteId + ", productName="
				+ productName + ", serial=" + serial + ", zipCode=" + zipCode
				+ ", address=" + address + ", streetNumber=" + streetNumber
				+ ", accessType=" + accessType + ", newAccessType="
				+ newAccessType + ", status=" + status + ", orderId=" + orderId
				+ ", productType=" + productType + ", tvProduct=" + tvProduct
				+ ", productVo=" + productVo + "]";
	}
	
	public String getIpContractId() {
		return ipContractId;
	}
	public void setIpContractId(String ipContractId) {
		this.ipContractId = ipContractId;
	}
	public void setTvProduct(boolean tvProduct) {
		this.tvProduct = tvProduct;
	}
				
}
