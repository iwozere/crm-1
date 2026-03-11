package sunrise.crm.util;

import java.util.Date;

public class SecondDpUtil {

    /**
     * @param firstDpEndDate is the end date of First Device Plan
     * @return effective date of Second Device Plan.
     * This is the time when customer starts to pay for second device plan
     */
    public static Date getEffectiveDateForSecondDp(Date firstDpEndDate) {
    	
    	// if firstDpEndDate is in Past ..
    	if (CrmDateUtil.isBeforeToday(firstDpEndDate)) {
			return new Date();
		}
		else {
			return CrmDateUtil.addDays(firstDpEndDate, 1);
		}
    }
    
    /**
     * @param effectiveDate is the start date of second device plan
     * @param duration      is the time in months of second device plan is binded to customer
     * @return endDate is the sum Duration months after effective date
     */
    public static Date getEndSecondDpDate(Date effectiveDate, String duration) {
        return CrmDateUtil.addMonths(effectiveDate, CrmNumberUtil.toInteger(duration, 0));
    }
}
