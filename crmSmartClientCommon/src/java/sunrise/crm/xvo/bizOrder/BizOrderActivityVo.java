package sunrise.crm.xvo.bizOrder;

public class BizOrderActivityVo {
	     
        private String actObjid;
        private String activity;
        private java.util.Date createDate;
        private String user;
        private String additionalInfo;

        // *************************************************************************
        // CONSTRUCTOR
        // *************************************************************************

        public BizOrderActivityVo(){}
        
        // ***************************
        // *** Setters and getters ***
        // ***************************
        
		public void setActObjid(String actObjid) {
			this.actObjid = actObjid;
		}

		public String getActObjid() {
			return actObjid;
		}
        
		public void setActivity(String activity) {
			this.activity = activity;
		}

		public String getActivity() {
			return activity;
		}

		public void setCreateDate(java.util.Date createDate) {
			this.createDate = createDate;
		}

		public java.util.Date getCreateDate() {
			return createDate;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getUser() {
			return user;
		}

		public void setAdditionalInfo(String additionalInfo) {
			this.additionalInfo = additionalInfo;
		}

		public String getAdditionalInfo() {
			return additionalInfo;
		}
}
