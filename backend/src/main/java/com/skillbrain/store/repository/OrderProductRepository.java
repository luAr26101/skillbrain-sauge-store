package com.skillbrain.store.repository;

import com.skillbrain.store.model.OrderProduct;
import com.skillbrain.store.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
