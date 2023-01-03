package com.myservice.firstproject.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UserDetails {

	@Size(min = 3,message = "name should not be less than 3")
	private String name;

	@Size(min = 10,max = 10, message = "mob number should be 10 digits")
	private String mobNum;

	@Email
	private  String email;


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	
	
}
