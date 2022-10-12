package entities.concretes;

import java.time.LocalDate;

import entities.abstracts.Entity;

public class Customer implements Entity{

	private String id;
	private String name;
	private String lastName;
	private String nationalIdenty;
	private LocalDate dateOfBirth;
	
	
	public Customer(String id, String name, String lastName, String nationalIdenty, LocalDate dateOfBirth) {
		
		
		super();
		this.id = id;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}




	
	
	
	
	
}
