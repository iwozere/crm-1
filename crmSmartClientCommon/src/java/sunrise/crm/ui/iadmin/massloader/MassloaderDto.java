package sunrise.crm.ui.iadmin.massloader;

import sunrise.crm.xvo.util.XKeyValueVo;

import java.util.Date;

public class MassloaderDto {

	private Date execution;

	protected XKeyValueVo[] inputParams = null;

	private String [] errors;

	private String[] appIds ;

	private String errorMessage;

	private int processedRows;

	private XNewContractActivation [] newContractActivations;
	private XOrderLineItem [] newContractActivationsOrderLineItems;

	private XActivateNewGsmContract [] activateNewGsmContracts;
	private XOrderLineItem [] activateNewGsmContractsOrderLineItems;

	private XModifyExistingGsmContract [] modifyExistingGsmContracts;
	private XModifyExistingGsmContractOrderLineItem [] modifyExistingGsmContractOrderLineItems;

	private XChangeRatePlan [] changeRatePlans;
	private XChangeRatePlanOrderLineItem [] changeRatePlanOrderLineItems;

	private XOwnerChange [] ownerChanges;
	private XDataPrivacySettings [] dataPrivacySettings;

	private XCeaseGsmContract [] ceaseGsmContracts;

	private XReconnectGsmContract [] reconnectGsmContracts;

	private XNwProvisioning [] nwProvisionings;
	private XNwProvisioningAttribute [] nwProvisioningAttributes;

	private XAccountDiscount [] accountDiscounts;
	private XOrderLineItem [] accountDiscountAttributes;

	private XApplyCampaign [] campaigns;
	private XOrderLineItem [] campaignAttributes;

	private XContractExtension [] contractExtensions;

	private XNwProvisioning [] networkProvisionings;
	private XNwProvisioningAttribute [] networkProvisioningAttributes;

	private XAdjustment [] adjustments;
	
	private XSapReturnSimulation [] sapReturnSimulation;

	private XSimChange [] simChanges;

	public XCreateCustomer [] createCustomers;

	public XCreateBusinessService [] createBusinessService;

	public XBizOrderContractExtension [] bizOrderContractExtension ;

	private XMultiwayDiscount [] multiwayDiscounts;
	private XMultiwayDiscountAttributes [] multiwayDiscountAttributes;

	public MassloaderDto() {
	}

	public MassloaderDto(Date execution, XKeyValueVo[] inputParams, String[] errors, String[] appIds, String errorMessage, int processedRows, XNewContractActivation[] newContractActivations,
			XOrderLineItem[] newContractActivationsOrderLineItems, XActivateNewGsmContract[] activateNewGsmContracts, XOrderLineItem[] activateNewGsmContractsOrderLineItems, XModifyExistingGsmContract[] modifyExistingGsmContracts,
			XModifyExistingGsmContractOrderLineItem[] modifyExistingGsmContractOrderLineItems, XChangeRatePlan[] changeRatePlans, XChangeRatePlanOrderLineItem[] changeRatePlanOrderLineItems, XOwnerChange[] ownerChanges,
			XDataPrivacySettings[] dataPrivacySettings, XCeaseGsmContract[] ceaseGsmContracts, XReconnectGsmContract[] reconnectGsmContracts, XNwProvisioning[] nwProvisionings, XNwProvisioningAttribute[] nwProvisioningAttributes,
			XAccountDiscount[] accountDiscounts, XOrderLineItem[] accountDiscountAttributes, XApplyCampaign[] campaigns, XOrderLineItem[] campaignAttributes, XContractExtension[] contractExtensions, XNwProvisioning[] networkProvisionings,
			XNwProvisioningAttribute[] networkProvisioningAttributes, XAdjustment[] adjustments, XSimChange[] simChanges, XCreateCustomer[] createCustomers, XCreateBusinessService[] createBusinessService,
			XBizOrderContractExtension[] bizOrderContractExtension, XMultiwayDiscount[] multiwayDiscounts, XMultiwayDiscountAttributes[] multiwayDiscountAttributes, XSapReturnSimulation[] sapReturnSimulations) {
		this.execution = execution;
		this.inputParams = inputParams;
		this.errors = errors;
		this.appIds = appIds;
		this.errorMessage = errorMessage;
		this.processedRows = processedRows;
		this.newContractActivations = newContractActivations;
		this.newContractActivationsOrderLineItems = newContractActivationsOrderLineItems;
		this.activateNewGsmContracts = activateNewGsmContracts;
		this.activateNewGsmContractsOrderLineItems = activateNewGsmContractsOrderLineItems;
		this.modifyExistingGsmContracts = modifyExistingGsmContracts;
		this.modifyExistingGsmContractOrderLineItems = modifyExistingGsmContractOrderLineItems;
		this.changeRatePlans = changeRatePlans;
		this.changeRatePlanOrderLineItems = changeRatePlanOrderLineItems;
		this.ownerChanges = ownerChanges;
		this.dataPrivacySettings = dataPrivacySettings;
		this.ceaseGsmContracts = ceaseGsmContracts;
		this.reconnectGsmContracts = reconnectGsmContracts;
		this.nwProvisionings = nwProvisionings;
		this.nwProvisioningAttributes = nwProvisioningAttributes;
		this.accountDiscounts = accountDiscounts;
		this.accountDiscountAttributes = accountDiscountAttributes;
		this.campaigns = campaigns;
		this.campaignAttributes = campaignAttributes;
		this.contractExtensions = contractExtensions;
		this.networkProvisionings = networkProvisionings;
		this.networkProvisioningAttributes = networkProvisioningAttributes;
		this.adjustments = adjustments;
		this.simChanges = simChanges;
		this.createCustomers = createCustomers;
		this.createBusinessService = createBusinessService;
		this.bizOrderContractExtension = bizOrderContractExtension;
		this.multiwayDiscounts = multiwayDiscounts;
		this.multiwayDiscountAttributes = multiwayDiscountAttributes;
		this.sapReturnSimulation = sapReturnSimulations;
	}

