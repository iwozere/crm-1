package sunrise.crm.xvo.site;

import java.io.Serializable;
import java.util.Date;

public class XUIDCheckVo implements Serializable {

	private static final long serialVersionUID = 6997083418015881743L;
	
	private String orgName;
	private String companyUID;
	private String legalEntity;
	private Date foundationDate;
	private boolean isVlaidUID;
	private boolean isWhitelist;
	private boolean BCException;
	private boolean BCGovernance;
	private boolean BMMwithoutUID;
	private boolean LegalIdentityChange;
	
	private String legalEntityName_en;
	private String legalEntityName_de;
	private String legalEntityName_fr;
	private String legalEntityName_it;
	
	private String legalEntityAbb_en;
	private String legalEntityAbb_de;
	private String legalEntityAbb_fr;
	private String legalEntityAbb_it;
	
	private String custLang;
	
	/**
	 * @param orgName
	 * @param companyUID
	 * @param legalEntity
	 * @param legalEntityName
	 * @param foundationDate
	 * @param isVlaidUID
	 * @param isWhitelist
	 */
	public XUIDCheckVo(String orgName, String companyUID, String legalEntity, Date foundationDate, boolean isVlaidUID, boolean isWhitelist) {
		this.orgName = orgName;
		this.companyUID = companyUID;
		this.legalEntity = legalEntity;
		this.foundationDate = foundationDate;
		this.isVlaidUID = isVlaidUID;
		this.isWhitelist = isWhitelist;
	}
	
	/**
	 * 
	 */
	public XUIDCheckVo(){
		
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getCompanyUID() {
		return companyUID;
	}

	public void setCompanyUID(String companyUID) {
		this.companyUID = companyUID;
	}

	public String getLegalEntity() {
		return legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	public Date getFoundationDate() {
		return foundationDate;
	}

	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}

	public boolean isVlaidUID() {
		return isVlaidUID;
	}

	public void setVlaidUID(boolean isVlaidUID) {
		this.isVlaidUID = isVlaidUID;
	}

	public boolean isWhitelist() {
		return isWhitelist;
	}

	public void setWhitelist(boolean isWhitelist) {
		this.isWhitelist = isWhitelist;
	}

	public boolean isBCException() {
		return BCException;
	}

	public void setBCException(boolean bCException) {
		BCException = bCException;
	}

	public boolean isBCGovernance() {
		return BCGovernance;
	}

	public void setBCGovernance(boolean bCGovernance) {
		BCGovernance = bCGovernance;
	}

	public boolean isBMMwithoutUID() {
		return BMMwithoutUID;
	}

	public void setBMMwithoutUID(boolean bMMwithoutUID) {
		BMMwithoutUID = bMMwithoutUID;
	}

	public String getLegalEntityName_en() {
		return legalEntityName_en;
	}

	public void setLegalEntityName_en(String legalEntityName_en) {
		this.legalEntityName_en = legalEntityName_en;
	}

	public String getLegalEntityName_de() {
		return legalEntityName_de;
	}

	public void setLegalEntityName_de(String legalEntityName_de) {
		this.legalEntityName_de = legalEntityName_de;
	}

	public String getLegalEntityName_fr() {
		return legalEntityName_fr;
	}

	public void setLegalEntityName_fr(String legalEntityName_fr) {
		this.legalEntityName_fr = legalEntityName_fr;
	}

	public String getLegalEntityName_it() {
		return legalEntityName_it;
	}

	public void setLegalEntityName_it(String legalEntityName_it) {
		this.legalEntityName_it = legalEntityName_it;
	}

	public String getLegalEntityAbb_en() {
		return legalEntityAbb_en;
	}

	public void setLegalEntityAbb_en(String legalEntityAbb_en) {
		this.legalEntityAbb_en = legalEntityAbb_en;
	}

	public String getLegalEntityAbb_de() {
		return legalEntityAbb_de;
	}

	public void setLegalEntityAbb_de(String legalEntityAbb_de) {
		this.legalEntityAbb_de = legalEntityAbb_de;
	}

	public String getLegalEntityAbb_fr() {
		return legalEntityAbb_fr;
	}

	public void setLegalEntityAbb_fr(String legalEntityAbb_fr) {
		this.legalEntityAbb_fr = legalEntityAbb_fr;
	}

	public String getLegalEntityAbb_it() {
		return legalEntityAbb_it;
	}

	public void setLegalEntityAbb_it(String legalEntityAbb_it) {
		this.legalEntityAbb_it = legalEntityAbb_it;
	}

	public boolean isLegalIdentityChange() {
		return LegalIdentityChange;
	}

	public void setLegalIdentityChange(boolean legalIdentityChange) {
		LegalIdentityChange = legalIdentityChange;
	}

	public String getCustLang() {
		return custLang;
	}

	public void setCustLang(String custLang) {
		this.custLang = custLang;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "XUIDCheckVo [orgName=" + orgName + ", companyUID=" + companyUID + ", legalEntity=" + legalEntity
				+ ", foundationDate=" + foundationDate + ", isVlaidUID=" + isVlaidUID + ", isWhitelist=" + isWhitelist
				+ ", BCException=" + BCException + ", BCGovernance=" + BCGovernance + ", BMMwithoutUID=" + BMMwithoutUID
				+ ", LegalIdentityChange=" + LegalIdentityChange + ", legalEntityName_en=" + legalEntityName_en
				+ ", legalEntityName_de=" + legalEntityName_de + ", legalEntityName_fr=" + legalEntityName_fr
				+ ", legalEntityName_it=" + legalEntityName_it + ", legalEntityAbb_en=" + legalEntityAbb_en
				+ ", legalEntityAbb_de=" + legalEntityAbb_de + ", legalEntityAbb_fr=" + legalEntityAbb_fr
				+ ", legalEntityAbb_it=" + legalEntityAbb_it + ", custLang=" + custLang + "]";
	}



}
