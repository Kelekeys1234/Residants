package com.Resident.assignment.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ResisdentService {
	@Autowired
	ResidentRepository residentRepository;
	@Autowired
	EmailValidator emailValidator;
	// save new resident
	public Resident saveResident(Resident resident) {
		boolean valid = emailValidator.test(resident.getEmail());
		if(!valid) {
			new Exception("Email address not valid");
		}
		
		return  residentRepository.save(resident);
		
	}
	// remove resident
	public void removeResisdent(Long residentId) throws Exception {
	             residentRepository.deleteById(residentId);
		
	}
	//Update Resident
	public Resident updateResident(Long residentId , Resident user) throws Exception {
		Resident getId = residentRepository.findById(residentId).orElseThrow(()-> new Exception("users not found"));
	     getId.setFirstName(user.getFirstName());
	     getId.setLastName(user.getLastName());
	     getId.setEmail(user.getEmail());
	     Resident save = residentRepository.save(getId);
	     return save;
		
	}
	
	//getAll Resident
	public List<Resident> getAllResident(){
		return residentRepository.findAll();
	}

}
