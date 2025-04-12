package com.example.dinerestaurant.controller;

import com.example.dinerestaurant.model.Reservation;
import com.example.dinerestaurant.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @Autowired
    private ReservationRepository repo;

    @GetMapping
    public List<Reservation> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Reservation create(@RequestBody Reservation item) {
        return repo.save(item);
    }

    @GetMapping("/{id}")
    public Optional<Reservation> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @PutMapping("/{id}")
    public Reservation update(@PathVariable String id, @RequestBody Reservation updated) {
        updated.setReservationId(id);
        return repo.save(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}