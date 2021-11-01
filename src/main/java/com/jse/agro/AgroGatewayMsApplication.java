package com.jse.agro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AgroGatewayMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgroGatewayMsApplication.class, args);
	}

}
