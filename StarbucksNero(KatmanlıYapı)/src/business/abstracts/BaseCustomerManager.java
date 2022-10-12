package business.abstracts;

import java.rmi.RemoteException;

import dataAcces.abstracts.CustomerDao;
import entities.concretes.Customer;

public abstract class BaseCustomerManager {
	
	protected CustomerDao customerDao;
	
	public BaseCustomerManager(CustomerDao customerDao) {
		
		this.customerDao=customerDao;
		
	}


	public void add(Customer customer) throws NumberFormatException, RemoteException {
				
		customerDao.add(customer);
		
		
	}
	
	
}
