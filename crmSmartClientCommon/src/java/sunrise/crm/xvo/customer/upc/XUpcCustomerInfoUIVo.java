package sunrise.crm.xvo.customer.upc;

import java.util.Date;

/**
 * Flat UPC info for UI purposes
 * @author salgado
 *
 */
public class XUpcCustomerInfoUIVo {
	
    private String firstName;
    private String lastName;
    private String nationality;
    private String companyName;
    private String salutation;
    private Date birthDate;
    private String gender;
    private String identificationType;
    private String identificationNumber;
    private String language;
    private String emailAddress;
    private String phone;
    
    
    private String streetName;
    private String houseNumber;
    private String zipCode;
    private String city;
    private String country;

    private String paymentType;
    private String invoiceDeliveryChannel;

	private String bankAccountNo;
	private String paymentId;

	private String billCycle;

	// Tax Exemption
	private String taxExemptReason;
	private Date certificateStartDate; 
	private Date certificateEndDate; 
	
	public String getTaxExemptReason() {
		return taxExemptReason;
	}
	public void setTaxExemptReason(String taxExemptReason) {
		this.taxExemptReason = taxExemptReason;
	}

	public Date getCertificateStartDate() {
		return certificateStartDate;
	}
	public void setCertificateStartDate(Date certificateStartDate) {
		this.certificateStartDate = certificateStartDate;
	}
	public Date getCertificateEndDate() {
		return certificateEndDate;
	}
	public void setCertificateEndDate(Date certificateEndDate) {
		this.certificateEndDate = certificateEndDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIdentificationType() {
		return identificationType;
	}
	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getInvoiceDeliveryChannel() {
		return invoiceDeliveryChannel;
	}
	public void setInvoiceDeliveryChannel(String invoiceDeliveryChannel) {
		this.invoiceDeliveryChannel = invoiceDeliveryChannel;
	}
	public String getBillCycle() {
		return billCycle;
	}
	public void setBillCycle(String billCycle) {
		this.billCycle = billCycle;
	}

	@Override
	public String toString() {
		return "XUpcCustomerInfoUIVo{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", nationality='" + nationality + '\'' +
				", companyName='" + companyName + '\'' +
				", salutation='" + salutation + '\'' +
				", birthDate=" + birthDate +
				", gender='" + gender + '\'' +
				", identificationType='" + identificationType + '\'' +
				", identificationNumber='" + identificationNumber + '\'' +
				", language='" + language + '\'' +
				", emailAddress='" + emailAddress + '\'' +
				", phone='" + phone + '\'' +
				", streetName='" + streetName + '\'' +
				", houseNumber='" + houseNumber + '\'' +
				", zipCode='" + zipCode + '\'' +
				", city='" + city + '\'' +
				", country='" + country + '\'' +
				", paymentType='" + paymentType + '\'' +
				", invoiceDeliveryChannel='" + invoiceDeliveryChannel + '\'' +
				", bankAccountNo='" + bankAccountNo + '\'' +
				", billCycle='" + billCycle + '\'' +
				", paymentId='" + paymentId + '\'' +
				", certificateStartDate='" + certificateStartDate + '\'' +
				", certificateEndDate='" + certificateEndDate + '\'' +
				'}';
	}
}
