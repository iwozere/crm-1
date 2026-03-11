package ch.sunrise.domain.model.customer;

import ch.sunrise.domain.annotation.MappedFrom;
import java.util.List;

@MappedFrom("DaSite")
public record Customer(
        String objid,
        String siteId,
        String name,
        List<ContactRole> contactRoles) {

    public Customer withObjid(String objid) {
        return new Customer(objid, siteId, name, contactRoles);
    }
}
