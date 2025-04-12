package com.example.dinerestaurant.model;

public class Booking {
    private String bdate;
    private int capacity;
    private String slotTime;

    public Booking() {}

    public Booking(String bdate, int capacity, String slotTime) {
        this.bdate = bdate;
        this.capacity = capacity;
        this.slotTime = slotTime;
    }

    public String getBdate() { return bdate; }
    public void setBdate(String bdate) { this.bdate = bdate; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public String getSlotTime() { return slotTime; }
    public void setSlotTime(String slotTime) { this.slotTime = slotTime; }
}