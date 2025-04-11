package com.example.dinerestaurant.repository;

import com.example.dinerestaurant.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
