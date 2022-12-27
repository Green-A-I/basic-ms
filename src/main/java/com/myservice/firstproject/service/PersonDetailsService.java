package com.myservice.firstproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myservice.firstproject.entity.PersonDetails;
import com.myservice.firstproject.repository.PersonDetailsRepo;

@Service
public class PersonDetailsService {

	@Autowired
	private PersonDetailsRepo personDetailsRepo;
	
	
	public String savePersonToDB(PersonDetails details) {
		try {
			personDetailsRepo.save(details);
			return "Successfully saved to DB";
		}
		catch(Exception e){
			return "failed to save in DB reason : "+e.getLocalizedMessage();
		}
		
		
	}
}
