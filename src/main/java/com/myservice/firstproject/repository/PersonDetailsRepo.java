package com.myservice.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myservice.firstproject.entity.PersonDetails;

@Repository
public interface PersonDetailsRepo extends JpaRepository<PersonDetails, String>{

}
