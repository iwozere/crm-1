package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.ACCOUNT_DISCOUNT)
public class XAccountDiscount {

    public String siteId;

    public String schedule;

    public void setsiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setschedule(String schedule) {
        this.schedule = schedule;
    }
}
