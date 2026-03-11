package sunrise.crm.ui.iadmin.massloader;

/**
 * Used for both nw provisioning and network provisioning pages
 */
@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET)
public class XNwProvisioning {

    public String productSerial;

    public String siteId;

    public String schedule;

    public void setproductSerial(String productSerial) {
        this.productSerial = productSerial;
    }

    public void setsiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setschedule(String schedule) {
        this.schedule = schedule;
    }
}
