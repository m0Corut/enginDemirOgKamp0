package Abstract;
import java.rmi.RemoteException;

import Entities.*;

public interface ICustomerService {

	public void add(Customer customer) throws RemoteException;
	
	public void delete(Customer customer);
	
	public void update(Customer customer);
	
	
	
}
