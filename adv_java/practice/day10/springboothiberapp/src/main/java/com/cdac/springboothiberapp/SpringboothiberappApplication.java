package com.cdac.springboothiberapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.cdac.springboothiberapp.entity.Users;

@SpringBootApplication
@EntityScan(basePackages= {"com.cdac.springboothiberapp.entity"})
public class SpringboothiberappApplication implements CommandLineRunner {

	@Autowired
	SessionFactory hibernateFactory;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringboothiberappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try (// TODO Auto-generated method stub
		 Session hibernateSession = hibernateFactory.openSession()) {
			Users objUser=(Users)hibernateSession.get(Users.class, "karen");
			System.out.println(objUser);
		}
	}

}