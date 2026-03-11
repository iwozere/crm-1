package sunrise.crm.ui.iadmin.massloader;
@XWorksheet(rowOffset = 1, name = XConstants.UPC_REMAINING_CUSTOMER_MIGRATION)

public class XUPCMigrationData {
	@XColumn(id = 0, required = true)
	public String siteId;
	@XColumn(id = 1)
	public String prodName;
	@XColumn(id = 2)
	public String wishDate;
	@XColumn(id = 3)
	public String orderReason;
	@XColumn(id = 4)
	public String inetRP;
	@XColumn(id = 5)
	public String inetDiscName;
	@XColumn(id = 6)
	public String inetDiscPerc;
	@XColumn(id = 7)
	public String inetDiscDuration;
	@XColumn(id = 8)
	public String inetDiscBillText;
	@XColumn(id = 9)
	public String voiceRp;
	@XColumn(id = 10)
	public String cli;
	@XColumn(id = 11)
	public String voiceOptName;
	@XColumn(id = 12)
	public String voiceOptDiscName;
	@XColumn(id = 13)
	public String voiceOptDiscPerc;	
	@XColumn(id = 14)
	public String voiceOptDiscDuration;
	@XColumn(id = 15)
	public String shipAddrHouseNr;
	@XColumn(id = 16)
	public String shipAddrStreet;
	@XColumn(id = 17)
	public String shipAddrBuilding;
	@XColumn(id = 18)
	public String shipAddrCity;
	@XColumn(id = 19)
	public String shipAddrZip;
	@XColumn(id = 20)
	public String accessory1;
	@XColumn(id = 21)
	public String accessory2;
	
	
	public String getSiteId() {
		return siteId;
	}
	public void setsiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setprodName(String prodName) {
		this.prodName = prodName;
	}
	public String getWishDate() {
		return wishDate;
	}
	public void setwishDate(String wishDate) {
		this.wishDate = wishDate;
	}
	public String getOrderReason() {
		return orderReason;
	}
	public void setorderReason(String orderReason) {
		this.orderReason = orderReason;
	}
	public String getInetRP() {
		return inetRP;
	}
	public void setinetRP(String inetRP) {
		this.inetRP = inetRP;
	}
	public String getInetDiscName() {
		return inetDiscName;
	}
	public void setinetDiscName(String inetDiscName) {
		this.inetDiscName = inetDiscName;
	}
	public String getInetDiscPerc() {
		return inetDiscPerc;
	}
	public void setinetDiscPerc(String inetDiscPerc) {
		this.inetDiscPerc = inetDiscPerc;
	}
	public String getInetDiscDuration() {
		return inetDiscDuration;
	}
	public void setinetDiscDuration(String inetDiscDuration) {
		this.inetDiscDuration = inetDiscDuration;
	}
	public String getInetDiscBillText() {
		return inetDiscBillText;
	}
	public void setinetDiscBillText(String inetDiscBillText) {
		this.inetDiscBillText = inetDiscBillText;
	}
	public String getVoiceRp() {
		return voiceRp;
	}
	public void setvoiceRp(String voiceRp) {
		this.voiceRp = voiceRp;
	}
	public String getCli() {
		return cli;
	}
	public void setcli(String cli) {
		this.cli = cli;
	}
	public String getVoiceOptName() {
		return voiceOptName;
	}
	public void setvoiceOptName(String voiceOptName) {
		this.voiceOptName = voiceOptName;
	}
	public String getVoiceOptDiscName() {
		return voiceOptDiscName;
	}
	public void setvoiceOptDiscName(String voiceOptDiscName) {
		this.voiceOptDiscName = voiceOptDiscName;
	}
	public String getVoiceOptDiscPerc() {
		return voiceOptDiscPerc;
	}
	public void setvoiceOptDiscPerc(String voiceOptDiscPerc) {
		this.voiceOptDiscPerc = voiceOptDiscPerc;
	}
	public String getVoiceOptDiscDuration() {
		return voiceOptDiscDuration;
	}
	public void setvoiceOptDiscDuration(String voiceOptDiscDuration) {
		this.voiceOptDiscDuration = voiceOptDiscDuration;
	}
	public String getShipAddrHouseNr() {
		return shipAddrHouseNr;
	}
	public void setshipAddrHouseNr(String shipAddrHouseNr) {
		this.shipAddrHouseNr = shipAddrHouseNr;
	}
	public String getShipAddrStreet() {
		return shipAddrStreet;
	}
	public void setshipAddrStreet(String shipAddrStreet) {
		this.shipAddrStreet = shipAddrStreet;
	}
	public String getShipAddrBuilding() {
		return shipAddrBuilding;
	}
	public void setshipAddrBuilding(String shipAddrBuilding) {
		this.shipAddrBuilding = shipAddrBuilding;
	}
	public String getShipAddrCity() {
		return shipAddrCity;
	}
	public void setshipAddrCity(String shipAddrCity) {
		this.shipAddrCity = shipAddrCity;
	}
	public String getShipAddrZip() {
		return shipAddrZip;
	}
	public void setshipAddrZip(String shipAddrZip) {
		this.shipAddrZip = shipAddrZip;
	}
	public String getAccessory1() {
		return accessory1;
	}
	public void setaccessory1(String accessory1) {
		this.accessory1 = accessory1;
	}
	public String getAccessory2() {
		return accessory2;
	}
	public void setaccessory2(String accessory2) {
		this.accessory2 = accessory2;
	}
	

}
