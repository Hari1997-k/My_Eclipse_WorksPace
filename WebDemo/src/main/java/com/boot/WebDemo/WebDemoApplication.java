package com.boot.WebDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.boot.WebDemo.DAO.UserDAO;
import com.boot.WebDemo.Model.User;

@SpringBootApplication
public class WebDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebDemoApplication.class, args);
		
		User user = new User("Vishnu", null, "VishnuDev@gmail.com", "12340", null);
		UserDAO udao = new UserDAO();
		udao.CreateUser(user);
		
	}

}
