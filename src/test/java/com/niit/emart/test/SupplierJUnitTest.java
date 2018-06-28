package com.niit.emart.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.emart.dao.SupplierDAO;
import com.niit.emart.model.Supplier;

public class SupplierJUnitTest {
	private static AnnotationConfigApplicationContext context = null;
	private static Supplier supplier = null;
	private static SupplierDAO supplierDAO = null;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.emart");
		context.refresh();

		supplier= (Supplier) context.getBean("supplier");// user is the original bean of the table
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");// bean of dao impl
	}

	@Test
	public void testaddSupplierSuccess() {
		supplier.setSupplierName("Anshu");
		supplier.setSupplierAddr("Lakshmi Nagar");
		
		assertEquals(true, supplierDAO.addSupplier(supplier));

	}



}
