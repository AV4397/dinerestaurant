package com.example.dinerestaurant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.dinerestaurant.model.Staff;

public interface StaffRepository extends MongoRepository<Staff, String> {

}