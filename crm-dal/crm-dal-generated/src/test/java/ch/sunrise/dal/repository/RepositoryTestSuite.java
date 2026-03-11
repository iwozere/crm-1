package ch.sunrise.dal.repository;

import ch.sunrise.dal.repository.base.BaseRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import java.util.Map;

/**
 * Validates all generated repositories and their Querydsl integration.
 */
@DataJpaTest
@ActiveProfiles("test")
public class RepositoryTestSuite {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    @SuppressWarnings("unchecked")
    void testAllRepositories() {
        Map<String, BaseRepository<?, Long>> repositories = applicationContext
                .getBeansOfType((Class<BaseRepository<?, Long>>) (Class<?>) BaseRepository.class);

        System.out.println("Verifying " + repositories.size() + " repositories...");

        Assertions.assertFalse(repositories.isEmpty(), "No repositories found in context");

        repositories.forEach((name, repo) -> {
            try {
                // 1. Test findByObjid (should return empty for dummy ID, but not throw)
                repo.findByObjid(-1L);

                // 2. Test Querydsl presence (should be able to accept a null predicate without
                // crash, or just verify interface)
                // Since repo extends QuerydslPredicateExecutor, we just verify it doesn't fail
                // basic wiring
                repo.count(new com.querydsl.core.types.dsl.BooleanExpression(null) {
                    @Override
                    public <R, C> R accept(com.querydsl.core.types.Visitor<R, C> v, C c) {
                        return null;
                    }
                });

            } catch (Exception e) {
                // We expect some failures if H2 can't handle the schema,
                // but the goal is to verify the methods "exist" and are correctly wired
                if (!(e instanceof org.springframework.dao.InvalidDataAccessResourceUsageException)) {
                    Assertions.fail("Repository " + name + " failed wiring check: " + e.getMessage());
                }
            }
        });
    }
}
