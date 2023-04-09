package com.empresa;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Candidate {
	
	private LocalDate dateOfBirth;
	private LocalDateTime starDate;
	private String dni;
	private String name;
	private String surname;
	private ContractType ct;
	private boolean inProject; 
	
	public final static Double EXPERIENCIA_PROFESIONAL = 0.05;
	

	public Candidate() {
		
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public LocalDateTime getStarDate() {
		return starDate;
	}


	public void setStarDate(LocalDateTime starDate) {
		this.starDate = starDate;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public ContractType getCt() {
		return ct;
	}


	public void setCt(ContractType ct) {
		this.ct = ct;
	}
	
	public int compareTo(Candidate otroCandidate) {
		return this.getStarDate().compareTo(otroCandidate.getStarDate());
		
	}

}
