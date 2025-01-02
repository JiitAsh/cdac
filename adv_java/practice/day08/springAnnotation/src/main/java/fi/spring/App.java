package fi.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fi.spring.beans.Users;
import fi.spring.config.ApplicationConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
        	
        	Users objUser = (Users) applicationContext.getBean("objUser");
        	System.out.println(objUser.getPassword());
        	System.out.println(objUser.getUserName());
		}
        
        
        
    }
}
