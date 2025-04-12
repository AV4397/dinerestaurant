package com.example.dinerestaurant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.dinerestaurant.model.Slot;

public interface SlotRepository extends MongoRepository<Slot, String> {

}