package com.example.dinerestaurant.controller;

import com.example.dinerestaurant.model.Menu;
import com.example.dinerestaurant.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/menus")
public class MenuController {

    @Autowired
    private MenuRepository repo;

    @GetMapping
    public List<Menu> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Menu create(@RequestBody Menu item) {
        return repo.save(item);
    }

    @GetMapping("/{id}")
    public Optional<Menu> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @PutMapping("/{id}")
    public Menu update(@PathVariable String id, @RequestBody Menu updated) {
        updated.setMenuId(id);
        return repo.save(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}