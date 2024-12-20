package com.example.discoveryserver3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServer3Application {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServer3Application.class, args);
    }

}
