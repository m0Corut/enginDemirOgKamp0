package Concrete;
import java.rmi.RemoteException;

import Abstract.*;
import Entities.*;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;
	
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
		
	}


	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		
		else {
			
			System.out.println("not a valid person");
		}
		
			
	}
	
	
	

}
