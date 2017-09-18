package com.cppba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class SpringCloudEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClientApplication.class, args);
    }
}
