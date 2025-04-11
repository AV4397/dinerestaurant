package com.example.dinerestaurant.repository;

import com.example.dinerestaurant.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
