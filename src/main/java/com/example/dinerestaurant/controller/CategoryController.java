package com.example.dinerestaurant.controller;

import com.example.dinerestaurant.model.Category;
import com.example.dinerestaurant.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository repo;

    @GetMapping
    public List<Category> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Category create(@RequestBody Category category) {
        return repo.save(category);
    }

    @GetMapping("/{id}")
    public Optional<Category> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @PutMapping("/{id}")
    public Category update(@PathVariable String id, @RequestBody Category updated) {
        updated.setCatId(id);
        return repo.save(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }

    @GetMapping("/latest")
    public Optional<Category> getLatest() {
        return repo.findTopByOrderByCatIdDesc();
    }

    @GetMapping("/byCatId/{catId}")
    public Optional<Category> getByCatId(@PathVariable String catId) {
        return repo.findByCatId(catId);
    }
}