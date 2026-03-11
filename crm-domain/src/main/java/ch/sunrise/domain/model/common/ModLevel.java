package ch.sunrise.domain.model.common;

import java.time.LocalDateTime;
import java.util.List;

public record ModLevel(
                String objid,
                String revision, // mod_level and s_mod_level fields
                String linkPartNum,
                boolean isActive,
                LocalDateTime effectiveDateTime,
                LocalDateTime endDateTime,
                List<AttributeDefinition> attributes) {

}
