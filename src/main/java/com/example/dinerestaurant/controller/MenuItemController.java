package com.example.dinerestaurant.controller;

import com.example.dinerestaurant.model.MenuItem;
import com.example.dinerestaurant.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuItemController {

    @Autowired
    private MenuItemRepository menuItemRepository;

    @GetMapping
    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    @PostMapping
    public MenuItem createMenuItem(@RequestBody MenuItem item) {
        return menuItemRepository.save(item);
    }

    @GetMapping("/{id}")
    public MenuItem getMenuItemById(@PathVariable String id) {
        return menuItemRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public MenuItem updateMenuItem(@PathVariable String id, @RequestBody MenuItem updatedItem) {
        updatedItem.setId(id);
        return menuItemRepository.save(updatedItem);
    }

    @DeleteMapping("/{id}")
    public void deleteMenuItem(@PathVariable String id) {
        menuItemRepository.deleteById(id);
    }
}
