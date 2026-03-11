package sunrise.crm.xvo.bizOrder;

import java.io.Serializable;

public class XBizOrderEndDataVo implements Serializable {

	private static final long serialVersionUID = 2400748216201050748L;
	
	//End-site Info
	private String siteId;
	private String siteName;
	private String addressObjid;
	private String address;
	private String address2;
	private String city;
	private String zipcode;
	private String state;
	private String country;
	private String building;
	private String floor;
	private String room;

	//POP
	private String popName;
	
	//Technical contact
	private String techObjid;
	private String techFirstName;
	private String techLastName;
	private String techFormattedName;
	private String techPhone;
	private String techFaxNumber;
	private String techEmail;
	private String techMobilePhone;
	private int    techDphone;
	private int    techDphoneTwo;
	private int    techDphoneThree;
	
	//On-site contact
	private String onsiteObjid;
	private String onsiteFirstName;
	private String onsiteLastName;
	private String onsiteFormattedName;
	private String onsitePhone;
	private String onsiteFaxNumber;
	private String onsiteEmail;
	private String onsiteMobilePhone;
	private int    onsiteDphone;
	private int    onsiteDphoneTwo;
	private int    onsiteDphoneThree;

	//Electrician
	private String elecSiteName;
	private String elecAddress;
	private String elecCity;
	private String elecZipcode;
	private String elecFirstName;
	private String elecLastName;
	private String elecFormattedName;
	private String elecPhone;
	private String elecFaxNumber;
	private String elecEmail;
	private String elecMobilePhone;
	private int    elecDphone;
	private int    elecDphoneTwo;
	private int    elecDphoneThree;
	private String elecMsg;
	
    // ************************************************************************
    // GETTERS & SETTERS
    // ************************************************************************
	
	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
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

	public void setAddressObjid(String addressObjid) {
		this.addressObjid = addressObjid;
	}

