package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.CEASE_GSM_CONTRACT)
public class XCeaseGsmContract {

    public String msisdn;

    public String siteId;

    public String schedule;
    
    public String suppressCommunication;

    public void setmsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public void setsiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setschedule(String schedule) {
        this.schedule = schedule;
    }
    
    public void setsuppressCommunication(String suppressCommunication) {
        this.suppressCommunication = suppressCommunication;
    }
    
}
