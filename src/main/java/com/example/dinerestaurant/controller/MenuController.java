package com.example.dinerestaurant.controller;

import com.example.dinerestaurant.model.Menu;
import com.example.dinerestaurant.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuRepository repo;

    @GetMapping
    public List<Menu> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Menu create(@RequestBody Menu menu) {
        return repo.save(menu);
    }

    @GetMapping("/{id}")
    public Menu getById(@PathVariable String id) {
        return repo.findById(id).orElse(null);
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
