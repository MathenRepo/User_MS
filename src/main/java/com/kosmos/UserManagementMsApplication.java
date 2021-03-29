package com.kosmos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.kosmos")
public class UserManagementMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementMsApplication.class, args);
	}

}
