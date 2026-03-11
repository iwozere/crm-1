package sunrise.crm.domain.enums;


public enum CaseTypeInfo {    
    
    MOBILE_ONP_ETF_REFUND("Adjustment", "Mobile ONP ETF refund", "*"),
    UNDEFINED_CASE_TYPE("Undefined", "Undefined", "Undefined");
    
    private String type;
    private String subtype;
    private String detail;
    
    
    private CaseTypeInfo(String type, String subtype, String detail) {
        this.type = type;
        this.subtype = subtype;
        this.detail = detail;
    }
    
    public static CaseTypeInfo fromValues(String type, String subtype, String detail) {
        for (CaseTypeInfo enumValue : CaseTypeInfo.values()) {
            boolean firstMatch = eqWithAst(enumValue.type, type) && eqWithAst(enumValue.subtype, subtype)  && eqWithAst(enumValue.detail, detail);
            if (firstMatch) {
                return enumValue;
            }
        }
        return UNDEFINED_CASE_TYPE;
    }
        
    private static boolean eqWithAst(String enValue, String realValue) {
        return "*".equals(enValue) || enValue.equals(realValue);
    }


    public String getType() {
        return type;
    }

    public String getSubtype() {
        return subtype;
    }

    public String getDetail() {
        return detail;
    }
    
    public String getLevel1() {
        return type;
    }

    public String getLevel2() {
        return subtype;
    }

    public String getLevel3() {
        return detail;
    }    
    

}
