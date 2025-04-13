package com.example.dinerestaurant.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "menu")
public class Menu {

    @Id
    private String id;          // Primary key in MongoDB

    private String menuId;      // Extra field if you want a special code like "MENU001"
    private String catId;       // Extra field if you want a category code like "CAT01"
    private String name;
    private String category;
    private double price;
    private boolean availability;
    private String recipe;
    private String imgUrl;

    public Menu() {
    }

    public Menu(String id, String menuId, String catId, String name, String category, double price,
                boolean availability, String recipe, String imgUrl) {
        this.id = id;
        this.menuId = menuId;
        this.catId = catId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.availability = availability;
        this.recipe = recipe;
        this.imgUrl = imgUrl;
    }

    // --- Getters and Setters ---

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
