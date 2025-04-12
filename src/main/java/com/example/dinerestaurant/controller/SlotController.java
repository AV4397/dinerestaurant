package com.example.dinerestaurant.controller;

import com.example.dinerestaurant.model.Slot;
import com.example.dinerestaurant.repository.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/slots")
public class SlotController {

    @Autowired
    private SlotRepository repo;

    @GetMapping
    public List<Slot> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Slot create(@RequestBody Slot item) {
        return repo.save(item);
    }

    @GetMapping("/{id}")
    public Optional<Slot> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @PutMapping("/{id}")
    public Slot update(@PathVariable String id, @RequestBody Slot updated) {
        updated.setSlotTime(id);
        return repo.save(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}