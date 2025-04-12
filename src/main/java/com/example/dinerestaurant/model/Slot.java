package com.example.dinerestaurant.model;

public class Slot {
    private String slotTime;

    public Slot() {}

    public Slot(String slotTime) {
        this.slotTime = slotTime;
    }

    public String getSlotTime() { return slotTime; }
    public void setSlotTime(String slotTime) { this.slotTime = slotTime; }
}