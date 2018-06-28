package com.niit.emart.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.emart.dao.ProductDAO;
import com.niit.emart.model.Product;

public class ProductJUnitTest {
	private static AnnotationConfigApplicationContext context = null;
	private static Product product = null;
	private static ProductDAO productDAO = null;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.emart");
		context.refresh();

		product = (Product) context.getBean("product");// user is the original bean of the table
		productDAO = (ProductDAO) context.getBean("productDAO");// bean of dao impl
	}

	@Test
	public void testaddProductSuccess() {
		product.setProductName("Anshu");
		product.setProductDesc("Lakshmi Nagar");
		product.setPrice(21);
		product.setStock(5);
		product.setSupplierId(98);
		product.setCategoryId(7);

		assertEquals(true, productDAO.addProduct(product));

	}



}
