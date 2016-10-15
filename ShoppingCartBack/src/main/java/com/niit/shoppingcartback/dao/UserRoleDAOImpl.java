package com.niit.shoppingcartback.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcartback.model.UserRole;

@Repository("UserRoleDAO")
public class UserRoleDAOImpl implements UserRoleDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public UserRole get(String username) {
		
		
		String hql = "from UserRole where username ='"+ username +"'";
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<UserRole> listUser = (List<UserRole>) query.list();
		
		if (listUser != null && !listUser.isEmpty()){
			return listUser.get(0);
		}
		return null;
	}
}
