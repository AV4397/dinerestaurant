package com.example.dinerestaurant.model;

import java.util.List;

public class Order {
    private String orderId;
    private String custId;
    private String reservationId;
    private String tableNo;
    private String slotTime;
    private String orderedDate;
    private List<OrderItem> orderItems;
    private double amount;
    private String paymentmode;
    private String paymentstatus;
    private String staffId;
    private String status;

    public Order() {}

    public Order(String orderId, String custId, String reservationId, String tableNo, String slotTime,
                 String orderedDate, List<OrderItem> orderItems, double amount, String paymentmode,
                 String paymentstatus, String staffId, String status) {
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
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getCustId() { return custId; }
    public void setCustId(String custId) { this.custId = custId; }

    public String getReservationId() { return reservationId; }
    public void setReservationId(String reservationId) { this.reservationId = reservationId; }

    public String getTableNo() { return tableNo; }
    public void setTableNo(String tableNo) { this.tableNo = tableNo; }

    public String getSlotTime() { return slotTime; }
    public void setSlotTime(String slotTime) { this.slotTime = slotTime; }

    public String getOrderedDate() { return orderedDate; }
    public void setOrderedDate(String orderedDate) { this.orderedDate = orderedDate; }

    public List<OrderItem> getOrderItems() { return orderItems; }
    public void setOrderItems(List<OrderItem> orderItems) { this.orderItems = orderItems; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getPaymentmode() { return paymentmode; }
    public void setPaymentmode(String paymentmode) { this.paymentmode = paymentmode; }

    public String getPaymentstatus() { return paymentstatus; }
    public void setPaymentstatus(String paymentstatus) { this.paymentstatus = paymentstatus; }

    public String getStaffId() { return staffId; }
    public void setStaffId(String staffId) { this.staffId = staffId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}