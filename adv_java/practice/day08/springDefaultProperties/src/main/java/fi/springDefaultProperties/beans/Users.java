package fi.springDefaultProperties.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Component       // no need to specify if you are creating bean in ApplicationConfiguration
public class Users {
	String userName;
	String password;
	
	
	public Users()
	{
		
	}
	
	
	public Users(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	@PostConstruct
	public void initialize()
	{
		System.out.println("initialize method of Users fired....");
	}
	
	@PreDestroy
	public void releaseResources()
	{
		System.out.println("releaseResources method of Users fired....");
	}
	
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
