package sunrise.crm.custom;

import sunrise.crm.util.CrmStringUtil;

public enum Upc2SunFinancialMapping {

	/**
	 * UPC bill delivery channel, UPC pay method, Sunrise payment method, Sunrise bill medium, IBAN required, PID required (eBill), Invoice as attachment or via link.
	 */
    BM_1("PayNet",                     "Acceptgiro",     "EBPP Bank",           "NP", "Bank",  false, true, false),
    BM_2("YellowBill",                 "Acceptgiro",     "EBPP Bank",           "NP", "Bank",  false, true, false),
    BM_3("Invoice sent through post",  "Acceptgiro",     "Blue Slip",           "P",  null,    false, false, false),
    BM_4("e-mail",                     "Acceptgiro",     "Blue Slip",           "NP", "eBill", false, false, false),
    BM_5("Online",                     "Acceptgiro",     "Blue Slip",           "NP", "eBill", false, false, false),
    BM_6("e-mail",                     "Direct Debit",   "Direct Debit (Bank)", "NP", "eBill", true,  false, false),
    BM_7("Invoice sent through post",  "Direct Debit",   "Direct Debit (Bank)", "P",  null,    true,  false, false),
    BM_8("Online",                     "Direct Debit",   "Direct Debit (Bank)", "NP", "eBill", true,  false, false),
    BM_9("e-mail",                     "Lastschrift",    "Direct Debit (Bank)", "NP", "eBill", true,  false, false),
    BM_10("Invoice sent through post", "Lastschrift",    "Direct Debit (Bank)", "P",  null,    true,  false, false),
    BM_11("Online",                    "Lastschrift",    "Direct Debit (Bank)", "NP", "eBill", true,  false, false),
    BM_12("e-mail",                    "Debito Credito", "Direct Debit (Bank)", "NP", "eBill", true,  false, false),
    BM_13("Invoice sent through post", "Debito Credito", "Direct Debit (Bank)", "P",  null,    true,  false, false),
    BM_14("Online",                    "Debito Credito", "Direct Debit (Bank)", "NP", "eBill", true,  false, false),
    BM_15("e-mail",                    "Prelevement",    "Direct Debit (Bank)", "NP", "eBill", true,  false, false),
    BM_16("Invoice sent through post", "Prelevement",    "Direct Debit (Bank)", "P",  null,    true,  false, false),
    BM_17("Online",                    "Prelevement",    "Direct Debit (Bank)", "NP", "eBill", true,  false, false),
    BM_18("Invoice not sent",          "Acceptgiro",     "Blue Slip",           "NP", "eBill", true,  false, true),
    BM_19("Invoice not sent",          "Direct Debit",   "Direct Debit (Bank)", "NP", "eBill", true,  false, true),
    BM_20("Invoice not sent",          "Lastschrift",    "Direct Debit (Bank)", "NP", "eBill", true,  false, true),
    BM_21("Invoice not sent",          "Debito Credito", "Direct Debit (Bank)", "NP", "eBill", true,  false, true),
    BM_22("Invoice not sent",          "Prelevement",    "Direct Debit (Bank)", "NP", "eBill", true,  false, true);

    public final String invoiceChannel;
    public final String payMethod;
    public final String xPaymentMethod;
    public final String xbillMedium;
    public final String xNPChannel;
    public final boolean xIBAN;
    public final boolean pid;
    public final boolean isInvoiceViaLink;

    Upc2SunFinancialMapping(String invoiceChannel, String payMethod, String xPaymentMethod, String xbillMedium, String xNPChannel, boolean xIBAN, boolean pid, boolean isInvoiceViaLink) {
        this.invoiceChannel = invoiceChannel;
        this.payMethod = payMethod;
        this.xPaymentMethod = xPaymentMethod;
        this.xbillMedium = xbillMedium;
        this.xNPChannel = xNPChannel;
        this.xIBAN = xIBAN;
        this.pid = pid;
        this.isInvoiceViaLink = isInvoiceViaLink;
    }

    public static Upc2SunFinancialMapping getMapping(String deliveryChannel, String paymentType){
		String channel = CrmStringUtil.stripAccents(deliveryChannel);
		String payment = CrmStringUtil.stripAccents(paymentType);

		for (Upc2SunFinancialMapping mapping : Upc2SunFinancialMapping.values()) {
			if (mapping.invoiceChannel.equalsIgnoreCase(channel) && mapping.payMethod.equalsIgnoreCase(payment)) {
				return mapping;
			}
		}
    	return null;
    }

    public static String getPaymentMethod(String deliveryChannel, String paymentType, String iban){
		String sunrisePaymentMethod = null;
		Upc2SunFinancialMapping ret = getMapping(deliveryChannel, paymentType);
		String payment = CrmStringUtil.stripAccents(paymentType);
		if (ret != null
				&& CrmStringUtil.isNotBlank(iban)
				&& "Direct Debit (Bank)".equalsIgnoreCase(ret.xPaymentMethod)
				&& "09000".equals(iban.substring(4, 9))){
			sunrisePaymentMethod = "Direct Debit (Post)";
		}
    	return sunrisePaymentMethod;
    }
}
