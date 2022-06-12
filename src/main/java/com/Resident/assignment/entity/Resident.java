package com.Resident.assignment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="Resident")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Resident {
     @Id
 	@GeneratedValue(strategy = GenerationType.AUTO)
 	private Long residentId;
	 
	 private String firstName;
	 
	 private String lastName;
	 
	 private String Email;

	public Long getResidentId() {
		return residentId;
	}

	public void setResidentId(Long residentId) {
		this.residentId = residentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Resident() {
		super();
	}
	 
	 
	
	 
}
