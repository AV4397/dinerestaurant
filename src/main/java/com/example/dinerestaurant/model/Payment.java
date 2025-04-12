package com.dinein.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
public class Payment {
	String orderId;
	double totalAmount;
	double tipsAmount;
	String paymentMode;
	String paymentStatus;
	public Payment(String id, String orderId, double totalAmount, double tipsAmount, String paymentMode,
			String paymentStatus) {
		this.orderId = orderId;
		this.totalAmount = totalAmount;
		this.tipsAmount = tipsAmount;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		return "Payment [id=" + id + ", orderId=" + orderId + ", totalAmount=" + totalAmount + ", tipsAmount="
				+ tipsAmount + ", paymentMode=" + paymentMode + ", paymentStatus=" + paymentStatus + "]";
		return orderId;
	public void setOrderId(String orderId) {
		this.orderId = orderId;
		return totalAmount;
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
		return tipsAmount;
	public void setTipsAmount(double tipsAmount) {
		this.tipsAmount = tipsAmount;
		return paymentMode;
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
		return paymentStatus;
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
}