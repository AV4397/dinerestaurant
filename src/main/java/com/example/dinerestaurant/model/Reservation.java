package com.example.dinerestaurant.model;

public class Reservation {
    private String reservationId;
    private String customerId;
    private int tableNo;
    private String bdate;
    private String slotTime;
    private String staffId;
    private String status;

    public Reservation() {}

    public Reservation(String reservationId, String customerId, int tableNo, String bdate, String slotTime, String staffId, String status) {
        this.reservationId = reservationId;
        this.customerId = customerId;
        this.tableNo = tableNo;
        this.bdate = bdate;
        this.slotTime = slotTime;
        this.staffId = staffId;
        this.status = status;
    }

    public String getReservationId() { return reservationId; }
    public void setReservationId(String reservationId) { this.reservationId = reservationId; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public int getTableNo() { return tableNo; }
    public void setTableNo(int tableNo) { this.tableNo = tableNo; }

    public String getBdate() { return bdate; }
    public void setBdate(String bdate) { this.bdate = bdate; }

    public String getSlotTime() { return slotTime; }
    public void setSlotTime(String slotTime) { this.slotTime = slotTime; }

    public String getStaffId() { return staffId; }
    public void setStaffId(String staffId) { this.staffId = staffId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}