package com.niit.shoppingcartback.model;


import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;


@Entity
@Table(name = "user")
@Component
public class User {
	
	@Id
	
	@GeneratedValue
	private String usersId;
	
	@NotNull
	@Column(name="username", unique=true, columnDefinition="VARCHAR(35)" )
	private String username;	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String password;
	
	@NotNull	
	private long phoneNo;
	
	@NotNull
	@Column(name="emailid", unique=true, columnDefinition="VARCHAR(35)" )
	private String emailid;
	
	private String adress;
	private int zipCode;
	 private boolean enabled;
	 
	 
	@Generated(value = { "" })
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date date = new java.sql.Date(new java.util.Date().getTime());
	
	
	@Transient
	private String FirstName;
	@Transient
	private String LastName;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usersId")
	private UserRole userRole;
		
	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	

	
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getUsersId() {
		return usersId;
	}

	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
