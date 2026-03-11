package sunrise.crm.xvo.upc2sun;

import com.google.gson.Gson;

import java.util.Calendar;
import java.util.Date;

/**
 * Class represents one UPC Customer.
 *
 * @author Kanonchyk
 */
public class Upc2SunMigrationCustomerDto {

    private java.util.Date sysDate = Calendar.getInstance().getTime();

    private String objid;
    private Date creationDate = sysDate;
    private Date processDate;
    private String upcCustomerId;
    private String sunriseSiteId;
    private Date updateTimeStampDate;
    private String siteId;
    private String logMsg;
    private CustomerU2SMigrationStatus status;
    private String rejectionReason;

    public Upc2SunMigrationCustomerDto() {
    }

    public Upc2SunMigrationCustomerDto(Upc2SunMigrationCustomerDto customerDto) {
        this.objid = customerDto.objid;
        this.creationDate = customerDto.creationDate;
        this.processDate = customerDto.processDate;
        this.upcCustomerId = customerDto.upcCustomerId;
        this.sunriseSiteId = customerDto.sunriseSiteId;
        this.updateTimeStampDate = customerDto.updateTimeStampDate;
        this.siteId = customerDto.siteId;
        this.logMsg = customerDto.logMsg;
        this.status = customerDto.status;
        this.rejectionReason = customerDto.rejectionReason;
    }

    public Upc2SunMigrationCustomerDto(Date creationDate, String sunriseSiteId,
                                       Date processDate, String upcCustomerId,
                                       Date updateTimeStampDate, String siteId, String logMsg,
                                       CustomerU2SMigrationStatus status, String rejectionReason) {
        this.creationDate = creationDate;
        this.processDate = processDate;
        this.upcCustomerId = upcCustomerId;
        this.sunriseSiteId = sunriseSiteId;
        this.updateTimeStampDate = updateTimeStampDate;
        this.siteId = siteId;
        this.siteId = logMsg;
        this.status = status;
        this.rejectionReason = rejectionReason;
    }

    public String getObjid() {
        return objid;
    }
    public void setObjid(String objid) {
        this.objid = objid;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    public Date getProcessDate() {
        return processDate;
    }
    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }
    public String getUpcCustomerId() {
        return upcCustomerId;
    }
    public String getSunriseSiteId() {
        return sunriseSiteId;
    }
    public void setSunriseSiteId(String sunriseSiteId) {
        this.sunriseSiteId = sunriseSiteId;
    }
    public void setUpcCustomerId(String upcCustomerId) {
        this.upcCustomerId = upcCustomerId;
    }
    public Date getUpdateTimeStampDate() {
        return updateTimeStampDate;
    }
    public void setUpdateTimeStampDate(Date updateTimeStampDate) {
        this.updateTimeStampDate = updateTimeStampDate;
    }
    public String getSiteId() {
        return siteId;
    }
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
    public String getStatus() {
        return status.getDisplayValue();
    }
    public void setStatus(CustomerU2SMigrationStatus status) {
        this.status = status;
    }
    public String getRejectionReason() {
        return rejectionReason;
    }
    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }
    public String getLogMsg() {
        return logMsg;
    }
    public void setLogMsg(String logMsg) {
        this.logMsg = logMsg;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

