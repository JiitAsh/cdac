package fi.springDefaultProperties.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import fi.springDefaultProperties.beans.Users;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {
	@Bean
//	@Scope(scopeName="prototype")
	public Users objUser(@Value("${default.username}") String usr, @Value("${default.password}") String pwd) {
		return new Users(usr, pwd);
	}
}
