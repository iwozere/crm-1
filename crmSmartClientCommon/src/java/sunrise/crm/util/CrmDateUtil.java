package sunrise.crm.util;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sunrise.crm.domain.exceptions.CrmValidationException;

/**
 * This utility class provides methods needed by data transfer objects (dto).
 * 
 * @author Oliveira, kolhe
 */
public final class CrmDateUtil {

    private static Log log = LogFactory.getLog(CrmDateUtil.class);

    public static final String MACHINE_HOSTNAME;
    
    public static final String DATE_FORMAT_COMPLETE = "yyyyMMddHHmmss";
    
    public static final String DATE_FORMAT_SAP = "yyyy-MM-dd'T'HH:mm:ss";
    
    public static final String NUMBER_FORMAT_DECIMAL_SEPARATOR = "#,##0.00";

    public static final String DATE_FORMAT_CUSTOM = "yyyy-MMM-dd";

    public static final String DATE_FORMAT_VITRIA = "yyyyMMdd";
    
    public static final String DATE_FORMAT_US_DATE = "yyyyMMdd";

    public static final String DATE_FORMAT_DMS = "ddMMyyyy";

    public static final String DATE_FORMAT_US_TIME = "HH:mm";
    
    public static final String NUMBER_FORMAT_DECIMAL = "##0.00";
    
    public static final String DATE_FORMAT_ORDER_LONG = "dd-MMM-yyyy HH:mm:ss";
  
    public static final String DATE_FORMAT_MEDIUM = "dd-MMM-yyyy";
    
    public static final String DATE_FORMAT_ORDER = "dd-MMM-yy HH:mm:ss";
    
    public static final String DATE_FORMAT_LONG_HYPHEN = "MM-dd-yyyy HH:mm:ss";
    
    public static final String DATE_FORMAT_LONG_HYPHEN_EU = "dd-MM-yyyy HH:mm:ss";

    public static final String DATE_FORMAT_EU = "dd.MM.yyyy";
    
    public static final String DATE_FORMAT_EU_LONG = "dd.MM.yyyy HH:mm:ss";

    public static final String DATE_FORMAT_EU_LONG_NO_SECONDS = "dd.MM.yyyy HH:mm";

    public static final String DATE_FORMAT_SHORT_NO_CENTURY = "MM/dd/yy";
    
    public static final String DATE_FORMAT_SHORT = "MM/dd/yyyy";
    
    public static final String DATE_FORMAT_SHORT3 = "dd-MM-yyyy";

    public static final String DATE_FORMAT_SHORT5 = "MM.dd.yyyy";

    public static final String DATE_FORMAT_LONG = "MM/dd/yyyy HH:mm:ss";
    
    public static final String DATE_FORMAT_LONG2 = "MM-dd-yyyy HH:mm";

    public static final String DEFAULT_DATE = "01.01.1753";

    public static final String DEFAULT_DATE_LONG_FORMAT = "01.01.1753 00:00:00";

    public static final String DATE_FORMAT_NX_DATE = "MM-dd-yyyy";
    
    public static final String DATE_FORMAT_SQL = "yyyy-MM-dd HH:mm:ss";

    public static final String DATE_FORMAT_LIT_CASE = "yyyy.MM.dd HH.mm.ss";

    public static final String DATE_FORMAT_SAP_SHORT = "yyyy-MM-dd";
    
    public static final String DATE_FORMAT_UTC = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    public static final String DATE_FORMAT_UTC_2 = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	
	 public static final String DATE_FORMAT_TIME = "HH:mm:ss";
    
    public static final String DATE_FORMAT_SWISSCOM = "dd/MM/yyyy";
    
    public static final String DATE_FORMAT_DELTA_VISTA = "yyyy MM dd";

    @Deprecated
    public static final String[] DATE_FORMATS = new String[]{
            DATE_FORMAT_EU_LONG
            , DATE_FORMAT_EU
            , DATE_FORMAT_EU_LONG_NO_SECONDS
            , DATE_FORMAT_LONG
            , DATE_FORMAT_SHORT
            , DATE_FORMAT_NX_DATE, DATE_FORMAT_SHORT_NO_CENTURY
            , DATE_FORMAT_SHORT3, DATE_FORMAT_LONG2, DATE_FORMAT_SHORT5
            , DATE_FORMAT_SQL, DATE_FORMAT_LIT_CASE, DATE_FORMAT_SAP_SHORT
            , DATE_FORMAT_UTC, DATE_FORMAT_UTC_2};
    
    private static final int CLARIFY_ZERO_YEAR = 1753;
    
    public static final int NO_SECONDS_IN_A_DAY = 86400;
    
    public static final Calendar CLARIFY_EMPTY_CAL = new GregorianCalendar(CLARIFY_ZERO_YEAR,
            Calendar.JANUARY, 1);

    public static final Date CLARIFY_MIN_DATE = new Date(-6847808400000l); //new Date(CboConstants.cboMinDateInMillis());
    
    public static Calendar CLARIFY_MIN_CALENDAR = null;

    public static final Date CLARIFY_MAX_DATE_TIME = new Date(86560700399000l); //new Date(CboConstants.cboMaxDateInMillis());

    public static final Date CLARIFY_MAX_DATE = new Date(86560614000000l); // DateUtils.truncate(new Date(CboConstants.cboMaxDateInMillis()), Calendar.DATE);
    
    public static final Calendar CLARIFY_MAX_CALENDAR = null;

    private static final int ORDER_SCHEDULE_HOUR_OF_DAY = 20;
    
    public static final SimpleDateFormat sdfLong23hrs = new SimpleDateFormat("dd-MMM-yyyy 23:59:59");

    public static final String DATE_FORMAT_UCCP = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    
    public static final String SBP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    public static final String FORMAT_FILE = "yyyyMMddHHmmss";
    
    public static final String POA_DATE = "yyyyMMdd";
    
    public static final String ISO_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    
//    static {
//    	boolean classAvailable = false; 
//        //Avoid loading the class:
//    	try { 
//    		Class.forName("com.amdocs.config.org.jdom.output.XMLOutputter");
//    		classAvailable = true;
//    	} catch (Exception e) {
//    		//Ignore exception
//    		
//    	} finally {
//    		if (classAvailable) {
//                XML_OUTPUTTER = new XMLOutputter(Format.getRawFormat().setIndent(" ").setExpandEmptyElements(true));
//
//                XML_OUTPUTTER_ENC = new XMLOutputter(Format.getRawFormat().setEncoding(Const.XML_ENCODING)
//                        .setOmitDeclaration(false).setExpandEmptyElements(true));
//
//                SAX_BUILDER = new com.amdocs.config.org.jdom.input.SAXBuilder();
//    		} else {
//    			XML_OUTPUTTER = null;
//    			XML_OUTPUTTER_ENC = null;
//    			SAX_BUILDER = null;
//    		}
//    	}
//    }

    static {
        String host = "unknown";
        try {
            host = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            log.error("Could not retrieve the machine's hostname!", e);
        } catch (Exception e) {
            log.error("Unknown error!", e);
        } finally {
            MACHINE_HOSTNAME = host;
        }
    }

    /**
     * Default constructor.
     */
    private CrmDateUtil() {
    }

    /**
     * Generic format factory.
     * 
     * @param format Date format.
     * @return simple date format instance.
     */
    public static SimpleDateFormat format(String format) {
        return new SimpleDateFormat(format);
    }
    
    public static SimpleDateFormat formatComplete() {
        return new SimpleDateFormat(DATE_FORMAT_COMPLETE);
    }
    
    /**
     * Long format factory.
     * 
     * @return simple date format instance.
     */
    public static String formatEu(Date date) {
        return format(DATE_FORMAT_EU).format(date);
    }
    
    /**
     * Format with  yyyy-MM-dd'T'HH:mm:ss.SSS'Z' pattern
     *
     */
    public static String formatUTC(Date date) {
        return format(DATE_FORMAT_UTC).format(date);
    }

    public static String formatUTC2(Date date) {
        return format(DATE_FORMAT_UTC_2).format(date);
    }

