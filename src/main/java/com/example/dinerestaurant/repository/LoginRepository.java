package com.example.dinerestaurant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.dinerestaurant.model.Login;

public interface LoginRepository extends MongoRepository<Login, String> {

}