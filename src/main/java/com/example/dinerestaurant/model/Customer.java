package com.dinein.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
public class Customer {
	String customerId;
	String fname;
	String lname;
	String address;
	String mobile;
	String emailId;
	String zip;
	String password;
	public Customer(String id, String customerId, String fname, String lname, String address, String mobile,
			String emailId, String zip, String password) {
		this.customerId = customerId;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.mobile = mobile;
		this.emailId = emailId;
		this.zip = zip;
		this.password = password;
		return customerId;
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
		return fname;
	public void setFname(String fname) {
		this.fname = fname;
		return lname;
	public void setLname(String lname) {
		this.lname = lname;
		return address;
	public void setAddress(String address) {
		this.address = address;
		return mobile;
	public void setMobile(String mobile) {
		this.mobile = mobile;
		return emailId;
	public void setEmailId(String emailId) {
		this.emailId = emailId;
		return zip;
	public void setZip(String zip) {
		this.zip = zip;
		return password;
	public void setPassword(String password) {
		this.password = password;
}