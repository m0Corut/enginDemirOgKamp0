package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServisAdapter implements CustomerCheckService{
	
	
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {

	boolean result= client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdenty()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		
		
		return result;
	}

	
	
}
