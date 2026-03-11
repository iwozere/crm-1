package sunrise.crm.xvo.product;


public class XLateElectricianCaseVo {

		private String serialNo;                
        private String orderType;             
        private String address;
        private String nsn;
        private String accessType;
        private String upkContact;
        private String status;
        private String title;
        private String productName;
        private String upkRequired;
        private boolean showAllHFCPackages;
        private String hfcBillingMethod;
        private String sitePartObjid ;
        private String hfcAddressType ;

        // *************************************************************************
        // CONSTRUCTOR
        // *************************************************************************

       

		public String getUpkRequired() {
			return upkRequired;
		}

		public void setUpkRequired(String upkRequired) {
			this.upkRequired = upkRequired;
		}

		public XLateElectricianCaseVo(){}
        
        // ***************************
        // *** Setters and getters ***
        // ***************************
        
        public String getSerialNo() {
    		return serialNo;
    	}


    	public void setSerialNo(String serialNo) {
    		this.serialNo = serialNo;
    	}


    	public String getOrderType() {
    		return orderType;
    	}


    	public void setOrderType(String orderType) {
    		this.orderType = orderType;
    	}


    	public String getAddress() {
    		return address;
    	}


    	public void setAddress(String address) {
    		this.address = address;
    	}


    	public String getNsn() {
    		return nsn;
    	}


    	public void setNsn(String nsn) {
    		this.nsn = nsn;
    	}


    	public String getAccessType() {
    		return accessType;
    	}


    	public void setAccessType(String accessType) {
    		this.accessType = accessType;
    	}


    	public String getUpkContact() {
    		return upkContact;
    	}


    	public void setUpkContact(String upkContact) {
    		this.upkContact = upkContact;
    	}


    	public String getStatus() {
    		return status;
    	}


    	public void setStatus(String status) {
    		this.status = status;
    	}
    	
    	public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public boolean isShowAllHFCPackages() {
			return showAllHFCPackages;
		}

		public void setShowAllHFCPackages(boolean showAllHFCPackages) {
			this.showAllHFCPackages = showAllHFCPackages;
		}

		public String getHfcBillingMethod() {
			return hfcBillingMethod;
		}

		public void setHfcBillingMethod(String hfcBillingMethod) {
			this.hfcBillingMethod = hfcBillingMethod;
		}

		public String getSitePartObjid() {
			return sitePartObjid;
		}

		public void setSitePartObjid(String sitePartObjid) {
			this.sitePartObjid = sitePartObjid;
		}

		public String getHfcAddressType() {
			return hfcAddressType;
		}

		public void setHfcAddressType(String hfcAddressType) {
			this.hfcAddressType = hfcAddressType;
		}
		
}
