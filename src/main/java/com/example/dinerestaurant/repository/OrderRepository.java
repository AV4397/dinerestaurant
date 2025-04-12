package com.example.dinerestaurant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.dinerestaurant.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

}