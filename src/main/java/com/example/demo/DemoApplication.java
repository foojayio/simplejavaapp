package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

        public void unsafeMethod(String userInput) {
                String query = "SELECT * FROM users WHERE name = '" + userInput + "'";
                response.getWriter().println(userInput);
        }

}
