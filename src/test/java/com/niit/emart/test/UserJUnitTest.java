package com.niit.emart.test;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.emart.model.User;
import com.niit.emart.dao.UserDAO;

public class UserJUnitTest {
	private static AnnotationConfigApplicationContext context = null;
	private static User user = null;
	private static UserDAO userDAO = null;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.emart");
		context.refresh();

		user = (User) context.getBean("user");// user is the original bean of the table
		userDAO = (UserDAO) context.getBean("userDAO");// bean of dao impl
	}

	@Test
	public void testSaveUserSuccess() {
		user.setUsername("Anshu");
		user.setAddress("Lakshmi Nagar");
		user.setAge(21);
		user.setEmailId("anshita1997@gmail.com");
		user.setPhone(9875643);
		user.setPassword("hsyqdu");

		assertEquals(true, userDAO.saveUser(user));

	}

}