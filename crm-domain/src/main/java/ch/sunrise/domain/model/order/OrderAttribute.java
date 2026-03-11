package ch.sunrise.domain.model.order;

import java.time.LocalDate;

public record OrderAttribute(
                String objid,
                String name,
                String value,
                LocalDate dateValue) {
}
