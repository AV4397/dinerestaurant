package com.example.dinerestaurant.model;



public class Menu {
    private String menuId;
    private String catId;
    private String name;
    private double price;
    private String recipe;
    private String imgUrl;

    public Menu() {}

    public Menu(String menuId, String catId, String name, double price, String recipe, String imgUrl) {
        this.menuId = menuId;
        this.catId = catId;
        this.name = name;
        this.price = price;
        this.recipe = recipe;
        this.imgUrl = imgUrl;
    }

    public String getMenuId() { return menuId; }
    public void setMenuId(String menuId) { this.menuId = menuId; }

    public String getCatId() { return catId; }
    public void setCatId(String catId) { this.catId = catId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getRecipe() { return recipe; }
    public void setRecipe(String recipe) { this.recipe = recipe; }

    public String getImgUrl() { return imgUrl; }
    public void setImgUrl(String imgUrl) { this.imgUrl = imgUrl; }


}
