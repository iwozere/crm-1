package sunrise.crm.xvo.product;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class XCeaseRequestLineVwVoExt implements Serializable {

	private static final long serialVersionUID = -1450126412170891129L;
	
	//From XVO
	private String objid;
	private Date xRequestDate;
	private Date xCeaseWishDate;
	private Date xAccessCeaseWishDate;
	private String xRequestType;
	private String xCeaseReason;
	private String xCancelReason;
	private String xPrimaryAction;
	private String xSecondaryAction;
	private byte xWasContractExtended;
	private String xOverruleReason;
	private String xDirection;
	private String xMedium;
	private String xEtf;
	private String xSubcaseObjid;
	private String xSubcaseId;
	private String xParentCaseObjid;
	private String xSubcaseStatus;
	private String xIpObjid;
	private String xIpId;
	private Date xIpStartDate;
	private String xDisplaySerialNo;
	private String xSerialNo;
	private String xPartStatus;
	private String xInstanceName;
	private int xDuration;
	private String xTitle;
	private int xLevelToPart;
//	private String xSelectStatus;
	private String xProdCategory;
	private String xOptionEtf;
	private byte xIsLetterRequired;
	private byte xIsVoiceRecording;
	private String xDevicePlanEtf;
	private String xCeaseOption;
	private String xBrokenBundleEtf;
	private String xTertiaryAction;
	private boolean isCallReasonSaved;
	private String xWaiveEtf;
	
	// List of Strings
	private XCeaseRequestLineCeaseReasons[] xCeaseReasons;
	private String[] xSendceaseletters;
	private String[] xCECRs;
	private String xCECR;
	private String[] xOverruleReasons;
	private String[] xPrimaryActions;
	private String[] xSecondaryActions;
	private String[] xTertiaryActions;
	private String[] xSubcaseStatuses;
	private String[] xMediums;
	
	public boolean isCallReasonSaved() {
		return isCallReasonSaved;
	}
	public void setCallReasonSaved(boolean isCallReasonSaved) {
		this.isCallReasonSaved = isCallReasonSaved;
	}
	
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	public Date getxRequestDate() {
		return xRequestDate;
	}
	public void setxRequestDate(Date xRequestDate) {
		this.xRequestDate = xRequestDate;
	}
	public Date getxCeaseWishDate() {
		return xCeaseWishDate;
	}
	public void setxCeaseWishDate(Date xCeaseWishDate) {
		this.xCeaseWishDate = xCeaseWishDate;
	}
	public Date getxAccessCeaseWishDate() {
		return xAccessCeaseWishDate;
	}
	public void setxAccessCeaseWishDate(Date xAccessCeaseWishDate) {
		this.xAccessCeaseWishDate = xAccessCeaseWishDate;
	}
	public String getxRequestType() {
		return xRequestType;
	}
	public void setxRequestType(String xRequestType) {
		this.xRequestType = xRequestType;
	}
	public String getxCeaseReason() {
		return xCeaseReason;
	}
	public void setxCeaseReason(String xCeaseReason) {
		this.xCeaseReason = xCeaseReason;
	}
	public String getxCancelReason() {
		return xCancelReason;
	}
	public void setxCancelReason(String xCancelReason) {
		this.xCancelReason = xCancelReason;
	}
	public String getxPrimaryAction() {
		return xPrimaryAction;
	}
	public void setxPrimaryAction(String xPrimaryAction) {
		this.xPrimaryAction = xPrimaryAction;
	}
	public String getxSecondaryAction() {
		return xSecondaryAction;
	}
	public void setxSecondaryAction(String xSecondaryAction) {
		this.xSecondaryAction = xSecondaryAction;
	}
	public byte getxWasContractExtended() {
		return xWasContractExtended;
	}
	public void setxWasContractExtended(byte xWasContractExtended) {
		this.xWasContractExtended = xWasContractExtended;
	}
	public String getxOverruleReason() {
		return xOverruleReason;
	}
	public void setxOverruleReason(String xOverruleReason) {
		this.xOverruleReason = xOverruleReason;
	}
	public String getxDirection() {
		return xDirection;
	}
	public void setxDirection(String xDirection) {
		this.xDirection = xDirection;
	}
	public String getxMedium() {
		return xMedium;
	}
	public void setxMedium(String xMedium) {
		this.xMedium = xMedium;
	}
	public String getxEtf() {
		return xEtf;
	}
	public void setxEtf(String xEtf) {
		this.xEtf = xEtf;
	}
	public String getxSubcaseObjid() {
		return xSubcaseObjid;
	}
	public void setxSubcaseObjid(String xSubcaseObjid) {
		this.xSubcaseObjid = xSubcaseObjid;
	}
	public String getxSubcaseId() {
		return xSubcaseId;
	}
	public void setxSubcaseId(String xSubcaseId) {
		this.xSubcaseId = xSubcaseId;
	}
	public String getxParentCaseObjid() {
		return xParentCaseObjid;
	}
	public void setxParentCaseObjid(String xParentCaseObjid) {
		this.xParentCaseObjid = xParentCaseObjid;
	}
	public String getxSubcaseStatus() {
		return xSubcaseStatus;
	}
	public void setxSubcaseStatus(String xSubcaseStatus) {
		this.xSubcaseStatus = xSubcaseStatus;
	}
	public String getxIpObjid() {
		return xIpObjid;
	}
	public void setxIpObjid(String xIpObjid) {
		this.xIpObjid = xIpObjid;
	}
	public String getxIpId() {
		return xIpId;
	}
	public void setxIpId(String xIpId) {
		this.xIpId = xIpId;
	}
	public Date getxIpStartDate() {
		return xIpStartDate;
	}
	public void setxIpStartDate(Date xIpStartDate) {
		this.xIpStartDate = xIpStartDate;
	}
	public String getxDisplaySerialNo() {
		return xDisplaySerialNo;
	}
	public void setxDisplaySerialNo(String xDisplaySerialNo) {
		this.xDisplaySerialNo = xDisplaySerialNo;
	}
	public String getxSerialNo() {
		return xSerialNo;
	}
	public void setxSerialNo(String xSerialNo) {
		this.xSerialNo = xSerialNo;
	}
	public String getxPartStatus() {
		return xPartStatus;
	}
	public void setxPartStatus(String xPartStatus) {
		this.xPartStatus = xPartStatus;
	}
	public String getxInstanceName() {
		return xInstanceName;
	}
	public void setxInstanceName(String xInstanceName) {
		this.xInstanceName = xInstanceName;
	}
	public int getxDuration() {
		return xDuration;
	}
	public void setxDuration(int xDuration) {
		this.xDuration = xDuration;
	}
	public String getxTitle() {
		return xTitle;
	}
	public void setxTitle(String xTitle) {
		this.xTitle = xTitle;
	}
	public int getxLevelToPart() {
		return xLevelToPart;
	}
	public void setxLevelToPart(int xLevelToPart) {
		this.xLevelToPart = xLevelToPart;
	}
//	public String getxSelectStatus() {
//		return xSelectStatus;
//	}
//	public void setxSelectStatus(String xSelectStatus) {
//		this.xSelectStatus = xSelectStatus;
//	}
	public String getxProdCategory() {
		return xProdCategory;
	}
	public void setxProdCategory(String xProdCategory) {
		this.xProdCategory = xProdCategory;
	}
	public String getxOptionEtf() {
		return xOptionEtf;
	}
	public void setxOptionEtf(String xOptionEtf) {
		this.xOptionEtf = xOptionEtf;
	}
	public byte getxIsLetterRequired() {
		return xIsLetterRequired;
	}
	public void setxIsLetterRequired(byte xIsLetterRequired) {
		this.xIsLetterRequired = xIsLetterRequired;
	}
	public byte getxIsVoiceRecording() {
		return xIsVoiceRecording;
	}
	public void setxIsVoiceRecording(byte xIsVoiceRecording) {
		this.xIsVoiceRecording = xIsVoiceRecording;
	}
	public String getxDevicePlanEtf() {
		return xDevicePlanEtf;
	}
	public void setxDevicePlanEtf(String xDevicePlanEtf) {
		this.xDevicePlanEtf = xDevicePlanEtf;
	}
	public String getxCeaseOption() {
		return xCeaseOption;
	}
	public void setxCeaseOption(String xCeaseOption) {
		this.xCeaseOption = xCeaseOption;
	}
	public String getxBrokenBundleEtf() {
		return xBrokenBundleEtf;
	}
	public void setxBrokenBundleEtf(String xBrokenBundleEtf) {
		this.xBrokenBundleEtf = xBrokenBundleEtf;
	}
	public String getxTertiaryAction() {
		return xTertiaryAction;
	}
	public void setxTertiaryAction(String xTertiaryAction) {
		this.xTertiaryAction = xTertiaryAction;
	}
	public XCeaseRequestLineCeaseReasons[] getxCeaseReasons() {
		return xCeaseReasons;
	}
	public void setxCeaseReasons(XCeaseRequestLineCeaseReasons[] list) {
		this.xCeaseReasons = list;
	}
	public String[] getxSendceaseletters() {
		return xSendceaseletters;
	}
	public void setxSendceaseletters(String[] xSendceaseletters) {
		this.xSendceaseletters = xSendceaseletters;
	}
	public String getxCECR() {
		return xCECR;
	}
	public String[] getxCECRs() {
		return xCECRs;
	}
	public void setxCECRs(String[] xCECRs) {
		this.xCECRs = xCECRs;
	}
	public void setxCECR(String xCECR) {
		this.xCECR = xCECR;
	}
	public String[] getxOverruleReasons() {
		return xOverruleReasons;
	}
	public void setxOverruleReasons(String[] xOverruleReasons) {
		this.xOverruleReasons = xOverruleReasons;
	}
	public String[] getxPrimaryActions() {
		return xPrimaryActions;
	}
	public void setxPrimaryActions(String[] xPrimaryActions) {
		this.xPrimaryActions = xPrimaryActions;
	}
	public String[] getxSecondaryActions() {
		return xSecondaryActions;
	}
	public void setxSecondaryActions(String[] xSecondaryActions) {
		this.xSecondaryActions = xSecondaryActions;
	}
	public String[] getxTertiaryActions() {
		return xTertiaryActions;
	}
	public void setxTertiaryActions(String[] xTertiaryActions) {
		this.xTertiaryActions = xTertiaryActions;
	}
	public String[] getxSubcaseStatuses() {
		return xSubcaseStatuses;
	}
	public void setxSubcaseStatuses(String[] xStatuses) {
		this.xSubcaseStatuses = xStatuses;
	}
	public void setxMediums(String[] xMediums) {
		this.xMediums = xMediums;
	}
	public String[] getxMediums() {
		return xMediums;
	}
	public String getxWaiveEtf() {
		return xWaiveEtf;
	}
	public void setxWaiveEtf(String xWaiveEtf) {
		this.xWaiveEtf = xWaiveEtf;
	}
	
	@Override
	public String toString() {
		return "XCeaseRequestLineVwVoExt [objid=" + objid + ", xRequestDate="
				+ xRequestDate + ", xCeaseWishDate=" + xCeaseWishDate
				+ ", xAccessCeaseWishDate=" + xAccessCeaseWishDate
				+ ", xRequestType=" + xRequestType + ", xCeaseReason="
				+ xCeaseReason + ", xCancelReason=" + xCancelReason
				+ ", xPrimaryAction=" + xPrimaryAction + ", xSecondaryAction="
				+ xSecondaryAction + ", xWasContractExtended="
				+ xWasContractExtended + ", xOverruleReason=" + xOverruleReason
				+ ", xDirection=" + xDirection + ", xMedium=" + xMedium
				+ ", xEtf=" + xEtf + ", xSubcaseObjid=" + xSubcaseObjid
				+ ", xSubcaseId=" + xSubcaseId + ", xParentCaseObjid="
				+ xParentCaseObjid + ", xSubcaseStatus=" + xSubcaseStatus
				+ ", xIpObjid=" + xIpObjid + ", xIpId=" + xIpId
				+ ", xIpStartDate=" + xIpStartDate + ", xDisplaySerialNo="
				+ xDisplaySerialNo + ", xSerialNo=" + xSerialNo
				+ ", xPartStatus=" + xPartStatus + ", xInstanceName="
				+ xInstanceName + ", xDuration=" + xDuration + ", xTitle="
				+ xTitle + ", xLevelToPart=" + xLevelToPart
				+ ", xProdCategory="
				+ xProdCategory + ", xOptionEtf=" + xOptionEtf
				+ ", xIsLetterRequired=" + xIsLetterRequired
				+ ", xIsVoiceRecording=" + xIsVoiceRecording
				+ ", xDevicePlanEtf=" + xDevicePlanEtf + ", xCeaseOption="
				+ xCeaseOption + ", xBrokenBundleEtf=" + xBrokenBundleEtf
				+ ", xTertiaryAction=" + xTertiaryAction + ", xCeaseReasons="
				+ xCeaseReasons + ", xWaiveEtf="+xWaiveEtf+", xSendceaseletters="
				+ Arrays.toString(xSendceaseletters) + ", xCECRs="
				+ Arrays.toString(xCECRs) + ", xOverruleReasons="
				+ Arrays.toString(xOverruleReasons) + ", xPrimaryActions="
				+ Arrays.toString(xPrimaryActions) + ", xSecondaryActions="
				+ Arrays.toString(xSecondaryActions) + ", xTertiaryActions="
				+ Arrays.toString(xTertiaryActions) + ", xSubcaseStatuses="
				+ Arrays.toString(xSubcaseStatuses) + ", xMediums="
				+ Arrays.toString(xMediums) + "]";
	}
	
}
