package com.example.dinerestaurant.controller;

import com.example.dinerestaurant.model.Menu;
import com.example.dinerestaurant.repository.MenuRepository;
import com.example.dinerestaurant.service.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

    // ✅ Get all menu items
    @GetMapping
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    // ✅ Get single item
    @GetMapping("/{id}")
    public ResponseEntity<Menu> getMenuById(@PathVariable String id) {
        Optional<Menu> menu = menuRepository.findById(id);
        return menu.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // ✅ Standard JSON-based POST
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Menu createMenu(@RequestBody Menu menu) {
        return menuRepository.save(menu);
    }

    // ✅ Update by ID
    @PutMapping("/{id}")
    public ResponseEntity<Menu> updateMenu(@PathVariable String id, @RequestBody Menu menuDetails) {
        Optional<Menu> optionalMenu = menuRepository.findById(id);
        if (optionalMenu.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Menu menu = optionalMenu.get();
        menu.setName(menuDetails.getName());
        menu.setCategory(menuDetails.getCategory());
        menu.setPrice(menuDetails.getPrice());
        menu.setAvailability(menuDetails.isAvailability());
        menu.setImgUrl(menuDetails.getImgUrl());
        return ResponseEntity.ok(menuRepository.save(menu));
    }

    // ✅ Delete by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenu(@PathVariable String id) {
        if (!menuRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        menuRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // ✅ New: Upload with Image (Cloudinary)
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Menu> uploadMenuItem(
            @RequestParam("name") String name,
            @RequestParam("category") String category,
            @RequestParam("price") double price,
            @RequestParam("availability") boolean availability,
            @RequestParam("image") MultipartFile file) throws IOException {

        String imgUrl = FileUploadUtil.saveFileToCloudinary(file);

        Menu menu = new Menu();
        menu.setName(name);
        menu.setCategory(category);
        menu.setPrice(price);
        menu.setAvailability(availability);
        menu.setImgUrl(imgUrl);

        return ResponseEntity.ok(menuRepository.save(menu));
    }
}
