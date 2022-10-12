package business.concretes;

import java.rmi.RemoteException;

import business.abstracts.BaseCustomerManager;
import business.abstracts.CustomerCheckService;
import dataAcces.abstracts.CustomerDao;
import entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	 CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerDao customerDao,CustomerCheckService customerCheckService) {
		
	super(customerDao);
	this.customerCheckService=customerCheckService;
	
	}



	@Override
	public void add(Customer customer) throws NumberFormatException, RemoteException {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
		customerDao.add(customer);
	
			
		}
		
		else
			System.out.println("not valid a person");
		
		
	}
	
	
	
	
	

}
