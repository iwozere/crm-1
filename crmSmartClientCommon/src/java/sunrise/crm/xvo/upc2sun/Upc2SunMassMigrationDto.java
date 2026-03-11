package sunrise.crm.xvo.upc2sun;

import com.google.gson.Gson;

import java.util.Date;
import java.util.List;

public class Upc2SunMassMigrationDto {

    private String sunriseSiteId;
    private Upc2SunMigrationRequestDto upc2SunMigrationRequestDto;

    public String getSunriseSiteId() {
        return sunriseSiteId;
    }

    public void setSunriseSiteId(String sunriseSiteId) {
        this.sunriseSiteId = sunriseSiteId;
    }

    public Upc2SunMigrationRequestDto getUpc2SunMigrationRequestDto() {
        return upc2SunMigrationRequestDto;
    }

    public void setUpc2SunMigrationRequestDto(Upc2SunMigrationRequestDto upc2SunMigrationRequestDto) {
        this.upc2SunMigrationRequestDto = upc2SunMigrationRequestDto;
    }

    public String getUpcProductId() {
        return upc2SunMigrationRequestDto.getUpcProductId();
    }
    public void setUpcProductId(String upcProductId) {
        upc2SunMigrationRequestDto.setUpcProductId(upcProductId);
    }
    public String getUpcCustomerId() {
        return upc2SunMigrationRequestDto.getUpcCustomerId();
    }
    public void setUpcCustomerId(String upcCustomerId) {
        upc2SunMigrationRequestDto.setUpcCustomerId(upcCustomerId);
    }
    public Date getMigrationDate() {
        return upc2SunMigrationRequestDto.getMigrationDate();
    }
    public void setMigrationDate(Date migrationDate) {
        upc2SunMigrationRequestDto.setMigrationDate(migrationDate);
    }
    public Upc2SunMassMigrationStatus getStatus() {
        return upc2SunMigrationRequestDto.getStatus();
    }
    public void setStatus(Upc2SunMassMigrationStatus status) {
        upc2SunMigrationRequestDto.setStatus(status);
    }
    public String getTargetProductName() {
        return upc2SunMigrationRequestDto.getTargetProductName();
    }
    public void setTargetProductName(String targetProductName) {
        upc2SunMigrationRequestDto.setTargetProductName(targetProductName);
    }
    public List<Upc2SunMigrationLineItemDto> getLineItems() {
        return upc2SunMigrationRequestDto.getLineItems();
    }
    public void setLineItems(List<Upc2SunMigrationLineItemDto> lineItems) {
        upc2SunMigrationRequestDto.setLineItems(lineItems);
    }
    public List<Upc2SunMigrationAttributeDto> getAttributes() {
        return upc2SunMigrationRequestDto.getAttributes();
    }
    public void setAttributes(List<Upc2SunMigrationAttributeDto> attributes) {
        upc2SunMigrationRequestDto.setAttributes(attributes);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
