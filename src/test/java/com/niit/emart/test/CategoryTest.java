package com.niit.emart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.emart.model.Category;

public class CategoryTest {
	public static void main(String[] args )
	  {
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.niit.emart");
			context.refresh();
			Category category=(Category)context.getBean("Category");
		
				System.out.println("Bean is created");
			context.close();
	  }
}
