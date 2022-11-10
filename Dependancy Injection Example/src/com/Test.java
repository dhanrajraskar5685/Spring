package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/NewFile.xml");

		Employee employee = (Employee) ac.getBean("e");
		//System.out.println(employee);
		System.out.println(employee.getEid());
		System.out.println(employee.getEname());
		System.out.println(employee.getAddress());
		System.out.println(employee.getCompany().getCid());
		System.out.println(employee.getCompany().getName());
	}

}
