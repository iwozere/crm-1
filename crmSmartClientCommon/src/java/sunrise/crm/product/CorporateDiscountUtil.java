package sunrise.crm.product;

import java.util.ArrayList;

public class CorporateDiscountUtil {
	
	public static final String NET_PRICE_LEVEL= "Net Price Level - ";

	// This map store minimum count of products and discount level 
	public static Object DISCOUNT_LEVEL_MAP[][] = {
			// {minimum count of product , discount level },
			{3, "B0"},
			{10, "B1"},
			{20, "B2"},
			{30, "B3"},
			{40, "B4"},
			{50, "B5"},
			{100, "E1"},
			{200, "E2"},
			{300, "E3"},
			{400, "E4"},
			{500, "E5"}, 
			};
	
	 /**
     * Loop each records of DISCOUNT_LEVEL_MAP.
     * if no. of product count is greater or equal than first attribute add discount level
     * @param productCount
     * @return list of discount level
     */
	public static ArrayList<String> getDiscountLevels(int productCount) {
        ArrayList<String> discLevelList = new ArrayList<String>();
        
        for (int i = 0; i < DISCOUNT_LEVEL_MAP.length; i++) {
        	if(productCount>=(int)DISCOUNT_LEVEL_MAP[i][0])
        		discLevelList.add((String) DISCOUNT_LEVEL_MAP[i][1]);
        }
        
        return discLevelList;
    }
	
	public static String getDiscountLevel(String discountLevelDisplayName) {
		return discountLevelDisplayName.replace(NET_PRICE_LEVEL, "");
	}
	
	public static String getDiscountLevelDisplayName(String discountLevel) {
		return NET_PRICE_LEVEL+discountLevel;
	}

}