    /**
     * Get end of date time. Set time to 23:59:59
     * @param date
     * @return
     */
    public static Date getEODTime(Date date) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);

        return cal.getTime();
    }
    
    /**
     * Get end of date time. Set time to 23:59:59
     * @return
     */
    public static Calendar getEODTime(Calendar cal) {

        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);

        return cal;
    }
    
    public static Calendar getLastMinuteOfDayTime(Calendar cal) {
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 0);
        return cal;
    }

    /**
     * Long format factory.
     * 
     * @return simple date format instance.
     */
    public static String formatLong(Date date) {
        return format(DATE_FORMAT_LONG).format(date);
    }

    /**
     * Long format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatLongHyphen() {
        return format(DATE_FORMAT_LONG_HYPHEN);
    }

    /**
     * Long format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatLongHyphenEu() {
        return format(DATE_FORMAT_LONG_HYPHEN_EU);
    }

    /**
     * Long format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatMediumHyphenEu() {
        return format(DATE_FORMAT_MEDIUM);
    }

    /**
     * Short format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatShort() {
        return format(DATE_FORMAT_SHORT);
    }

    /**
     * Short format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatShort3() {
        return format(DATE_FORMAT_SHORT3);
    }


    /**
     * Short format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatShortNoCentury() {
        return format(DATE_FORMAT_SHORT_NO_CENTURY);
    }

    /** 
     * SQL format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatSQL() {
        return format(DATE_FORMAT_SQL);
    }

    /**
     * Time format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatTime() {
        return format(DATE_FORMAT_TIME);
    }

    /**
     * Order format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatOrder() {
        return format(DATE_FORMAT_ORDER);
    }

    /**
     * Order format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatOrderLong() {
        return format(DATE_FORMAT_ORDER_LONG);
    }

    /**
     * US date format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatUSDate() {
        return format(DATE_FORMAT_US_DATE);
    }

    /**
     * US time format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatUSTime() {
        return format(DATE_FORMAT_US_TIME);
    }

    /**
     * EU format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatEU() {
        return format(DATE_FORMAT_EU);
    }

    /**
     * Swisscom format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatSwisscom() {
        return format(DATE_FORMAT_SWISSCOM);
    }

    /**
     * Delta Vista format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatDeltaVista() {
        return format(DATE_FORMAT_DELTA_VISTA);
    }

    /**
     * Vitria format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatVitria() {
        return format(DATE_FORMAT_VITRIA);
    }

    /**
     * NX format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatNx() {
        return format(DATE_FORMAT_NX_DATE);
    }
    
    /**
     * NX format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatLong2() {
        return format(DATE_FORMAT_LONG2);
    }

    /**
     * NX format factory.
     *
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatLong() {
        return format(DATE_FORMAT_LONG);
    }

    /**
     * SAP format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatSap() {
        return format(DATE_FORMAT_SAP);
    }

    /**
     * SAP format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatSapShort() {
        return format(DATE_FORMAT_SAP_SHORT);
    }

    /**
     * SAP format factory.
     * 
     * @return simple date format instance.
     */
    public static SimpleDateFormat formatInventoryProvisioning() {
        return format(DATE_FORMAT_LONG_HYPHEN_EU);
    }

    /**
     * Checks if a date is invalid - 01/01/1753 00:00:00.
     * 
     * @param date date to be checked
     * @return true if invalid, false otherwise
     */
    public static boolean isInvalidDate(Date date) {

        /* null date is considered invalid */
        if (null == date) {
            return true;
        }

        return !date.after(CLARIFY_MIN_DATE);
    }

    /**
     * Checks if a date is invalid - 01/01/1753 00:00:00.
     * 
     * @param cal date to be checked
     * @return true if invalid, false otherwise
     */
    public static boolean isInvalidDate(Calendar cal) {

        /* null date is considered invalid */
        if (null == cal) {
            return true;
        }

        return isInvalidDate(cal.getTime());
    }

    /**
     * Checks if a date is valid - different from 01/01/1753 00:00:00.
     * 
     * @param dateValue date to be checked
     * @return true if valid, false invalid
     */
    public static boolean isValidDate(Date dateValue) {
        return !isInvalidDate(dateValue);
    }

    /**
     * Checks if a date is valid - different from 01/01/1753 00:00:00.
     * 
     * @param cal date to be checked
     * @return true if valid, false invalid
     */
    public static boolean isValidDate(Calendar cal) {
        return !isInvalidDate(cal);
    }

    /**
     * Checks if a date is invalid - 01/01/1753 00:00:00. Same as original isInvalidDate method, except that
     * we can also check for Clarify min date + dayRange, e.g. 2 Jan 1753, which sometimes occur in Tux2Java
     * billing. To check also for 2 Jan 1753, enter "1" as dayRange parameter, to check also for 3 Jan 1753,
     * enter "2" as dayRange parameter etc.
     * 
     * @author - T anderson, T hug
     * @param date date to be checked
     * @param dayRange check also for Clarify min date + dayRange
     * @return true if invalid, false otherwise
     */
    public static boolean isInvalidDate(Date date, int dayRange) {

        /* null date is considered invalid */
        if (null == date) {
            return true;
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, dayRange * -1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);

        Date compare = cal.getTime();

        return compare.equals(CLARIFY_MIN_DATE) || compare.before(CLARIFY_MIN_DATE);
    }

    /**
     * Get formatted date for now.
     * 
     * @return Formatted date for now.
     */
    public static String now() {
        return formatLong(new Date());
    }

    /**
     * Format decimal number to specified format.
     * 
     * @param decimal decimal number
     * @return number formatted as String
     */
    public static String formatDecimal(BigDecimal decimal) {
        DecimalFormat myFormatter = new DecimalFormat(NUMBER_FORMAT_DECIMAL);
        return myFormatter.format(decimal);
    }

    /**
     * Format decimal number to specified format.
     * 
     * @param decimal decimal number
     * @return number formatted as String
     */
    public static String formatDecimalSeparator(BigDecimal decimal) {
        DecimalFormat myFormatter = new DecimalFormat(NUMBER_FORMAT_DECIMAL_SEPARATOR);
        return myFormatter.format(decimal);
    }

    /**
     * Format decimal number to specified format.
     * 
     * @param decimalStr decimal number
     * @return number formatted as String
     */
    public static String formatDecimal(String decimalStr) {
        return formatDecimal(new BigDecimal(decimalStr));
    }

    // CS:CyclomaticComplexity:ON

    /**
     * Gets the Clarify Min Date (1st Jan 1753).
     * 
     * @return Clarify Min Date
     */
    public static Date getClarifyMinDate() {
        return CLARIFY_MIN_DATE;
    }
    
    /**
     * A variant of getClarifyMinDate()
     * Gets the Clarify Min Date (1st Jan 1753).
     * 
     * @return Clarify Min Date
     */
    public static Calendar getClarifyMinCalendar() {
        if(CLARIFY_MIN_CALENDAR == null){
            CLARIFY_MIN_CALENDAR = Calendar.getInstance();
            CLARIFY_MIN_CALENDAR.setTime(CLARIFY_MIN_DATE);
        }
        return CLARIFY_MIN_CALENDAR;
    }
    
    /**
     *
     * Gets the Clarify Max Calendar Date (31st Dec 4712).
     * 
     * @return Clarify Max Calendar Date
     */
    public static Calendar getClarifyMaxCalendar() {
        if(CLARIFY_MAX_CALENDAR == null){
            CLARIFY_MIN_CALENDAR = Calendar.getInstance();
            CLARIFY_MIN_CALENDAR.setTime(CLARIFY_MAX_DATE);
        }
        return CLARIFY_MAX_CALENDAR;
    }

    /**
     * Returns the date of the next midnight
     * 
     * @return next midnight
     */
    public static Date getNextMidnight() {

        Calendar cal = Calendar.getInstance();
        // Adds one day and remove the time part.
        cal.add(Calendar.DATE, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return cal.getTime();
    }

    public static Date getNextMidnight(Date date) {
        return getNextMidnight(toCalendar(date)).getTime();
    }
    
    public static Calendar getNextMidnight(Calendar cal) {
    	Calendar ret = Calendar.getInstance();
    	ret.setTime(cal.getTime());        
        cal.add(Calendar.DATE, 1);
        return cal;
    }
    
   public static Calendar toMidnight(Calendar cal) {
    	
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return cal;
    }
   
   /**setToMidnightPlusOneSecond current date(now).
    * @param date
    * @param minutes
    * @return
    */
   public static Date setToMidnightPlusOneSecond(Date date) {
       if (date == null) {
           return null;
       }

       Calendar c = Calendar.getInstance();
       c.setTime(date);
       c.set(Calendar.HOUR_OF_DAY, 0);
       c.set(Calendar.MINUTE, 0);
       c.set(Calendar.SECOND, 1);
       c.set(Calendar.MILLISECOND, 0);
       return new Date(c.getTimeInMillis());
   }
   
   public static Calendar setHourOfDay(Calendar cal, int hour) {
   	
       cal.set(Calendar.HOUR_OF_DAY, hour);
       cal.set(Calendar.MINUTE, 0);
       cal.set(Calendar.SECOND, 0);
       cal.set(Calendar.MILLISECOND, 0);

       return cal;
   }
   
   public static Date setHourOfDay(Date date, int hour) {
	   Calendar cal = Calendar.getInstance();
	   cal.setTime(date);
       return setHourOfDay(cal, hour).getTime();
   }

    /**
     * Removes time part from the date
     * 
     * @param date Date string to parse.
     * @return rounded date
     */
    public static Date roundDate(Date date) {
          if(date != null){
          Calendar cal = Calendar.getInstance();
          cal.setTime(date);
          cal.set(Calendar.HOUR_OF_DAY, 0);
          cal.set(Calendar.MINUTE, 0);
          cal.set(Calendar.SECOND, 0);
          cal.set(Calendar.MILLISECOND, 0);
          date = cal.getTime();
          return date;
          }
          return null;
      }

    /**
     * Tries to parse a date.
     * 
     * @param date Date string to parse.
     * @param formats Format.
     * @return True or False.
     */
    public static boolean isDateParsable(String date, String... formats) {
    	if (CrmStringUtil.isBlank(date)){
    		return false;
    	}
    	for (String format : formats) {
    		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            try {
                dateFormat.parse(date);
                return true;
            } catch (ParseException e) {
                return false;
            }
		}        
        return true;
    }
    
    /**
     * Tries to parse a date as EU date format. 
     * 
     * @param date Date string to parse.
     * @return parsed date.
     */
    public static Date parseDateEU(String date) {
        return parseDate(date, DATE_FORMAT_EU);
    }
    
    public static Date parseDateEU(String date, Date defaultDate) {
        return parseDate(date, DATE_FORMAT_EU, defaultDate);
    }
    
    public static Date parseDateEULong(String date) {
        return parseDate(date, DATE_FORMAT_EU_LONG);
    }
    
    public static Date parseDateEULong(String date, Date defaultDate) {
        return parseDate(date, DATE_FORMAT_EU_LONG, defaultDate);
    }
    
    public static Date parseDateUTC(String date) {
        return parseDate(date, DATE_FORMAT_UTC, TimeZone.getTimeZone("UTC"));
    }
    
    public static Date parseDateLong2(String date) {
        return parseDate(date, DATE_FORMAT_LONG2);
    }
    
    public static Date parseDateLong(String date) {
        return parseDate(date, DATE_FORMAT_LONG);
    }
    
    public static Date parseDateUCCP(String date) {
        return parseDate(date, DATE_FORMAT_UCCP);
    }
    
    public static Date parseDateSQL(String date) {
        return parseDate(date, DATE_FORMAT_SQL);
    }

    /**
     * Tries to parse a date as SHORT date format. 
     * 
     * @param date Date string to parse.
     * @return parsed date.
     */
    public static Date parseDateShort(String date) {
        return parseDate(date, CrmDateUtil.DATE_FORMAT_SHORT);
    }
    
    public static Date parseDateShort3(String date) {
        return parseDate(date, CrmDateUtil.DATE_FORMAT_SHORT3);
    }
    
    public static Date parseDateSapShort(String date) {
        return parseDate(date, CrmDateUtil.DATE_FORMAT_SAP_SHORT);
    }

    /**
     * Tries to parse a date with a list of date formats. Returns the first matching.
     * 
     * @param date Date string to parse.
     * @param format Format.
     * @return parsed date.
     */
    public static Date parseDate(String date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date result = null;
        try {
            result = dateFormat.parse(date);
        } catch (ParseException e) {
            throw new CrmValidationException("date", date, format);
        }
        return result;
    }

    
    public static Date parseDate(String date, String format, boolean lenient) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date result = null;
        try {
        	dateFormat.setLenient(lenient);
            result = dateFormat.parse(date);
        } catch (ParseException e) {
            throw new CrmValidationException("date", date, format);
        }
        return result;
    }        
    
    public static Date parseDate(String date, String format, TimeZone timeZone) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date result = null;
        try {
        	dateFormat.setTimeZone(timeZone);
            result = dateFormat.parse(date);
        } catch (ParseException e) {
            throw new CrmValidationException("date", date, format);
        }
        return result;
    }
    
    public static Date parseDate(String date, String format, Date defaultDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date result = null;
        try {
            result = dateFormat.parse(date);
        } catch (Exception e) {
            return defaultDate;
        }
        return result;
    }

    /**
     * Tries to parse a date with a list of date formats. Returns the first matching.
     * 
     * @param date Date string to parse.
     * @param format Format.
     * @return parsed date.
     */
    public static Date parseChangeDate(String date, String format,String formatToChange) {

    	SimpleDateFormat sdf = new SimpleDateFormat(format);
    	Date dateChanged = null ;
    	try {
    		Date dateIncoming = sdf.parse(date);
    		sdf = new SimpleDateFormat(formatToChange);
    		dateChanged = sdf.parse(sdf.format(dateIncoming));
    	} catch (ParseException e) {
    		log.debug("Format error :"+e.getMessage());
    	}
    	return dateChanged;
    }
    
    /**
     * Parse wish date on TAL Line. It can be stored in long or short format
     * @param date
     * @return
     */
    public static Date parseTALWishDate(String date) {
    	return parseDate(date, DATE_FORMAT_LONG2, DATE_FORMAT_NX_DATE);
    }
    
    /**
     * Tries to parse a date with a list of date formats. Returns the first matching.
     * 
     * @param date Date string to parse.
     * @param formats Format list.
     * @return parsed date.
     */
    @Deprecated
    public static Date parseDate(String date, String... formats) {
        for (int i = 0; i < formats.length; i++) {
            try {
                SimpleDateFormat format = new SimpleDateFormat(formats[i]);
                // setLenient aka use strict mode: very important: don't
                // remove it as it will break the function below parseC2WDate
                format.setLenient(false);
                Date result = format.parse(date);
                if (log.isDebugEnabled()) {
                    log.debug("parseDate(): tried " + formats[i] + ", matched with " + date);
                }
                return result;
            } catch (Exception e) {
                if (log.isDebugEnabled()) {
                    log.debug("parseDate(): tried " + formats[i] + ", no match with " + date);
                }
            }
        }
        return null;
    }

    /**
     * TODO: Check it in the upcoming releases, when ScheduleRemoveEvtStep is reworked properly.
     * @param date
     * @return
     */
    @Deprecated
    public static Date parseDateAllFormats(String date) {
        return parseDate(date, DATE_FORMATS);
    }

    public static Date parseEUDate(String date) {
        return parseDate(date, DATE_FORMAT_EU_LONG, DATE_FORMAT_EU_LONG_NO_SECONDS, DATE_FORMAT_EU);
    }

    /**
     * Calculates the current age based on Birth of Date.
     * 
     * @param birthDate Birth date.
     * @return Age.
     */
    public static int getAge(Date birthDate) {

        Calendar calBirthDate = Calendar.getInstance();
        Calendar calCurrentDate = Calendar.getInstance();

        calBirthDate.setTime(birthDate);

        int userAge = calCurrentDate.get(Calendar.YEAR) - calBirthDate.get(Calendar.YEAR);

        if (calCurrentDate.get(Calendar.MONTH) < calBirthDate.get(Calendar.MONTH)) {
            userAge--;
        }
        if (calCurrentDate.get(Calendar.MONTH) == calBirthDate.get(Calendar.MONTH)
                && calCurrentDate.get(Calendar.DATE) < calBirthDate.get(Calendar.DATE)) {
            userAge--;
        }

        return userAge;
    }

    /**
     * Calculates the current age based on Birth of Date.
     * 
     * @param birthDate Birth date.
     * @return Age.
     */
    public static int getAge(Date givenDate, Date birthDate) {

        Calendar calBirthDate = Calendar.getInstance();
        Calendar calGivenDate = Calendar.getInstance();

        calBirthDate.setTime(birthDate);
        calGivenDate.setTime(givenDate);

        int userAge = calGivenDate.get(Calendar.YEAR) - calBirthDate.get(Calendar.YEAR);

        if (calGivenDate.get(Calendar.MONTH) < calBirthDate.get(Calendar.MONTH)) {
            userAge--;
        }
        if (calGivenDate.get(Calendar.MONTH) == calBirthDate.get(Calendar.MONTH)
                && calGivenDate.get(Calendar.DATE) < calBirthDate.get(Calendar.DATE)) {
            userAge--;
        }

        return userAge;
    }
    
    /**
     * Set time zero for a date object.
     * 
     * @param date to be manipulated
     * @return Date with time zero
     */
    public static Date setTimeZero(Date date) {

        if (date == null) {
            return null;
        }

        // Get an instance of the Calendar.
        Calendar calendar = Calendar.getInstance();

        // Make sure the calendar will not perform automatic correction.
        calendar.setLenient(false);

        // Set the time of the calendar to the given date.
        calendar.setTime(date);
        
        return setTimeZero(calendar).getTime();
    }

    
    public static Calendar setTimeZero(Calendar calendar) {

        if (calendar == null) {
            return null;
        }

        // Make sure the calendar will not perform automatic correction.
        calendar.setLenient(false);

        // Remove the hours, minutes, seconds and milliseconds.
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        // Return the date again.
        return calendar;
    }

    /**
     * Set cease order schedule timestamp on given date.
     * 
     * @param dt date
     * @return timestamped date
     */
    public static Date getOrderScheduleTimestamp(Date dt) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);

        cal.set(Calendar.HOUR_OF_DAY, ORDER_SCHEDULE_HOUR_OF_DAY);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        return cal.getTime();
    }

    /**
     * Utility to convert from Date to Calendar
     * 
     * @param date
     * @return
     */
    public static Calendar toCalendar(Date date) {
        if (date == null) return null;
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c;
    }
    
    public static final int getMonthsDifference(Date date1, Date date2) {
        Calendar cal = Calendar.getInstance();
        // default will be Gregorian in US Locales
        cal.setTime(date2);
        int minuendMonth = cal.get(Calendar.MONTH);
        int minuendYear = cal.get(Calendar.YEAR);
        cal.setTime(date1);
        int subtrahendMonth = cal.get(Calendar.MONTH);
        int subtrahendYear = cal.get(Calendar.YEAR);

        // the following will work okay for Gregorian but will not
        // work correctly in a Calendar where the number of months
        // in a year is not constant
        return Math.abs(((minuendYear - subtrahendYear) * cal.getMaximum(Calendar.MONTH))
                + (minuendMonth - subtrahendMonth));
    }
    
    /**
     * Returning the number of months between 2 dates rounded to noDecPlaces decimal places 
     *  
     * @param cal1 date1
     * @param cal2 date2
     * @return number of months between dat1 and dat2 rounded.
     */
    public static final Double getMonthsDifferenceRounded(Calendar cal1, Calendar cal2, int noDecPlaces) {                
        if (cal1.after(cal2)) {
            Calendar tmp = cal1;
            cal1=cal2;
            cal2=tmp;            
        }        
        int noOfMonths =(cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR))*12;        
        noOfMonths += (cal2.get(Calendar.MONTH) - cal1.get(Calendar.MONTH));
        int noOfDays = (cal2.get(Calendar.DAY_OF_MONTH) - cal1.get(Calendar.DAY_OF_MONTH));                
        double dDif = noOfMonths + ((double)noOfDays / 30);         
        return CrmNumberUtil.roundToDecimalPlaces(dDif, noDecPlaces);               
    }

    /**
     * Returning the number of FULL months between 2 dates 
     *  
     * @param cal1 date1
     * @param cal2 date2
     * @return number of full months between dat1 and dat2 Always positive.
     */
    public static final Double getFullMonthsDifference(Calendar cal1, Calendar cal2) { 
        Double result = Double.valueOf(0);
        if (cal1.after(cal2)) {
            Calendar tmp = cal1;
            cal1=cal2;
            cal2=tmp;            
        }       
        int noOfMonths =(cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR))*12;        
        noOfMonths += (cal2.get(Calendar.MONTH) - cal1.get(Calendar.MONTH));
        if (noOfMonths == 0) return result;
        int noOfDays = (cal2.get(Calendar.DAY_OF_MONTH) - cal1.get(Calendar.DAY_OF_MONTH));                
        if (noOfDays >= 0) return Double.valueOf(noOfMonths);
        return Double.valueOf(noOfMonths - 1);               
    }

    /**
     * Returning the number of FULL months between first date and second date. If first date is after second date returns 0 
     *  
     * @param dateFrom first date
     * @param dateUntil second date
     * @return number of full months between dateFrom and dateUntil. returns 0 in case dateFrom is after dateUntil
     */
    public static final Double getFullMonthsFromUntil(Calendar dateFrom, Calendar dateUntil) { 
        Double result = Double.valueOf(0);
        if (dateFrom.after(dateUntil)) {
            return Double.valueOf(0);                 
        }       
        int noOfMonths =(dateUntil.get(Calendar.YEAR) - dateFrom.get(Calendar.YEAR))*12;        
        noOfMonths += (dateUntil.get(Calendar.MONTH) - dateFrom.get(Calendar.MONTH));
        if (noOfMonths == 0) return result;
        int noOfDays = (dateUntil.get(Calendar.DAY_OF_MONTH) - dateFrom.get(Calendar.DAY_OF_MONTH));                
        if (noOfDays >= 0) return Double.valueOf(noOfMonths);
        return Double.valueOf(noOfMonths - 1);               
    }

    
    /**
     * Calculates the remaining number of months till given date. Time part is ignored. If the difference is
     * less than month, the result is 1.
     * 
     * @param date date
     * @return number of months or 0 if date is in the past
     */
    public static final int getNoOfMonthsUntilDate(Date date) {
       return getNoOfMonthsBetweenDate(new Date(), date);
    }
    
    /**
     * Calculates the remaining number of months between two given dates. Time part is ignored. If the difference is
     * less than month, the result is 1.
     * 
     * @param fromDate date
     * @return number of months or 0 if {@code from.after(date)}
     */
    public static final int getNoOfMonthsBetweenDate(Date fromDate, Date toDate) {
        Calendar fromDateCal = Calendar.getInstance();
        fromDateCal.setTime(setTimeZero(fromDate));
        Calendar toDateCal = Calendar.getInstance();
        toDateCal.setTime(setTimeZero(toDate));
        int diff = 0;
        Calendar cal = Calendar.getInstance();
        cal.setTime(fromDateCal.getTime());
        while (cal.before(toDateCal)) {
            diff++;
            cal.setTime(fromDateCal.getTime());
            cal.add(Calendar.MONTH, diff);
        }
        return diff;
    }
    
    /**
     * Returns the SQL formatted date for the passed input and if the day = today it sets the input billing
     * date to the date past if input day = today then adds the time stamp (current timestamp).
     * 
     * @param inputDate the input date to be formatted
     * @return formatted date
     */
    public static String getSqlFormattedDateWithBillingTimestamp(Date inputDate) {

        Date returnDate = inputDate;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inputDate);

        int cyear = calendar.get(Calendar.YEAR);
        int cday = calendar.get(Calendar.DATE);
        int cmonth = calendar.get(Calendar.MONTH);
        int ch = calendar.get(Calendar.HOUR);
        int cm = calendar.get(Calendar.MINUTE);
        int cs = calendar.get(Calendar.SECOND);

        Calendar today = Calendar.getInstance();
        int year = today.get(Calendar.YEAR);
        int date = today.get(Calendar.DATE);
        int month = today.get(Calendar.MONTH);
        int hour = today.get(Calendar.HOUR);
        int minute = today.get(Calendar.MINUTE);
        int second = today.get(Calendar.SECOND);

        if (cyear == year && cmonth == month && cday == date) {

            if (ch == 0 && cm == 0 && cs == 0) {
                calendar.set(year, month, date, hour, minute, second);
                returnDate = calendar.getTime();
            }
        }
        String billingDate = CrmDateUtil.formatSQL().format(returnDate);
        return billingDate;
    }

    /**
     * @param cal
     * @param numBusinessDays
     * @param holidayList
     * @return
     */
    public static void addBusinessDays(Calendar cal, int numBusinessDays, List<Date> holidayList) {

        for (int i = 0; i < numBusinessDays; i++) {
            cal.add(Calendar.DATE, 1);
            while ((!isWeekDay(cal)) || (isWeekDay(cal) && holidayList.contains(setTimeZero(cal.getTime())))){
                cal.add(Calendar.DATE, 1);
            }
        }
    }
    

    /**
     * @param cal
     * @return
     */
    public static boolean isWeekDay(Calendar cal) {
        return ((Calendar.SATURDAY != cal.get(Calendar.DAY_OF_WEEK)) && (Calendar.SUNDAY != cal.get(Calendar.DAY_OF_WEEK)));
    }
    
    public static boolean isWeekDay(Date dt) {
        return isWeekDay(toCalendar(dt));
    }

    /**Add days to a date.
     * @param date
     * @param days
     * @return
     */
    public static Date addDays(Date date, int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, days);
        return new Date(c.getTimeInMillis());
    }

    /**Add weeks to a date.
     * @param date
     * @param weeks
     * @return
     */
    public static Date addWeeks(Date date, int weeks) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.WEEK_OF_YEAR, weeks);
        return c.getTime();
    }

    /**Add months to a date.
     * @param date
     * @param months
     * @return the modified date.
     */
    public static Date addMonths(Date date, int months) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MONTH, months);
        return new Date(c.getTimeInMillis());
    }
    
    /**Add months to a date.
     * @param date
     * @param years
     * @return the modified date.
     */
    public static Date addYears(Date date, int years) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.YEAR, years);
        return new Date(c.getTimeInMillis());
    }
    
    /**Add seconds to a current date(now).
     * @param date
     * @param seconds
     * @return
     */
    public static Date addSeconds(Date date, int seconds) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.SECOND, seconds);
        return new Date(c.getTimeInMillis());
    }
    
    /**Add minutes to a current date(now).
     * @param date
     * @param minutes
     * @return
     */
    public static Date addMinutes(Date date, int minutes) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MINUTE, minutes);
        return new Date(c.getTimeInMillis());
    }
    /**Add hours to a provided date.
     * @param date
     * @param hours
     * @return
     */
    public static Date addHours(Date date, int hours) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.HOUR_OF_DAY, hours);
        return new Date(c.getTimeInMillis());
    }
    
    public static Calendar addHoursInFuture(Calendar cal, int hours) {
    	Calendar now = Calendar.getInstance();
        now.add(Calendar.HOUR, hours);
        if (cal == null) {
        	return now;
        }
    	Calendar c = Calendar.getInstance();
        c.setTime(cal.getTime());
        c.add(Calendar.HOUR, hours);        
        return c.before(now) ? now : c;
        
    }

    /**
     * 
     * @param day Calendar 
     * @param initialHour number in 24H format (0 to 23)
     * @param endHour number in 24H format (0 to 23)
     * 
     * @return random time for a informed date using a timeframe range eg. from 8:00 to 15:00
     */
    public static Calendar getRandomRangeTime(Calendar day, int initialHour, int endHour) {
        
        List <String> hours = new ArrayList <> ();
        
        for (int i = initialHour; i <= endHour; i++) { 
            hours.add(String.valueOf(i));
        }
        
        int hour = Integer.parseInt(CrmNumberUtil.getRandomValueFromList(hours));
        
        int minute = CrmNumberUtil.getRandomNumber(60);
    
        Calendar rangedTime = (Calendar) day.clone();
        
        rangedTime.set(rangedTime.get(Calendar.YEAR), rangedTime.get(Calendar.MONTH), rangedTime.get(Calendar.DATE), 
                hour, minute );
    
        return rangedTime;
        
    }
    
    /**Returns the first day of the next month.
     * @return
     */
    public static Calendar getFirstDayOfNextMonth() {
        return getFirstDayOfNextMonth(new Date());
    }
    
    public static Calendar getFirstDayOfNextMonth(Date date) {
        Calendar firstDayOfNextMonth = Calendar.getInstance();                        
        firstDayOfNextMonth.setTime(date);
        firstDayOfNextMonth.add(Calendar.MONTH, 1);
        firstDayOfNextMonth.set(Calendar.DATE, 1);
        firstDayOfNextMonth.set(Calendar.HOUR_OF_DAY, 0);
        firstDayOfNextMonth.set(Calendar.MINUTE, 0);
        firstDayOfNextMonth.set(Calendar.SECOND, 0);
        firstDayOfNextMonth.set(Calendar.MILLISECOND, 0);
        return firstDayOfNextMonth;
    }
    
    public static Calendar getFirstDayOfNextYear() {
        return getFirstDayOfNextYear(new Date());
    }
    
    public static Calendar getFirstDayOfNextYear(Date date) {
        Calendar firstDayOfNextYear = Calendar.getInstance();                        
        firstDayOfNextYear.setTime(date);
        firstDayOfNextYear.add(Calendar.YEAR, 1);
        firstDayOfNextYear.set(Calendar.MONTH, 0);
        firstDayOfNextYear.set(Calendar.DATE, 1);
        firstDayOfNextYear.set(Calendar.HOUR_OF_DAY, 0);
        firstDayOfNextYear.set(Calendar.MINUTE, 0);
        firstDayOfNextYear.set(Calendar.SECOND, 0);
        firstDayOfNextYear.set(Calendar.MILLISECOND, 0);
        return firstDayOfNextYear;
    }

    public static Calendar getFirstDayOfMonth(Date date) {
        Calendar firstDayOfMonth = Calendar.getInstance();                        
        firstDayOfMonth.setTime(date);
        firstDayOfMonth.set(Calendar.DATE, 1);
        firstDayOfMonth.set(Calendar.HOUR_OF_DAY, 0);
        firstDayOfMonth.set(Calendar.MINUTE, 0);
        firstDayOfMonth.set(Calendar.SECOND, 0);
        firstDayOfMonth.set(Calendar.MILLISECOND, 0);
        return firstDayOfMonth;
    }

    public static Calendar getLastDayOfLastMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -1);
        cal = getLastDayOfMonth(cal);
        return cal;
    }

    /**Returns the first day of the next month.
     * @return
     */
    public static Calendar getEndOfNextMonth() {
        Calendar endOfNextMonth = Calendar.getInstance();                        
        endOfNextMonth.setTime(new Date());
        endOfNextMonth.add(Calendar.MONTH, 2);
        endOfNextMonth.set(Calendar.DATE, 1);
        endOfNextMonth.set(Calendar.HOUR_OF_DAY, 0);
        endOfNextMonth.set(Calendar.MINUTE, 0);
        endOfNextMonth.set(Calendar.SECOND, 0);
        endOfNextMonth.set(Calendar.MILLISECOND, 0);
        return endOfNextMonth;
    }
    
    public static Calendar getEndOfNextMonth(Date date) {
        Calendar endOfNextMonth = Calendar.getInstance(); 
        endOfNextMonth.setTime(date);
        endOfNextMonth.setTime(new Date());
        endOfNextMonth.add(Calendar.MONTH, 2);
        endOfNextMonth.set(Calendar.DATE, 1);
        endOfNextMonth.set(Calendar.HOUR_OF_DAY, 0);
        endOfNextMonth.set(Calendar.MINUTE, 0);
        endOfNextMonth.set(Calendar.SECOND, 0);
        endOfNextMonth.set(Calendar.MILLISECOND, 0);
        return endOfNextMonth;
    }

    /**Returns the last day of actual month.
     * @return
     */
    public static Calendar getLastDayOfMonth() {
        Date date = new Date();
        Calendar endOfNextMonth = getFirstDayOfNextMonth(date);
        endOfNextMonth.add(Calendar.DAY_OF_MONTH, -1);
        return endOfNextMonth;
    }
    
    /**Returns the last day of month for requested Date.
     * @return
     */
    public static Calendar getLastDayOfMonth(Date date) {
        Calendar endOfNextMonth = getFirstDayOfNextMonth(date);
        endOfNextMonth.add(Calendar.DAY_OF_MONTH, -1);
        return endOfNextMonth;
    }
    
    /**Returns the last day of month for requested Date.
     * @return
     */
    public static Calendar getLastDayOfMonth(Calendar cal) {
        if (cal!=null) {
            return getLastDayOfMonth(cal.getTime());
        }
        return null;
    }

    public static boolean isBeforeSomeMonthsFromToday(Date date, int months){
        Calendar monthsBeforeToday = Calendar.getInstance();
        monthsBeforeToday.add(Calendar.MONTH, months);
        return date.before(monthsBeforeToday.getTime());
    }
    
    public static boolean isOlderThanMonths(Date date, int months) {
        Calendar thresholdDate = Calendar.getInstance();
        thresholdDate.add(Calendar.MONTH, -months);
        return date.before(thresholdDate.getTime());
    }

    public static boolean isBeforeToday(Date wishDate){
        Calendar calWish = Calendar.getInstance();
        Calendar calNow = Calendar.getInstance();
        calWish.setTime(setTimeZero(wishDate));
        calNow.setTime(setTimeZero(new Date()));
        return calWish.before(calNow);
    }
    
    public static boolean isBeforeNow(Date wishDate){
        Calendar calWish = Calendar.getInstance();
        Calendar calNow = Calendar.getInstance();
        calWish.setTime(wishDate);
        calNow.setTime(new Date());
        return calWish.before(calNow);
    }
    /**
     * to check if the date is before given refernce date
     * @param dateTobeChecked
     * @param refernceDate
     * @return
     */
    public static boolean isBeforeDate(Date dateTobeChecked, Date refernceDate){
        Calendar dateToBeCheckedCal = Calendar.getInstance();
        Calendar refernceDataCal = Calendar.getInstance();
        dateToBeCheckedCal.setTime(dateTobeChecked);
        refernceDataCal.setTime(refernceDate);
        return dateToBeCheckedCal.before(refernceDataCal);
    }
    
    /**
     * Time stamp should come in format of HH:MM:SS.
     * The number of seconds from midnight to that moment will be returned.
     * @param timestamp
     * @return
     */
    public static int timestampToSeconds(String timestamp){
        Date today = setTimeZero(new Date());
        long startMilliSeconds = today.getTime();
        long endMilliSeconds = startMilliSeconds;
        String stringDateAndTime = formatSapShort().format(today) + " " + timestamp;
        Date dateAndTime = today;
        try{
            if ("24:00:00".equals(timestamp)){
                endMilliSeconds = NO_SECONDS_IN_A_DAY * 1000 + startMilliSeconds;
            }else{
                dateAndTime = format(DATE_FORMAT_SAP_SHORT + " " + DATE_FORMAT_TIME).parse(stringDateAndTime);
                endMilliSeconds = dateAndTime.getTime();
            }
        }catch(ParseException ex){
            log.debug("Could not parse timestamp " + timestamp);
        }
        return (int)((endMilliSeconds - startMilliSeconds) / 1000);
    }
    
    /** 
     * Get number of days between 2 dates (the two days included).
     * 
     * @param d1 date from
     * @param d2 date to
     * @return the number of days between these two dates i.e.29=from 03.Oct to 31.Oct
     */
    public static int getDaysBetween(Date d1, Date d2) {
        return (int) Math.round((d2.getTime() - d1.getTime()) / ((double)(24 * 60 * 60 * 1000))); 

    }
    
    /**
     * 1-based. 1 - Sunday, ... 7 - Saturday.
     * @param dt
     * @return
     */
    public static int getDayOfWeek(Date dt){
        return toCalendar(dt).get(Calendar.DAY_OF_WEEK);
    }
    
    /**
     * If Date object has a time part (time not equal to midnight) then number of seconds, 
     * elapsed since last midnight will be returned. Otherwise - 0.
     * @param dt
     * @return
     */
    public static int getSecondsSinceMidnight(Date dt){
        Calendar c = toCalendar(dt);
        return getSecondsSinceMidnight(c);
    }
    
    public static int getSecondsSinceMidnight(Calendar c){
        Calendar c2 = setTimeZero((Calendar)c.clone());
        long timespan = c.getTimeInMillis() - c2.getTimeInMillis();
        int seconds = (int)(timespan / 1000L);
        return seconds;
    }

    public static boolean isDateOutOfRange(Date date){
        if(date == null){
            return true;
        }
        else if(date.before(CLARIFY_MIN_DATE) || date.equals(CLARIFY_MIN_DATE)){
            return true;
        }else if(date.after(CLARIFY_MAX_DATE) || date.equals(CLARIFY_MAX_DATE)){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * It returns true if the input date is the same or before the Clarify minimum system date.
     * @param date
     * @return
     */
    public static boolean isMinDate(Date date) {
        return (date.before(CLARIFY_MIN_DATE) || date.equals(CLARIFY_MIN_DATE));
    }

    /**
     * It returns true if the input date is the same or after the Clarify maximum system date.
     * @param date
     * @return
     */
    public static boolean isMaxDate(Date date) {
        return (date.after(CLARIFY_MAX_DATE) || date.equals(CLARIFY_MAX_DATE));
    }

	public static List<Date> getWeekendsBetweenDates(Date startDate,Date endDate) {
		List<Date> weekendList = new ArrayList<Date>();
		Calendar cStart = setTimeZero(toCalendar(startDate));
		Calendar cEnd = setTimeZero(toCalendar(endDate));
		
        while (! cStart.after(cEnd)) {
        	if (!isWeekDay(cStart)) {
        		weekendList.add(cStart.getTime());
        	}

        	cStart.add(Calendar.DATE, 1);
        }
		
		return weekendList;
		
	}
	
	/**
	 * @param startDate
	 * @param endDate the end date is included on the output if the it is not a weekend nor a holiday
	 * @param holidaysDates - list of dates with time zero!
	 * @return
	 */
	public static List<Date> getWeekdaysBetweenDates(Date startDate,Date endDate, List<Date> holidaysDates) {
		List<Date> weekDaysList = new ArrayList<Date>();
		Calendar cStart = setTimeZero(toCalendar(startDate));
		Calendar cEnd = setTimeZero(toCalendar(endDate));
		
        while (!cStart.after(cEnd)) {// If the date is the same it still enders the list. 
        	if (isWeekDay(cStart) && !holidaysDates.contains(cStart)) {
        		weekDaysList.add(cStart.getTime());
        	}

        	cStart.add(Calendar.DATE, 1);
        }
		
		return weekDaysList;
	}

	public static List<Date> getWeekdaysBetweenDates(Date startDate,Date endDate) {
		return getWeekdaysBetweenDates(startDate, endDate, Collections.emptyList());
	}
	
	/**
     * Long format factory.
     * 
     * @return simple date format instance.
     */
    public static String formatDateEu(Date date) {
        return format(DATE_FORMAT_EU).format(date);
    }


    /**
     * Swisscom format factory.
     *
     * @return date format instance.
     */
    public static String formatSwisscom(Date date) {
        return format(DATE_FORMAT_SWISSCOM).format(date);
    }


    /**
     * Long format factory.
     *
     * @return simple date format instance.
     */
    public static String formatDateLong(Date date) {
        return format(DATE_FORMAT_LONG).format(date);
    }


    /**
     * SQL format factory.
     * 
     * @return simple date format instance.
     */
    public static String formatDateSQL(Date date) {
        return format(CrmDateUtil.DATE_FORMAT_SQL).format(date);
    } 
    
    /******************************************************
     * This function calculates difference in seconds between two dates
     * TODO: actually this is a difference in minutes!
     ******************************************************/
    public static long dateDiffInSeconds(Date startDate, Date endDate){
    	long duration  = endDate.getTime() - startDate.getTime();
    	return duration / 1000 % 60;
    }
    
    /******************************************************
     * This function calculates difference in hours between two dates
     ******************************************************/
    public static int dateDiffInHours(Date startDate, Date endDate){
    	long duration  = (endDate.getTime() - startDate.getTime())/1000;
    	return  (int) (duration / 3600);
    }

    /********************************************************************
     * This function calculates the difference in days between two dates.
     *******************************************************************/
    public static int dateDiffInDays(Date startDate, Date endDate) {
    	long duration = (endDate.getTime() - startDate.getTime())/1000;
    	return (int) (duration / 86400);
    }

    /**
     * Add specified number of working days (days excluding weekends and holidays) to provided date 
     *  
     * @param startDate date to which we add number of working days
     * @param noOfWorkingDays number of working days
     * @param holidaysDates list of holiday dates
     * @param noOfWorkingDaysInWeek number Of Working Days In Week
     * 
     * @return date in number working days provided 
     */
    public static Date addWorkingDays(final Date startDate, int noOfWorkingDays, List<Date> holidaysDates, int noOfWorkingDaysInWeek) {
    	Calendar  startCal = Calendar.getInstance();
    	startCal.setTime(startDate);
    	int startDayOfWeek = startCal.get(Calendar.DAY_OF_WEEK);
    	//start offset with next working day
    	int offSet = getWeekendOffset(startDayOfWeek,noOfWorkingDaysInWeek,noOfWorkingDays);
    	startCal.add(Calendar.DATE, offSet);
    	startCal = CrmDateUtil.setTimeZero(startCal);
    	
    	//end date
    	Calendar endCal = Calendar.getInstance();
    	endCal.setTime(startCal.getTime());
    	//add all weekends. 
    	offSet = getNoOfWorkingDaysOffset(noOfWorkingDays,noOfWorkingDaysInWeek,startDayOfWeek);
    	endCal.add(Calendar.DATE, offSet);
    	endCal = CrmDateUtil.setTimeZero(endCal);    	
    	//add holidays    	
    	for (Date holidayDt : holidaysDates) {
    		Calendar holidayCal = Calendar.getInstance();
    		holidayCal.setTime(holidayDt);
    		holidayCal = CrmDateUtil.setTimeZero(holidayCal);
    		
			offSet = getHolidayOffset(noOfWorkingDaysInWeek, startCal, endCal,
					holidayCal);
    		endCal.add(Calendar.DATE, offSet);
		}
    	//last offset    	
    	addLastOffset(holidaysDates, noOfWorkingDaysInWeek, endCal);
    	return endCal.getTime();
    }

	/**
	 * @param holidaysDates
	 * @param noOfWorkingDaysInWeek
	 * @param endCal
	 */
	private static void addLastOffset(List<Date> holidaysDates,
			int noOfWorkingDaysInWeek, Calendar endCal) {
		int endWeekOfDay = endCal.get(Calendar.DAY_OF_WEEK);
    	if(noOfWorkingDaysInWeek == 6) {
    		while(endWeekOfDay == Calendar.SUNDAY || holidaysDates.contains(endCal.getTime())) {
        		endCal.add(Calendar.DATE, 1);
        		endWeekOfDay = endCal.get(Calendar.DAY_OF_WEEK);
        	}
    	}else {
    		while(endWeekOfDay == Calendar.SATURDAY || endWeekOfDay == Calendar.SUNDAY || holidaysDates.contains(endCal.getTime())) {
        		endCal.add(Calendar.DATE, 1);
        		endWeekOfDay = endCal.get(Calendar.DAY_OF_WEEK);
        	}
    	}
	}

	
	/**
	 * @param noOfWorkingDays
	 * @param noOfWorkingDaysInWeek
	 * @param startDayOfWeek
	 * @return
	 */
	private static int getNoOfWorkingDaysOffset(int noOfWorkingDays,int noOfWorkingDaysInWeek, int startDayOfWeek) {
		int offSet = 0;
		if(noOfWorkingDaysInWeek == 6) {
			offSet = noOfWorkingDays + ((noOfWorkingDays/6) * 1); 
			if(startDayOfWeek == Calendar.SUNDAY){
				offSet = offSet - 1;
			}
		}else {
			offSet = noOfWorkingDays + ((noOfWorkingDays/5) * 2); //+ ((((noOfWorkingDays/5) * 2)/5)*2);
			if(startDayOfWeek == Calendar.SATURDAY){
				offSet = offSet - 1;
			}
		}
		return offSet;
	}

	/**
	 * @param noOfWorkingDaysInWeek
	 * @param startCal
	 * @param endCal
	 * @param holidayCal
	 * @return
	 */
	private static int getHolidayOffset(int noOfWorkingDaysInWeek,
			Calendar startCal, Calendar endCal, Calendar holidayCal) {
		int offSet = 0;
		int holDay = holidayCal.get(Calendar.DAY_OF_WEEK);
		if(noOfWorkingDaysInWeek == 6) {
			if (holDay != Calendar.SUNDAY) {
				offSet = (!holidayCal.before(startCal) && !(holidayCal.after(endCal))) ? 1 : 0;
			}
		}else {
			if (holDay != Calendar.SATURDAY && holDay != Calendar.SUNDAY) {
				offSet = (!holidayCal.before(startCal) && !(holidayCal.after(endCal))) ? 1 : 0;
			}
		}
		return offSet;
	}

	
	/**
	 * @param startDayOfWeek
	 * @param noOfWorkingDaysInWeek
	 * @param noOfWorkingDays
	 * @return
	 */
	private static int getWeekendOffset(int startDayOfWeek,
			int noOfWorkingDaysInWeek, int noOfWorkingDays) {
		int offSet = 0;
		if (noOfWorkingDaysInWeek == 6) {
			if ((noOfWorkingDays < 5) &&(startDayOfWeek + noOfWorkingDays) > 6) {
					offSet = offSet + 1;
			}
		} else {
			if ((noOfWorkingDays < 4) && (startDayOfWeek + noOfWorkingDays) > 5) {
					offSet = offSet + 2;
			}

		}
		 
		return offSet;
	}

    /**
     * Long format factory: dd.MM.yyyy HH:mm:ss
     * 
     * @return simple date format instance.
     */
    public static String formatEuLong(Date date) {
        return format(DATE_FORMAT_EU_LONG).format(date);
    }
    
    /**
     * Format UCCP: yyyy-MM-dd'T'HH:mm:ss.SSSXXX
     * 
     * @param date
     * @return
     */
    public static String formatUCCP(Date date) {
    	 return CrmDateUtil.format(DATE_FORMAT_UCCP).format(date);
    }
    
    /**
     * Format Date in yyyy-MM-dd'T'HH:mm:ss format
     * 
     * @param date
     * @return
     */
    public static String formatSBP(Date date) {
    	 return CrmDateUtil.format(SBP_FORMAT).format(date);
    }
    
    

    /**
     * Format for file name: yyyyMMddHHmmss
     *
     * @param date
     * @return
     */
    public static String formatFile(Date date) {
    	 return CrmDateUtil.format(FORMAT_FILE).format(date);
    }

    public static String formatPoaDate(Date date) {
   	 return CrmDateUtil.format(POA_DATE).format(date);
   }
    
    public static String formatSAP(Date date) {
    	 return CrmDateUtil.format(DATE_FORMAT_SAP_SHORT).format(date);
    }
    
    /**
     * Checks if 2 dates are the same day. This is similar to commons-lang DateUtils. As, sometimes there are issues of commons-lang version, the logic was created here.
     * @param d1
     * @param d2
     * @return
     */
    public static boolean isSameDay (Date d1, Date d2) {
    	return isSameDay(toCalendar(d1), toCalendar(d2));
    }

    
    /**
     * Checks if 2 dates are the same day. This is similar to commons-lang DateUtils. As, sometimes there are issues of commons-lang version, the logic was created here.
     * @param c1
     * @param c2
     * @return
     */
    public static boolean isSameDay (Calendar c1, Calendar c2) {
        return c1.get(Calendar.ERA) == c2.get(Calendar.ERA) &&
                c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR) &&
                c1.get(Calendar.DAY_OF_YEAR) == c2.get(Calendar.DAY_OF_YEAR);
    }

    public static Calendar cloneCalendar(Calendar calendar) {
        if (calendar == null) {
            return calendar;
        } else {
            return (Calendar) calendar.clone();
        }

    }

    /**
     * Returns the maximum of two dates. A null date is treated as being less
     * than any non-null date.
     */
    public static Date maxOf2Dates(Date firstDate, Date secondDate) {
        if (firstDate == null && secondDate == null) return null;
        if (firstDate == null) return secondDate;
        if (secondDate == null) return firstDate;
        return (firstDate.after(secondDate)) ? firstDate : secondDate;
    }

	public static Date toDate(Object dt) {
		if (dt == null) {
			return null;
		}
	    if (dt instanceof Date) {
	        return (Date) dt;
	    } else if (dt instanceof Calendar) {
	        return ((Calendar) dt).getTime();
	    } else if (dt instanceof LocalDate) {
	        return Date.from(((LocalDate) dt).atStartOfDay(ZoneId.systemDefault()).toInstant());
	    } else if (dt instanceof LocalDateTime) {
	        return Date.from(((LocalDateTime) dt).atZone(ZoneId.systemDefault()).toInstant());
	    } else if (dt instanceof OffsetDateTime) {
	        return Date.from(((OffsetDateTime) dt).toInstant());
	    } else if (dt instanceof String) {
	        return CrmDateUtil.parseDateEULong((String) dt, null);
	    }
	    return null;
		
	}

	/**
	 * Null input will be returned as a null output
	 * @param odt
	 */
	public static Date toDate(OffsetDateTime odt) {
		if (odt == null) return null;
		
		return Date.from(odt.toInstant());
		
	}
	
	/**
	 * Null input will be returned as a null output
	 * @param ld
	 */
	public static Date toDate(LocalDate ld) {
		if (ld == null) return null;
		
		return Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
	}
	
	/**
	 * Null input will be returned as a null output
	 * @param ld
	 */
	public static Date toDate(LocalDateTime ld) {
		if (ld == null) return null;
		return java.util.Date
			      .from(ld.atZone(ZoneId.systemDefault())
			      .toInstant());
	}
	
    
	public static Date roundONPDate(Date dt) {
		
		Calendar c = CrmDateUtil.toCalendar(dt);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
		int hours = c.get(Calendar.HOUR_OF_DAY);
		int minutes = c.get(Calendar.MINUTE);
		
		// For non-working (before 8 or after 17) hours align to 8am of the next day.
		if (hours >= 17){
			c.add(Calendar.DAY_OF_YEAR, 1);
			c.set(Calendar.HOUR_OF_DAY, 8);
			c.set(Calendar.MINUTE, 0);
		}else if (hours < 8){
			c.add(Calendar.DAY_OF_YEAR, 0);
			c.set(Calendar.HOUR_OF_DAY, 8);
			c.set(Calendar.MINUTE, 0);
		}
		
		int addH = 0;
		int addM = 0;
		minutes = c.get(Calendar.MINUTE);
		int interval15Min = minutes / 15;
		interval15Min++;
		if (interval15Min > 3){
			interval15Min = 0;
			addH++;
		}
		addM = 15 * interval15Min;
		
		c.add(Calendar.HOUR_OF_DAY, addH);
		c.set(Calendar.MINUTE, addM);
		
		return c.getTime();
	}
	
	public static int dateComparewithCurrent(String dateEU){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(CrmDateUtil.DATE_FORMAT_EU);
        LocalDate expirationDate = LocalDate.parse(dateEU, formatter);
        LocalDate currentDateEU = LocalDateTime.now().toLocalDate();
        if (currentDateEU.isBefore(expirationDate)){
        	return 1;
        }
        else
        	return 0;
	}

    public static boolean isDateIncluded(List<Date> dates, Date date) {
        Calendar what = Calendar.getInstance();
        Calendar with = Calendar.getInstance();
        with.setTime(date);
        toMidnight(with);

        for (Date dt : dates) {
            what.setTime(dt);
            toMidnight(what);
            if (what.compareTo(with) == 0) {
                return true;
            }
        }
        return false;
    }

    public static Calendar convertOffsetDateTimeToCalendar(OffsetDateTime odt) {
        Instant instant = odt.toInstant();
        Date date = Date.from(instant);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static OffsetDateTime convertCalendarToOffsetTimeUTC(Calendar calendar) {
        Date date = calendar.getTime();
        Instant instant = date.toInstant();
        return instant.atOffset(ZoneOffset.UTC);
    }
    
    public static LocalDate toLocalDate(Date dt){
    	return dt.toInstant()
    		      .atZone(ZoneId.systemDefault())
    		      .toLocalDate();
    }

    public static LocalDateTime toLocalDateTime(Date dt){
    	return dt.toInstant()
    		      .atZone(ZoneId.systemDefault())
    		      .toLocalDateTime();
    }

    public static LocalDate toLocalDate(Calendar cal){
    	return LocalDateTime.ofInstant(cal.toInstant(), cal.getTimeZone().toZoneId()).toLocalDate();
    }

    public static LocalDateTime toLocalDateTime(Calendar cal){
    	return LocalDateTime.ofInstant(cal.toInstant(), cal.getTimeZone().toZoneId());
    }
    
    public static Date getNextFutureDate(Date startDate, int durationInMonths) {
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(startDate);

        Calendar todayCal = Calendar.getInstance();

        // Calculate how many months between startDate and today
        int startYear = startCal.get(Calendar.YEAR);
        int startMonth = startCal.get(Calendar.MONTH);

        int todayYear = todayCal.get(Calendar.YEAR);
        int todayMonth = todayCal.get(Calendar.MONTH);

        int totalMonthsBetween = (todayYear - startYear) * 12 + (todayMonth - startMonth);

        // Number of full periods passed
        int periodsPassed = totalMonthsBetween / durationInMonths;

        // Advance to the next period
        startCal.add(Calendar.MONTH, (periodsPassed + 1) * durationInMonths);

        return startCal.getTime();
    }
    
    /**
     * For Pricing Engine and Commissioning Calculator.
     * For the short time this function will also be able to receive EU Long format assuming Swiss timezone (31.12.2026 23:45:59). To be removed in R26.2.
     * @param date 2026-01-28T13:54:25.678+01:00
     * @return
     */
    public static OffsetDateTime parseIso8601(String s){
    	try{
        	return OffsetDateTime.parse(s);
    	}catch(Exception ex){
    		log.error(s, ex);
    		
    		ZoneId zone = ZoneId.of("Europe/Zurich");
    		LocalDateTime ldt = LocalDateTime.ofInstant(parseDateEULong(s).toInstant(), zone);
    		ZoneOffset offset = zone.getRules().getOffset(ldt);
    		return ldt.atOffset(offset);
    	}
    }

    public static String formatIso8601(Date d){
    	ZoneId zoneId = ZoneId.of("Europe/Zurich");  // your location's zone
    	ZonedDateTime zdt = d.toInstant().atZone(zoneId);
    	return zdt.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public static OffsetDateTime parseIso8601(Date d){
		ZoneId zone = ZoneId.of("Europe/Zurich");
		LocalDateTime ldt = LocalDateTime.ofInstant(d.toInstant(), zone);
		ZoneOffset offset = zone.getRules().getOffset(ldt);
		return ldt.atOffset(offset);
    }
}
