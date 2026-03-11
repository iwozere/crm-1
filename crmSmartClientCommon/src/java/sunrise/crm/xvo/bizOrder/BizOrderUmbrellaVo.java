package sunrise.crm.xvo.bizOrder;

public class BizOrderUmbrellaVo {

        private String type; // Child or parent
        private String spObjid;
        private String umbrellaObjid;
        private String lastOrderObjid;
        private String svcIdSerialNumber;
        private String svcType;
        private String billSiteName;
        private String billSiteId;
        private String orderStatus;
        private String orderType;
        private java.util.Date sadDate;
        private String slaLevel;
        private java.util.Date expiryDate;
        private String orderRef;
        private String siteAname;
        private String siteAcity;
        private String orderOwner;

        // *************************************************************************
        // CONSTRUCTOR
        // *************************************************************************

        public BizOrderUmbrellaVo(){}
        
        // ***************************
        // *** Setters and getters ***
        // ***************************
        
        public String getType() {
            return type;
        }
        
        public void setType(String type) {
            this.type = type;
        }
        
        public String getSpObjid() {
            return spObjid;
        }
        
        public void setSpObjid(String spObjid) {
            this.spObjid = spObjid;
        }

		public void setUmbrellaObjid(String umbrellaObjid) {
			this.umbrellaObjid = umbrellaObjid;
		}

		public String getUmbrellaObjid() {
			return umbrellaObjid;
		}

		public void setLastOrderObjid(String lastOrderObjid) {
			this.lastOrderObjid = lastOrderObjid;
		}

		public String getLastOrderObjid() {
			return lastOrderObjid;
		}

		public void setSvcIdSerialNumber(String svcIdSerialNumber) {
			this.svcIdSerialNumber = svcIdSerialNumber;
		}

		public String getSvcIdSerialNumber() {
			return svcIdSerialNumber;
		}

		public void setSvcType(String svcType) {
			this.svcType = svcType;
		}

		public String getSvcType() {
			return svcType;
		}

		public void setBillSiteName(String billSiteName) {
			this.billSiteName = billSiteName;
		}

		public String getBillSiteName() {
			return billSiteName;
		}

		public void setBillSiteId(String billSiteId) {
			this.billSiteId = billSiteId;
		}

		public String getBillSiteId() {
			return billSiteId;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		public String getOrderStatus() {
			return orderStatus;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public String getOrderType() {
			return orderType;
		}

		public void setSadDate(java.util.Date sadDate) {
			this.sadDate = sadDate;
		}

		public java.util.Date getSadDate() {
			return sadDate;
		}

		public void setSlaLevel(String slaLevel) {
			this.slaLevel = slaLevel;
		}

		public String getSlaLevel() {
			return slaLevel;
		}

		public void setExpiryDate(java.util.Date expiryDate) {
			this.expiryDate = expiryDate;
		}

		public java.util.Date getExpiryDate() {
			return expiryDate;
		}

		public void setOrderRef(String orderRef) {
			this.orderRef = orderRef;
		}

		public String getOrderRef() {
			return orderRef;
		}

		public void setSiteAname(String siteAname) {
			this.siteAname = siteAname;
		}

		public String getSiteAname() {
			return siteAname;
		}

		public void setSiteAcity(String siteAcity) {
			this.siteAcity = siteAcity;
		}

		public String getSiteAcity() {
			return siteAcity;
		}

		public void setOrderOwner(String orderOwner) {
			this.orderOwner = orderOwner;
		}

		public String getOrderOwner() {
			return orderOwner;
		}
}
