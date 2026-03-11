package ch.sunrise.domain.model.common;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum PartClassification {
    TV("TV"),
    OTT_TV("OTT TV"),
    VOICE("Voice"),
    INTERNET("Internet"),
    HZN_TV("HZN TV"),
    WIFI_POD("WIFI POD"),
    OTT_SERVICE("OTT Service"),
    FIXNET("Fixnet"),
    MOBILE("Mobile"),
    OTT_VAS("OTT VAS"),
    OTT_BUNDLE("OTT Bundle"),
    SECURITY("Security");

    private final String displayValue;

    public static final List<PartClassification> TV_SERVICES = Arrays.asList(TV, OTT_TV, HZN_TV, OTT_VAS, OTT_BUNDLE);

    public static final List<String> TV_SERVICES_STR = Arrays.asList(TV.toString(), OTT_TV.toString(), HZN_TV.toString(),
            OTT_VAS.toString(), OTT_BUNDLE.toString());

    private static final Map<String, PartClassification> LOOKUP = Map.copyOf(
            Stream.of(values()).collect(Collectors.toMap(
                    type -> type.displayValue.toUpperCase(),
                    type -> type)));

    PartClassification(final String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }

    /**
     * Finds the PartClassification by its display value (case-insensitive).
     *
     * @param displayValue The display value to look up.
     * @return An Optional containing the PartClassification if found, or empty
     *         otherwise.
     */
    public static Optional<PartClassification> fromDisplayValue(String displayValue) {
        return Optional.ofNullable(displayValue)
                .map(String::toUpperCase)
                .map(LOOKUP::get);
    }

    /**
     * @deprecated Use {@link #getDisplayValue()}
     */
    @Deprecated
    public String value() {
        return displayValue;
    }
}
