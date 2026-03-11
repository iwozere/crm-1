package sunrise.crm;

/**
 * Holds constants used all around in the Sunrise CRM Application.
 * 
 * @author Jasinski
 * @author Zisler
 * Constants should be declared across the Clarify Java framework on the respective domains where they should be used. 
 * Avoid at all costs adding more constants to this class. On mid-term, the constants already declared in this class will be moved
 * to auxiliary classes, in respective domains.
 * 
 * @author modified by borkar: This class was deprecated, but as it is now moved to SmartClientCommon, it now makes sense to use these constant.
 * Also move respective product, date related constant to other classes like ProductMobile, ProductUll, CrmDateUtil etc
 * 
 */
public final class Const {
	

    public static final String YES = "yes";
    public static final String NO = "no";

    public static final String VOIP_USERNAME = "User Name";

    public static final int SERVICE_SWITCH_SCHEDULE_HOUR = 22;

    /**
     * Source version constant. This is filled by the build process.
     */
    public static final String SOURCE_VERSION = "{{SRCVER}}";

    /**
     * Default objid.
     */
    public static final String DEFAULT_OBJID = "-2";

    /**
     * Standard XML encoding.
     */
    public static final String XML_ENCODING = "iso-8859-1";

    public static final int ORDER_DEFAULT_DURATION = 12;

    public static final String SBS_CATEGORY = "SBS";

    public static final String ORDER_ATTR_SBS_MIGRATION_CEASE = "SBS Migration Cease Order";

    public static final String ORDER_ATTR_CAMPAIN_NAME = "Campaign Name";

    public static final String ORDER_ATTR_CAMPAIN_SOURCE = "Campaign Source";

    // Campaign applied from CB GUI, button Install Promotion
    public static final String ORDER_ATTR_CAMPAIN_SOURCE_CB = "CB GUI";
    
    // Campaign comes from XIP (SMS campaign, uses SMS Keyword as a key)
    public static final String ORDER_ATTR_CAMPAIN_SOURCE_WS = "Web Service";
    
    // Campaign applied from massloader, sheet Apply Campaign
    public static final String ORDER_ATTR_CAMPAIN_SOURCE_ML = "Massloader";

    // Promotion code (campaign name) comes in the capture request as promotionCode
    public static final String ORDER_ATTR_CAMPAIN_SOURCE_REQ = "Request";

    public static final int END_OF_DAY_SECOND = 59;

    public static final int END_OF_DAY_MINUTE = 59;

    public static final int END_OF_DAY_HOUR = 23;


    /**
     * Standard Decimal format.
     */
    public static final String NUMBER_FORMAT_DECIMAL = "##0.00";

    /**
     * Decimal format with grouping separator.
     */
    public static final String NUMBER_FORMAT_DECIMAL_SEPARATOR = "#,##0.00";

    /**
     * The current row needs to be committed.
     */
    public static final int CBO_EDIT_ROW = 0;

    /**
     * The current row is new.
     */
    public static final int CBO_EDIT_ROW_NE = 1;

    /**
     * The current row has modified fields.
     */
    public static final int CBO_EDIT_ROW_EDITED = 2;

    /**
     * All exposed rows need to be committed.
     */
    public static final int CBO_EDIT_EXPOSED = 3;

    /**
     * All rows need to be committed.
     */
    public static final int CBO_EDIT_ALL = 4;

    /**
     * Spin notes log header.
     */
    public static final String SPIN_NOTES_HEADER = "Change Password. ";

    public static final String ADSL = "ADSL";

    public static final String ADSL_CLI = "CLI";

    public static final String TM_ADSL_SPEED_CATALOG = "sunrise talk&more ADSL Speed";

    public static final String TM_ADSL_RP_CATALOG = "sunrise ADSL talk&more RP";

    /**
     * Default cablecom postpaid rate plan.
     */
    public static final String RATE_PLAN_CABLECOM_BASIC = "Rate Plan cablecom basic";

    /**
     * Date/time helper constants.
     */
    public static final int HOURS_DAY = 24;

    public static final int DAYS_WEEK = 7;

    public static final int ORDER_ID_LENGTH = 10;

    /**
     * Identifiers for different types in table_contract.
     */
    public static final int CONTRACT_TYPE_ORDER = 2;
    public static final int CONTRACT_TYPE_QUOTE_ORDER = 1;
    public static final int CONTRACT_TYPE_OFFER = 3;

