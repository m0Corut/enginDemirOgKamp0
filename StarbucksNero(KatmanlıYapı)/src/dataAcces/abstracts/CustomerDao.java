package dataAcces.abstracts;

import java.util.List;

import entities.concretes.Customer;

public interface CustomerDao {
	
	public void add(Customer customer);
	public void delete(Customer customer);
	public Customer get(Customer customer);
	
	
	
	
}
