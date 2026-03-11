package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.CREATE_CUSTOMER)
public class XCreateCustomer {

    public String externalId;

    public String fname;

    public String lname;

    public String phoneNumber;

    public String company;
    
    public String uid;

    public String customerType;

    public String creditClass;

    public String score;

    public String salutation;

    public String dob;

    public String nationality;

    public String documentType;

    public String documentNumber;

    public String email;

    public String address;

    public String zip;

    public String city;

    public String country;

    public String billType;

    public String billFormat;

    public String billingLanguage;

    public String paymentType;

    public String threshold;

    public String creditCheckValidation;

    public String salesRep;

    public String acctMrg;

    public String altFname;

    public String altLname;

    public String altPhoneNumber;

    public String altAddress;

    public String altZip;

    public String altCity;

    public String altCountry;

    public String siteCatType;

    public String siteCatName;

    public String siteBillMedium;

    public String appId;

    public String siteId;

    public String responseXML;
    
    @XColumn(id=40, required = false)
    public String taifunId;
    
    @XColumn(id=41, required = false)
    public String upcCustId;

    public void setexternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setfname(String fname) {
        this.fname = fname;
    }

    public void setlname(String lname) {
        this.lname = lname;
    }

    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setcompany(String company) {
        this.company = company;
    }

    public void setuid(String uid) {
        this.uid = uid;
    }

    public void setcustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setcreditClass(String creditClass) {
        this.creditClass = creditClass;
    }

    public void setscore(String score) {
        this.score = score;
    }

    public void setsalutation(String salutation) {
        this.salutation = salutation;
    }

    public void setdob(String dob) {
        this.dob = dob;
    }

    public void setnationality(String nationality) {
        this.nationality = nationality;
    }

    public void setdocumentType(String documentType) {
        this.documentType = documentType;
    }

    public void setdocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public void setzip(String zip) {
        this.zip = zip;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public void setcountry(String country) {
        this.country = country;
    }

    public void setbillType(String billType) {
        this.billType = billType;
    }

    public void setbillFormat(String billFormat) {
        this.billFormat = billFormat;
    }

    public void setbillingLanguage(String billingLanguage) {
        this.billingLanguage = billingLanguage;
    }

    public void setpaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setthreshold(String threshold) {
        this.threshold = threshold;
    }

    public void setcreditCheckValidation(String creditCheckValidation) {
        this.creditCheckValidation = creditCheckValidation;
    }

    public void setsalesRep(String salesRep) {
        this.salesRep = salesRep;
    }

    public void setacctMrg(String acctMrg) {
        this.acctMrg = acctMrg;
    }

    public void setaltFname(String altFname) {
        this.altFname = altFname;
    }

    public void setaltLname(String altLname) {
        this.altLname = altLname;
    }

    public void setaltPhoneNumber(String altPhoneNumber) {
        this.altPhoneNumber = altPhoneNumber;
    }

    public void setaltAddress(String altAddress) {
        this.altAddress = altAddress;
    }

    public void setaltZip(String altZip) {
        this.altZip = altZip;
    }

    public void setaltCity(String altCity) {
        this.altCity = altCity;
    }

    public void setaltCountry(String altCountry) {
        this.altCountry = altCountry;
    }

    public void setsiteCatType(String siteCatType) {
        this.siteCatType = siteCatType;
    }

    public void setsiteCatName(String siteCatName) {
        this.siteCatName = siteCatName;
    }

    public void setsiteBillMedium(String siteBillMedium) {
        this.siteBillMedium = siteBillMedium;
    }

    public void setappId(String appId) {
        this.appId = appId;
    }

    public void setsiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setresponseXML(String responseXML) {
        this.responseXML = responseXML;
    }


	public void settaifunId(String taifunId) {
		this.taifunId = taifunId;
	}	

	public void setupcCustId(String upcCustId) {
		this.upcCustId = upcCustId;
	}

	@Override
	public String toString() {
		return "XCreateCustomer [externalId=" + externalId + ", fname=" + fname + ", lname=" + lname + ", phoneNumber="
				+ phoneNumber + ", company=" + company + ", uid=" + uid + ", customerType=" + customerType
				+ ", creditClass=" + creditClass + ", score=" + score + ", salutation=" + salutation + ", dob=" + dob
				+ ", nationality=" + nationality + ", documentType=" + documentType + ", documentNumber="
				+ documentNumber + ", email=" + email + ", address=" + address + ", zip=" + zip + ", city=" + city
				+ ", country=" + country + ", billType=" + billType + ", billFormat=" + billFormat
				+ ", billingLanguage=" + billingLanguage + ", paymentType=" + paymentType + ", threshold=" + threshold
				+ ", creditCheckValidation=" + creditCheckValidation + ", salesRep=" + salesRep + ", acctMrg=" + acctMrg
				+ ", altFname=" + altFname + ", altLname=" + altLname + ", altPhoneNumber=" + altPhoneNumber
				+ ", altAddress=" + altAddress + ", altZip=" + altZip + ", altCity=" + altCity + ", altCountry="
				+ altCountry + ", siteCatType=" + siteCatType + ", siteCatName=" + siteCatName + ", siteBillMedium="
				+ siteBillMedium + ", appId=" + appId + ", siteId=" + siteId + ", responseXML=" + responseXML
				+ ", taifunId=" + taifunId + ", upcCustId=" + upcCustId + "]";
	}
	
	
        
}
