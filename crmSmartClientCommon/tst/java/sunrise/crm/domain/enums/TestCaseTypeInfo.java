package sunrise.crm.domain.enums;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import sunrise.crm.domain.enums.CaseTypeInfo;


public class TestCaseTypeInfo extends AssertJUnit {
    
    @Test
    public void testPositive() {
        CaseTypeInfo caseType = CaseTypeInfo.fromValues("Adjustment", "Mobile ONP ETF refund", "Add");
        assertEquals(CaseTypeInfo.MOBILE_ONP_ETF_REFUND , caseType);
        
        caseType = CaseTypeInfo.fromValues("Adjustment", "Mobile ONP ETF refund", "Whatever");
        assertEquals(CaseTypeInfo.MOBILE_ONP_ETF_REFUND , caseType);
    }
    
    @Test
    public void testNegative() {
       CaseTypeInfo caseType = CaseTypeInfo.fromValues("Nonexisting", "Case", "Type");
       assertEquals(CaseTypeInfo.UNDEFINED_CASE_TYPE, caseType);               
    }

}
