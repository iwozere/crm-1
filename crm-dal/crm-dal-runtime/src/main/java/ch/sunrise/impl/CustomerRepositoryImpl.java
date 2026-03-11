package ch.sunrise.impl;

import ch.sunrise.dal.entity.DaSite;
import ch.sunrise.domain.model.customer.Customer;
import ch.sunrise.domain.repository.CustomerRepository;
import ch.sunrise.mapper.CustomerMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @PersistenceContext
    private EntityManager em;

    private final CustomerMapper mapper;

    public CustomerRepositoryImpl(CustomerMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Optional<Customer> findById(String objid) {
        DaSite entity = em.find(DaSite.class, Long.valueOf(objid));
        return Optional.ofNullable(entity).map(mapper::toDomain);
    }

    @Override
    public Customer save(Customer customer) {
        // Basic implementation for reference
        DaSite entity;
        if (customer.objid() == null) {
            entity = new DaSite();
            em.persist(entity);
        } else {
            entity = em.find(DaSite.class, Long.valueOf(customer.objid()));
            if (entity == null) {
                entity = new DaSite();
                entity.setObjid(Long.valueOf(customer.objid()));
                em.persist(entity);
            }
        }
        
        // Site field updates would go here
        entity.setName(customer.name());
        entity.setSiteId(customer.siteId());
        
        return mapper.toDomain(entity);
    }
}
