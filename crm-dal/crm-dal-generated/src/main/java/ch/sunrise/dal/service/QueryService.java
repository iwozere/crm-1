package ch.sunrise.dal.service;

import ch.sunrise.dal.dto.SiteSummaryRecord;
import ch.sunrise.dal.entity.QDaBusOrg;
import ch.sunrise.dal.entity.QDaSite;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryService {

        private final JPAQueryFactory queryFactory;

        /**
         * Demonstrates a projected read using a Java 25 Record.
         * This bypasses the Hibernate entity state for maximum performance.
         */
        @Transactional(readOnly = true)
        public List<SiteSummaryRecord> findSitesByOrgName(String orgName) {
                QDaBusOrg org = QDaBusOrg.daBusOrg;
                QDaSite site = QDaSite.daSite;

                return queryFactory
                                .select(Projections.constructor(
                                                SiteSummaryRecord.class,
                                                site.objid,
                                                site.name))
                                .from(site)
                                .join(site.primary2BusOrg, org)
                                .where(org.name.containsIgnoreCase(orgName))
                                .fetch();
        }

        /**
         * Demonstrates parallel execution using Java 21 StructuredTaskScope (commented
         * out for stability).
         */
        /*
         * public void performParallelChecks(Long orgId) {
         * QDaBusOrg org = QDaBusOrg.daBusOrg;
         * QDaSite site = QDaSite.daSite;
         * 
         * try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
         * StructuredTaskScope.Subtask<Boolean> orgExistsTask = scope.fork(() ->
         * queryFactory.selectOne().from(org).where(org.objid.eq(orgId)).fetchFirst() !=
         * null);
         * 
         * StructuredTaskScope.Subtask<Long> siteCountTask = scope.fork(() ->
         * queryFactory.select(site.count()).from(site).where(site.primary2BusOrg().
         * objid.eq(orgId)).fetchOne());
         * 
         * scope.join().throwIfFailed();
         * 
         * boolean exists = orgExistsTask.get();
         * Long count = siteCountTask.get();
         * 
         * System.out.println("Org exists: " + exists + ", Site count: " + count);
         * } catch (Exception e) {
         * throw new RuntimeException("Parallel check failed", e);
         * }
         * }
         */
}
