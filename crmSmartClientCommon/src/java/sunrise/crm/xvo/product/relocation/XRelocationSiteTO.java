package sunrise.crm.xvo.product.relocation;

import sunrise.crm.util.CrmStringUtil;

public class XRelocationSiteTO {
	
	private String siteId;
	private String siteType;
	private String siteStatus;
	private String legalEntity;
	private String siteSegment;
	
	/*** PRIMARY address data ****/
	private String country;
	private String city;
	private String zipCode;
	private String address;
	private String firstName;
	private String lastName;
	private String salutation;	
	private String companyName;
	
	/*** BILLING address data ****/
	private String billingCountry;
	private String billingCity;
	private String billingZipCode;
	private String billingAddress;
	private String billingFirstName;
	private String billingLastName;
	private String billingSalutation;	
	private String billingCompanyName;	
	
	/*** RELOCATION new address data ****/
	private String newAddress;
	private String newZipCode;
	private String newCity;
	private String newCountry;
	private String newCanton;
	private String newAddress2;
	private String newFloor;
	private String newRoom;
	private String newStreet;
	private String newHouseNo;
	private boolean changeBillingAddress;
	
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
	 * @return the siteType
	 */
	public final String getSiteType() {
		return siteType;
	}
	/**
	 * @param siteType the siteType to set
	 */
	public final void setSiteType(String siteType) {
		this.siteType = siteType;
	}
	/**
	 * @return the country
	 */
	public final String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public final void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the city
	 */
	public final String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public final void setCity(String city) {
		this.city = city;
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
	 * @return the firstName
	 */
	public final String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public final String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the salutation
	 */
	public final String getSalutation() {
		return salutation;
	}
	/**
	 * @param salutation the salutation to set
	 */
	public final void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	/**
	 * @return the siteStatus
	 */
	public final String getSiteStatus() {
		return siteStatus;
	}
	/**
	 * @param siteStatus the siteStatus to set
	 */
	public final void setSiteStatus(String siteStatus) {
		this.siteStatus = siteStatus;
	}
	/**
	 * @return the companyName
	 */
	public final String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public final void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @return the legalEntity
	 */
	public final String getLegalEntity() {
		return legalEntity;
	}
	/**
	 * @param legalEntity the legalEntity to set
	 */
	public final void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}
	/**
	 * @return the siteSegment
	 */
	public final String getSiteSegment() {
		return siteSegment;
	}
	/**
	 * @param siteSegment the siteSegment to set
	 */
	public final void setSiteSegment(String siteSegment) {
		this.siteSegment = siteSegment;
	}
	/**
	 * @return the newAddress
	 */
	public final String getNewAddress() {
		return newAddress;
	}
	/**
	 * @param newAddress the newAddress to set
	 */
	public final void setNewAddress(String newAddress) {
		this.newAddress = newAddress;
	}
	/**
	 * @return the newZipCode
	 */
	public final String getNewZipCode() {
		return newZipCode;
	}
	/**
	 * @param newZipCode the newZipCode to set
	 */
	public final void setNewZipCode(String newZipCode) {
		this.newZipCode = newZipCode;
	}
	/**
	 * @return the newCity
	 */
	public final String getNewCity() {
		return newCity;
	}
	/**
	 * @param newCity the newCity to set
	 */
	public final void setNewCity(String newCity) {
		this.newCity = newCity;
	}
	/**
	 * @return the newCountry
	 */
	public final String getNewCountry() {
		return newCountry;
	}
	/**
	 * @param newCountry the newCountry to set
	 */
	public final void setNewCountry(String newCountry) {
		this.newCountry = newCountry;
	}
		

	/**
	 * @return the newCanton
	 */
	public String getNewCanton() {
		return newCanton;
	}
	/**
	 * @param newCanton the newCanton to set
	 */
	public void setNewCanton(String newCanton) {
		this.newCanton = newCanton;
	}
	/**
	 * @return the newAddress2
	 */
	public String getNewAddress2() {
		return newAddress2;
	}
	/**
	 * @param newAddress2 the newAddress2 to set
	 */
	public void setNewAddress2(String newAddress2) {
		this.newAddress2 = newAddress2;
	}
	/**
	 * @return the newFloor
	 */
	public String getNewFloor() {
		return newFloor;
	}
	/**
	 * @param newFloor the newFloor to set
	 */
	public void setNewFloor(String newFloor) {
		this.newFloor = newFloor;
	}
	/**
	 * @return the newRoom
	 */
	public String getNewRoom() {
		return newRoom;
	}
	/**
	 * @param newRoom the newRoom to set
	 */
	public void setNewRoom(String newRoom) {
		this.newRoom = newRoom;
	}
	
