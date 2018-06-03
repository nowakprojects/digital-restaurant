package com.drestaurant.query.repository;

import com.drestaurant.query.model.OrderEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "orders", path = "orders") public interface OrderRepository
		extends PagingAndSortingRepository<OrderEntity, String> {

	@Override @RestResource(exported = false) OrderEntity save(OrderEntity entity);

	@Override @RestResource(exported = false) void deleteById(String aLong);

	@Override @RestResource(exported = false) void delete(OrderEntity entity);

}
