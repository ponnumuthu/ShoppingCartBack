package com.niit.shoppingcartback.dao;

import java.util.List;

import com.niit.shoppingcartback.model.Product;

public interface ProductDAO {
	
	public List<Product> list();
	
	public List<Product> list(String category);
	
	public Product get(String product_Id);
	
	public void saveOrUpdate(Product product);
	
	public void delete(String product_Id);
	


}