	/**
	 * Address is set when f.i., zipcode is set
	 * @return
	 */
	public boolean isAddressSet() {
		return CrmStringUtil.isNotEmpty(newZipCode);
	}	
	
	/**
	 * @return the billingCountry
	 */
	public String getBillingCountry() {
		return billingCountry;
	}
	/**
	 * @param billingCountry the billingCountry to set
	 */
	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}
	/**
	 * @return the billingCity
	 */
	public String getBillingCity() {
		return billingCity;
	}
	/**
	 * @param billingCity the billingCity to set
	 */
	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}
	/**
	 * @return the billingZipCode
	 */
	public String getBillingZipCode() {
		return billingZipCode;
	}
	/**
	 * @param billingZipCode the billingZipCode to set
	 */
	public void setBillingZipCode(String billingZipCode) {
		this.billingZipCode = billingZipCode;
	}
	/**
	 * @return the billingAddress
	 */
	public String getBillingAddress() {
		return billingAddress;
	}
	/**
	 * @param billingAddress the billingAddress to set
	 */
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	/**
	 * @return the billingFirstName
	 */
	public String getBillingFirstName() {
		return billingFirstName;
	}
	/**
	 * @param billingFirstName the billingFirstName to set
	 */
	public void setBillingFirstName(String billingFirstName) {
		this.billingFirstName = billingFirstName;
	}
	/**
	 * @return the billingLastName
	 */
	public String getBillingLastName() {
		return billingLastName;
	}
	/**
	 * @param billingLastName the billingLastName to set
	 */
	public void setBillingLastName(String billingLastName) {
		this.billingLastName = billingLastName;
	}
	/**
	 * @return the billingSalutation
	 */
	public String getBillingSalutation() {
		return billingSalutation;
	}
	/**
	 * @param billingSalutation the billingSalutation to set
	 */
	public void setBillingSalutation(String billingSalutation) {
		this.billingSalutation = billingSalutation;
	}
	/**
	 * @return the billingCompanyName
	 */
	public String getBillingCompanyName() {
		return billingCompanyName;
	}
	/**
	 * @param billingCompanyName the billingCompanyName to set
	 */
	public void setBillingCompanyName(String billingCompanyName) {
		this.billingCompanyName = billingCompanyName;
	}
		
	/**
	 * @return the changeBillingAddress
	 */
	public boolean isChangeBillingAddress() {
		return changeBillingAddress;
	}
	/**
	 * @param changeBillingAddress the changeBillingAddress to set
	 */
	public void setChangeBillingAddress(boolean changeBillingAddress) {
		this.changeBillingAddress = changeBillingAddress;
	}
	
	/**
	 * @return the newStreet
	 */
	public String getNewStreet() {
		return newStreet;
	}
	/**
	 * @param newStreet the newStreet to set
	 */
	public void setNewStreet(String newStreet) {
		this.newStreet = newStreet;
	}
	/**
	 * @return the newHouseNo
	 */
	public String getNewHouseNo() {
		return newHouseNo;
	}
	/**
	 * @param newHouseNo the newHouseNo to set
	 */
	public void setNewHouseNo(String newHouseNo) {
		this.newHouseNo = newHouseNo;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XRelocationSiteTO [siteId=" + siteId + ", siteType=" + siteType
				+ ", siteStatus=" + siteStatus + ", legalEntity=" + legalEntity
				+ ", siteSegment=" + siteSegment + ", country=" + country
				+ ", city=" + city + ", zipCode=" + zipCode + ", address="
				+ address + ", firstName=" + firstName + ", lastName="
				+ lastName + ", salutation=" + salutation + ", companyName="
				+ companyName + ", billingCountry=" + billingCountry
				+ ", billingCity=" + billingCity + ", billingZipCode="
				+ billingZipCode + ", billingAddress=" + billingAddress
				+ ", billingFirstName=" + billingFirstName
				+ ", billingLastName=" + billingLastName
				+ ", billingSalutation=" + billingSalutation
				+ ", billingCompanyName=" + billingCompanyName
				+ ", newAddress=" + newAddress + ", newZipCode=" + newZipCode
				+ ", newCity=" + newCity + ", newCountry=" + newCountry
				+ ", newCanton=" + newCanton + ", newAddress2=" + newAddress2
				+ ", newFloor=" + newFloor + ", newRoom=" + newRoom
				+ ", newStreet=" + newStreet + ", newHouseNo=" + newHouseNo
				+ ", changeBillingAddress=" + changeBillingAddress + "]";
	}
	
}
