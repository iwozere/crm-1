# Project Specification: Hibernate Migration (DAL)

## Overview
This project aims to automate the migration of a legacy ORM to a modern Hibernate 6.6 / Spring Data JPA layer. The migration is driven by relational metadata (exported to JSON) to ensure 100% accuracy and consistency across 2000+ entities.

## Technical Stack
- **Languages**: Java 21 (LTS), Python 3.13 (Generator scripts)
- **Frameworks**: Spring Boot 3.4.0, Spring Data JPA, Hibernate 6.6.1.Final, Querydsl 5.1 (Jakarta)
- **Database**: Oracle (Legacy Schema)
- **Build Tool**: Maven (Local `mvn.cmd` with JDK 21 from `d:\tools\jdk-21.0.9`)

## Core Architectural Patterns

### 1. Naming Conventions
- **Entity Classes**: All generated entity classes must be prefixed with `Da` (e.g., `DaCase`, `DaContact`).
- **Repositories**: All repository interfaces must be named `{EntityName}Repository` (e.g., `DaCaseRepository`).
- **Fields**: Oracle snake_case columns are mapped to Java camelCase fields.
- **Sanitization**: 
    - Java keywords are escaped if they appear in fields (e.g., `xAbstract`).
    - Collisions between data columns and relationship names are handled by suffixing the data column (e.g., `userId` -> `userIdField`).

### 2. Identity & State Management
- **Primary Key**: All entities use the `objid` field as `@Id`.
- **Identity Generation**: Custom `ObjidGenerator` calling Oracle sequence provider: `sa.pkg_oid.nextval_by_name(table_name)`.
- **Versioning**: Legacy `dev` field is ignored and not used for Hibernate `@Version`.

### 3. Entity Hierarchy
- **BaseEntity**: A `@MappedSuperclass` providing common fields (`objid`, `dev` - though `dev` is ignored for versioning).
- **Entities**: All entities extend `BaseEntity`.
- **Views**: Metadata-identified views are marked as `@Immutable` to prevent write operations.

### 4. Relationship Mapping
- **MTO (Many-to-One)**: Standard `@ManyToOne` with `@JoinColumn`.
- **OTM (One-to-Many)**: Standard `@OneToMany` with `mappedBy`.
- **MTM (Many-to-Many)**: 
    - Guided by `ADP_MTM_STRUCTURE.json`.
    - Uses `@ManyToMany` and `@JoinTable` with physical join table names.
    - Owners are determined lexically or via metadata hints.

### 5. Persistence Layer (Repositories)
- **BaseRepository<T, ID>**: A custom Spring Data `@NoRepositoryBean` interface.
    - Extends `JpaRepository<T, ID>` and `QuerydslPredicateExecutor<T>`.
    - Provides `findByObjid(ID)` and `findByObjids(Iterable<ID>)` as type-safe aliases.
- **Generated Repositories**: Every entity gets a repository interface extending `BaseRepository`.

### 6. Query Architecture (Querydsl JPA)
- **Type-Safety**: Using generated `Q` classes for all entities in `target/generated-sources`.
- **Projections**: Utilizing Java Records (e.g., `SiteSummaryRecord`) via `Projections.constructor` for efficient read-only operations.
- **Service Layer**: `QueryService` provides a template for complex joins and parallel execution.

## Implementation Workflow
1. **Metadata Extraction**: `scripts/export_adp_data.py` connects to Oracle and dumps `ADP_OBJECT`, `ADP_FIELD`, `ADP_RELATION`, and `ADP_MTM_STRUCTURE` to JSON.
2. **Code Generation**: `scripts/generate_entities_from_json.py` consumes JSON and generates `.java` source files in a case-sensitive, consistent manner.
3. **Verification**: Automated compilation checks and relationship symmetry validation.

## Strategic Objectives
- **Zero Manual Mapping**: No manual edits to generated files. 
- **Isolation**: Keep DAL separate from Business Services to allow "force-regeneration" without logic loss.
- **Performance**: Use `@BatchSize` and LAZY fetching by default to avoid legacy graph bloat.
