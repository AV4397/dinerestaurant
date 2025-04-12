package com.dinein.model;
public class Booking {
	String bdate;
	int capacity;
	String slotTime;
	public Booking(String bdate, int capacity, String slotTime) {
		this.bdate = bdate;
		this.capacity = capacity;
		this.slotTime = slotTime;
		return "Booking [bdate=" + bdate + ", capacity=" + capacity + ", slotTime=" + slotTime + "]";
		return bdate;
	public void setBdate(String bdate) {
		this.bdate = bdate;
		return capacity;
	public void setCapacity(int capacity) {
		this.capacity = capacity;
		return slotTime;
	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
}