package com.niit.shoppingcartback.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.shoppingcartback.dao.CartDAO;
import com.niit.shoppingcartback.dao.CartDAOImpl;
import com.niit.shoppingcartback.dao.CategoryDAO;
import com.niit.shoppingcartback.dao.CategoryDAOImpl;
import com.niit.shoppingcartback.dao.UserDAO;
import com.niit.shoppingcartback.dao.UserDAOImpl;
import com.niit.shoppingcartback.model.Cart;
import com.niit.shoppingcartback.model.Category;
import com.niit.shoppingcartback.model.CreditCard;
import com.niit.shoppingcartback.model.Product;
import com.niit.shoppingcartback.model.ShippingAddress;
import com.niit.shoppingcartback.model.Supplier;
import com.niit.shoppingcartback.model.User;
import com.niit.shoppingcartback.model.UserRole;
import com.niit.shoppingcartback.model.Users;


@Configuration
@ComponentScan("com.niit.shoppingcartback")
@EnableTransactionManagement

public class ApplicationContextConfig {

	@Autowired
	@Bean(name = "dataSource")
	public DataSource getH2DataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/ElectronicsCart");
		
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		
		return dataSource;
		}
	
	private Properties getHibernateProperties(){
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.format_sql", "true");
		
		return properties;
		}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource){
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Users.class);
		sessionBuilder.addAnnotatedClass(UserRole.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		sessionBuilder.addAnnotatedClass(CreditCard.class);
		sessionBuilder.addAnnotatedClass(ShippingAddress.class);
		return sessionBuilder.buildSessionFactory();
		}
	
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
		
	}
	
    @Autowired(required=true)
    @Bean(name = "userDAO")
    public UserDAO getUserDAO(SessionFactory sessionFactory) {
    	return new UserDAOImpl(sessionFactory);
    }	
    @Autowired(required=true)
    @Bean(name = "categoryDAO")
    public CategoryDAO getCategoryDAO(SessionFactory sessionFactory) {
    	return new CategoryDAOImpl(sessionFactory);
    }
    @Autowired(required=true)
    @Bean(name="cartDAO")
    public CartDAO getCartDAO(SessionFactory sessionFactory){
    	return new CartDAOImpl(sessionFactory);
    }
}
