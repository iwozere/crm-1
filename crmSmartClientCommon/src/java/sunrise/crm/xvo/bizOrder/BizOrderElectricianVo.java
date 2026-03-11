package sunrise.crm.xvo.bizOrder;

public class BizOrderElectricianVo {
	     
        private String siteObjid;
        private String siteName;
        private String address;
        private String city;
        private String zipcode;
        private String contactObjid;
        private String firstName;
        private String lastName;
        private String formattedName;
        private String phone;
        private String faxNumber;
        private String email;
        private String mobilePhone;
        private int    phoneCode1;
        private int    phoneCode2;
        private int    phoneCode3;
        private String additionalInfo;

        // *************************************************************************
        // CONSTRUCTOR
        // *************************************************************************

        public BizOrderElectricianVo(){}
        
        // ***************************
        // *** Setters and getters ***
        // ***************************
        
		public void setSiteObjid(String siteObjid) {
			this.siteObjid = siteObjid;
		}

		public String getSiteObjid() {
			return siteObjid;
		}

		public void setSiteName(String siteName) {
			this.siteName = siteName;
		}

		public String getSiteName() {
			return siteName;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getAddress() {
			return address;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCity() {
			return city;
		}

		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}

		public String getZipcode() {
			return zipcode;
		}

		public void setContactObjid(String contactObjid) {
			this.contactObjid = contactObjid;
		}

		public String getContactObjid() {
			return contactObjid;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setFormattedName(String formattedName) {
			this.formattedName = formattedName;
		}

		public String getFormattedName() {
			return formattedName;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getPhone() {
			return phone;
		}

		public void setFaxNumber(String faxNumber) {
			this.faxNumber = faxNumber;
		}

		public String getFaxNumber() {
			return faxNumber;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmail() {
			return email;
		}

		public void setMobilePhone(String mobilePhone) {
			this.mobilePhone = mobilePhone;
		}

		public String getMobilePhone() {
			return mobilePhone;
		}

		public void setPhoneCode1(int phoneCode1) {
			this.phoneCode1 = phoneCode1;
		}

		public int getPhoneCode1() {
			return phoneCode1;
		}

		public void setPhoneCode2(int phoneCode2) {
			this.phoneCode2 = phoneCode2;
		}

		public int getPhoneCode2() {
			return phoneCode2;
		}

		public void setPhoneCode3(int phoneCode3) {
			this.phoneCode3 = phoneCode3;
		}

		public int getPhoneCode3() {
			return phoneCode3;
		}

		public void setAdditionalInfo(String additionalInfo) {
			this.additionalInfo = additionalInfo;
		}

		public String getAdditionalInfo() {
			return additionalInfo;
		}
}
