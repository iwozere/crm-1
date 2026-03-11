package sunrise.crm.domain.enums;

import java.util.Arrays;

public enum CacheRefreshEventType {
	FULL("full"), INCREMENTAL("incremental");

	private final String value;

	CacheRefreshEventType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static CacheRefreshEventType fromDisplayValue(String displayValue) {
		return Arrays.stream(CacheRefreshEventType.values()).filter(t -> t.value.equals(displayValue)).findFirst().orElse(null);
	}
}
