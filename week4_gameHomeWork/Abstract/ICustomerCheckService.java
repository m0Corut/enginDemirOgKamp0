package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerCheckService {
	
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException;
	
	
	

}
