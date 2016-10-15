package com.niit.shoppingcartback.dao;

import java.util.List;

import com.niit.shoppingcartback.model.ShippingAddress;



public interface ShippingAddressDAO {
	
	public List<ShippingAddress> list(String id);
	
	public ShippingAddress get(String name);
	
	public void saveOrUpdate(ShippingAddress shippingAddress);
	
	public void delete(String id);
	
	public void editShippingAddress(ShippingAddress shippingAddress);
	

}
