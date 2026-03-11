package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.CONTRACT_EXTENSION)
public class XContractExtension {

    public String salesId;

    public String msisdn;

    public String siteId;

    public String schedule;

    public String duration;

    public String reason;

    public String deliveryAddress;

    public String subscriberInfo;

    public void setsalesId(String salesId) {
        this.salesId = salesId;
    }

    public void setmsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public void setsiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setschedule(String schedule) {
        this.schedule = schedule;
    }

    public void setduration(String duration) {
        this.duration = duration;
    }

    public void setreason(String reason) {
        this.reason = reason;
    }

    public void setdeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setsubscriberInfo(String subscriberInfo) {
        this.subscriberInfo = subscriberInfo;
    }
}
