package ch.sunrise.domain.model.common;

public record AttributeDefinition(
        String objid,
        String name,
        String dataType,
        String defaultValue,
        UomType uomType) {

}