    public static final int CONTRACT_TYPE_IP = 9;

    /**
     * Activity log codes.
     */
    public static final int ACT_CODE_CASE_CLOSE = 200;

    public static final int ACT_CODE_CASE_REOPEN = 2400;

    public static final int ACT_CODE_CONTACT_MODIFY = 9800;

    public static final int ACT_CODE_SITE_MODIFY = 1500;

    /**
     * Scheduler event types.
     */
    public static final String SCHEDULER_EVENT_GSM_NEW = "gsm_contract_new";

    public static final String SCHEDULER_EVENT_GSM_MODIFY = "gsm_contract_modify";

    public static final String SCHEDULER_EVENT_GSM_CEASE = "gsm_contract_cease";

    public static final String SCHEDULER_EVENT_GSM_RECONNECT = "gsm_contract_reconne";

    public static final String SCHEDULER_EVENT_GSM_PROV_NE = "gsm_contract_prov_ne";

    public static final String SCHEDULER_EVENT_GSM_TERM = "gsm_contract_term";

    public static final String SCHEDULER_EVENT_ADSL_MODIFY = "adsl_contract_modify";

    public static final String SCHEDULER_EVENT_REFILL_RESTART = "refill_restart";

    public static final String SCHEDULER_EVENT_SBS_TERM = "sbs_termination";

    public static final String SCHEDULER_EVENT_SBS_NEW = "sbs_contract_new";

    public static final String SCHEDULER_EVENT_BILL_ACC_TERM = "bill_acc_term";

    public static final String SCHEDULER_EVENT_REMOVE_FAST_PORTING = "ip_contract_fastport";
    
    public static final String SCHED_EVENT_CREATE_CEASE_ORDER = "create_cease_order";
    
    public static final String SCHEDULER_EVENT_BANK_ACC_CLEANUP = "customer_bank_clean";
    
    /**
     * Scheduler priority codes.
     */
    public static final int SCHED_PRIORITY_URGENT = 1;

    public static final int SCHED_PRIORITY_HIGH = 2;

    public static final int SCHED_PRIORITY_MEDIUM = 3;

    public static final int SCHED_PRIORITY_LOW = 4;

    /**
     * Status code for product activity.
     */
    public static final String STATUS_ACTIVE = "Active";

    /**
     * Status of a site_part.
     */
    public static final String DEINSTALLED = "Deinstalled";

    public static final String DISCONNECTED = "Disconnected";

    public static final String INSTALLED = "Installed";

    public static final String SUNRISEVOICE = "SunriseVoice";

    public static final String INPROGRESS = "In Progress";

    public static final String SUSPEND = "Suspend";

    public static final String SUSPENDED = "Suspended";

    public static final String UNSUSPEND = "Unsuspend";

    public static final String BLOCK = "block";

    public static final String UNBLOCK = "unblock";

    public static final String NONE = "none";

    /**
     * Default length of Cli.
     */
    public static final int DIGITS_10 = 10;

    /**
     * Cli check statues.
     */
    public static final String CLI_INSTALLEDONOTHERSITE = "InstalledOnOtherSite";

    public static final String CLI_INSTALLABLE = "Installable";

    public static final String CLI_UPDATABLE = "Updatable";

    public static final String CLI_INSTALLED = "Installed";

    public static final String CLI_INVALID = "Invalid";

    /**
     * action type for site_part for relocation.
     */
    public static final String REPLACE_CLI = "Replace CLI";

    public static final int PENDING = 0;

    /**
     * prefix for phone numbers from F�rstentum Lichtenstein.
     */
    public static final String CLI_075 = "075";

    /**
     * case severity codes.
     */
    public static final String CASE_SEVERITY_LOW = "3 Low Impact";
    public static final String CASE_SEVERITY_OTHER = "0 Other";

    /**
     * case condition codes.
     */
    public static final int CASE_CONDITION_OPEN = 2;

    /**
     * Contract Duration.
     */
    public static final int CONTRACT_DURATION_3 = 3;

    public static final int CONTRACT_DURATION_12 = 12;

    public static final int CONTRACT_DURATION_24 = 24;

    /**
     * Contract Reference JAM Reference date.
     */
    public static final int CONTRACT_REF_DATE_YEAR = 2001;

