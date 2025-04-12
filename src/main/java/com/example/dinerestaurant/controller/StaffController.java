package com.example.dinerestaurant.controller;

import com.example.dinerestaurant.model.Staff;
import com.example.dinerestaurant.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/staffs")
public class StaffController {

    @Autowired
    private StaffRepository repo;

    @GetMapping
    public List<Staff> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Staff create(@RequestBody Staff item) {
        return repo.save(item);
    }

    @GetMapping("/{id}")
    public Optional<Staff> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @PutMapping("/{id}")
    public Staff update(@PathVariable String id, @RequestBody Staff updated) {
        updated.setEmployeeId(id);
        return repo.save(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}