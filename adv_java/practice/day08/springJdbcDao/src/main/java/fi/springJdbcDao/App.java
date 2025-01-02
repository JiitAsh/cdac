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
        	
        	Iterator<Users> allUsers = dao.getAllUsers();
        	while(allUsers.hasNext()) {
        		Users objUser = allUsers.next();
        		System.out.println(objUser);
        	}
		}
    }
}
