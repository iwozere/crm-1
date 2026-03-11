package ch.sunrise.domain.model.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerBuilder {
    private String objid;
    private String siteId;
    private String name;
    private List<ContactRole> contactRoles = new ArrayList<>();

    public CustomerBuilder objid(String objid) {
        this.objid = objid;
        return this;
    }

    public CustomerBuilder siteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    public CustomerBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder contactRoles(List<ContactRole> contactRoles) {
        this.contactRoles = contactRoles;
        return this;
    }

    public CustomerBuilder addContactRole(ContactRole role) {
        this.contactRoles.add(role);
        return this;
    }

    public Customer build() {
        return new Customer(objid, siteId, name, contactRoles);
    }
}
