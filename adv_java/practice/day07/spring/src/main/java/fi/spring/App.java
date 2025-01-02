package fi.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("first-beans-app.xml");
		
		Users objUser = (Users)applicationContext.getBean("objUser");
		System.out.println(objUser.getPassword());
		System.out.println(objUser.getUserName());
	}
}
