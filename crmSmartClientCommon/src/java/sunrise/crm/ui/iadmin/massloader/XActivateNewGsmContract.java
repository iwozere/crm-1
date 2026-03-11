package sunrise.crm.ui.iadmin.massloader;

/**
 * Container for excel row, indexing starts from 0.
 */
@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.ACTIVATE_NEW_GSM_CONTRACT)
public class XActivateNewGsmContract {

    /**
     * General data required for Activation
     */

    @XColumn(id = 0, required = true)
    public String id;

    @XColumn(id = 1)
    public String msisdn;

    @XColumn(id = 2)
    public String siteId;

    @XColumn(id = 3)
    public String iccid;

    @XColumn(id = 4)
    public String msisdnCat;

    @XColumn(id = 5)
    public String duration;

    @XColumn(id = 6)
    public String schedule;

    @XColumn(id = 7)
    public String ratePlan;

    /**
     * ONP parameters section
     */

    @XColumn(id = 8)
    public String donor;

    @XColumn(id = 9)
    public String donorId;

    @XColumn(id = 10)
    public String connection;

    @XColumn(id = 11)
    public String portingDate;

    @XColumn(id = 12)
    public String ownerFName;

    @XColumn(id = 13)
    public String ownerLName;

    @XColumn(id = 14)
    public String ownerCompany;

    @XColumn(id = 15)
    public String ownerAddress;

    @XColumn(id = 16)
    public String ownerPOBox;

    @XColumn(id = 17)
    public String ownerZip;

    @XColumn(id = 18)
    public String ownerCity;

    @XColumn(id = 19)
    public String temporaryMsisdn;

    @XColumn(id = 20)
    public String notification;

    /**
     * SubscriberInfo parameters section
     */
    @XColumn(id = 21)
    public String userData;

    @XColumn(id = 22)
    public String fName;

    @XColumn(id = 23)
    public String lName;

    @XColumn(id = 24)
    public String address;

    @XColumn(id = 25)
    public String address2;

    @XColumn(id = 26)
    public String zipcode;

    @XColumn(id = 27)
    public String city;

    @XColumn(id = 28)
    public String salutation;

    @XColumn(id = 29)
    public String country;

    @XColumn(id = 30)
    public String dob;

    @XColumn(id = 31)
    public String swisscomDirectory;

    @XColumn(id = 32)
    public String language;

    /**
     * DeliveryAddres parameters section
     */

    @XColumn(id=33)
    public String delSalutation;

    @XColumn(id=34)
    public String delFName;

    @XColumn(id=35)
    public String delLName;

    @XColumn(id=36)
    public String delCompanyName;

    @XColumn(id=37)
    public String delAddress;

    @XColumn(id=38)
    public String  delAddress2;

    @XColumn(id=39)
    public String delCity;

    @XColumn(id=40)
    public String delZipCode;

    @XColumn(id=41)
    public String delCountry;

    @XColumn(id=42)
    public String shippingType;

    @XColumn(id=43)
    public String expressShipment;

    @XColumn(id=44)
    public String shippingCost;

    @XColumn(id=48)
    public String materialId;

    @XColumn(id=49)
    public String listPrice;

    @XColumn(id=50)
    public String discount;
    
    @XColumn(id=51)
    public String parentMsisdn;
    
    // index 52 and 53 are used by flex attributes, as per mass loader template
    
    @XColumn(id=54)
    public String netPrice;
    
    @XColumn(id=55)
    public String eSimContactEmail;
    
    @XColumn(id=56)
    public String subscriberInfoEmail;
    
    @XColumn(id=57)
    public String costCenter;

    
    /******************************************
     * GETTERS & SETTERS
     *****************************************/
    
	public String geteSimContactEmail() {
		return eSimContactEmail;
	}

	public void seteSimContactEmail(String eSimContactEmail) {
		this.eSimContactEmail = eSimContactEmail;
	}

	public void setid(String id) {
        this.id = id;
    }

    public void setmsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public void setsiteId(String siteId) {
        this.siteId = siteId;
    }

    public void seticcid(String iccid) {
        this.iccid = iccid;
    }

    public void setmsisdnCat(String msisdnCat) {
        this.msisdnCat = msisdnCat;
    }

    public void setduration(String duration) {
        this.duration = duration;
    }

    public void setschedule(String schedule) {
        this.schedule = schedule;
    }

    public void setratePlan(String ratePlan) {
        this.ratePlan = ratePlan;
    }

    public void setdonor(String donor) {
        this.donor = donor;
    }

    public void setdonorId(String donorId) {
        this.donorId = donorId;
    }

    public void setconnection(String connection) {
        this.connection = connection;
    }

    public void setportingDate(String portingDate) {
        this.portingDate = portingDate;
    }

    public void setownerFName(String ownerFName) {
        this.ownerFName = ownerFName;
    }

    public void setownerLName(String ownerLName) {
        this.ownerLName = ownerLName;
    }

