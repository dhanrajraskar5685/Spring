package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");
		Connection con = apc.getBean("m", Connection.class);

		con.conON();
		con.conOFF();
		System.out.println("+++++++++++++++++++++++++");

		Connection con1 = apc.getBean("o", Connection.class);

		con1.conON();
		con1.conOFF();
	}

}
