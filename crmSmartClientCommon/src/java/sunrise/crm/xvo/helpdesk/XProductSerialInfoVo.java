package sunrise.crm.xvo.helpdesk;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * The Class XProductSerialInfoVo.
 */
public class XProductSerialInfoVo {
	    
	    /** The Constant LOG. */
    	private static final Log LOG = LogFactory.getLog(XProductSerialInfoVo.class);

		/** The serial no. */
		private String serialNo;
	    
    	/** The description. */
    	private String description;
	    
    	/** The objid. */
    	private String objid;
	    
    	/** The active. */
    	private boolean active;
	    
    	/** The domain. */
    	private String domain; 
	    
    	/**
	     * Instantiates a new x product serial info vo.
	     */
	    public XProductSerialInfoVo() {}

		/* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
		public String toString() {
			return "XProductSerialInfoVo [serialNo=" + serialNo
					+ ", description=" + description + ", objid=" + objid
					+ ", active=" + active + ", domain=" + domain + "]";
		}

    	/**
	     * Instantiates a new x product serial info vo.
	     *
	     * @param productSerialNo the product serial no
	     * @param productInstanceName the product instance name
	     * @param ratePlanObjid the rate plan objid
	     * @param ratePlanInstanceName the rate plan instance name
	     * @param isMigrate the is migrate
	     */
	    public XProductSerialInfoVo(String productSerialNo, String productInstanceName, String ratePlanObjid, String ratePlanInstanceName,boolean isMigrate) {
    		this.serialNo = productSerialNo;
    		this.description= productInstanceName;
    		this.objid=ratePlanObjid;
    		this.active=isMigrate;
    		this.domain=ratePlanInstanceName;
    		
    	}


		/**
    	 * Gets the serial no.
    	 *
    	 * @return the serial no
    	 */
    	public String getSerialNo() {
			return serialNo;
		}
		
		/**
		 * Sets the serial no.
		 *
		 * @param serialNo the new serial no
		 */
		public void setSerialNo(String serialNo) {
			this.serialNo = serialNo;
		}
		
		/**
		 * Gets the description.
		 *
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}
		
		/**
		 * Sets the description.
		 *
		 * @param description the new description
		 */
		public void setDescription(String description) {
			this.description = description;
		}
		
		/**
		 * Gets the objid.
		 *
		 * @return the objid
		 */
		public String getObjid() {
			return objid;
		}
		
		/**
		 * Sets the objid.
		 *
		 * @param objid the new objid
		 */
		public void setObjid(String objid) {
			this.objid = objid;
		}
		
		
		/**
		 * Gets the domain.
		 *
		 * @return the domain
		 */
		public String getDomain() {
			return domain;
		}
		
		/**
		 * Sets the domain.
		 *
		 * @param domain the new domain
		 */
		public void setDomain(String domain) {
			this.domain = domain;
		}

		/**
		 * Checks if is active.
		 *
		 * @return true, if is active
		 */
		public boolean isActive() {
			return active;
		}


		/**
		 * Sets the active.
		 *
		 * @param active the new active
		 */
		public void setActive(boolean active) {
			this.active = active;
		}

	}

