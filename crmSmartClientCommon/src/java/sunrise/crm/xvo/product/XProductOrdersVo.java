package sunrise.crm.xvo.product;

import java.util.Date;


public class XProductOrdersVo {

		private String orderID;                
        private String title;             
        private String status;
        private Date startDate;
        
        // *************************************************************************
        // CONSTRUCTOR
        // *************************************************************************

        public XProductOrdersVo(){}

		// ***************************
        // *** Setters and getters ***
        // ***************************
        
        public String getOrderID() {
			return orderID;
		}

		public void setOrderID(String orderID) {
			this.orderID = orderID;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
        
}
