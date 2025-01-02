package fi.springAnnotBean.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import fi.springAnnotBean.Users;

@Configuration
public class ApplicationConfiguration {

//	@Bean
//	@Scope(scopeName="prototype")
//	public Users objUser() {
//		return new Users("ramesh","ramesh123");
//	}
	
	@Bean
	public Users objUser(@Value("JohnDoe") String username, @Value("Johndoe123") String pswd) {
		return new Users(username, pswd);
	}
}
