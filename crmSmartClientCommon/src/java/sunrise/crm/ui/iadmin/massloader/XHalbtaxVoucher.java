package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = 1)
public class XHalbtaxVoucher {
	
	@XColumn(id = 0, required = true)
    public String code;

    @XColumn(id = 1)
    public String redeemableFrom;
    
    @XColumn(id = 2)
    public String redeemableUntil;

    @XColumn(id = 3)
    public String option;

	public String getOption() {
		return option;
	}

	public void setoption(String option) {
		this.option = option;
	}

	public String getCode() {
		return code;
	}

	public void setcode(String code) {
		this.code = code;
	}

	public String getRedeemableFrom() {
		return redeemableFrom;
	}

	public void setredeemableFrom(String redeemableFrom) {
		this.redeemableFrom = redeemableFrom;
	}

	public String getRedeemableUntil() {
		return redeemableUntil;
	}

	public void setredeemableUntil(String redeemableUntil) {
		this.redeemableUntil = redeemableUntil;
	}
}
