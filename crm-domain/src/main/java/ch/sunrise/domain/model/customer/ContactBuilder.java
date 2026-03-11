package ch.sunrise.domain.model.customer;

public class ContactBuilder {
    private String objid;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public ContactBuilder objid(String objid) {
        this.objid = objid;
        return this;
    }

    public ContactBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactBuilder email(String email) {
        this.email = email;
        return this;
    }

    public ContactBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public Contact build() {
        return new Contact(objid, firstName, lastName, email, phone);
    }
}