    public static final int CONTRACT_REF_DATE_MONTH = 6;

    public static final int CONTRACT_REF_DATE_DAY = 1;

    public static final int DOWNGRADE_REF_DATE_YEAR = 2009;

    public static final int DOWNGRADE_REF_DATE_MONTH = 1;

    public static final int DOWNGRADE_REF_DATE_DAY = 16;

    public static final int ETF_REF_DATE_YEAR = 2002;

    public static final int ETF_REF_DATE_MONTH = 3;

    public static final int ETF_REF_DATE_DAY = 1;

    public static final int GSM_ETF_300 = 300;

    public static final int GSM_ETF_400 = 400;

    public static final int GSM_ETF_450 = 450;

    public static final int GSM_ETF_550 = 550;

    public static final int GSM_UPDOWN_FEE_450 = 450;

    public static final int GSM_DOWNGRADE_FEE_250 = 250;

    public static final int GSM_UPDOWN_FEE_550 = 550;

    public static final int ADSL_UPDOWN_FEE_100 = 100;

    public static final int ROLLOVER_MINUS_2 = -2;

    public static final int RESP_ERR_MINUS_2 = -2;

    public static final String ZERO_AMOUNT = "0.00";

    /**
     * Relocation constants.
     */
    public static final long RELOCATION_EMAIL_TEMPLATE_ID = 52;

    public static final long SWISSCOM_REGULAR_EMAIL_TEMPLATE_ID = 53;

    public static final long SWISSCOM_ROLLBACK_EMAIL_TEMPLATE_ID = 88;

    /**
     * EBP constants.
     */
    public static final int EBP_CUSTOMER_SCORE = 999;

    public static final String EBP_EMAIL_REGISTRATION_NOTIFICATION_PDF = "EBP_RegEmailPDF";

    public static final String EBP_EMAIL_REGISTRATION_NOTIFICATION_LINK = "EBP_RegEmailLink";

    public static final String EBP_SMS_REGISTRATION_NOTIFICATION = "EBP_RegSMS";

    public static final String EBP_EMAIL_NOTIFICATION_ESR = "eBILLNotifEmailESR";
    public static final String EBP_EMAIL_NOTIFICATION_ESR_LINK = "eBILLNotifEmailESRLink";

    public static final String EBP_EMAIL_NOTIFICATION_PDF = "eBILLNotifEmailPDF";
    public static final String EBP_EMAIL_NOTIFICATION_PDF_LINK = "eBILLNotifEmailPDFLink";

    public static final String EBP_SMS_NOTIFICATION = "eBILLNotifSMS";

    /**
     * Default Partner ID.
     */
    public static final String NODEALER = "NoDealer";

    /**
     * department.
     */
    public static final String CALLCENTER_WIRELINE = "CallCenter Wireline";

    public static final String CUSTOMER = "C";

    public static final String PROSPECT = "P";

    /**
     * time_zone.
     */
    public static final String GMTPLUS1 = "GMT+1";

    /**
     * legal registration.
     */
    public static final int LEGAL_REG_DATE_YEAR = 2002;

    public static final int LEGAL_REG_DATE_MONTH = 11;

    public static final int LEGAL_REG_DATE_DAY = 1;

    /**
     * Relocation flags.
     */
    public static final int FLAG_PENDING = 0;

    public static final int FLAG_DONE = 1;

    public static final int FLAG_ADSL_PENDING = 3;

    public static final int ZIPCODE_LENGHT = 4;

    public static final int RELOCATION_EMAIL_ENTRY_LIST = 4;

    /**
     * Relocation action types.
     */
    public static final String ACT_TYPE_PRESERVE = "Preserve CLI";

    public static final String ACT_TYPE_DEINSTALL = "Deinstall CLI";

    public static final String ACT_TYPE_CONVERT = "Convert CLI";

    public static final String ACT_TYPE_REPLACE = "Replace CLI";

    /**
     * Maximum rows returned by JDBC template (spring).
     */
    public static final int JDBC_MAX_ROWS = 20000;

    /**
     * Payment card roles.
     */
    public static final String SUBSCRIBER = "Subscriber";

    public static final String ACCOUNT = "Account";

    public static final String REFILL_CATALOG_NAME = "Refill";

    /**
     * Prepaid CC Refill.
     */
    public static final String LI_TYPE_ONE_OFF_REFILL = "One-off CC Refill";

