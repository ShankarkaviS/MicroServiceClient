package com.hcl.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hcl.client.service.ClientServices"})
public class MicroServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceClientApplication.class, args);
	}

}
