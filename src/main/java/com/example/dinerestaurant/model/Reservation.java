package com.dinein.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
public class Reservation {
	String reservationId;
	String customerId;
	int tableNo;
	String bdate;
	String slotTime;
	String staffId;
	String status;
	public Reservation(String id, String reservationId, String customerId, int tableNo, String bdate, String slotTime,
			String staffId, String status) {
		this.reservationId = reservationId;
		this.customerId = customerId;
		this.tableNo = tableNo;
		this.bdate = bdate;
		this.slotTime = slotTime;
		this.staffId = staffId;
		this.status = status;
		return reservationId;
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
		return customerId;
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
		return tableNo;
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
		return bdate;
	public void setBdate(String bdate) {
		this.bdate = bdate;
		return slotTime;
	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
		return staffId;
	public void setStaffId(String staffId) {
		this.staffId = staffId;
		return status;
	public void setStatus(String status) {
		this.status = status;
		return "Reservation [id=" + id + ", reservationId=" + reservationId + ", customerId=" + customerId
				+ ", tableNo=" + tableNo + ", bdate=" + bdate + ", slotTime=" + slotTime + ", staffId=" + staffId
				+ ", status=" + status + "]";
}