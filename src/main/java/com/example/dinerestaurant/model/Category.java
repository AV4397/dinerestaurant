package com.example.dinerestaurant.model;

public class Category {
    private String catId;
    private String name;
    private String remarks;

    public Category() {}

    public Category(String catId, String name, String remarks) {
        this.catId = catId;
        this.name = name;
        this.remarks = remarks;
    }

    public String getCatId() { return catId; }
    public void setCatId(String catId) { this.catId = catId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }
}