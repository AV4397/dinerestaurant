package com.example.dinerestaurant.model;

public class Customer {
    private String customerId;
    private String fname;
    private String lname;
    private String address;
    private String mobile;
    private String emailId;
    private String zip;
    private String password;

    public Customer() {}

    public Customer(String customerId, String fname, String lname, String address,
                    String mobile, String emailId, String zip, String password) {
        this.customerId = customerId;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.mobile = mobile;
        this.emailId = emailId;
        this.zip = zip;
        this.password = password;
    }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public String getFname() { return fname; }
    public void setFname(String fname) { this.fname = fname; }

    public String getLname() { return lname; }
    public void setLname(String lname) { this.lname = lname; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public String getEmailId() { return emailId; }
    public void setEmailId(String emailId) { this.emailId = emailId; }

    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}