package sunrise.crm.order.dto;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Date;
import java.util.Objects;

public class OnpDto {
    private String connection;
    private String donor;
    private Boolean fastPorting;
    private String donorId;
    private Date portingDate;
    private String shopAgentEmailAddress;
    private String shopAgentLanguage;
    private String temporaryMsisdn;
    private static Log log = LogFactory.getLog(OnpDto.class);
    
    public OnpDto(){}

    public OnpDto(OnpDto dto){
    	if (dto == null){
    		return;
    	}
    	this.connection = dto.getConnection();
    	this.donor = dto.getDonor();
    	this.donorId = dto.getDonorId();
    	this.fastPorting = dto.getFastPorting();
    	this.portingDate = new Date(dto.getPortingDate().getTime());
    	this.shopAgentEmailAddress = dto.getShopAgentEmailAddress();
    	this.shopAgentLanguage = dto.getShopAgentLanguage();
    	this.temporaryMsisdn = dto.getTemporaryMsisdn();
    }

    public String getConnection() {
        return connection;
    }

    public String getDonor() {
        return donor;
    }

    public Boolean getFastPorting() {
        return fastPorting;
    }

    public String getDonorId() {
        return donorId;
    }

    public Date getPortingDate() {
        return portingDate;
    }

    public String getShopAgentEmailAddress() {
        return shopAgentEmailAddress;
    }

    public String getShopAgentLanguage() {
        return shopAgentLanguage;
    }

    public String getTemporaryMsisdn() {
        return temporaryMsisdn;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public void setFastPorting(Boolean fastPorting) {
        this.fastPorting = fastPorting;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }

    public void setPortingDate(Date portingDate) {
        this.portingDate = portingDate;
    }

    public void setShopAgentEmailAddress(String shopAgentEmailAddress) {
        this.shopAgentEmailAddress = shopAgentEmailAddress;
    }

    public void setShopAgentLanguage(String shopAgentLanguage) {
        this.shopAgentLanguage = shopAgentLanguage;
    }

    public void setTemporaryMsisdn(String temporaryMsisdn) {
        this.temporaryMsisdn = temporaryMsisdn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnpDto onpDto = (OnpDto) o;

        if (!Objects.equals(this.connection, onpDto.connection)) {
            log.debug("Connection is not equal.");
            return false;
        }
        if (!Objects.equals(this.donor, onpDto.donor)) {
            log.debug("Donor is not equal.");
            return false;
        }
        if (!Objects.equals(this.fastPorting, onpDto.fastPorting)) {
            log.debug("FastPorting is not equal.");
            return false;
        }
        if (!Objects.equals(this.donorId, onpDto.donorId)) {
            log.debug("DonorId is not equal.");
            return false;
        }
        if (!Objects.equals(this.portingDate, onpDto.portingDate)) {
            log.debug("PortingDate is not equal.");
            return false;
        }
        if (!Objects.equals(this.shopAgentEmailAddress, onpDto.shopAgentEmailAddress)) {
            log.debug("ShopAgentEmailAddress is not equal.");
            return false;
        }
        if (!Objects.equals(this.shopAgentLanguage, onpDto.shopAgentLanguage)) {
            log.debug("ShopAgentLanguage is not equal.");
            return false;
        }
        if (!Objects.equals(this.temporaryMsisdn, onpDto.temporaryMsisdn)) {
            log.debug("TemporaryMsisdn is not equal.");
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(connection, donor, fastPorting, donorId, portingDate
                , shopAgentEmailAddress, shopAgentLanguage, temporaryMsisdn);
    }
}
