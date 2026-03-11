package sunrise.crm.order.dto;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Objects;

public class SalesInfoDto {
    private String salesId;
    private String locationId;
    private static Log log = LogFactory.getLog(SalesInfoDto.class);

    public SalesInfoDto() {}

    public SalesInfoDto(SalesInfoDto dto) {
    	if (dto == null){
    		return;
    	}
    	this.locationId = dto.getLocationId();
    	this.salesId = dto.getSalesId();
    }

    public SalesInfoDto(String salesId, String locationId) {
        this.salesId = salesId;
        this.locationId = locationId;
    }

    public String getSalesId() {
        return salesId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesInfoDto salesInfoDto = (SalesInfoDto) o;

        if (!Objects.equals(this.salesId, salesInfoDto.salesId)) {
            log.debug("SalesId is not equal.");
            return false;
        }
        if (!Objects.equals(this.locationId, salesInfoDto.locationId)) {
            log.debug("LocationId is not equal.");
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesId, locationId);
    }
}
