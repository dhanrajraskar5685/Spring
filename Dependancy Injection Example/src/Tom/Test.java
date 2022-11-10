package Tom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap = new ClassPathXmlApplicationContext("Tom/NewFile.xml");
		Student student = ap.getBean("s", Student.class);

		System.out.println(student);

	}

}
