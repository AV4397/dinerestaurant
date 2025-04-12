package com.dinein.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
public class Category {
	String catId;
	String name;
	String remarks;
	public Category(String id, String catId, String name, String remarks) {
		this.catId = catId;
		this.name = name;
		this.remarks = remarks;
		return catId;
	public void setCatId(String catId) {
		this.catId = catId;
		return name;
	public void setName(String name) {
		this.name = name;
		return remarks;
	public void setRemarks(String remarks) {
		this.remarks = remarks;
		return "Category [id=" + id + ", catId=" + catId + ", name=" + name + ", remarks=" + remarks + "]";
}