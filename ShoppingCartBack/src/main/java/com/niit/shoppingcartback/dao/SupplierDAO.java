package com.niit.shoppingcartback.dao;

import com.niit.shoppingcartback.model.Supplier;
import java.util.List;

public interface SupplierDAO {
	
	public List<Supplier> list();
	
	public Supplier get(String id);
	
	public void saveOrUpdate(Supplier category);
	
	public void delete(String id);
	

}
