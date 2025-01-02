package fi.springAnnotBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fi.springAnnotBean.config.ApplicationConfiguration;

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
		
        	Users objUser = (Users)applicationContext.getBean("objUser");
        	
        	Users secUser = (Users)applicationContext.getBean("objUser");
        	secUser.setUserName("Smith");
        	secUser.setPassword("smith123");
        	
        	System.out.println(objUser.getUserName());
        	System.out.println(objUser.getPassword());
        	System.out.println("*******************");
        	
        	
        	System.out.println(secUser.getUserName());
        	System.out.println(secUser.getPassword());
        	
        	
        
        }
        
        
    }
}
