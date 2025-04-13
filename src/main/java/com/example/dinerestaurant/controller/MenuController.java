package com.example.dinerestaurant.controller;

import com.example.dinerestaurant.model.Menu;
import com.example.dinerestaurant.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

    // 1) GET ALL
    @GetMapping
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    // 2) GET ONE BY ID
    @GetMapping("/{id}")
    public Menu getOneMenu(@PathVariable String id) {
        return menuRepository.findById(id).orElse(null);
    }

    // 3) CREATE
    @PostMapping
    public Menu createMenu(@RequestBody Menu newMenu) {
        // newMenu.setId(null); // uncomment if you want to ensure Mongo auto-generates the _id
        return menuRepository.save(newMenu);
    }

    // 4) UPDATE (does not overwrite 'id')
    @PutMapping("/{id}")
    public Menu updateMenu(@PathVariable String id, @RequestBody Menu updated) {
        Optional<Menu> existingOpt = menuRepository.findById(id);
        if (existingOpt.isEmpty()) {
            return null;  // or throw an exception / return 404
        }

        Menu existing = existingOpt.get();
        // Only update fields that are not null (or however you want to handle partial updates)
        if (updated.getMenuId() != null)    existing.setMenuId(updated.getMenuId());
        if (updated.getCatId()  != null)    existing.setCatId(updated.getCatId());
        if (updated.getName()   != null)    existing.setName(updated.getName());
        if (updated.getCategory() != null)  existing.setCategory(updated.getCategory());
        if (updated.getRecipe() != null)    existing.setRecipe(updated.getRecipe());
        if (updated.getImgUrl() != null)    existing.setImgUrl(updated.getImgUrl());

        // For numeric/boolean fields, decide how you want partial updates:
        existing.setPrice(updated.getPrice());  // always update price
        existing.setAvailability(updated.isAvailability()); // always update availability

        // DO NOT DO: existing.setId(updated.getId()); // never overwrite the primary _id
        return menuRepository.save(existing);
    }

    // 5) DELETE
    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable String id) {
        menuRepository.deleteById(id);
    }

    @DeleteMapping("/admin/deleteAll")
    public void deleteAllMenus() {
        menuRepository.deleteAll();
    }
}
