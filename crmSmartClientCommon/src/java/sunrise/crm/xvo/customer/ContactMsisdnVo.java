package sunrise.crm.xvo.customer;


public class ContactMsisdnVo {

    private String msisdn;
    private boolean validated;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactMsisdnVo that = (ContactMsisdnVo) o;

        if (validated != that.validated) return false;
        return msisdn.equals(that.msisdn);
    }

    @Override
    public int hashCode() {
        int result = msisdn.hashCode();
        result = 31 * result + (validated ? 1 : 0);
        return result;
    }
}
