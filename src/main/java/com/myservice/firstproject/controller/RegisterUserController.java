package com.myservice.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myservice.firstproject.bean.UserDetails;
import com.myservice.firstproject.service.RegistrationService;

@RestController
@RequestMapping("/new-registration")
public class RegisterUserController {
	
	@Autowired
	RegistrationService registrationService;

	@PostMapping("/register")
	public String register(@RequestBody UserDetails userDetails) {
		// save to DB
		
	String res = registrationService.registerService(userDetails);
		
	return res;
	}
}
