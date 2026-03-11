package ch.sunrise.domain.model.customer;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Customer Language.
 */
public enum CustomerLanguage {

    GERMAN(1, "German", "de", "deu", "D"),
    FRENCH(2, "French", "fr", "fra", "F"),
    ITALIAN(3, "Italian", "it", "ita", "I"),
    ENGLISH(4, "English", "en", "eng", "E");

    private final int id;
    private final String displayValue;
    private final String isoCode2;
    private final String isoCode3;
    private final String abbreviation;

    private static final Map<String, CustomerLanguage> LOOKUP = Map.copyOf(
            Stream.of(values()).collect(Collectors.toMap(
                    type -> type.displayValue.toUpperCase(),
                    type -> type)));

    private static final Map<String, CustomerLanguage> ISO2_LOOKUP = Map.copyOf(
            Stream.of(values()).collect(Collectors.toMap(
                    type -> type.isoCode2.toUpperCase(),
                    type -> type)));

    CustomerLanguage(int id, String displayValue, String isoCode2, String isoCode3, String abbreviation) {
        this.id = id;
        this.displayValue = displayValue;
        this.isoCode2 = isoCode2;
        this.isoCode3 = isoCode3;
        this.abbreviation = abbreviation;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }

    @Override
    public String toString() {
        return getDisplayValue();
    }

    /**
     * Finds the CustomerLanguage by its display value (case-insensitive).
     *
     * @param displayValue The display value to look up.
     * @return An Optional containing the CustomerLanguage if found, or empty
     *         otherwise.
     */
    public static Optional<CustomerLanguage> fromDisplayValue(String displayValue) {
        return Optional.ofNullable(displayValue)
                .map(String::toUpperCase)
                .map(LOOKUP::get);
    }

    /**
     * Finds the CustomerLanguage by its ISO-2 code (case-insensitive).
     *
     * @param isoCode2 The ISO-2 code to look up.
     * @return An Optional containing the CustomerLanguage if found, or empty
     *         otherwise.
     */
    public static Optional<CustomerLanguage> fromIsoCode2(String isoCode2) {
        return Optional.ofNullable(isoCode2)
                .map(String::toUpperCase)
                .map(ISO2_LOOKUP::get);
    }

    /**
     * Finds the CustomerLanguage by its display value. Returns GERMAN if not found.
     */
    public static CustomerLanguage fromDisplayValueNoException(String displayValue) {
        return fromDisplayValue(displayValue).orElse(GERMAN);
    }

    public static CustomerLanguage getDefault() {
        return GERMAN;
    }

    public String getName() {
        return displayValue;
    }

    public int getId() {
        return id;
    }

    public String getIsoCode() {
        return isoCode3;
    }

    public String getShortIsoCode() {
        return isoCode2;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static CustomerLanguage fromIdNoException(int id) {
        return Stream.of(values())
                .filter(cl -> cl.id == id)
                .findFirst()
                .orElse(GERMAN);
    }
}
