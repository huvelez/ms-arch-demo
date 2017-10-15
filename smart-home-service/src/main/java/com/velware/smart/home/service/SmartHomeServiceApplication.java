package com.velware.smart.home.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class SmartHomeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartHomeServiceApplication.class, args);
	}
}
