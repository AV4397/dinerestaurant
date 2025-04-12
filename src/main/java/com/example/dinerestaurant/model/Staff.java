package com.dinein.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
public class Staff {
	String employeeId;
	String femployeeName;
	String lemployeeName;
	String phone;
	String emailId;
	String gender;
	String zip;
	String designation;
	String address;
	double salary;
	String password;
	public Staff(String id, String employeeId, String femployeeName, String lemployeeName, String phone, String emailId,
			String gender, String zip, String designation, String address, double salary, String password) {
		this.employeeId = employeeId;
		this.femployeeName = femployeeName;
		this.lemployeeName = lemployeeName;
		this.phone = phone;
		this.emailId = emailId;
		this.gender = gender;
		this.zip = zip;
		this.designation = designation;
		this.address = address;
		this.salary = salary;
		this.password = password;
		return employeeId;
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
		return femployeeName;
	public void setFemployeeName(String femployeeName) {
		this.femployeeName = femployeeName;
		return lemployeeName;
	public void setLemployeeName(String lemployeeName) {
		this.lemployeeName = lemployeeName;
		return phone;
	public void setPhone(String phone) {
		this.phone = phone;
		return emailId;
	public void setEmailId(String emailId) {
		this.emailId = emailId;
		return gender;
	public void setGender(String gender) {
		this.gender = gender;
		return zip;
	public void setZip(String zip) {
		this.zip = zip;
		return designation;
	public void setDesignation(String designation) {
		this.designation = designation;
		return address;
	public void setAddress(String address) {
		this.address = address;
		return salary;
	public void setSalary(double salary) {
		this.salary = salary;
		return password;
	public void setPassword(String password) {
		this.password = password;
}