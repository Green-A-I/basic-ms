package com.myservice.firstproject.controller;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class MyController {

	@Value("${firstapplication.mysomevalue}")
	private String value;

	Logger logger = LogManager.getLogger(MyController.class);
	// we need to make this method as an endpoint...
	@GetMapping("/paymentDate")
	public Date getDate() {
		logger.info("info logger");
		return new Date();
	}

	@GetMapping("/paymentData")
	public String getData() {
		logger.info("info logger");
		return value;
	}
	
	//
	@GetMapping("/getCustomerName")
	public String getName() {
		return "Hi My name is Swapnil baba";
	}
	
	@PostMapping("/calculateLength")
	public String calculateLength(@RequestBody String name) {
		return "hello "+name;
	}
	
	
	
	
	
	
	
	
	
}
