package com.niit.shoppingcartback.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;



@Entity
@Table(name="users")
@Component
public class Users implements Serializable{
	
	private static final long serialVersionUID = 20L;

    @Id
    @GeneratedValue
    private String usersId;
    private String username;
    private String password;
    private boolean enabled;
   
    @Transient
    private String conformpassword;
    
    public String getUsersId() {
        return usersId;
    }

    public void setUsersId(String string) {
        this.usersId = string;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

	public String getConformpassword() {
		return conformpassword;
	}

	public void setConformpassword(String conformpassword) {
		this.conformpassword = conformpassword;
	}
    

}
