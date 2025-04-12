package com.dinein.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
public class Slot {
	String slotTime;
	public Slot(String id, String slotTime) {
		this.slotTime = slotTime;
		return "Slot [id=" + id + ", slotTime=" + slotTime + "]";
		return slotTime;
	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
}