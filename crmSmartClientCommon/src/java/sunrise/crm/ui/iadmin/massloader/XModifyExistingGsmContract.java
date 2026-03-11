package sunrise.crm.ui.iadmin.massloader;

/**
 * Container for excel row, indexing starts from 0.
 */
@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.MODIFY_EXISTING_GSM_CONTRACT)
public class XModifyExistingGsmContract {

    public String msisdn;

    public String siteId;

    public String schedule;

    public void setmsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public void setsiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setschedule(String schedule) {
        this.schedule = schedule;
    }
}
