package com.myservice.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FirstprojectApplication {

	@Bean
	RestTemplate getRestTemplete(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}

}
