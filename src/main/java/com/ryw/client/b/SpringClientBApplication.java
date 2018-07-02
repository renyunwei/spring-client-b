package com.ryw.client.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringClientBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClientBApplication.class, args);
	}
}
