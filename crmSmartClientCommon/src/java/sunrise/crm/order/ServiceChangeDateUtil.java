package sunrise.crm.order;

import java.util.Calendar;
import java.util.Date;

import sunrise.crm.domain.enums.ProductType;
import sunrise.crm.util.CrmDateUtil;

public class ServiceChangeDateUtil {

	public static Date getServiceChangeDate(String ratePlanAction){
        Date serviceChangeDate = null;
        if ("Downgrade".equalsIgnoreCase(ratePlanAction)) {
            Calendar cal = CrmDateUtil.getLastDayOfMonth(Calendar.getInstance());
            cal.add(Calendar.DAY_OF_MONTH, 1);
            serviceChangeDate = cal.getTime();
        } else if ("Upgrade".equalsIgnoreCase(ratePlanAction)) {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DAY_OF_MONTH, 1);
            serviceChangeDate = cal.getTime();
        }
        return CrmDateUtil.setTimeZero(serviceChangeDate);
	}

	public static Date getServiceChangeDate(String ratePlanAction, ProductType productType){
		if (ProductType.ULL == productType){
			return null;
		}
		return getServiceChangeDate(ratePlanAction);
	}
}
