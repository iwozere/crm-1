package ch.sunrise.domain.model.customer;

import ch.sunrise.domain.annotation.MappedFrom;

@MappedFrom("DaContactRole")
public record ContactRole(
        String objid,
        String roleName,
        Contact contact,
        boolean defaultRole) {
}
