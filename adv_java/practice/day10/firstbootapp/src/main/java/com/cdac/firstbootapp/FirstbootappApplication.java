package com.cdac.firstbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cdac.firstbootapp.beans.Users;

@SpringBootApplication
public class FirstbootappApplication implements CommandLineRunner {
	
	@Autowired       // here we use @Autowired bcz Users already created and now here we want to add/use Users, so @Autowired will handle this automatically
	Users objUser;

	public static void main(String[] args) {
		SpringApplication.run(FirstbootappApplication.class, args);
		System.out.println("Hello Programmer :)");
	}
	
	
	// here run() method will execute, but main() also will execute and the sequence of execution is first run() will execute and then main()

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		objUser.setUserName("Jitesh");
		objUser.setPassword("jitesh123");
		
		System.out.println(objUser);
	}

}