    public static final String LI_TYPE_RECUR_REFILL = "Recurring CC Refill";

    public static final String LI_NAME_ONE_OFF_REFILL = "One-off Prepaid CC Refill";

    public static final String LI_NAME_RECUR_REFILL = "Recurring Prepaid CC Refill";

    public static final String PREPAID_MSISDN_ATTR = "Prepaid MSISDN";

    public static final String SMS_REASON = "SMSReason";

    /**
     * Prepaid Via Post Refill.
     */
    public static final String LI_TYPE_PREVIAPOST_RECUR_REFILL = "Recurring Refill";

    public static final String LI_TYPE_PREVIAPOST_ONE_OFF_REFILL = "One-off Refill";

    public static final String LI_NAME_PREVIAPOST_RECUR_REFILL = "Recurring Prepaid Refill";

    public static final String LI_NAME_PREVIAPOST_ONE_OFF_REFILL = "One-off Prepaid Refill";

    /**
     * Misc.
     */
    public static final String SOFT_SUSPEND_REASON = "by eService";

    public static final int NO_0 = 0;

    public static final int NO_1 = 1;

    public static final int NO_2 = 2;

    public static final int NO_3 = 3;

    public static final int NO_4 = 4;

    public static final int NO_2000 = 2000;

    public static final String EXPIRED = "expired";

    public static final String ABOUT2EXPIRE = "about2expire";

    public static final String VALID = "valid";

    public static final String LIMITSREACHED = "limitsreached";

    public static final long EXPIRED_TMPLT_ID = 55;

    public static final long ABOUT2EXPIRE_TMPLT_ID = 54;

    public static final long LIMITSREACHED_TMPLT_ID = 67;

    /**
     * Line Check Eligibility SOAP Call.
     */
    public static final String OK = "00";

    public static final String CLI_NOT_FOUND = "01";

    public static final String ILLEGAL_STATE = "11";

    public static final String CUSTOMER_INACTIVE = "12";

    public static final String HAS_PENDING_ORDERS = "13";

    /**
     * Pending order with the submitted CLI found.
     */
    public static final String HAS_NEW_ORDER = "14";

    public static final String CONFLICT = "20";

    public static final String FXV_MISSING_COMPONENT_ERR = "21";

    public static final String MIGRATION_ADSL = "30";

    public static final String MIGRATION_ADSLCF = "31";

    public static final String MIGRATION_ADSL_CF = "32";

    public static final String MIGRATION_ADSL_VOIP = "33";

    public static final String FXV_TO_FXVBB_MIGRATION_INFO = "34";

    public static final String ALREADY_INSTALLED = "40";

    public static final String NOT_RESIDENTIAL = "41";

    public static final String PRODUCT_IN_PROGRESS = "45";

    public static final String HAS_PENDING_RELOCATION = "50";

    /**
     * XDSL ULL
     */
    public static final String CLI_ALREADY_XDSL = "60";

    public static final String NOT_XDSL_ENABLED = "61";

    public static final String ULL_NOT_INSTALLED = "62";

    public static final String PRODUCT_XDSL = "XDSLULL";

    /**
     * Lego International Plus.
     */
    public static final String INT_PLUS = " Int+";

    /**
     * Product Rules.
     */
    public static final String PRULE_NOT_COMPATIBLE = "Not compatible";

    public static final String PRULE_CUSTOMER_BASE = "Customer base";

    public static final String PRULE_MINIMUM_DURATION = "Minimum duration";

    public static final String PRULE_CUSTOMER_BASE_POSTPAID = "Postpaid";

    public static final String PRULE_CUSTOMER_BASE_PRONTO = "Pronto";

    public static final String PRULE_CUSTOMER_BASE_RESIDENTIAL = "Residential";

    public static final String PRULE_IS_DEINSTALLABLE = "Is Deinstallable";

    public static final String PRULE_AGE_CHECK = "Age Check";
    /*
     * Q8195 - R48 check if the product user is above age limit for availing SBB half fare option.
     */
    public static final String PRULE_AGE_MIN_CHECK = "Age Min Check";

    public static final String PRULE_NCOMPATIBLE_NACTION = "Not compatible No Action";
    
    public static final String PRULE_PARENT_DEPLETED = "Has parent depleted";

