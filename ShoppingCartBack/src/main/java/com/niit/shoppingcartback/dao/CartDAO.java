package com.niit.shoppingcartback.dao;

import java.util.List;

import com.niit.shoppingcartback.model.Cart;

public interface CartDAO {

	public List<Cart> list(String id);
	
	public Cart get(String id);
	
	public void saveOrUpdate(Cart cart);
	
	public void delete(String productName);
		
	public Long getTotalAmount(String id);
	
	public Long getCount(String username);
	
}
