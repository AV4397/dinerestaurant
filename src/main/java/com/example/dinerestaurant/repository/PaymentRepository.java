package com.example.dinerestaurant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.dinerestaurant.model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {

}