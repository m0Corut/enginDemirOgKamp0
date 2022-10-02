package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicLocator;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceManager implements ICustomerCheckService{
	
	
	
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {
		
		
			KPSPublicSoapProxy client= new KPSPublicSoapProxy();
			
			boolean result= client.TCKimlikNoDogrula(Long.parseLong(customer.nationalIdenty), customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateOfBirth.getYear());
		
		
			return result;		
		
		
	}
	
	
	
	
	
	
	

}
