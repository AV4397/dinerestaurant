package com.example.dinerestaurant.repository;

import com.example.dinerestaurant.model.MenuItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuItemRepository extends MongoRepository<MenuItem, String> {
}
