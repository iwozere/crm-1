# CRM Domain Specification

## Overview

The `crm-domain` module defines the core business model for the Sunrise CRM/OMS system.
It is pure Java, zero-dependency, and contains only Records, Interfaces, and domain invariants.
All objects in this module are immutable Java Records unless stated otherwise.

---

## Reference Data (Read-Only)

Reference data is maintained externally (via scripts or admin tooling) and consumed by the CRM
as read-only. The CRM does not own the lifecycle of these objects. They are cached in memory
by `crm-cache` and refreshed automatically when changes are detected.

### `PartNum`

Represents a product definition — the catalogue entry for an installable product or service.

| Field           | Type             | Description                                           |
|-----------------|------------------|-------------------------------------------------------|
| `objid`         | `long`           | Surrogate primary key                                 |
| `partNumId`     | `String`         | Business identifier of the part number                |
| `description`   | `String`         | Human-readable description                            |
| `billingConfig` | `BillingConfig`  | Billing configuration embedded within the part number |
| `modLevels`     | `List<ModLevel>` | All associated mod levels (versions)                  |

**Business Rules:**
- A `PartNum` may have multiple `ModLevel` entries but exactly one with `status = ACTIVE`
  at any point in time.
- The active `ModLevel` is guaranteed by external scripts; the CRM trusts the data as-is.
- `BillingConfig` is inherited transitively by any `SitePart` linked to a `ModLevel`
  of this `PartNum`.
- At runtime, before installation, only the active `PartNum` with its active `ModLevel`
  is selected.

---

### `ModLevel`

Represents a specific version of a `PartNum`. `LineItem` and `SitePart` reference
`ModLevel` directly by `objid`.

| Field           | Type                 | Description                                             |
|-----------------|----------------------|---------------------------------------------------------|
| `objid`         | `long`               | Surrogate primary key (FK in `LineItem` and `SitePart`) |
| `version`       | `String`             | Version identifier                                      |
| `status`        | `ModLevelStatus`     | `ACTIVE` or `INACTIVE`                                  |
| `partNum`       | `PartNum`            | Parent part number                                      |
| `attributeDefs` | `List<AttributeDef>` | Attribute definitions valid for this mod level          |

**Business Rules:**
- Exactly one `ModLevel` per `PartNum` may have `status = ACTIVE` at any time.
- This constraint is enforced externally. The CRM reads and trusts the active state.
- `LineItem` and `SitePart` reference `ModLevel` by `objid`.

---

### `AttributeDef`

Defines a named attribute that is valid for a given `ModLevel`. Attributes present on an
`Order` or `LineItem` whose names match an `AttributeDef` will be provisioned into
`x_part_attribute_value` by the CRM Provisioning task.

| Field         | Type      | Description                        |
|---------------|-----------|------------------------------------|
| `objid`       | `long`    | Surrogate primary key              |
| `attrName`    | `String`  | Attribute name (matching key)      |
| `description` | `String`  | Human-readable description         |
| `required`    | `boolean` | Whether the attribute is mandatory |

**Business Rules:**
- Attributes on `Order` and `LineItem` whose names match an `AttributeDef` are considered
  *installable* and will be written to `x_part_attribute_value`.
- Attributes with no matching `AttributeDef` are retained on the order/line item but
  are not provisioned to product attribute tables.
- The filtering logic lives in the **CRM Provisioning** task (`crm-be-tasks`), not in
  the domain.

---

### `BillingConfig`

Billing configuration embedded within a `PartNum`. Cached as part of the `PartNum` object.
Inherited by all `SitePart` instances linked to a `ModLevel` of this `PartNum`.

| Field        | Type                  | Description                             |
|--------------|-----------------------|-----------------------------------------|
| `objid`      | `long`                | Surrogate primary key                   |
| `configData` | `Map<String, String>` | Billing system configuration parameters |

**Notes:**
- Provisioned to the billing system by the **Billing Provisioning** task (`crm-be-tasks`).
- Accessed via: `sitePart → modLevel → partNum → billingConfig`.

---

### `ProductDefinition`

Represents a hierarchical product template (`x_product` in the legacy schema). Each node
in the tree is linked to a `PartNum` and defines cardinality and installability rules for
that component within the product. Parent-child relationships between nodes are stored in
the `x_product_qty` join table. The tree is navigated top-down only.

A `PartNum` may appear in multiple `ProductDefinition` trees with different rules.

**Cache note:** `ProductDefinition` trees are fully pre-loaded and cached in memory by
`crm-cache`. There is no `ProductDefinitionRepository` — all access is via the cache.

