package sunrise.crm;

import java.util.Arrays;
import java.util.List;

public interface PricingAttribute {

    static final List<String> VALID_CONTAINERS = Arrays.asList("GSM Contract", "ULL Contract", "Subscription Contract", "Site Global Contract", "Home Protect Contract", "OTT Contract");

    static final List<String> INVALID_CONTAINERS = Arrays.asList(
            "Equipment", 
            "Instalments", 
            "Charge List", 
            "Credit List", 
            "First Bill", 
            "Final Bill", 
            "Discount List", 
            "mygroup", 
            "Sunrise Residential Email", 
            "Lookout Licenses",
            "One-off Prepaid Refill",
            "One-off Prepaid CC Refill",
            "Recurring Prepaid Refill",
            "UPC2SUN Email Product");

	String UOM_CHF = "CHF";
    String UOM_PERCENT = "percent";

    String UOM_TYPE_PERCENTAGE = "Percentage";
    String UOM_TYPE_MONETARY = "Monetary";
    
    String ATTR_NET_PRICE = "Net Price";
    String ATTR_BASE_FEE = "Base fee";
    String ATTR_ONE_TIME_FEE = "One time fee";

    String ATTR_PRICE = "Price";
    String ATTR_AMOUNT = "Amount";
    String ATTR_AMOUNT_CHF = "Calculated Amount CHF";
    String ATTR_AMOUNT_PERC = "Amount perc";
    String ATTR_INVOICE_ITEM_DESCRIPTION = "Invoice Item Description";
    String ATTR_DURATION = "Duration";
    String ATTR_DISCOUNTED_PRICE = "DiscountedPrice";
    String ATTR_CONTRACT_DURATION = "ContractDuration";
    String ATTR_DISCOUNT = "Discount";
    
    String QUOTATION_ORDER_ID = "Quotation Order ID";
    String PARENT_ORDER_ID = "Parent Order ID";
}
