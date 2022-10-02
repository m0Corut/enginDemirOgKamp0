package Concrete;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class CustomerManager implements ICustomerService{
	
	ICustomerCheckService checkService;
	
	public CustomerManager(ICustomerCheckService checkService) {
		
		this.checkService=checkService;
		
	}
	
	
	
	public void add(Customer customer) throws RemoteException {
		
		
		if(checkService.CheckIfRealPerson(customer)) {
			
			System.out.println("Sisteme kayýt olundu: "+customer.firstName);
		}
		
		
		
	}
	
	public void delete(Customer customer) {
		
		
		System.out.println("Sistemden kayýt silindi: "+customer.firstName);

		
		
	}
	
	public void update(Customer customer) {
		
		System.out.println("Bilgileri güncellendi: "+customer.firstName);
		
		
		
	}



}
