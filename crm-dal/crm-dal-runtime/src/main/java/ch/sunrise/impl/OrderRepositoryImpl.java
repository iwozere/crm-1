package ch.sunrise.impl;

import ch.sunrise.dal.entity.DaContract;
import ch.sunrise.domain.model.order.Order;
import ch.sunrise.domain.repository.OrderRepository;
import ch.sunrise.mapper.OrderMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    @PersistenceContext
    private EntityManager em;

    private final OrderMapper mapper;
    private final OrderAuditService auditService;

    public OrderRepositoryImpl(OrderMapper mapper, OrderAuditService auditService) {
        this.mapper = mapper;
        this.auditService = auditService;
    }

    @Override
    public Optional<Order> findById(String objid) {
        DaContract entity = em.find(DaContract.class, Long.valueOf(objid));
        return Optional.ofNullable(entity).map(mapper::toDomain);
    }

    @Override
    @Transactional
    public Order save(Order domain) {
        DaContract entity;
        if (domain.objid() == null) {
            entity = new DaContract();
            // ID handled by generator or manual call if needed
            em.persist(entity);
        } else {
            entity = em.find(DaContract.class, Long.valueOf(domain.objid()));
            if (entity == null) {
                entity = new DaContract();
                entity.setObjid(Long.valueOf(domain.objid()));
                em.persist(entity);
            }
        }

        mapper.toEntity(domain, entity);
        
        reconcileItems(domain, entity);
        
        return mapper.toDomain(entity);
    }

    private void reconcileItems(Order domain, DaContract entity) {
        if (entity.getContract2ContrSchedule() == null) return;
        
        var existingItems = entity.getContract2ContrSchedule().stream()
                .flatMap(s -> s.getSchedule2ContrItm().stream())
                .toList();
        
        List<String> domainIds = domain.lineItems().stream()
                .map(ch.sunrise.domain.model.order.LineItem::objid)
                .filter(java.util.Objects::nonNull)
                .toList();

        // Audit physical deletes
        existingItems.stream()
                .filter(item -> item.getObjid() != null && !domainIds.contains(item.getObjid().toString()))
                .forEach(item -> {
                    auditService.logDeletion("DaContrItm", item.getObjid().toString(), "Removed from Order " + entity.getId());
                    // em.remove(item); // Physical delete after audit
                });
    }
}
