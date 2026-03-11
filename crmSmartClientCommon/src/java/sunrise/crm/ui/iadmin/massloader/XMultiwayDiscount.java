package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.MULTIWAY_DISCOUNT)
public class XMultiwayDiscount {

    public String siteId;
    public String scheduleDate;
    
	public void setsiteId(String siteId) {
		this.siteId = siteId;
	}
	public void setscheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
}
