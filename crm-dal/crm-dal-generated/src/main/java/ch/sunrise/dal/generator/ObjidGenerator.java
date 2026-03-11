package ch.sunrise.dal.generator;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.sql.CallableStatement;
import java.sql.Types;

/**
 * Custom identifier generator for legacy Clarify-style OBJIDs.
 * Calls Oracle function sa.pkg_oid.nextval_by_name(type_name).
 */
public class ObjidGenerator implements IdentifierGenerator {

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        // Check if the object already has an ID (Manual Override support)
        Object id = session.getEntityPersister(null, object).getIdentifier(object, session);
        if (id != null && (id instanceof Number && ((Number) id).longValue() > 0)) {
            return id;
        }

        String entityName = session.getEntityPersister(null, object).getEntityName();
        String className = entityName.substring(entityName.lastIndexOf('.') + 1);
        String typeName = className.startsWith("Da") ? className.substring(2).toLowerCase() : className.toLowerCase();

        // Ensure the type name matches the legacy table name expected by the Oracle
        // package
        if (typeName.startsWith("table")) {
            typeName = typeName.substring(5); // Remove "table" prefix if present
            if (typeName.startsWith("_")) {
                typeName = typeName.substring(1);
            }
        }

        final String finalTypeName = typeName;

        try {
            return session.doReturningWork(connection -> {
                try (CallableStatement call = connection.prepareCall("{ ? = call sa.pkg_oid.nextval_by_name(?) }")) {
                    call.registerOutParameter(1, Types.NUMERIC);
                    call.setString(2, finalTypeName);
                    call.execute();
                    return call.getLong(1);
                }
            });
        } catch (Exception e) {
            throw new HibernateException("Error calling sa.pkg_oid.nextval_by_name for type: " + finalTypeName, e);
        }
    }
}
