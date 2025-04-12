package com.example.dinerestaurant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.dinerestaurant.model.OrderItem;

public interface OrderItemRepository extends MongoRepository<OrderItem, String> {

}