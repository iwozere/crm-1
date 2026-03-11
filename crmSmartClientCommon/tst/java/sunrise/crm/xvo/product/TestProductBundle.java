package sunrise.crm.xvo.product;

import java.util.Calendar;

import org.testng.annotations.Test;

import com.google.gson.Gson;

public class TestProductBundle {

    @Test
    public void testToJson() {
    	
    	XProdBundleDefInfoVo b = new XProdBundleDefInfoVo();
    	b.setBundleId("My OTT+OTT bundle");
    	b.setCreateDate(Calendar.getInstance());
    	b.setDescription("Netflix Standard or Premium and Disney+ Standard or premium");
    	b.setEndDate(Calendar.getInstance());
    	b.setObjid("00000001");
    	b.setStartDate(Calendar.getInstance());
    	b.setStatus("ACTIVE");
    	
    	XProdBundleItemDefInfoVo bi1 = new XProdBundleItemDefInfoVo();
    	bi1.setBundlingStartDate(Calendar.getInstance());
    	bi1.setDescription("Netflix Standard or Premium");
    	bi1.setMain(true);
    	bi1.setObjid("1234567");
    	bi1.setPromoName("PM_12345_Netflix Bundled");
    	bi1.setStatus("ACTIVE");
    	
    	XProdBundleItemEligibilityInfoVo e1 = new XProdBundleItemEligibilityInfoVo();
    	e1.setObjid("1");
    	e1.setProductName("Netflix");
    	e1.setRatePlan("Netflix Standard");
    	
    	XProdBundleItemEligibilityInfoVo e2 = new XProdBundleItemEligibilityInfoVo();
    	e2.setObjid("2");
    	e2.setProductName("Netflix");
    	e2.setRatePlan("Netflix Premium");
    	
    	bi1.getEligibility().add(e1);
    	bi1.getEligibility().add(e2);
    	
    	
    	XProdBundleItemDefInfoVo bi2 = new XProdBundleItemDefInfoVo();
    	bi2.setBundlingStartDate(Calendar.getInstance());
    	bi2.setDescription("Disney+ Standard or Premium");
    	bi2.setMain(false);
    	bi2.setObjid("1111111");
    	bi2.setPromoName("PM_11111_Disney+ Bundled");
    	bi2.setStatus("ACTIVE");
    	
    	XProdBundleItemEligibilityInfoVo e3 = new XProdBundleItemEligibilityInfoVo();
    	e3.setObjid("3");
    	e3.setProductName("Disney+");
    	e3.setRatePlan("Disney+ Standard");
    	
    	XProdBundleItemEligibilityInfoVo e4 = new XProdBundleItemEligibilityInfoVo();
    	e4.setObjid("4");
    	e4.setProductName("Disney+");
    	e4.setRatePlan("Disney+ Premium");
    	
    	bi2.getEligibility().add(e3);
    	bi2.getEligibility().add(e4);
    	
    	b.getItems().add(bi1);
    	b.getItems().add(bi2);
    	
    	System.out.println(new Gson().toJson(b));
    }
}