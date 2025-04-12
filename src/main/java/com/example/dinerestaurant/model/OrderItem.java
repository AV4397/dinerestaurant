package com.dinein.model;
public class OrderItem {
	int orderNo;
	String menuId;
	String name;
	String imgUrl;
	int qty;
	double price;
	public OrderItem(int orderNo, String menuId, String name, String imgUrl, int qty, double price) {
		this.orderNo = orderNo;
		this.menuId = menuId;
		this.name = name;
		this.imgUrl = imgUrl;
		this.qty = qty;
		this.price = price;
		return orderNo;
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
		return menuId;
	public void setMenuId(String menuId) {
		this.menuId = menuId;
		return name;
	public void setName(String name) {
		this.name = name;
		return imgUrl;
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
		return qty;
	public void setQty(int qty) {
		this.qty = qty;
		return price;
	public void setPrice(double price) {
		this.price = price;
		return "OrderItem [orderNo=" + orderNo + ", menuId=" + menuId + ", name=" + name + ", imgUrl=" + imgUrl
				+ ", qty=" + qty + ", price=" + price + "]";
}