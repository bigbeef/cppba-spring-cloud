package com.cppba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CppbaSpringCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CppbaSpringCloudEurekaApplication.class, args);
	}
}
