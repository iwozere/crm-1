/**
 * 
 */
package sunrise.crm.xvo.customer;

import java.util.Date;

/**
 * Entity containing X_IDENTIF_DOC + FORM_ID.
 * 
 * @author Paulo Correia
 * @since R17.4, 8657 (ID Checker), ALM #110597
 *
 */
public class XIdentifDocTO {
	
	private String identifDocId;
	private String mrzDocumentNo;
	private String mrzType;
	private Date mrzExpirationDate;
	private Date dcdScanDate;
	private String mrzFirstName;
	private String mrzLastName;
	private Date mrzDateOfBirth;
	private String mrzNationality;
	private String legalOwner;
	
	/**
	 * @return the identifDocId
	 */
	public String getIdentifDocId() {
		return identifDocId;
	}

	/**
	 * @param identifDocId the identifDocId to set
	 */
	public void setIdentifDocId(String identifDocId) {
		this.identifDocId = identifDocId;
	}

	/**
	 * @param mrzDocumentNo the mrzDocumentNo to set
	 */
	public void setMrzDocumentNo(String mrzDocumentNo) {
		this.mrzDocumentNo = mrzDocumentNo;
	}

	/**
	 * @return the mrzDocumentNo
	 */
	public String getMrzDocumentNo() {
		return mrzDocumentNo;
	}

	/**
	 * @param mrzType the mrzType to set
	 */
	public void setMrzType(String mrzType) {
		this.mrzType = mrzType;
	}

	/**
	 * @return the mrzType
	 */
	public String getMrzType() {
		return mrzType;
	}

	/**
	 * @param mrzExpirationDat the mrzExpirationDat to set
	 */
	public void setMrzExpirationDate(Date mrzExpirationDat) {
		this.mrzExpirationDate = mrzExpirationDat;
	}

	/**
	 * @return the mrzExpirationDat
	 */
	public Date getMrzExpirationDate() {
		return mrzExpirationDate;
	}

	/**
	 * @param dcdScanDate the dcdScanDate to set
	 */
	public void setDcdScanDate(Date dcdScanDate) {
		this.dcdScanDate = dcdScanDate;
	}

	/**
	 * @return the dcdScanDate
	 */
	public Date getDcdScanDate() {
		return dcdScanDate;
	}

	/**
	 * @param mrzFirstName the mrzFirstName to set
	 */
	public void setMrzFirstName(String mrzFirstName) {
		this.mrzFirstName = mrzFirstName;
	}

	/**
	 * @return the mrzFirstName
	 */
	public String getMrzFirstName() {
		return mrzFirstName;
	}

	/**
	 * @param mrzLastName the mrzLastName to set
	 */
	public void setMrzLastName(String mrzLastName) {
		this.mrzLastName = mrzLastName;
	}

	/**
	 * @return the mrzLastName
	 */
	public String getMrzLastName() {
		return mrzLastName;
	}

	/**
	 * @param date the mrzDateOfBirth to set
	 */
	public void setMrzDateOfBirth(Date mrzDateOfBirth) {
		this.mrzDateOfBirth = mrzDateOfBirth;
	}

	/**
	 * @return the mrzDateOfBirth
	 */
	public Date getMrzDateOfBirth() {
		return mrzDateOfBirth;
	}

	/**
	 * @param mrzNationality the mrzNationality to set
	 */
	public void setMrzNationality(String mrzNationality) {
		this.mrzNationality = mrzNationality;
	}

	/**
	 * @return the mrzNationality
	 */
	public String getMrzNationality() {
		return mrzNationality;
	}

	/**
	 * @param legalOwner the legalOwner to set
	 */
	public void setLegalOwner(String legalOwner) {
		this.legalOwner = legalOwner;
	}

	/**
	 * @return the legalOwner
	 */
	public String getLegalOwner() {
		return legalOwner;
	}
}
