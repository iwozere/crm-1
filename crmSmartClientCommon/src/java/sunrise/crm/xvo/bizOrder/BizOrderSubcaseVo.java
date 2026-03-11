package sunrise.crm.xvo.bizOrder;

public class BizOrderSubcaseVo {
	     
        private String subcaseObjid;
        private String subcaseId;
        private String subcaseTitle;
        private String serviceId;
        private String description;
        private java.util.Date plannedStartDate;
        private String status;
        private String type;
        private String condition;
        private java.util.Date commitDate;
        private int elapsedTime;
        private String owner;
        private String currentQueue;
        private String previousQueue;

        // *************************************************************************
        // CONSTRUCTOR
        // *************************************************************************

        public BizOrderSubcaseVo(){}
        
        // ***************************
        // *** Setters and getters ***
        // ***************************
        
		public void setSubcaseObjid(String subcaseObjid) {
			this.subcaseObjid = subcaseObjid;
		}

		public String getSubcaseObjid() {
			return subcaseObjid;
		}
        
		public void setSubcaseId(String subcaseId) {
			this.subcaseId = subcaseId;
		}

		public String getSubcaseId() {
			return subcaseId;
		}

		public void setSubcaseTitle(String subcaseTitle) {
			this.subcaseTitle = subcaseTitle;
		}

		public String getSubcaseTitle() {
			return subcaseTitle;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getServiceId() {
			return serviceId;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDescription() {
			return description;
		}

		public void setPlannedStartDate(java.util.Date plannedStartDate) {
			this.plannedStartDate = plannedStartDate;
		}

		public java.util.Date getPlannedStartDate() {
			return plannedStartDate;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatus() {
			return status;
		}

        public String getType() {
            return type;
        }
        
        public void setType(String type) {
            this.type = type;
        }

		public void setCondition(String condition) {
			this.condition = condition;
		}

		public String getCondition() {
			return condition;
		}

		public void setCommitDate(java.util.Date commitDate) {
			this.commitDate = commitDate;
		}

		public java.util.Date getCommitDate() {
			return commitDate;
		}

		public void setElapsedTime(int elapsedTime) {
			this.elapsedTime = elapsedTime;
		}

		public int getElapsedTime() {
			return elapsedTime;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getOwner() {
			return owner;
		}

		public void setCurrentQueue(String currentQueue) {
			this.currentQueue = currentQueue;
		}

		public String getCurrentQueue() {
			return currentQueue;
		}

		public void setPreviousQueue(String previousQueue) {
			this.previousQueue = previousQueue;
		}

		public String getPreviousQueue() {
			return previousQueue;
		}
}