	public Date getExecution() {
		return execution;
	}

	public void setExecution(Date execution) {
		this.execution = execution;
	}

	public XKeyValueVo[] getInputParams() {
		return inputParams;
	}

	public void setInputParams(XKeyValueVo[] inputParams) {
		this.inputParams = inputParams;
	}

	public String[] getErrors() {
		return errors;
	}

	public void setErrors(String[] errors) {
		this.errors = errors;
	}

	public String[] getAppIds() {
		return appIds;
	}

	public void setAppIds(String[] appIds) {
		this.appIds = appIds;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getProcessedRows() {
		return processedRows;
	}

	public void setProcessedRows(int processedRows) {
		this.processedRows = processedRows;
	}

	public XNewContractActivation[] getNewContractActivations() {
		return newContractActivations;
	}

	public void setNewContractActivations(XNewContractActivation[] newContractActivations) {
		this.newContractActivations = newContractActivations;
	}

	public XOrderLineItem[] getNewContractActivationsOrderLineItems() {
		return newContractActivationsOrderLineItems;
	}

	public void setNewContractActivationsOrderLineItems(XOrderLineItem[] newContractActivationsOrderLineItems) {
		this.newContractActivationsOrderLineItems = newContractActivationsOrderLineItems;
	}

	public XActivateNewGsmContract[] getActivateNewGsmContracts() {
		return activateNewGsmContracts;
	}

	public void setActivateNewGsmContracts(XActivateNewGsmContract[] activateNewGsmContracts) {
		this.activateNewGsmContracts = activateNewGsmContracts;
	}

	public XOrderLineItem[] getActivateNewGsmContractsOrderLineItems() {
		return activateNewGsmContractsOrderLineItems;
	}

	public void setActivateNewGsmContractsOrderLineItems(XOrderLineItem[] activateNewGsmContractsOrderLineItems) {
		this.activateNewGsmContractsOrderLineItems = activateNewGsmContractsOrderLineItems;
	}

	public XModifyExistingGsmContract[] getModifyExistingGsmContracts() {
		return modifyExistingGsmContracts;
	}

	public void setModifyExistingGsmContracts(XModifyExistingGsmContract[] modifyExistingGsmContracts) {
		this.modifyExistingGsmContracts = modifyExistingGsmContracts;
	}

	public XModifyExistingGsmContractOrderLineItem[] getModifyExistingGsmContractOrderLineItems() {
		return modifyExistingGsmContractOrderLineItems;
	}

	public void setModifyExistingGsmContractOrderLineItems(XModifyExistingGsmContractOrderLineItem[] modifyExistingGsmContractOrderLineItems) {
		this.modifyExistingGsmContractOrderLineItems = modifyExistingGsmContractOrderLineItems;
	}

	public XChangeRatePlan[] getChangeRatePlans() {
		return changeRatePlans;
	}

	public void setChangeRatePlans(XChangeRatePlan[] changeRatePlans) {
		this.changeRatePlans = changeRatePlans;
	}

	public XChangeRatePlanOrderLineItem[] getChangeRatePlanOrderLineItems() {
		return changeRatePlanOrderLineItems;
	}

	public void setChangeRatePlanOrderLineItems(XChangeRatePlanOrderLineItem[] changeRatePlanOrderLineItems) {
		this.changeRatePlanOrderLineItems = changeRatePlanOrderLineItems;
	}

	public XOwnerChange[] getOwnerChanges() {
		return ownerChanges;
	}

	public void setOwnerChanges(XOwnerChange[] ownerChanges) {
		this.ownerChanges = ownerChanges;
	}

	public XDataPrivacySettings[] getDataPrivacySettings() {
		return dataPrivacySettings;
	}

	public void setDataPrivacySettings(XDataPrivacySettings[] dataPrivacySettings) {
		this.dataPrivacySettings = dataPrivacySettings;
	}

	public XCeaseGsmContract[] getCeaseGsmContracts() {
		return ceaseGsmContracts;
	}

	public void setCeaseGsmContracts(XCeaseGsmContract[] ceaseGsmContracts) {
		this.ceaseGsmContracts = ceaseGsmContracts;
	}

	public XReconnectGsmContract[] getReconnectGsmContracts() {
		return reconnectGsmContracts;
	}

	public void setReconnectGsmContracts(XReconnectGsmContract[] reconnectGsmContracts) {
		this.reconnectGsmContracts = reconnectGsmContracts;
	}

	public XNwProvisioning[] getNwProvisionings() {
		return nwProvisionings;
	}

	public void setNwProvisionings(XNwProvisioning[] nwProvisionings) {
		this.nwProvisionings = nwProvisionings;
	}

	public XNwProvisioningAttribute[] getNwProvisioningAttributes() {
		return nwProvisioningAttributes;
	}

	public void setNwProvisioningAttributes(XNwProvisioningAttribute[] nwProvisioningAttributes) {
		this.nwProvisioningAttributes = nwProvisioningAttributes;
	}

	public XAccountDiscount[] getAccountDiscounts() {
		return accountDiscounts;
	}

	public void setAccountDiscounts(XAccountDiscount[] accountDiscounts) {
		this.accountDiscounts = accountDiscounts;
	}

	public XOrderLineItem[] getAccountDiscountAttributes() {
		return accountDiscountAttributes;
	}

	public void setAccountDiscountAttributes(XOrderLineItem[] accountDiscountAttributes) {
		this.accountDiscountAttributes = accountDiscountAttributes;
	}

	public XApplyCampaign[] getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(XApplyCampaign[] campaigns) {
		this.campaigns = campaigns;
	}

	public XOrderLineItem[] getCampaignAttributes() {
		return campaignAttributes;
	}

	public void setCampaignAttributes(XOrderLineItem[] campaignAttributes) {
		this.campaignAttributes = campaignAttributes;
	}

	public XContractExtension[] getContractExtensions() {
		return contractExtensions;
	}

	public void setContractExtensions(XContractExtension[] contractExtensions) {
		this.contractExtensions = contractExtensions;
	}

	public XNwProvisioning[] getNetworkProvisionings() {
		return networkProvisionings;
	}

	public void setNetworkProvisionings(XNwProvisioning[] networkProvisionings) {
		this.networkProvisionings = networkProvisionings;
	}

	public XNwProvisioningAttribute[] getNetworkProvisioningAttributes() {
		return networkProvisioningAttributes;
	}

	public void setNetworkProvisioningAttributes(XNwProvisioningAttribute[] networkProvisioningAttributes) {
		this.networkProvisioningAttributes = networkProvisioningAttributes;
	}

	public XAdjustment[] getAdjustments() {
		return adjustments;
	}

	public void setAdjustments(XAdjustment[] adjustments) {
		this.adjustments = adjustments;
	}
	
	public XSapReturnSimulation[] getSapReturnSimulation() {
		return sapReturnSimulation;
	}

	public void setSapReturnSimulation(XSapReturnSimulation[] sapReturnSimulation) {
		this.sapReturnSimulation = sapReturnSimulation;
	}

	public XSimChange[] getSimChanges() {
		return simChanges;
	}

	public void setSimChanges(XSimChange[] simChanges) {
		this.simChanges = simChanges;
	}

	public XCreateCustomer[] getCreateCustomers() {
		return createCustomers;
	}

	public void setCreateCustomers(XCreateCustomer[] createCustomers) {
		this.createCustomers = createCustomers;
	}

	public XCreateBusinessService[] getCreateBusinessService() {
		return createBusinessService;
	}

	public void setCreateBusinessService(XCreateBusinessService[] createBusinessService) {
		this.createBusinessService = createBusinessService;
	}

	public XBizOrderContractExtension[] getBizOrderContractExtension() {
		return bizOrderContractExtension;
	}

	public void setBizOrderContractExtension(XBizOrderContractExtension[] bizOrderContractExtension) {
		this.bizOrderContractExtension = bizOrderContractExtension;
	}

	public XMultiwayDiscount[] getMultiwayDiscounts() {
		return multiwayDiscounts;
	}

	public void setMultiwayDiscounts(XMultiwayDiscount[] multiwayDiscounts) {
		this.multiwayDiscounts = multiwayDiscounts;
	}

	public XMultiwayDiscountAttributes[] getMultiwayDiscountAttributes() {
		return multiwayDiscountAttributes;
	}

	public void setMultiwayDiscountAttributes(XMultiwayDiscountAttributes[] multiwayDiscountAttributes) {
		this.multiwayDiscountAttributes = multiwayDiscountAttributes;
	}
}
