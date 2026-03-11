package sunrise.crm.xvo.order;

import java.io.Serializable;

public class XPaidServiceInfoVO implements Serializable {
	private static final long serialVersionUID = -3794088430816829072L;
	private String operationId;
	private String feeAmount;
	private String operationMessageText;
	private String actionMessageText;
	private String confirmationMessageText;
	private String processingObjectType;
	private String interactionCategory;
	private String interactionReason1;
	private String interactionReason2;
	private String interactionDescription;
	private String feeSitePart;
	
	public XPaidServiceInfoVO() {}
	
	public XPaidServiceInfoVO(String operationId, String feeAmount,
			String operationMessageText, String actionMessageText,
			String confirmationMessageText, String processingObjectType,
			String interactionCategory, String interactionReason1,
			String interactionReason2, String interactionDescription,
			String feeSitePart) {
		this();
		this.operationId = operationId;
		this.feeAmount = feeAmount;
		this.operationMessageText = operationMessageText;
		this.actionMessageText = actionMessageText;
		this.confirmationMessageText = confirmationMessageText;
		this.processingObjectType = processingObjectType;
		this.interactionCategory = interactionCategory;
		this.interactionReason1 = interactionReason1;
		this.interactionReason2 = interactionReason2;
		this.interactionDescription = interactionDescription;
		this.feeSitePart = feeSitePart;
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getOperationMessageText() {
		return operationMessageText;
	}

	public void setOperationMessageText(String operationMessageText) {
		this.operationMessageText = operationMessageText;
	}

	public String getActionMessageText() {
		return actionMessageText;
	}

	public void setActionMessageText(String actionMessageText) {
		this.actionMessageText = actionMessageText;
	}

	public String getConfirmationMessageText() {
		return confirmationMessageText;
	}

	public void setConfirmationMessageText(String confirmationMessageText) {
		this.confirmationMessageText = confirmationMessageText;
	}

	public String getProcessingObjectType() {
		return processingObjectType;
	}

	public void setProcessingObjectType(String processingObjectType) {
		this.processingObjectType = processingObjectType;
	}

	public String getInteractionCategory() {
		return interactionCategory;
	}

	public void setInteractionCategory(String interactionCategory) {
		this.interactionCategory = interactionCategory;
	}

	public String getInteractionReason1() {
		return interactionReason1;
	}

	public void setInteractionReason1(String interactionReason1) {
		this.interactionReason1 = interactionReason1;
	}

	public String getInteractionReason2() {
		return interactionReason2;
	}

	public void setInteractionReason2(String interactionReason2) {
		this.interactionReason2 = interactionReason2;
	}

	public String getInteractionDescription() {
		return interactionDescription;
	}

	public void setInteractionDescription(String interactionDescription) {
		this.interactionDescription = interactionDescription;
	}

	public String getFeeSitePart() {
		return feeSitePart;
	}

	public void setFeeSitePart(String feeSitePart) {
		this.feeSitePart = feeSitePart;
	}
}
