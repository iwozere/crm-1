package sunrise.crm.xvo.order;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class XDowngradeFeeInfoVo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1104683763623870125L;
	
	private String feeName;
	private String feeAmount;
	
	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}
	public String getFeeName() {
		return feeName;
	}
	
	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}
	public String getFeeAmount() {
		return feeAmount;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
