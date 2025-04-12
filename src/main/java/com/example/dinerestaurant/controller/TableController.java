package com.example.dinerestaurant.controller;

import com.example.dinerestaurant.model.Table;
import com.example.dinerestaurant.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tables")
public class TableController {

    @Autowired
    private TableRepository repo;

    @GetMapping
    public List<Table> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Table create(@RequestBody Table item) {
        return repo.save(item);
    }

    @GetMapping("/{id}")
    public Optional<Table> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @PutMapping("/{id}")
    public Table update(@PathVariable String id, @RequestBody Table updated) {
        updated.setId(id);
        return repo.save(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}