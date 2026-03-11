package sunrise.crm.ui.iadmin;

import java.math.BigDecimal;

/**
 * The Class OrderProcessInfo.
 */
public class OrderProcessInfo {

	/** The x media type. */
	private String xMediaType;

	/** The x template body. */
	private String xTemplateBody;

	/** The x status id. */
	private String xStatusId;

	/** The x status name. */
	private String xStatusName; 

	/** The x phase id. */
	private BigDecimal xPhaseId;

	/** The x phase name. */
	private String xPhaseName;

	/** The x product dependency. */
	private String xProductDependency;

	/** The x has exception. */
	private BigDecimal xHasException;

	/** The x exception delay. */
	private BigDecimal xExceptionDelay;

	/** The x is notification enabled. */
	private BigDecimal xIsNotificationEnabled;

	/** The x is enabled. */
	private BigDecimal xIsEnabled;

	/** The xchannel name. */
	private String xchannelName;
	
	private BigDecimal xId;

	/**
	 * Gets the x status id.
	 *
	 * @return the x status id
	 */
	public String getXStatusId() {
		return xStatusId;
	}

	public BigDecimal getXId() {
		return xId;
	}

	public void setXId(BigDecimal xId) {
		this.xId = xId;
	}

	/**
	 * Gets the x status name.
	 *
	 * @return the x status name
	 */
	public String getXStatusName() {
		return xStatusName;
	}

	/**
	 * Gets the x phase id.
	 *
	 * @return the x phase id
	 */
	public BigDecimal getXPhaseId() {
		return xPhaseId;
	}

	/**
	 * Gets the x phase name.
	 *
	 * @return the x phase name
	 */
	public String getXPhaseName() {
		return xPhaseName;
	}

	/**
	 * Gets the x product dependency.
	 *
	 * @return the x product dependency
	 */
	public String getXProductDependency() {
		return xProductDependency;
	}

	/**
	 * Gets the x has exception.
	 *
	 * @return the x has exception
	 */
	public BigDecimal getXHasException() {
		return xHasException;
	}

	/**
	 * Gets the x exception delay.
	 *
	 * @return the x exception delay
	 */
	public BigDecimal getXExceptionDelay() {
		return xExceptionDelay;
	}

	/**
	 * Gets the x is notification enabled.
	 *
	 * @return the x is notification enabled
	 */
	public BigDecimal getXIsNotificationEnabled() {
		return xIsNotificationEnabled;
	}

	/**
	 * Gets the x is enabled.
	 *
	 * @return the x is enabled
	 */
	public BigDecimal getXIsEnabled() {
		return xIsEnabled;
	}

	/**
	 * Gets the x channel name.
	 *
	 * @return the x channel name
	 */
	public String getXChannelName() {
		return xchannelName;
	}

	/**
	 * Gets the x media type.
	 *
	 * @return the x media type
	 */
	public String getXMediaType() {
		return xMediaType;
	}

	/**
	 * Gets the x template body.
	 *
	 * @return the x template body
	 */
	public String getXTemplateBody() {
		return xTemplateBody;
	}

	/**
	 * Sets the x template body.
	 *
	 * @param xTemplateBody the new x template body
	 */
	public void setXTemplateBody(String xTemplateBody) {
		this.xTemplateBody = xTemplateBody;
	}

	/**
	 * Sets the x media type.
	 *
	 * @param xMediaType the new x media type
	 */
	public void setXMediaType(String xMediaType) {
		this.xMediaType = xMediaType;
	}

	/**
	 * Sets the x status id.
	 *
	 * @param xStatusId the new x status id
	 */
	public void setXStatusId(String xStatusId) {
		this.xStatusId = xStatusId;
	}

	/**
	 * Sets the x status name.
	 *
	 * @param xStatusName the new x status name
	 */
	public void setXStatusName(String xStatusName) {
		this.xStatusName = xStatusName;
	}

	/**
	 * Sets the x phase id.
	 *
	 * @param xPhaseId the new x phase id
	 */
	public void setXPhaseId(BigDecimal xPhaseId) {
		this.xPhaseId = xPhaseId;
	}

	/**
	 * Sets the x phase name.
	 *
	 * @param xPhaseName the new x phase name
	 */
	public void setXPhaseName(String xPhaseName) {
		this.xPhaseName = xPhaseName;
	}

	/**
	 * Sets the x product dependency.
	 *
	 * @param xProductDependency the new x product dependency
	 */
	public void setXProductDependency(String xProductDependency) {
		this.xProductDependency = xProductDependency;
	}

	/**
	 * Sets the x has exception.
	 *
	 * @param xHasException the new x has exception
	 */
	public void setXHasException(BigDecimal xHasException) {
		this.xHasException = xHasException;
	}

	/**
	 * Sets the x exception delay.
	 *
	 * @param xExceptionDelay the new x exception delay
	 */
	public void setXExceptionDelay(BigDecimal xExceptionDelay) {
		this.xExceptionDelay = xExceptionDelay;
	}

	/**
	 * Sets the x is notification enabled.
	 *
	 * @param xIsNotificationEnabled the new x is notification enabled
	 */
	public void setXIsNotificationEnabled(BigDecimal xIsNotificationEnabled) {
		this.xIsNotificationEnabled = xIsNotificationEnabled;
	}

	/**
	 * Sets the x is enabled.
	 *
	 * @param xIsEnabled the new x is enabled
	 */
	public void setXIsEnabled(BigDecimal xIsEnabled) {
		this.xIsEnabled = xIsEnabled;
	}

	/**
	 * Sets the x channel name.
	 *
	 * @param channel the new x channel name
	 */
	public void setXChannelName(String channel) {
		this.xchannelName = channel;
	}

}