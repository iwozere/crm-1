package ch.sunrise.domain.model.common;

import java.util.Optional;

/**
 * Single-file implementation of Unit of Measure using Java 21 Sealed
 * Interfaces.
 */
public sealed interface UomType {

    // 1. Monetary Category
    enum Monetary implements UomType {
        CHF;

        public static Optional<Monetary> parse(String code) {
            try {
                return Optional.of(valueOf(code.toUpperCase()));
            } catch (Exception e) {
                return Optional.empty();
            }
        }
    }

    // 2. Volume Category
    enum Volume implements UomType {
        KB, MB, GB, TB;

        public static Optional<Volume> parse(String code) {
            try {
                return Optional.of(valueOf(code.toUpperCase()));
            } catch (Exception e) {
                return Optional.empty();
            }
        }
    }

    // 3. Percentage Category
    enum Percentage implements UomType {
        // RATIO, // 0.0 - 1.0
        Percent; // 0 - 100

        public static Optional<Percentage> parse(String code) {
            try {
                return Optional.of(valueOf(code.toUpperCase()));
            } catch (Exception e) {
                return Optional.empty();
            }
        }
    }

    // Static helper for global lookup
    static UomType fromString(String category, String code) {
        return switch (category.toLowerCase()) {
            case "monetary" -> Monetary.valueOf(code.toUpperCase());
            case "volume" -> Volume.valueOf(code.toUpperCase());
            case "percentage" -> Percentage.valueOf(code.toUpperCase());
            default -> throw new IllegalArgumentException("Unknown category: " + category);
        };
    }
}