package sunrise.crm.xvo.bizOrder;

public class BizOrderInstalledPartVo {

        private String siteRef;				// A or Z
        private String objid;				// site_part.objid OR part_num.objid
        private String mlObjid;				// mod_level.objid
        private String mlStatus;			// mod_level.active
        private String instanceName;        // site_part.instance_name
        private String serialNo;            // site_part.serial_no
        private java.util.Date installDate; // site_part.install_date
        private int quantity;               // site_part.quantity
        private String status;              // site_part.part_status
        private String domReference;        // The objid of the associated Site-A or Site-Z
        private String upgrade;             // Set to 'True' if the site-part has been upgraded
        
        // *************************************************************************
        // CONSTRUCTOR
        // *************************************************************************

        public BizOrderInstalledPartVo(){}
        
        // ***************************
        // *** Setters and getters ***
        // ***************************
        
        public String getSiteRef() {
            return siteRef;
        }
        
        public void setSiteRef(String siteRef) {
            this.siteRef = siteRef;
        }
        
        public String getObjid() {
            return objid;
        }
        
        public void setObjid(String objid) {
            this.objid = objid;
        }
  
        public void setMlObjid(String mlObjid) {
			this.mlObjid = mlObjid;
		}

		public String getMlObjid() {
			return mlObjid;
		}

		public void setMlStatus(String mlStatus) {
			this.mlStatus = mlStatus;
		}

		public String getMlStatus() {
			return mlStatus;
		}

		public String getInstanceName() {
            return instanceName;
        }
        
        public void setInstanceName(String instanceName) {
            this.instanceName = instanceName;
        }
        
        public String getSerialNo() {
            return serialNo;
        }
        
        public void setSerialNo(String serialNo) {
            this.serialNo = serialNo;
        }
        
        public java.util.Date getInstallDate() {
            return installDate;
        }
        
        public void setInstallDate(java.util.Date installDate) {
            this.installDate = installDate;
        }
        
        public int getQuantity() {
            return quantity;
        }
        
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        
        public String getStatus() {
            return status;
        }
        
        public void setStatus(String status) {
            this.status = status;
        }

		public void setDomReference(String domReference) {
			this.domReference = domReference;
		}

		public String getDomReference() {
			return domReference;
		}

		public void setUpgrade(String upgrade) {
			this.upgrade = upgrade;
		}

		public String getUpgrade() {
			return upgrade;
		}
}
