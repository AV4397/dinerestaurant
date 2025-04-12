package com.example.dinerestaurant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.dinerestaurant.model.Menu;
import java.util.Optional;

public interface MenuRepository extends MongoRepository<Menu, String> {
    Optional<Menu> findTopByOrderByMenuIdDesc();
}