package fi.springJdbcDao;

import java.util.Iterator;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fi.springJdbcDao.beans.Users;
import fi.springJdbcDao.config.ApplicationConfiguration;
import fi.springJdbcDao.dao.UsersDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try (AnnotationConfigApplicationContext appContext = new 
        		AnnotationConfigApplicationContext(ApplicationConfiguration.class);
				Scanner sc = new Scanner(System.in)) {
        	
        	UsersDAO dao = (UsersDAO) appContext.getBean("userDAO");
        	
//        	dao.registerUser("smith", "smith123", "smith", "smith@cdac.com");
        	
        	Iterator<Users> allUsers = dao.getAllUsers();
        	while(allUsers.hasNext()) {
        		Users objUser = allUsers.next();
        		System.out.println(objUser);
        	}
        	
//        	System.out.println(dao.getUserDetails("shyam"));
        	dao.deleteUser("smith");
        	
        	dao.changePassword("ram", "ram456");
        	
        	Iterator<Users> allUsers2 = dao.getAllUsers();
        	while(allUsers2.hasNext()) {
        		Users objUser = allUsers2.next();
        		System.out.println(objUser);
        	}
        	
        	dao.fun();
		}
    }
}
