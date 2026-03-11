package ch.sunrise.mapper;

import ch.sunrise.dal.entity.DaContact;
import ch.sunrise.dal.entity.DaContactRole;
import ch.sunrise.dal.entity.DaSite;
import ch.sunrise.domain.model.customer.Contact;
import ch.sunrise.domain.model.customer.ContactRole;
import ch.sunrise.domain.model.customer.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {

    @Mapping(target = "objid", expression = "java(site.getObjid().toString())")
    @Mapping(target = "siteId", source = "siteId")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "contactRoles", source = "site2ContactRole")
    Customer toDomain(DaSite site);

    @Mapping(target = "objid", expression = "java(role.getObjid().toString())")
    @Mapping(target = "roleName", source = "roleName")
    @Mapping(target = "contact", source = "contactRole2Contact")
    @Mapping(target = "defaultRole", source = "roleName", qualifiedByName = "isDefaultRole")
    ContactRole toContactRole(DaContactRole role);

    @Mapping(target = "objid", expression = "java(contact.getObjid().toString())")
    @Mapping(target = "email", source = "EMail")
    Contact toContact(DaContact contact);

    @Named("isDefaultRole")
    default boolean isDefaultRole(String roleName) {
        return "Default".equalsIgnoreCase(roleName);
    }
}
