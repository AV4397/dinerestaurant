package com.example.dinerestaurant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.dinerestaurant.model.Booking;

public interface BookingRepository extends MongoRepository<Booking, String> {

}