package ch.sunrise.domain.repository;

import ch.sunrise.domain.model.order.Order;
import java.util.Optional;

public interface OrderRepository {
    Optional<Order> findById(String objid);
    Order save(Order order);
}
