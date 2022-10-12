package dataAcces.concretes;

import java.util.List;

import dataAcces.abstracts.CustomerDao;
import entities.concretes.Customer;

public class AbcCustomerDao implements CustomerDao{

	public void add(Customer customer) {
		
		System.out.println("veri tabanưna eklendi: "+customer.getId());
		
	}
	
	public void delete(Customer customer) {
		
		System.out.println("veri tabanưndan silindi: "+customer.getId());
	}
	
	public Customer get(Customer customer) {
		
		return customer;
		
	}

}
