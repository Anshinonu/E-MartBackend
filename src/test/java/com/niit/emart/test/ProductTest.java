package com.niit.emart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.emart.model.Product;

public class ProductTest {
	public static void main(String[] args )
	  {
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.niit.emart");
			context.refresh();
			Product prop=(Product)context.getBean("Product");
		
				System.out.println("Bean is created");
			context.close();
	  }
}
