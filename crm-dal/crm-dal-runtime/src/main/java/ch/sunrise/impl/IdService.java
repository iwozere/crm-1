package ch.sunrise.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class IdService {

    @PersistenceContext
    private EntityManager em;

    public Long getNextId(String typeName) {
        Query query = em.createNativeQuery("SELECT sa.pkg_oid.nextval_by_name(?) FROM DUAL");
        query.setParameter(1, typeName);
        Object result = query.getSingleResult();
        if (result instanceof BigDecimal) {
            return ((BigDecimal) result).longValue();
        }
        return ((Number) result).longValue();
    }
}
