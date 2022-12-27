package com.myservice.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myservice.firstproject.bean.UserDetails;
import com.myservice.firstproject.entity.PersonDetails;
import com.myservice.firstproject.service.PersonDetailsService;
import com.myservice.firstproject.service.RegistrationService;

@RestController
@RequestMapping("/new-registration")
public class RegisterUserController {
	
	@Autowired
	RegistrationService registrationService;
	
	@Autowired
	private PersonDetailsService personDetailsService;

	@PostMapping("/register")
	public String register(@RequestBody UserDetails userDetails) {
		// save to DB
		
	String res = registrationService.registerService(userDetails);
		
	return res;
	}
	
	
	@PostMapping("/saveWithCountry")
	public String saveWithCountry(@RequestHeader HttpHeaders httpHeaders,   @RequestBody String personName) {
		
		String headerValue = httpHeaders.get("HEADER_NAME").get(0);
		return "Successfully saved name : "+personName+ "  "+ headerValue;
	}
	
	@PostMapping("/register-person")
	public String registerPerson(@RequestBody PersonDetails personDetails) {
		String response = personDetailsService.savePersonToDB(personDetails);
		
	return response;
	}
	
	
}
