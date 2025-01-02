package fi.springDefaultProperties;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fi.springDefaultProperties.beans.Users;
import fi.springDefaultProperties.config.ApplicationConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
			Users userOne = (Users) appContext.getBean("objUser");
			
			Users userTwo = (Users) appContext.getBean("objUser");
			userTwo.setPassword("smith123");
			userTwo.setUserName("Smith"); 
			
			
			System.out.println(userOne.getUserName());
			System.out.println(userOne.getPassword());
			System.out.println("*******************");
			System.out.println(userTwo.getUserName());
			System.out.println(userTwo.getPassword());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }
}
