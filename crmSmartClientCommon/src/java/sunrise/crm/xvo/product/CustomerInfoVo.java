package sunrise.crm.xvo.product;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sunrise.crm.domain.enums.CustomerLanguage;

import java.util.Objects;

public class CustomerInfoVo {

    private static Log log = LogFactory.getLog(CustomerInfoVo.class);
    private String customerSegment;
    private String siteId;
    private boolean newCustomer;
    private CustomerLanguage customerLanguage;
    private String siteObjid;

    public CustomerInfoVo() {
    }

    public CustomerInfoVo(CustomerInfoVo customer) {
        this.customerSegment = customer.getCustomerSegment();
        this.siteId = customer.getSiteId();
        this.newCustomer = customer.isNewCustomer();
        this.customerLanguage = customer.getCustomerLanguage();
        this.siteObjid = customer.getSiteObjid();
    }

    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }

    public String getCustomerSegment() {
        return customerSegment;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteId() {
        return siteId;
    }

    public boolean isNewCustomer() {
        return newCustomer;
    }

    public void setNewCustomer(boolean newCustomer) {
        this.newCustomer = newCustomer;
    }

    public CustomerLanguage getCustomerLanguage() {
        return customerLanguage;
    }

    public void setCustomerLanguage(CustomerLanguage customerLanguage) {
        this.customerLanguage = customerLanguage;
    }

    public void setSiteObjid(String siteObjid) {
        this.siteObjid = siteObjid;
    }

    public String getSiteObjid() {
        return siteObjid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerInfoVo customerInfoVo = (CustomerInfoVo) o;

        if (!Objects.equals(this.newCustomer, customerInfoVo.newCustomer)) {
            //log.debug("NewCustomer is not equal.");
            return false;
        }
        if (!Objects.equals(this.customerSegment, customerInfoVo.customerSegment)) {
            //log.debug("CustomerSegment is not equal.");
            return false;
        }
        if (customerLanguage != customerInfoVo.customerLanguage) {
            //log.debug("CustomerLanguage is not equal.");
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerSegment, newCustomer, customerLanguage);
    }
}
