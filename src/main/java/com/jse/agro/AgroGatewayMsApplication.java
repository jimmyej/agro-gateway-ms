package com.jse.agro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AgroGatewayMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgroGatewayMsApplication.class, args);
	}

}
