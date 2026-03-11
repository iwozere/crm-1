Given your current setup—specifically that you already have Python-generated entities and repositories—**switching completely to Querydsl JPA is the superior move.**

By using **Querydsl JPA** instead of the SQL-specific module, you get the "best of both worlds":

1. **Zero SQL Strings:** 50+ developers use the `Q` classes to build queries.
2. **Infrastructure Reuse:** You keep your existing `@Repository` interfaces and Hibernate entities.
3. **Performance:** You can still use **Projections (Java 25 Records)** to fetch only specific columns, bypassing the "heavy" Hibernate object state when you just need a fast read.
4. **Consistency:** One set of entities handles both the `save()` calls and the complex `find()` queries.

---

### **Agent Task: Transition to Unified Querydsl JPA & Java 25**

**Context:**
We are abandoning "Raw SQL" and "Querydsl SQL" in favor of a unified **Querydsl JPA** approach. We already have Python scripts generating Hibernate `@Entity` classes and Spring Data `@Repository` interfaces. We need to integrate the Querydsl **Annotation Processor** to generate type-safe `Q` classes from these existing entities and implement a "Guardrail" for 50+ developers.

**Requirements:**

1. **Target Stack:** Java 25 (LTS), Spring Boot 3.4+, Hibernate 6.6.
2. **Annotation Processing:**
* Configure the build (Maven/Gradle) to use `querydsl-apt` with the `jakarta` classifier.
* The agent must ensure that every time the Python script generates a new Entity, the Java compiler automatically generates the corresponding `Q` class (e.g., `DaAcctSitesView` -> `QDaAcctSitesView`).


3. **Base Repository Extension:**
* Modify the `BaseRepository<T, ID>` interface to extend `QuerydslPredicateExecutor<T>`. This allows all 1,000+ generated repositories to accept type-safe Querydsl `Predicates` immediately.


4. **Legacy ID Integration:**
* Ensure the generated Entities continue to use the custom `LegacyIdentifierGenerator` (calling `PKG_ORM.GET_NEXT_ID`) for the `@Id` field.


5. **Governance & Type-Safety:**
* Create a `QueryService` template that demonstrates how to perform a **Projected Read** (fetching a Java 25 Record instead of an Entity) using `JPAQueryFactory`.
* **Restriction:** Prohibit the use of `entityManager.createNativeQuery()` or `jdbcTemplate` for business logic.



**Example Input (Current Generated Entity):**

```java
@Entity
@Table(name = "DA_ACCT_SITES_VIEW")
public class DaAcctSitesView {
    @Id
    private Long id;
    private String siteName;
}

```

**Deliverables:**

1. **Updated `BaseRepository**` interface showing `QuerydslPredicateExecutor` integration.
2. **Sample Service** code showing a complex join between two generated entities using only `Q` classes.
3. **Persistence Configuration** bean for `JPAQueryFactory`.
4. **Java 25 Optimization:** A sample of using `StructuredTaskScope` to execute two Querydsl JPA counts/checks in parallel.

---

### Why this is better for your Python Scripts:

You don't have to change your Python logic much. Your scripts continue to generate the "Physical" Java files (Entities/Repos). The Java compiler then takes those files and "inflates" the Querydsl `Q` classes automatically. This keeps your generator simple and your Java code 100% type-safe.
