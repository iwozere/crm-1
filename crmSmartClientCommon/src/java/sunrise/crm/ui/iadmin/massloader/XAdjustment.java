package sunrise.crm.ui.iadmin.massloader;


@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.ADJUSTMENT)
public class XAdjustment {

    public String siteId;

    public String amount;

    public String creditReason;

    public String creditProductGroup;

    public String creditCause;

    public String billText;

    public String schedule;

    public String caseText;

    public void setsiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setamount(String amount) {
        this.amount = amount;
    }

    public void setcreditReason(String creditReason) {
        this.creditReason = creditReason;
    }

    public void setcreditProductGroup(String creditProductGroup) {
        this.creditProductGroup = creditProductGroup;
    }

    public void setcreditCause(String creditCause) {
        this.creditCause = creditCause;
    }

    public void setbillText(String billText) {
        this.billText = billText;
    }

    public void setschedule(String schedule) {
        this.schedule = schedule;
    }

    public void setcaseText(String caseText) {
        this.caseText = caseText;
    }
}
