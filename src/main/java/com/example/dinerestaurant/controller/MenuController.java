package com.example.dinerestaurant.controller;

import com.example.dinerestaurant.model.Menu;
import com.example.dinerestaurant.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

    // -- 1) GET ALL --
    @GetMapping
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    // -- 2) GET ONE BY ID --
    @GetMapping("/{id}")
    public Menu getOneMenu(@PathVariable String id) {
        return menuRepository.findById(id).orElse(null);
    }

    // -- 3) CREATE (JSON-based) --
    @PostMapping
    public Menu createMenu(@RequestBody Menu newMenu) {
        // If you want Spring to auto-generate _id, do not set newMenu.setId(...)
        return menuRepository.save(newMenu);
    }

    // -- 4) UPDATE (JSON-based) --
    @PutMapping("/{id}")
    public Menu updateMenu(@PathVariable String id, @RequestBody Menu updated) {
        Optional<Menu> existingOpt = menuRepository.findById(id);
        if (existingOpt.isEmpty()) {
            return null; // or throw an exception / 404
        }
        Menu existing = existingOpt.get();

        // Only overwrite fields that changed
        if (updated.getMenuId() != null)    existing.setMenuId(updated.getMenuId());
        if (updated.getCatId()  != null)    existing.setCatId(updated.getCatId());
        if (updated.getName()   != null)    existing.setName(updated.getName());
        if (updated.getCategory()!= null)   existing.setCategory(updated.getCategory());
        if (updated.getRecipe() != null)    existing.setRecipe(updated.getRecipe());
        if (updated.getImgUrl() != null)    existing.setImgUrl(updated.getImgUrl());

        // numeric/boolean fields updated fully:
        existing.setPrice(updated.getPrice());
        existing.setAvailability(updated.isAvailability());

        // Don't overwrite the 'id'
        return menuRepository.save(existing);
    }

    // -- 5) DELETE --
    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable String id) {
        menuRepository.deleteById(id);
    }

    // -- 6) CREATE WITH IMAGE UPLOAD --
    @PostMapping("/upload")
    public Menu uploadItemWithImage(
            @RequestParam("name") String name,
            @RequestParam("price") double price,
            @RequestParam("file") MultipartFile file
    ) {
        try {
            // 1) Path to store images in local server
            String uploadDir = "src/main/resources/static/uploads/";
            File folder = new File(uploadDir);
            if (!folder.exists()) {
                folder.mkdirs();
            }

            // 2) Unique filename (or just use original filename)
            String originalFilename = file.getOriginalFilename();
            long currentTime = System.currentTimeMillis();
            String storedFilename = currentTime + "-" + originalFilename;

            // 3) Save file to local disk
            File dest = new File(folder, storedFilename);
            file.transferTo(dest);

            // 4) Construct the new item
            Menu newItem = new Menu();
            newItem.setName(name);
            newItem.setPrice(price);
            newItem.setAvailability(true);

            // Optionally set a default category or catId
            newItem.setCategory("Main Course");
            // newItem.setCatId("CAT01");

            // 5) Build local 'imgUrl' that your frontend can load
            // If you're deployed on Render, the static folder is served automatically at:
            //   https://<your-app>.onrender.com/uploads/...
            // NOTE: If you need a custom domain or path, adapt this baseURL
            String baseURL = "https://dinerestaurant.onrender.com";
            String finalImgUrl = baseURL + "/uploads/" + storedFilename;
            newItem.setImgUrl(finalImgUrl);

            // 6) Save to DB
            return menuRepository.save(newItem);

        } catch (Exception e) {
            throw new RuntimeException("Error storing image file: " + e.getMessage(), e);
        }
    }
}
