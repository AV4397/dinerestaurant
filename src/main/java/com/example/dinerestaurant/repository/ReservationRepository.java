package com.example.dinerestaurant.repository;

import com.example.dinerestaurant.model.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
}
