package sunrise.crm.domain.enums;

/**
 * These types are use in HFC provisioning process. 
 * Clarify got many KAFKA messages and need to notify the correct process step.
 * Use in indexing of order process's attribute 
 * @author KumarAb
 *
 */
public enum HFCProcessIndexType {
    
	VOICE_ADD("voiceAdd"),
	VOICE_TMP_ADD("voiceTmpAdd"),
	VOICE_TRANSFER("voiceTransfer"),
	VOICE_REMOVE("voiceRemove"),
	VOICE_CHANGE_ADDRESS("voiceChangeAddress"),
    VOICE_CHANGE_OWNER("voiceChangeOwner"),
    VOICE_RELOC("voiceReloc"),
    VOICE_SUSPEND("voiceSuspend"),
    VOICE_UNSUSPEND("voiceUnsuspend"),
    VOICE_MODIFY("voiceModify"),
    
    INTERNET_CREATE("inetCreate"),
    INTERNET_CEASE("inetCease"),
    INTERNET_MODIFY("inetModify"),
    IPV4("ipV4"),
    INTERNET_CHANGE_OWNER("inetChangeOwner"),
    INTERNET_RELOC("inetReloc"),
    INTERNET_SUSPEND("inetSuspend"),
    INTERNET_UNSUSPEND("inetUnsuspend"),
	ADD_CPE("addCpe"),
	REMOVE_CPE("removeCpe"),
	
	// Below enums are not specific to HFC, Its added for OTT Voice.
	OTTVOICE_ADD("ottvoiceAdd") ,
	OTTVOICE_REMOVE("ottvoiceRemove"),
	OTTVOICE_SUSPEND("ottvoiceSuspend"),
	OTTVOICE_UNSUSPEND("ottvoiceUnsuspend"),
	OTTVOICE_RELOCATE("ottvoiceRelocate") ,
	OTTVOICE_MODIFY("ottvoiceModify") ,
	OTTVOICE_TRANSFER("ottvoiceTransfer") ;

	private String displayValue;
    
    private static final java.util.Map<String, HFCProcessIndexType> ENUM_CONSTANTS = new java.util.HashMap<>();
    
    static {
        for (HFCProcessIndexType enumValue: HFCProcessIndexType.values()) {
        	HFCProcessIndexType.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    private HFCProcessIndexType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static HFCProcessIndexType fromDisplayValue(final String displayValue) {
    	HFCProcessIndexType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid HFC process Index type: " + displayValue);
    }


}
