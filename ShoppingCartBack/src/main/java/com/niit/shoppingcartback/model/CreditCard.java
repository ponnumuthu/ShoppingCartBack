package com.niit.shoppingcartback.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "creditcard")
@Component
public class CreditCard {

	@Id
	@Column(name="S_NO")	
	@GeneratedValue
	private int S_No;	
	
	private String nameOnCard;
	private long cardNumber;
	private int month;
	private int years;
	private int cvv;
	
	
	
	
	public int getS_No() {
		return S_No;
	}
	public void setS_No(int s_No) {
		S_No = s_No;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	
}
