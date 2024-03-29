package com.habte.maintenance_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
public class MaintenanceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaintenanceManagementApplication.class, args);
		System.out.println("Welcome");
	}

}
