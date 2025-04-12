package com.dinein.model;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
public class Order {
	String orderId;
	String custId;
	String reservationId;
	String tableNo;
	String slotTime;
	String orderedDate;
	List<OrderItem> orderItems;
	double amount;
	String paymentmode;
	String paymentstatus;
	String staffId;
	String status;
	public Order(String id, String orderId, String custId, String reservationId, String tableNo, String slotTime,
			String orderedDate, List<OrderItem> orderItems, double amount, String paymentmode, String paymentstatus,
			String staffId, String status) {
		this.orderId = orderId;
		this.custId = custId;
		this.reservationId = reservationId;
		this.tableNo = tableNo;
		this.slotTime = slotTime;
		this.orderedDate = orderedDate;
		this.orderItems = orderItems;
		this.amount = amount;
		this.paymentmode = paymentmode;
		this.paymentstatus = paymentstatus;
		this.staffId = staffId;
		this.status = status;
		return orderId;
	public void setOrderId(String orderId) {
		this.orderId = orderId;
		return custId;
	public void setCustId(String custId) {
		this.custId = custId;
		return reservationId;
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
		return tableNo;
	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
		return slotTime;
	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
		return orderedDate;
	public void setOrderedDate(String orderedDate) {
		this.orderedDate = orderedDate;
		return orderItems;
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
		return amount;
	public void setAmount(double amount) {
		this.amount = amount;
		return paymentmode;
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	public String getPaymentstatus() {
		return paymentstatus;
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
		return staffId;
	public void setStaffId(String staffId) {
		this.staffId = staffId;
		return status;
	public void setStatus(String status) {
		this.status = status;
		return "Order [id=" + id + ", orderId=" + orderId + ", custId=" + custId + ", reservationId=" + reservationId
				+ ", tableNo=" + tableNo + ", slotTime=" + slotTime + ", orderedDate=" + orderedDate + ", orderItems="
				+ orderItems + ", amount=" + amount + ", paymentmode=" + paymentmode + ", paymentstatus="
				+ paymentstatus + ", staffId=" + staffId + ", status=" + status + "]";
}