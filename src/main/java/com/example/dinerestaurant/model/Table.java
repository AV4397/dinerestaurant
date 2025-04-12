package com.dinein.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
public class Table {
	int tableNo;
	int capacity;
	String waiterId;
	public Table(String id, int tableNo, int capacity, String waiterId) {
		this.tableNo = tableNo;
		this.capacity = capacity;
		this.waiterId = waiterId;
		return tableNo;
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
		return capacity;
	public void setCapacity(int capacity) {
		this.capacity = capacity;
		return waiterId;
	public void setWaiterId(String waiterId) {
		this.waiterId = waiterId;
}