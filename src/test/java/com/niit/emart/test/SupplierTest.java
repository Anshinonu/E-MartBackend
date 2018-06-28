package com.niit.emart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.emart.model.Supplier;

public class SupplierTest {
	public static void main(String[] args )
	  {
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.niit.emart");
			context.refresh();
			Supplier supplier=(Supplier)context.getBean("Supplier");
		
				System.out.println("Bean is created");
			context.close();
	  }

}
