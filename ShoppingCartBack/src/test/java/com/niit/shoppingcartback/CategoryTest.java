package com.niit.shoppingcartback;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.shoppingcartback.dao.CartDAO;
import com.niit.shoppingcartback.dao.CategoryDAO;
import com.niit.shoppingcartback.dao.ProductDAO;
import com.niit.shoppingcartback.dao.SupplierDAO;
import com.niit.shoppingcartback.dao.UserDAO;
import com.niit.shoppingcartback.model.Cart;
import com.niit.shoppingcartback.model.Category;
import com.niit.shoppingcartback.model.Product;
import com.niit.shoppingcartback.model.Supplier;
import com.niit.shoppingcartback.model.User;

public class CategoryTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcartback");
		context.refresh();

		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("CategoryDAO");
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("SupplierDAO");
		ProductDAO productDAO = (ProductDAO) context.getBean("ProductDAO");
		UserDAO userDAO = (UserDAO) context.getBean("UserDAO");
		CartDAO cartDAO = (CartDAO) context.getBean("cartDAO");
		
		Category category = (Category) context.getBean("category");
		Supplier supplier = (Supplier) context.getBean("supplier");
		Product product = (Product) context.getBean("product");
		User user = (User) context.getBean("user");
		Cart cart = (Cart) context.getBean("cart");
		
category.setId("CG121");
		category.setName("CGName121");
		category.setDescription("CGDesc121");

		categoryDAO.saveOrUpdate(category);
		categoryDAO.delete("CG120");

		supplier.setId("CG121");
		supplier.setName("CGName121");
		supplier.setPhoneNo(9876543);
		supplier.setEmailId("abcasdxyz@gmail.com");
		supplier.setAddress("1/23,aGOLDbcasdfg ,xxx,yyy,chennai-600028");
	
		supplierDAO.saveOrUpdate(supplier);
		product.setProduct_Id("Pro_003");
		product.setProduct_Name("ProName_003");
		product.setSupplier_Name("Sup_003");
		product.setProduct_Price(9999);
		product.setProduct_Stock(150);
	
		product.setDescription("blah_blah");
		

		productDAO.saveOrUpdate(product);
		
		
		user.setUsersId("User_003");
		user.setUsername("Gold");
		user.setPassword("gold");
		user.setPhoneNo(963852);
		user.setEmailid("ponmuthu@gmail.com");
		user.setAdress("123,afbsukfgbuy");
		user.setZipCode(63214);
		
		
		userDAO.saveOrUpdate(user);
		cart.setCartId("1");
		cart.setUserId("user_001");
		cart.setUserName("muthu");
		cart.setProductName("sony z4");
		cart.setPrice(50000);
		cart.setQuantity(1);
		cart.setStatus("N");
		
		cartDAO.saveOrUpdate(cart);
		productDAO.get("product_001");
		categoryDAO.search("mob");
		for(Category category1:categoryDAO.search("mob")){
			System.out.println(category1);
		}
		
	}

}
