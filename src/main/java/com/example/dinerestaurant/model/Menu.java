package com.dinein.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
public class Menu {
	String menuId;
	String catId;
	String name;
	double price;
	String recipe;
	String imgUrl;
	public Menu(String id, String menuId, String catId, String name, double price, String recipe, String imgUrl) {
		this.menuId = menuId;
		this.catId = catId;
		this.name = name;
		this.price = price;
		this.recipe = recipe;
		this.imgUrl = imgUrl;
	public Menu(String menuId, String catId, String name, double price, String recipe, String imgUrl) {
		this.menuId = menuId;
		this.catId = catId;
		this.name = name;
		this.price = price;
		this.recipe = recipe;
		this.imgUrl = imgUrl;
		return menuId;
	public void setMenuId(String menuId) {
		this.menuId = menuId;
		return catId;
	public void setCatId(String catId) {
		this.catId = catId;
		return name;
	public void setName(String name) {
		this.name = name;
		return price;
	public void setPrice(double price) {
		this.price = price;
		return recipe;
	public void setRecipe(String recipe) {
		this.recipe = recipe;
		return imgUrl;
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
		return "Menu [id=" + id + ", menuId=" + menuId + ", catId=" + catId + ", name=" + name +", price=" + price
				+ ", recipe=" + recipe + ", imgUrl=" + imgUrl + "]";
}