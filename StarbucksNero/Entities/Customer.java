package Entities;

import java.time.LocalDate;

import Abstract.Entity;



public class Customer implements Entity{

	private String id;
	private String firstName;
	private String lastName;
	private String nationalIdenty;
	private LocalDate dateOfBirth;
	
	
	public Customer(String id, String firstName, String lastName, String nationalIdenty, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdenty = nationalIdenty;
		this.dateOfBirth = dateOfBirth;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public String getNationalIdenty() {
		return nationalIdenty;
	}


	public void setNationalIdenty(String nationalIdenty) {
		this.nationalIdenty = nationalIdenty;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		dateOfBirth = dateOfBirth;
	}
	
	
	
	
	
}
