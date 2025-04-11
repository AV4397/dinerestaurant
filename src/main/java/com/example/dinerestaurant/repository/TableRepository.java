package com.example.dinerestaurant.repository;

import com.example.dinerestaurant.model.Table;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TableRepository extends MongoRepository<Table, String> {
}
