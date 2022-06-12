package com.Resident.assignment.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resident")
public class ResidentController {
	@Autowired
	ResisdentService residentService;
	@PostMapping("/SaveResident")
	
	//Save resident
	public Resident save(@RequestBody Resident resident) {
	Resident saveAll = residentService.saveResident(resident);
		return saveAll;
	}
	
	//Modify Resident
	@PostMapping("/update/{residentId}")
	
	public Resident modifyResident(@RequestBody Resident user , @PathVariable Long residentId) throws Exception {
	  Resident update = residentService.updateResident(residentId, user);
	  return update;
}
	
	//Delete Resident
	public void delete(@PathVariable Long residentId) throws Exception {
		residentService.removeResisdent(residentId);
		
	}
	// Get All Resident
	public List<Resident> getAll(){
		return residentService.getAllResident();
	}
}