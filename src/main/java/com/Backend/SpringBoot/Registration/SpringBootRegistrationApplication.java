package com.Backend.SpringBoot.Registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.Backend.SpringBoot.Registration.Service.EmployeeService"})
public class SpringBootRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRegistrationApplication.class, args);
	}

}
