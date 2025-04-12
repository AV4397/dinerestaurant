package com.example.dinerestaurant.model;

public class Payment {
    private String orderId;
    private double totalAmount;
    private double tipsAmount;
    private String paymentMode;
    private String paymentStatus;

    public Payment() {}

    public Payment(String orderId, double totalAmount, double tipsAmount, String paymentMode, String paymentStatus) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.tipsAmount = tipsAmount;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public double getTipsAmount() { return tipsAmount; }
    public void setTipsAmount(double tipsAmount) { this.tipsAmount = tipsAmount; }

    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) { this.paymentMode = paymentMode; }

    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }
}