	public String getAddressObjid() {
		return addressObjid;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress2() {
		return address2;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getBuilding() {
		return building;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getFloor() {
		return floor;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getRoom() {
		return room;
	}

	public void setPopName(String popName) {
		this.popName = popName;
	}

	public String getPopName() {
		return popName;
	}

	public void setTechObjid(String techObjid) {
		this.techObjid = techObjid;
	}

	public String getTechObjid() {
		return techObjid;
	}

	public void setTechFirstName(String techFirstName) {
		this.techFirstName = techFirstName;
	}

	public String getTechFirstName() {
		return techFirstName;
	}

	public void setTechLastName(String techLastName) {
		this.techLastName = techLastName;
	}

	public String getTechLastName() {
		return techLastName;
	}

	public void setTechFormattedName(String techFormattedName) {
		this.techFormattedName = techFormattedName;
	}

	public String getTechFormattedName() {
		return techFormattedName;
	}

	public void setTechPhone(String techPhone) {
		this.techPhone = techPhone;
	}

	public String getTechPhone() {
		return techPhone;
	}

	public void setTechFaxNumber(String techFaxNumber) {
		this.techFaxNumber = techFaxNumber;
	}

	public String getTechFaxNumber() {
		return techFaxNumber;
	}

	public void setTechEmail(String techEmail) {
		this.techEmail = techEmail;
	}

	public String getTechEmail() {
		return techEmail;
	}

	public void setTechMobilePhone(String techMobilePhone) {
		this.techMobilePhone = techMobilePhone;
	}

	public String getTechMobilePhone() {
		return techMobilePhone;
	}

	public void setTechDphoneTwo(int techDphoneTwo) {
		this.techDphoneTwo = techDphoneTwo;
	}

	public int getTechDphoneTwo() {
		return techDphoneTwo;
	}

	public void setTechDphone(int techDphone) {
		this.techDphone = techDphone;
	}

	public int getTechDphone() {
		return techDphone;
	}

	public void setTechDphoneThree(int techDphoneThree) {
		this.techDphoneThree = techDphoneThree;
	}

	public int getTechDphoneThree() {
		return techDphoneThree;
	}

	public void setOnsiteObjid(String onsiteObjid) {
		this.onsiteObjid = onsiteObjid;
	}

	public String getOnsiteObjid() {
		return onsiteObjid;
	}

	public void setOnsiteFirstName(String onsiteFirstName) {
		this.onsiteFirstName = onsiteFirstName;
	}

	public String getOnsiteFirstName() {
		return onsiteFirstName;
	}

	public void setOnsiteLastName(String onsiteLastName) {
		this.onsiteLastName = onsiteLastName;
	}

	public String getOnsiteLastName() {
		return onsiteLastName;
	}

	public void setOnsiteFormattedName(String onsiteFormattedName) {
		this.onsiteFormattedName = onsiteFormattedName;
	}

	public String getOnsiteFormattedName() {
		return onsiteFormattedName;
	}

	public void setOnsitePhone(String onsitePhone) {
		this.onsitePhone = onsitePhone;
	}

	public String getOnsitePhone() {
		return onsitePhone;
	}

	public void setOnsiteFaxNumber(String onsiteFaxNumber) {
		this.onsiteFaxNumber = onsiteFaxNumber;
	}

	public String getOnsiteFaxNumber() {
		return onsiteFaxNumber;
	}

	public void setOnsiteEmail(String onsiteEmail) {
		this.onsiteEmail = onsiteEmail;
	}

	public String getOnsiteEmail() {
		return onsiteEmail;
	}

	public void setOnsiteMobilePhone(String onsiteMobilePhone) {
		this.onsiteMobilePhone = onsiteMobilePhone;
	}

	public String getOnsiteMobilePhone() {
		return onsiteMobilePhone;
	}

	public void setOnsiteDphone(int onsiteDphone) {
		this.onsiteDphone = onsiteDphone;
	}

	public int getOnsiteDphone() {
		return onsiteDphone;
	}

	public void setOnsiteDphoneTwo(int onsiteDphoneTwo) {
		this.onsiteDphoneTwo = onsiteDphoneTwo;
	}

	public int getOnsiteDphoneTwo() {
		return onsiteDphoneTwo;
	}

	public void setOnsiteDphoneThree(int onsiteDphoneThree) {
		this.onsiteDphoneThree = onsiteDphoneThree;
	}

	public int getOnsiteDphoneThree() {
		return onsiteDphoneThree;
	}

	public void setElecSiteName(String elecSiteName) {
		this.elecSiteName = elecSiteName;
	}

	public String getElecSiteName() {
		return elecSiteName;
	}

	public void setElecAddress(String elecAddress) {
		this.elecAddress = elecAddress;
	}

	public String getElecAddress() {
		return elecAddress;
	}

	public void setElecCity(String elecCity) {
		this.elecCity = elecCity;
	}

	public String getElecCity() {
		return elecCity;
	}

	public void setElecZipcode(String elecZipcode) {
		this.elecZipcode = elecZipcode;
	}

	public String getElecZipcode() {
		return elecZipcode;
	}

	public void setElecFirstName(String elecFirstName) {
		this.elecFirstName = elecFirstName;
	}

	public String getElecFirstName() {
		return elecFirstName;
	}

	public void setElecLastName(String elecLastName) {
		this.elecLastName = elecLastName;
	}

	public String getElecLastName() {
		return elecLastName;
	}

	public void setElecFormattedName(String elecFormattedName) {
		this.elecFormattedName = elecFormattedName;
	}

	public String getElecFormattedName() {
		return elecFormattedName;
	}

	public void setElecPhone(String elecPhone) {
		this.elecPhone = elecPhone;
	}

	public String getElecPhone() {
		return elecPhone;
	}

	public void setElecFaxNumber(String elecFaxNumber) {
		this.elecFaxNumber = elecFaxNumber;
	}

	public String getElecFaxNumber() {
		return elecFaxNumber;
	}

	public void setElecEmail(String elecEmail) {
		this.elecEmail = elecEmail;
	}

	public String getElecEmail() {
		return elecEmail;
	}

	public void setElecMobilePhone(String elecMobilePhone) {
		this.elecMobilePhone = elecMobilePhone;
	}

	public String getElecMobilePhone() {
		return elecMobilePhone;
	}

	public void setElecDphone(int elecDphone) {
		this.elecDphone = elecDphone;
	}

	public int getElecDphone() {
		return elecDphone;
	}

	public void setElecDphoneTwo(int elecDphoneTwo) {
		this.elecDphoneTwo = elecDphoneTwo;
	}

	public int getElecDphoneTwo() {
		return elecDphoneTwo;
	}

	public void setElecDphoneThree(int elecDphoneThree) {
		this.elecDphoneThree = elecDphoneThree;
	}

	public int getElecDphoneThree() {
		return elecDphoneThree;
	}

	public void setElecMsg(String elecMsg) {
		this.elecMsg = elecMsg;
	}

	public String getElecMsg() {
		return elecMsg;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
