package Entities;

import java.time.LocalDate;

import Concrete.CustomerManager;

public class Customer {
	

		public String id;
		public String firstName;
		public String lastName;
		public String nationalIdenty;
		public LocalDate dateOfBirth;
		
		
		public Customer(String id, String firstName, String lastName, String nationalIdenty, LocalDate dateOfBirth) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.nationalIdenty = nationalIdenty;
			this.dateOfBirth = dateOfBirth;
		}


	}
	

