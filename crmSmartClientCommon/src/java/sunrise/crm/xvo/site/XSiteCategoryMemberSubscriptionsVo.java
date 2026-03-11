/**
 * 
 */
package sunrise.crm.xvo.site;

import java.io.Serializable;

/**
 * @author garg
 *
 */
public class XSiteCategoryMemberSubscriptionsVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4268720005288975772L;
	
	private String serialNo;
	private String discountAction;
	private String discountDuration;
	private String contractDuration;
	private String renewalDuration;
	
	public String getSerialNo() {
		return serialNo;
	}
	
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	
	public String getDiscountAction() {
		return discountAction;
	}
	
	public void setDiscountAction(String discountAction) {
		this.discountAction = discountAction;
	}
	
	public String getDiscountDuration() {
		return discountDuration;
	}
	
	public void setDiscountDuration(String discountDuration) {
		this.discountDuration = discountDuration;
	}
	
	public String getContrDuration() {
		return contractDuration;
	}
	
	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}
	
	public String getRenewDuration() {
		return renewalDuration;
	}
	
	public void setRenewDuration(String renewalDuration) {
		this.renewalDuration = renewalDuration;
	}
	
	@Override
    public String toString() {
        return new StringBuilder().append("[")
                .append("serialNo=").append(serialNo).append(", ")
                .append("discountAction=").append(discountAction).append(", ")
                .append("discountDuration=").append(discountDuration).append(", ")
                .append("contractDuration=").append(contractDuration).append(", ")
                .append("renewalDuration=").append(renewalDuration)
                .append("]").toString();
    }
	
}
