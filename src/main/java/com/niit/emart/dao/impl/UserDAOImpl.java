package com.niit.emart.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.emart.dao.UserDAO;
import com.niit.emart.model.User;


@Repository(value = "userDAO")
@Transactional // it provides acid property
public class UserDAOImpl implements UserDAO {
	// to hide the implementation data we use interface class and it is loose
	// coupling and also used in factory pattern
	@Autowired
	private SessionFactory sessionFactory;

	public boolean saveUser(User user) {
		try {
			sessionFactory.getCurrentSession().save(user);

			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