| Field          | Type                      | Description                                                      |
|----------------|---------------------------|------------------------------------------------------------------|
| `objid`        | `long`                    | Surrogate primary key                                            |
| `type`         | `ProductDefinitionType`   | `TOP` for the subscription container node, `ITEM` for all others |
| `partNum`      | `PartNum`                 | The part number this node represents                             |
| `minOnProduct` | `int`                     | Minimum instances required in the product                        |
| `maxOnProduct` | `int`                     | Maximum instances allowed in the product                         |
| `maxOnOrder`   | `int`                     | Maximum instances allowed per order                              |
| `installable`  | `boolean`                 | Whether this component produces a `SitePart` on install          |
| `children`     | `List<ProductDefinition>` | Child nodes in the product hierarchy (via `x_product_qty`)       |

**Business Rules:**
- The node with `type = TOP` represents the subscription container and maps to the
  topmost `SitePart` created on a `CREATION` order.
- `installable = true` means a `LineItem` referencing this node's `PartNum` will produce
  a corresponding `SitePart` during CRM Provisioning.
- At runtime, only the active `PartNum` and its active `ModLevel` are selected before
  installation.
- Cardinality constraints are validated when building or submitting an order. Validation
  logic lives in `crm-be-tasks` or `crm-shared`.
- The same `PartNum` may appear in multiple `ProductDefinition` trees with different
  cardinality and installability settings.
- The tree is navigated top-down only; no parent reference is stored on the node.

---

## Core Aggregates (CRM-Owned)

### `Order` (Aggregate Root)

Represents a customer order. Also referred to as `contract` in the legacy schema (`x_contract`).
Linked to an `IpContract` which tracks subscription-level contract terms.

| Field        | Type                   | Description                                          |
|--------------|------------------------|------------------------------------------------------|
| `objid`      | `long`                 | Surrogate primary key                                |
| `orderId`    | `String`               | Business order identifier                            |
| `orderType`  | `OrderType`            | `CREATION`, `MODIFICATION`, `CANCELLATION`           |
| `status`     | `OrderStatus`          | Current lifecycle status of the order                |
| `ipContract` | `IpContract`           | Associated subscription contract                     |
| `lineItems`  | `List<LineItem>`       | Line items belonging to this order                   |
| `attributes` | `List<OrderAttribute>` | Order-level attributes (`attr2contract` link in DB)  |

**Business Rules:**
- An `Order` of type `CREATION` triggers creation of a subscription-level `SitePart`
  (the product container), performed by the CRM Provisioning task.
- Order-level attributes (`attr2contract`) are provisioned to the topmost `SitePart`
  only when the order is a creation order.
- All orders for a given subscription are linked to the same `IpContract`.

---

### `IpContract`

Represents the subscription contract. One `IpContract` exists per subscription.
All orders for that subscription reference it. Linked to the topmost `SitePart` via
an MTM relationship, simplified to a single reference in the domain model.

| Field           | Type        | Description                                            |
|-----------------|-------------|--------------------------------------------------------|
| `objid`         | `long`      | Surrogate primary key                                  |
| `contractRef`   | `String`    | Business contract reference                            |
| `startDate`     | `LocalDate` | Contract start date                                    |
| `endDate`       | `LocalDate` | Contract end date (nullable)                           |
| `bindingMonths` | `Integer`   | Binding duration in months (nullable)                  |
| `sitePart`      | `SitePart`  | Linked subscription-level `SitePart` (simplified MTM)  |

**Business Rules:**
- Created once when the first creation order for a subscription is processed.
- Shared across all subsequent orders for the same subscription.
- The underlying MTM table normally contains exactly one row; the domain model
  simplifies this to a direct reference.

---

### `LineItem`

Represents a single product or service line within an order. References `ModLevel`
directly by `objid`. Installability is resolved from the `ProductDefinition` node
for the referenced `PartNum` at runtime — it is not stored on the line item itself.

| Field        | Type                   | Description                                                  |
|--------------|------------------------|--------------------------------------------------------------|
| `objid`      | `long`                 | Surrogate primary key                                        |
| `modLevelId` | `long`                 | FK to `ModLevel.objid`                                       |
| `modLevel`   | `ModLevel`             | Resolved reference to mod level (transitively `PartNum`)     |
| `attributes` | `List<OrderAttribute>` | Line item-level attributes (`attr2line_itm` link in DB)      |

**Business Rules:**
- Whether a `LineItem` is installable is determined by the `ProductDefinition` node
  for its `PartNum` (`ProductDefinition.installable`), resolved at runtime.
- Installable line items produce a corresponding `SitePart` during CRM Provisioning.
- Line item attributes (`attr2line_itm`) are provisioned to the corresponding `SitePart`.
- Only attributes matching an `AttributeDef` of the referenced `ModLevel` are written
  to `x_part_attribute_value`. Others are retained but not provisioned.

---

### `OrderAttribute`

A single named attribute attached to either an `Order` or a `LineItem`. Both levels share
the same structure and are stored in the same table. The owning side is identified by
exactly one of two mutually exclusive FK columns (`attr2contract` or `attr2line_itm`).

