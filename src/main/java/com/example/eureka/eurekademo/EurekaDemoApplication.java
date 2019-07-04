package com.example.eureka.eurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaDemoApplication {

	public static void main(String[] args) {
		System.out.println("eureka demo started . . .");
		SpringApplication.run(EurekaDemoApplication.class, args);
		System.out.println("eureka demo Ended . . .");
	}

}
