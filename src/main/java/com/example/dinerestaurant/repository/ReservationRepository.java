package com.example.dinerestaurant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.dinerestaurant.model.Reservation;

import java.util.List;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
    List<Reservation> findAllByStaffIdOrderByReservationIdDesc(String staffId);

}