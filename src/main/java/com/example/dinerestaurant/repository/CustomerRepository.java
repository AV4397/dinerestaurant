package com.example.dinerestaurant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.dinerestaurant.model.Customer;

import java.util.Optional;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    Optional<Customer> findByEmailIdAndPassword(String emailId, String password);
    Optional<Customer> findTopByOrderByCustomerIdDesc();
    Optional<Customer> findByCustomerId(String customerId);

}