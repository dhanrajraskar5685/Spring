package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap = new ClassPathXmlApplicationContext("com/NewFile.xml");

		Product product = ap.getBean("p", Product.class);
		System.out.println(product);

//		System.out.println(product.getId());
//		System.out.println(product.getName());
//		System.out.println(product.getPrice());
	}

}
