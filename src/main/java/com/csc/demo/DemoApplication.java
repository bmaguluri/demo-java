package com.csc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

private static final String MY_SECRET = "47828a8dd77ee1eb9dde2d5e93cb221ce8c32b37";
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String pwd = "ER34@#dafdfasdf";
	
	  String uname = "steve";
  String password = "blue";
  conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
        "user=" + uname + "&password=" + password); // Sensitive
			String AWSToken = "wqerer45673535";
	}

}
