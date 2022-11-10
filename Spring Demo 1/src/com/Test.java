package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("NewFile.xml");

		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Connection con = (Connection) beanFactory.getBean("m");
		Connection con1 = (Connection) beanFactory.getBean("m");
		Connection con2 = (Connection) beanFactory.getBean("m");
		con.conON();
		con.conOFF();
		System.out.println(con==con1);
		System.out.println(con1==con2 );
		
		System.out.println("++++++++++++++++++++++++++++");
		Connection con0 = (Connection) beanFactory.getBean("m");
		con1.conON();
		con1.conOFF();
	}

}
