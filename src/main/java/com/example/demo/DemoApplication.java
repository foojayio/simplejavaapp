package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public List<String> addUsers(List<User> users) {
         List<String> items = new ArrayList<>();
         for (User user : users) {
           items.add(user.getName());
         } 
         return items;
        } 

}
