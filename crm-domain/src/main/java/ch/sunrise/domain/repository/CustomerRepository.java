package ch.sunrise.domain.repository;

import ch.sunrise.domain.model.customer.Customer;
import java.util.Optional;

public interface CustomerRepository {
    Optional<Customer> findById(String objid);
    Customer save(Customer customer);
}