    public void setownerCompany(String ownerCompany) {
        this.ownerCompany = ownerCompany;
    }

    public void setownerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public void setownerPOBox(String ownerPOBox) {
        this.ownerPOBox = ownerPOBox;
    }

    public void setownerZip(String ownerZip) {
        this.ownerZip = ownerZip;
    }

    public void setownerCity(String ownerCity) {
        this.ownerCity = ownerCity;
    }

    public void settemporaryMsisdn(String temporaryMsisdn) {
        this.temporaryMsisdn = temporaryMsisdn;
    }

    public void setnotification(String notification) {
        this.notification = notification;
    }

    public void setuserData(String userData) {
        this.userData = userData;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public void setaddress2(String address2) {
        this.address2 = address2;
    }

    public void setzipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public void setsalutation(String salutation) {
        this.salutation = salutation;
    }

    public void setcountry(String country) {
        this.country = country;
    }

    public void setdob(String dob) {
        this.dob = dob;
    }

    public void setswisscomDirectory(String swisscomDirectory) {
        this.swisscomDirectory = swisscomDirectory;
    }

    public void setlanguage(String language) {
        this.language = language;
    }

    public void setdelSalutation(String delSalutation) {
        this.delSalutation = delSalutation;
    }

    public void setdelFName(String delFName) {
        this.delFName = delFName;
    }

    public void setdelLName(String delLName) {
        this.delLName = delLName;
    }

    public void setdelCompanyName(String delCompanyName) {
        this.delCompanyName = delCompanyName;
    }

    public void setdelAddress(String delAddress) {
        this.delAddress = delAddress;
    }

    public void setdelAddress2(String delAddress2) {
        this.delAddress2 = delAddress2;
    }

    public void setdelCity(String delCity) {
        this.delCity = delCity;
    }

    public void setdelZipCode(String delZipCode) {
        this.delZipCode = delZipCode;
    }

    public void setdelCountry(String delCountry) {
        this.delCountry = delCountry;
    }

    public void setshippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public void setexpressShipment(String expressShipment) {
        this.expressShipment = expressShipment;
    }

    public void setshippingCost(String shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void setmaterialId(String materialId) {
        this.materialId = materialId;
    }

    public void setlistPrice(String listPrice) {
        this.listPrice = listPrice;
    }

    public void setdiscount(String discount) {
        this.discount = discount;
    }

	public void setparentMsisdn(String parentMsisdn) {
		this.parentMsisdn = parentMsisdn;
	}

	public String getnetPrice() {
		return netPrice;
	}

	public void setnetPrice(String netPrice) {
		this.netPrice = netPrice;
	}

	public String getSubscriberInfoEmail() {
		return subscriberInfoEmail;
	}

	public void setsubscriberInfoEmail(String subscriberInfoEmail) {
		this.subscriberInfoEmail = subscriberInfoEmail;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setcostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	@Override
	public String toString() {
		return "XActivateNewGsmContract [id=" + id + ", msisdn=" + msisdn + ", siteId=" + siteId + ", iccid=" + iccid
				+ ", msisdnCat=" + msisdnCat + ", duration=" + duration + ", schedule=" + schedule + ", ratePlan="
				+ ratePlan + ", donor=" + donor + ", donorId=" + donorId + ", connection=" + connection
				+ ", portingDate=" + portingDate + ", ownerFName=" + ownerFName + ", ownerLName=" + ownerLName
				+ ", ownerCompany=" + ownerCompany + ", ownerAddress=" + ownerAddress + ", ownerPOBox=" + ownerPOBox
				+ ", ownerZip=" + ownerZip + ", ownerCity=" + ownerCity + ", temporaryMsisdn=" + temporaryMsisdn
				+ ", notification=" + notification + ", userData=" + userData + ", fName=" + fName + ", lName=" + lName
				+ ", address=" + address + ", address2=" + address2 + ", zipcode=" + zipcode + ", city=" + city
				+ ", salutation=" + salutation + ", country=" + country + ", dob=" + dob + ", swisscomDirectory="
				+ swisscomDirectory + ", language=" + language + ", delSalutation=" + delSalutation + ", delFName="
				+ delFName + ", delLName=" + delLName + ", delCompanyName=" + delCompanyName + ", delAddress="
				+ delAddress + ", delAddress2=" + delAddress2 + ", delCity=" + delCity + ", delZipCode=" + delZipCode
				+ ", delCountry=" + delCountry + ", shippingType=" + shippingType + ", expressShipment="
				+ expressShipment + ", shippingCost=" + shippingCost + ", materialId=" + materialId + ", listPrice="
				+ listPrice + ", discount=" + discount + ", parentMsisdn=" + parentMsisdn + ", netPrice=" + netPrice
				+ ", eSimContactEmail=" + eSimContactEmail + ", subscriberInfoEmail=" + subscriberInfoEmail
				+ ", costCenter=" + costCenter + "]";
	}
	
	
}
