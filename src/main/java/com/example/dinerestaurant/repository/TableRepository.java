package com.example.dinerestaurant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.dinerestaurant.model.Table;

import java.util.List;

public interface TableRepository extends MongoRepository<Table, String> {
    List<Table> findDistinctByCapacity(int capacity);  // add parameter if needed
}