    /**
     * Product Groups as defined from Portals for Service Option management.
     */
    public static final String PORTALS_GROUP_POSTPAID = "Postpaid";

    public static final String PORTALS_GROUP_PREPAID = "Prepaid";

    public static final String PORTALS_GROUP_FIXNET = "Fixnet";

    public static final String PORTALS_GROUP_ULL = "ULL";

    public static final String PORTALS_GROUP_XDSLULL = "XDSLULL";

    /**
     * Opsc request action types.
     */
    public static final String OPSC_REQUEST_ADD = "Add";

    public static final String OPSC_REQUEST_RECONNECT = "Reconnect";

    public static final String OPSC_REQUEST_NEW = "New";

    public static final String OPSC_REQUEST_CEASE = "Cease";

    /**
     * OPSC error code and sms_template id.
     */
    public static final String OPSC_ERR_CODE_1 = "1";

    public static final String OPSC_ERR_CODE_2 = "2";

    public static final String OPSC_ERR_CODE_3 = "3";

    public static final String OPSC_ERR_CODE_4 = "4";

    public static final String OPSC_ERR_CODE_5 = "5";

    public static final String OPSC_ERR_CODE_6 = "6";

    public static final String OPSC_ERR_CODE_7 = "7";

    public static final String OPSC_ERR_CODE_8 = "8";

    public static final String OPSC_ERR_CODE_10 = "10";

    public static final String OPSC_ERR_CODE_11 = "11";

    public static final String SMS_TEPMPLATE_ID_34 = "34";

    public static final String SMS_TEPMPLATE_ID_35 = "35";

    public static final String SMS_TEPMPLATE_ID_36 = "36";

    public static final String SMS_TEPMPLATE_ID_37 = "37";

    public static final String SMS_TEPMPLATE_ID_38 = "38";

    public static final String SMS_TEPMPLATE_ID_39 = "39";

    public static final String SMS_TEPMPLATE_ID_40 = "40";

    public static final String SMS_TEPMPLATE_ID_41 = "41";

    public static final String SMS_TEPMPLATE_ID_42 = "42";

    public static final String SMS_TEPMPLATE_ID_43 = "43";

    public static final String SMS_TEPMPLATE_ID_44 = "44";

    public static final int X_TERM_REASON_LENGTH = 40;

    public static final String VOICE_MAIL_BOX_PREFIX = "086";

    /**
     * x_email_notification and x_sms_notification of a Site
     */
    public static final int NOTIFICATION_ENABLED = 1;
    public static final int NOTIFICATION_DISABLED = 0;
    public static final String EMPTY_STRING = "";

    /**
     * Part Status reason.
     */

    public static final String MIGRATION_SKIP_PROVISIONING = "MIGRATION_SKIP";

    public static final String MIGRATION_COMPONENTS_ONLY = "MIGRATION_COMPONENTS";
    
    public static final String PROVISIONED = "Provisioned";

    /**
     * return codes for AuthenticateCrmUser.
     */
    public static final String AUTH_OK = "0";

    public static final String AUTH_USER_NOT_FOUND = "1";

    public static final String AUTH_PASSWORD_INCORRECT = "2";

    public static final String AUTH_USER_NOT_ACTIVE = "3";

    public static final String AUTH_PASSWORD_EXPIRED = "4";

    public static final String AUTH_WITH_NO_LOGIN = "0";

    /**
     * return codes for table_user.
     */
    public static final String USER_IS_ACTIVE = "1";

    /**
     * Slim SIM related.
     */
    public static final String SLIM_SIM_MAXIMUM_NUMBER = "MaxSlimSimNumber";

    public static final String SLIM_SIM_DISPLAYED_TEXT = "SlimSimDisplayedText";

    public static final String REFERENCE_CLI = "Reference CLI";

    public static final String ARB_PREFIX = "CLI";

    public static final String ARB_CLI = "CLI";

    public static final String SKIP_SWISSCOM = "Skip Swisscom";

    public static final String SKIP_CPS_SWISSCOM = "Skip CPS Swisscom";

    public static final String SKIP_ARB_SWISSCOM = "Skip ARB Swisscom";

    public static final String SKIP_LDAP = "SkipLDAP";

    public static final String SKIP_ACS = "SkipACS";

    // proc inst data for the xml to be enqueued to Vitria
    public static final String RESULT_DATA_NAME = "XML";

