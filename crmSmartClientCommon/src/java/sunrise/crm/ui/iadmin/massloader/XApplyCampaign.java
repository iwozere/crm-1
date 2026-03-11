package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.APPLY_CAMPAIGN)
public class XApplyCampaign {

    public String msisdn;

    public String schedule;

    public String siteId;

    public void setmsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public void setschedule(String schedule) {
        this.schedule = schedule;
    }

    public void setsiteId(String siteId) {
        this.siteId = siteId;
    }
}
