package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//代表这个应用是一个Eureka的服务注册中心
public class ServerRegiserApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerRegiserApplication.class, args);
	}
}
