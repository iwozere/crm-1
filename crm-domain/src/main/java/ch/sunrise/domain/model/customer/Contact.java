package ch.sunrise.domain.model.customer;

import ch.sunrise.domain.annotation.MappedFrom;

@MappedFrom("DaContact")
public record Contact(
        String objid,
        String firstName,
        String lastName,
        String email,
        String phone) {

    public Contact withObjid(String objid) {
        return new Contact(objid, firstName, lastName, email, phone);
    }
}