| Field       | Type                 | Description                                               |
|-------------|----------------------|-----------------------------------------------------------|
| `objid`     | `long`               | Surrogate primary key                                     |
| `attrName`  | `String`             | Attribute name                                            |
| `attrValue` | `String`             | Attribute value                                           |
| `ownerType` | `AttributeOwnerType` | `CONTRACT` (order-level) or `LINE_ITEM` (line item-level) |

**Notes:**
- `ownerType = CONTRACT` → `attr2contract` FK is set in DB.
- `ownerType = LINE_ITEM` → `attr2line_itm` FK is set in DB.
- These two FKs are mutually exclusive — exactly one is populated per row.
- Whether an attribute is provisioned to `x_part_attribute_value` is determined by
  matching `attrName` against `AttributeDef.attrName` for the relevant `ModLevel`.
  This filtering is performed by the CRM Provisioning task.

---

### `SitePart`

Represents an installed product instance in the CRM/OMS (`site_part` table). Created and
owned by the CRM. Organized in a self-referencing hierarchy (`site_part2site_part`).

| Field        | Type             | Description                                                      |
|--------------|------------------|------------------------------------------------------------------|
| `objid`      | `long`           | Surrogate primary key                                            |
| `modLevelId` | `long`           | FK to `ModLevel.objid`                                           |
| `modLevel`   | `ModLevel`       | Resolved mod level (transitively `PartNum` and `BillingConfig`)  |
| `parent`     | `SitePart`       | Parent in hierarchy (null for subscription root)                 |
| `children`   | `List<SitePart>` | Child site parts (charges, discounts, sub-services)              |
| `ipContract` | `IpContract`     | Linked subscription contract (topmost node only, simplified MTM) |

**Business Rules:**
- The topmost `SitePart` (subscription container) is created by the CRM Provisioning task
  when a `CREATION` order is processed.
- The topmost `SitePart` is linked to the `IpContract`.
- Each installable `LineItem` corresponds to a `SitePart` at a lower level in the hierarchy.
- The hierarchy represents component relationships: service/sub-service, charge/discount.
- `BillingConfig` is resolved via `sitePart → modLevel → partNum → billingConfig` and
  provisioned to the billing system by the Billing Provisioning task.

---

## Repository Interfaces

All repository interfaces are defined in `crm-domain`. Implementations live in
`crm-dal-runtime`. Reference data repositories are read-only.

```java
// --- Reference Data (read-only) ---

public interface PartNumRepository {
    Optional<PartNum> findById(long objid);
    Optional<PartNum> findByPartNumId(String partNumId);
    Optional<ModLevel> findActiveModLevel(long partNumObjid);
    List<PartNum> findAll();
}

// --- CRM-Owned Aggregates ---

public interface OrderRepository {
    Optional<Order> findById(long objid);
    Optional<Order> findByOrderId(String orderId);
    List<Order> findByIpContract(long ipContractObjid);
    Order save(Order order);
    void updateStatus(long objid, OrderStatus status);
}

public interface IpContractRepository {
    Optional<IpContract> findById(long objid);
    Optional<IpContract> findBySubscriptionSitePart(long sitePartObjid);
    IpContract save(IpContract ipContract);
}

public interface SitePartRepository {
    Optional<SitePart> findById(long objid);
    Optional<SitePart> findRootByIpContract(long ipContractObjid);
    List<SitePart> findByIpContract(long ipContractObjid);
    SitePart save(SitePart sitePart);
}
```

---

## Enumerations

```java
public enum OrderType              { CREATION, MODIFICATION, CANCELLATION }
public enum OrderStatus            { DRAFT, SUBMITTED, IN_PROGRESS, COMPLETED, FAILED, CANCELLED }
public enum ModLevelStatus         { ACTIVE, INACTIVE }
public enum AttributeOwnerType     { CONTRACT, LINE_ITEM }
public enum ProductDefinitionType  { TOP, ITEM }
```

---

## Key Invariants Summary

| Invariant                                                                   | Enforced By                   |
|-----------------------------------------------------------------------------|-------------------------------|
| Exactly one `ModLevel` per `PartNum` is ACTIVE                              | External scripts (trusted)    |
| Only active `PartNum` + active `ModLevel` selected at install time          | CRM Provisioning task         |
| `OrderAttribute` owner FKs are mutually exclusive                           | DB constraint + constructor   |
| `LineItem` installability derived from `ProductDefinition.installable`      | CRM Provisioning task         |
| Cardinality rules (`minOnProduct`, `maxOnProduct`, `maxOnOrder`) enforced   | `crm-be-tasks` / `crm-shared` |
| Topmost `SitePart` linked to `IpContract`                                   | CRM Provisioning task         |
| Only `AttributeDef`-matched attributes written to `x_part_attribute_value`  | CRM Provisioning task         |
| `BillingConfig` provisioned per `SitePart` via `modLevel → partNum`         | Billing Provisioning task     |
| All orders for a subscription share one `IpContract`                        | CRM Provisioning task         |
| `CREATION` order triggers subscription `SitePart` creation                  | CRM Provisioning task         |
