package com.example.dinerestaurant.repository;

import com.example.dinerestaurant.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
