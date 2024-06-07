package com.cloud.config.sever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class Eai1027CloudConfigSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Eai1027CloudConfigSeverApplication.class, args);
	}

}
