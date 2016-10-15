package com.niit.shoppingcartback.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "shippingaddress")
@Component
public class ShippingAddress {
	
	
	@Id
	@Column(name="Serial_No")
	@GeneratedValue
	private String Serial_No;
	
	private String id;
	private String name;
	private String phoneNo;
	private String emailid;
	private String address;
	private String zipCode;
	public String getSerial_No() {
		return Serial_No;
	}
	public void setSerial_No(String serial_No) {
		Serial_No = serial_No;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
}
