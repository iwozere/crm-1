Moving the system to a single-project architecture with **Hibernate 6** and **Java 25** is a pragmatic choice. It simplifies the deployment and leverages Spring Boot’s "Opinionated" configuration to manage the legacy ID complexity without extra project overhead.

In this model, your "Data Access Project" effectively becomes a **package** (e.g., `com.yourcompany.persistence`) within the main project.

---

# Technical Requirements: Hibernate 6 & Java 25 Migration

## 1. Runtime Environment

* **JDK:** Java 25 (LTS).
* **Framework:** Spring Boot 3.4+ (required for stable Java 25 & Hibernate 6.6+ support).
* **Platform:** Oracle 19c.
* **Threading:** Virtual Threads enabled via `spring.threads.virtual.enabled=true`.
* **Maven Repository:** `d:\tools\.m2` (Configured local repository).

## 2. Persistence Layer Configuration

Instead of a separate project, the persistence layer will be a dedicated module/package within the application.

### A. Entity Mapping Strategy

* **Hybrid Truth:** Use Hibernate’s introspection for physical column mapping, but use the `ADP_%` JSON metadata to guide the generation of **One-to-Many** and **Many-to-One** associations.
* **Modern DTOs:** All read-only projections must use **Java Records** to minimize memory footprint and leverage Java 25’s "Compact Object Headers."
* **LOB Handling:** Oracle `CLOB` and `BLOB` must be mapped using `java.sql.Clob` or `@Lob String` with lazy loading enabled to prevent heap exhaustion.

### B. Custom Identity Generation (The "Pre-Insert" Bridge)

Since Hibernate cannot use standard auto-increment for your legacy IDs, the project must implement a **Custom Identifier Generator**.

* **Mechanism:** Extend Hibernate’s `IdentifierGenerator`.
* **Implementation:** * The generator will call the Oracle function `sa.pkg_oid.nextval_by_name(type_name)`.
* It must support **Manual Override**: If an ID is already set on the entity, the generator should use it; otherwise, it calls the Oracle package.


* **Optimistic Locking:** Every entity must include a `@Version` field (typically `NUMBER`) to prevent lost updates in the multi-user legacy environment.

## 3. Business Service Layer (Unit of Work)

* **Transaction Boundary:** Defined at the `@Service` level using Spring’s `@Transactional`.
* **Batching Performance:** * Set `hibernate.jdbc.batch_size` (recommended: 30-50).
* Set `hibernate.order_inserts` and `hibernate.order_updates` to `true` to allow Hibernate to group legacy ID inserts into single JDBC batches.



---

## 4. Automation Requirements for the Agent

The Agent must provide a generator (e.g., a Maven plugin or a standalone CLI) that performs the following:

1. **Parse ADP JSON:** Read table names, legacy sequence names, and relationship metadata.
2. **Generate Entities:** * Create `@Entity` classes with the `@GenericGenerator` pointing to your legacy ID service.
* Ensure `@Id` is **not** marked as `GeneratedType.IDENTITY` or `SEQUENCE` but uses your custom generator.


3. **Generate Repositories:** Create standard `JpaRepository` interfaces for each table defined in the JSON.
4. **Flexible Constructor Usage:** In Java 25, the generator should produce constructors that allow pre-initialization logic before the `super()` call if complex legacy state-checks are required.

---

## 5. Oracle-Specific Optimizations

| Feature | Setting / Requirement |
| --- | --- |
| **Fetch Size** | Set `hibernate.jdbc.fetch_size` to `100` (Oracle default of `10` is too low). |
| **Statement Caching** | Enable `oracle.jdbc.implicitStatementCacheSize` via HikariCP properties. |
| **Dialect** | Explicitly use `org.hibernate.dialect.OracleDialect` (Hibernate 6 automatically detects 19c features). |

---

## 6. Project Structure (Single Project)

```text
root
 ├── src/main/java
 │    ├── ch.sunrise.dal.config          # Hibernate & Transaction Config
 │    ├── ch.sunrise.dal.entity          # GENERATED: Entities & Repositories
 │    │    └── generator                 # ObjidGenerator class
 │    ├── ch.sunrise.dal.service         # Business Logic
 │    └── ch.sunrise.dal.web             # Controllers / API
 └── src/main/resources
      └── metadata                # ADP_% JSON files

```

### Next Step

**Would you like me to write the Java 25 code for the `LegacyIdentifierGenerator`?** This class is the "heart" of your migration—it connects Hibernate's save process to your Oracle ID package.