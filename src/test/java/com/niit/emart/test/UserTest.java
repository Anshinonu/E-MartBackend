package com.niit.emart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.emart.model.User;

public class UserTest {
	public static void main(String[] args )
  {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.emart");
		context.refresh();
		User userp=(User)context.getBean("User");
	
			System.out.println("Bean is created");
		context.close();
		
  }
}
		
			

