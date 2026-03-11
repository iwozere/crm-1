package ch.sunrise.domain.model.product;

import java.time.LocalDate;

public record ProductAttribute(
                String objid,
                String name,
                String value,
                LocalDate dateValue) {
}
