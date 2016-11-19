package com.niit.shoppingcartback.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "shippingaddress")
@Component
public class ShippingAddress {

	@Id
	@Column(name = "shippingId")
	@GeneratedValue
	private String shippingId;
	
	/*@Id
	@GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name = "newGenerator", strategy = "foreign", parameters = {
	@Parameter(value = "user", name = "property") })*/
	
	private String usersId;
	@NotNull
	@Column(name="username", unique=true, columnDefinition="VARCHAR(35)" )
	private String username;
	
	private String phoneNo;
	private String emailid;
	private String adress;
	private String zipCode;

	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usersId")
	@OneToOne
	@JoinColumn(name="usersId", updatable=true, insertable=true)
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
*/
	public String getPhoneNo() {
		return phoneNo;
	}

	public String getShippingId() {
		return shippingId;
	}

	public void setShippingId(String shippingId) {
		this.shippingId = shippingId;
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

	public String getUsersId() {
		return usersId;
	}

	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
