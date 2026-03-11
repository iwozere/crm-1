package sunrise.crm.domain.enums;

import java.util.Arrays;

public enum CacheRefreshEntityType {
	PART_NUM("part_num"),
	CAMPAIGN("campaign"),
	PROD_BUNDLES("prod_bundle");

	private final String value;

	CacheRefreshEntityType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static CacheRefreshEntityType fromDisplayValue(String displayValue) {
		return Arrays.stream(CacheRefreshEntityType.values()).filter(t -> t.value.equals(displayValue)).findFirst().orElse(null);
	}
}

