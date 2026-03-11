package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.DATA_PRIVACY_SETTINGS)
public class XDataPrivacySettings {
	
	@XColumn(id = 0, required = true)
	public String siteId;

	@XColumn(id = 1)
    public String schedule;

	@XColumn(id = 2)
    public String letter;

	@XColumn(id = 3)
    public String personalizedOffers;
    
	@XColumn(id = 4)
    public String email;

	@XColumn(id = 5)
    public String phone;

	@XColumn(id = 6)
    public String sunriseCh;

	@XColumn(id = 7)
    public String messengerServicesSocialMedia;
   
	@XColumn(id = 8)
    public String addressUpdating;

	@XColumn(id = 9)
    public String innovativeServices;
    
	@XColumn(id = 10)
    public String analysisOfUsageData;
	
	public void setsiteId(String siteId) {
		this.siteId = siteId;
	}

	public void setschedule(String schedule) {
		this.schedule = schedule;
	}

	public void setletter(String letter) {
		this.letter = letter;
	}

	public void setpersonalizedOffers(String personalizedOffers) {
		this.personalizedOffers = personalizedOffers;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}

	public void setsunriseCh(String sunriseCh) {
		this.sunriseCh = sunriseCh;
	}

	public void setmessengerServicesSocialMedia(String messengerServicesSocialMedia) {
		this.messengerServicesSocialMedia = messengerServicesSocialMedia;
	}

	public void setaddressUpdating(String addressUpdating) {
		this.addressUpdating = addressUpdating;
	}

	public void setinnovativeServices(String innovativeServices) {
		this.innovativeServices = innovativeServices;
	}

	public void setanalysisOfUsageData(String analysisOfUsageData) {
		this.analysisOfUsageData = analysisOfUsageData;
	}
    
    
}
