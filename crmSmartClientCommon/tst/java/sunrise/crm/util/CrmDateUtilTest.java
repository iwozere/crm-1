package sunrise.crm.util;

import junit.framework.TestCase;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.util.Calendar;
import java.util.Date;

public class CrmDateUtilTest {

    @Test
    public void isInvalidDate() throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        System.err.println(CrmDateUtil.CLARIFY_MIN_DATE);
        Date testDate = df.parse("1752-12-31");
        System.err.println(testDate + " is invalid: " + CrmDateUtil.isInvalidDate(testDate));

        testDate = df.parse("1753-01-01");
        System.err.println(testDate + " is invalid: " + CrmDateUtil.isInvalidDate(testDate));

        testDate = df.parse("2023-08-11");
        System.err.println(testDate + " is invalid: " + CrmDateUtil.isInvalidDate(testDate));

        System.err.println(CrmDateUtil.CLARIFY_MIN_DATE + " is invalid: " + CrmDateUtil.isInvalidDate(CrmDateUtil.CLARIFY_MIN_DATE));


    }
    
    @Test
    public void testDateFormat() throws ParseException {
        Date date = new Date();
        CrmDateUtil.formatDateEu(date);
        CrmDateUtil.formatDateLong(date);
        CrmDateUtil.formatDateSQL(date);
        CrmDateUtil.formatEuLong(date);
        CrmDateUtil.isInvalidDate(date);
        CrmDateUtil.roundDate(date);
        CrmDateUtil.getAge(date);
        CrmDateUtil.setTimeZero(date);
        CrmDateUtil.getMonthsDifference(date, date);
        CrmDateUtil.getSqlFormattedDateWithBillingTimestamp(date);
        CrmDateUtil.getRandomRangeTime(Calendar.getInstance(), 0, 12);
        CrmDateUtil.getFirstDayOfMonth(date);
        CrmDateUtil.getFirstDayOfNextYear(date);
        CrmDateUtil.getFirstDayOfNextMonth(date);
        CrmDateUtil.maxOf2Dates(date, date);
        CrmDateUtil.roundONPDate(date);
    }

    @Test
    public void testUTC() {
    	OffsetDateTime odt1 = OffsetDateTime.parse("2026-01-28T13:54:25.678+01:00");
    	OffsetDateTime odt2 = OffsetDateTime.parse("2026-01-28T13:54:25.6+01:00");
    	OffsetDateTime odt3 = OffsetDateTime.parse("2026-01-28T13:54+01:00");
    	
    	System.out.println(odt1);
    	System.out.println(odt2);
    	System.out.println(odt3);
    }
}