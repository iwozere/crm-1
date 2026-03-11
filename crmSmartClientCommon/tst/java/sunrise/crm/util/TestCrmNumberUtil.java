package sunrise.crm.util;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestCrmNumberUtil {

	@Test public void testIsNumericOnlyDecimalDigits() {
		boolean numeric = CrmNumberUtil.isNumeric(".1");
		assertTrue(numeric, ".1 is not numeric");
	}
}