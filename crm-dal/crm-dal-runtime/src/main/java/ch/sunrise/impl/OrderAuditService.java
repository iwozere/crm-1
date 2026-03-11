package ch.sunrise.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderAuditService {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void logDeletion(String entityType, String objid, String context) {
        // High-priority audit log for physical deletes
        System.out.println("AUDIT: Physical DELETE of " + entityType + " with ID " + objid + " | Context: " + context);
    }

    public void logChange(String message) {
        System.out.println("AUDIT: " + message);
    }
}
