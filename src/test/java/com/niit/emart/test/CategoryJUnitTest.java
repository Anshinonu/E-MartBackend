package com.niit.emart.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.emart.dao.CategoryDAO;
import com.niit.emart.model.Category;

public class CategoryJUnitTest {
	private static AnnotationConfigApplicationContext context = null;
	private static Category category = null;
	private static CategoryDAO categoryDAO = null;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.emart");
		context.refresh();

		category = (Category) context.getBean("category");// user is the original bean of the table
		categoryDAO  = (CategoryDAO) context.getBean("Category");// bean of dao impl
	}

	@Test
	public void testaddCategorySuccess() {
		category.setCategoryName("Lenovo");
		category.setCategoryDesc("lenovo mobiles");
		

		assertEquals(true, categoryDAO.addCategory(category));

	}


}
