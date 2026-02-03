package com.skillbrain.store.repository;

import com.skillbrain.store.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