    // proc inst data for the xml returned from Arbor
    public static final String ARBOR_RESPONSE = "ARBOR_RESP_";

    // proc inst data for the xml sent from Arbor
    public static final String ARBOR_REQUEST = "ARBOR_REQ_";

    public static final String SAP_REQUEST = "SAP_REQUEST";
    public static final String SAP_RESPONSE = "SAP_RESPONSE";

    // proc inst data for the ONP queue
    public static final String RESULT_DATA_QUEUE_ONP = "ONP";

    public static final String RESULT_DATA_QUEUE_XIP = "XIP";

    public static final String ARBOR_DATA_QUEUE = "CFYARBPROVOUT";

    public static final String XIP_DATA_QUEUE = "CFYXIPOUT";

    public static final String SAP_DATA_QUEUE = "CFYSAPPROVOUT";
    
    public static final String SAP_INSTALMENT_QUEUE = "CFYSAPPROVOUT-STRIPMEOUT";
    
    public static final String SAP_PREPAYMENT_QUEUE = "CFYSAPPROVOUT-SAP_DEPOSIT";
    
    public static final String SAP_BBKING_QUEUE = "CFYSAPPROVOUT-BBKING";
    
    public static final String REFILL_QUEUE = "Q_INT_PBP_TO_CRM";
    
    public static final String BOA_QUEUE = "CFYBOAOUT";

    /**
     * Bill type Residential-Details, check table_x_gbst_elm.
     */
    public static final String BILL_TYPE_RESIDENTIAL_DETAILS = "Residential-Details";

    // default x_threshold values for field x_threshold_default
    public static final int THRESHOLD_DEFAULT = 999;

    // This was fixed for R19.3. This constant will be re-factored for R19.4.
    public static final String PNCRM01 = "PCRMX01";

    // value of x_inv_threshold_id when threshold is 5 CHF
    public static final int INV_THRESHOLD_ID_5CHF = 1;

    /**
     * Line separator.
     */
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");

    /**
     * Reseller migration related.
     */
    public static final String RESELLER_MIGRATION = "Reseller Migration";

    /**
     * 
     * */
    public static final int PRICE_CONVERSION = 100;

    /**
     * interaction values
     */
    public static final String AUTOMATIC_INTERACT = "automatic interaction";
    public static final String CREATED_BY_INTERFACE = "created by interface";

    /**
     * Defines status flag for interface.obsolete_billing_accounts. (= tracking table for billing account
     * termination)
     */
    public enum BillAccTermStatus {
        CANDIDATE("C"), SENT("S"), TERMINATED("T"), ERROR("E"), REJECTED_CLARIFY("RC"), REJECTED_ARBOR("RA");

        private String status;

        BillAccTermStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return status;
        }
    }

    /**
     * Constant for table_x_dms_doc. Related to TPV.
     */
    public static final String TPV_ID = "TPVID";

    /**
     * Constant for table_x_dms_doc. Related to TPV.
     */
    public static final String TPV = "TPV";

    /**
     * Constant to be set in Order notes log.
     */
    public static final String LETTER_SENT_LOG = "Sending cease confirmation letter...";

    /**
     * identifier of micro SIM SIMs handsets.
     */
    public static final String MICRO_SIM = "MIC";

    /**
     * id of pending cease order (saved as proc_inst_data).
     */
    public static final String PENDING_ORDER = "PendingOrder";

    /***********************************************************************
     * "SIM", "SIM Card" & "SIM Card Replacement" part number attribute names.
     * 
     * @author correia
     * @since R31.0, Q6219, 10.02.2011
     **********************************************************************/
    public static final String MSISDN_TYPE = "MSISDN Type";
    public static final String MSISDN = "MSISDN";
    public static final String MSISDN_CATEGORY = "MSISDN Category";
    public static final String IMSI = "IMSI";
    public static final String HLR = "HLR";
    public static final String ICCID = "ICCID";
    public static final String PIN1 = "PIN1";
    public static final String PUK1 = "PUK1";
    public static final String CARD_TYPE = "Card Type";
    public static final String SIM = "SIM";
    public static final String EID = "eID";
    public static final String BUSINESS_SIM_CARD = "Business SIM Card";
    public static final String ESIM_DEVICE_IMEI = "eSIM Device IMEI";
    public static final String ESIM_DEVICE_VENDOR = "eSIM Device Vendor";
    public static final String ESIM_DEVICE_MODEL = "eSIM Device Model";
    public static final String LIST_PRICE = "List price";
    public static final String DISCOUNT = "Discount";
    public static final String WAIT_CUST_CALL = "Wait customer call";
    // Device Plan
    public static final String SERIAL_NO = "Serial No";
    public static final String SAP_MAT_ID = "SAP Material ID";
    public static final String DESCRIPTION = "Description";    
    /**
     * Order global notification proc instance data name.
     */
    public static final String NOTIFICATION_MSG_ID = "Notification Msg Id";
    public static final String NOTIFICATION_MSG_PARAM = "Notification Msg Param ";

    /**
     * Dynamic Voice Rate Plan Attribute Name and Default Price Plan
     */

    public static final String DYNAMIC_VOICE_PRICE_PLAN = "Dynamic Voice Price Plan";
    public static final String DYNAMIC_VOICE_DEFAULT_PRICE_PLAN = "Default Price Plan";
    public static final String DYNAMIC_VOICE_INTERNATIONAL_ACCESS = "Business standard international access";

    public static final String POSHANDSET = "POS Handset";
    public static final String IMEI = "IMEI";

    public static final String EQUIPMENT = "Equipment";

    /**
     * Message template placeholder prefix and suffix for Case and Order Status Notification templates.
     */
    public static final String TEMPLATE_PLACEHOLDER_PREFIX = "$";
    public static final String TEMPLATE_PLACEHOLDER_SUFFIX = "";
    public static final String DEVICEPLANHARDWARE = "Device Plan Hardware";
    public static final String DEVICEPLAN = "Device Plan";  
    public static final String ACCESSORYPLANHARDWARE = "Accessory Plan Hardware";
    public static final String ACCESSORYPLAN = "Accessory Plan";  
    
    /**
     * Project Q8976 MTV Phase Out changes 
     * 
     */
    public static final String  SUNRISE_YOUNG_HOME = "Sunrise Young home";
    public static final String  SUNRISE_YOUNG_WORLD = "Sunrise Young world";
    public static final String  SUNRISE_PREP_YOUNG_WHATSAPP = "Sunrise Prep Young WhatsApp";
    public static final String  YOUNG_HOME_CONTRACT = "Young home Contract";
    public static final String  SUNRISE_YOUNG_TV_START = "Sunrise Young TV start";
    public static final String  SUNRISE_YOUNG_TV_COMFORT = "Sunrise Young TV comfort";
    public static final String  SUNRISE_YOUNG_TV_MAX = "Sunrise Young TV max";
    public static final String YOUNG_INTERNET_BASE_OPTIONS = "Young Internet Base Options";
    public static final String YOUNG_TV_BASE_OPTIONS = "Young TV Base Options";
    
 
    /**
     * Project Q9057 rocket.2
     * 
     */
    
    public static final String SUNRISE_HOME_CONTRACT = "Sunrise Home Contract";
	public static final String NO_WP_Co1 = "No WP.CO1";
	public static final String ORDER_ULL_WITHOUT_CONTRACT = "ORDER_ULL_WITHOUT_CONTRACT";
	
	public static final String SAP_CREDITNOTE_QUEUE="CFYSAPPROVOUT-SAP_CREDIT";
	
	 /**
     * CR 31325 Output request for Child Subscript Phase 2 
     * 
     */
	public static final String NO_APPLICABLE = "Not Applicable";
    public static final String AGENT_HANDLING = "Agent Handling";
    public static final String AUTO_MIGRATION = "Auto Migration";
    public static final String CEASE_RAT = "Cease";
    public static final String PARENT_SERIAL_NO = "ParentSerialNo";
    public static final String CHILD_HANDLING_OPTION = "ChildHandlingOption";
    
    /**
     * CR 31617 Fiber process: Deduct if OTO- or BEP-ready
     * 
     */
	public static final String OTOREADY = "OTOREADY";
	public static final String NO_OTO = "NO OTO";
	public static final String OTO_ID_State = "OTO-ID State";
	public static final String OtoIDState = "OtoIdState";
	
	/**
	 * Project 686147 id checker consolidation PHS1
	 * */
	public static final String  APPLICATION_CLARIFY = "CLARIFY";
    /**
     * you cannot create one of these.
     */
    private Const() {
    }
}
