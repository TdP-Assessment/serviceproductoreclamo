package com.prueba.producto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductoyreclamoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductoyreclamoApplication.class, args);
	}

}
