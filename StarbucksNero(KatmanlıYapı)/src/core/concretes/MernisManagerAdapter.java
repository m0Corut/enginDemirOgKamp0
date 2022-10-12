package core.concretes;

import java.rmi.RemoteException;
import java.time.LocalDate;

import entities.concretes.Customer;
import business.abstracts.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManagerAdapter implements CustomerCheckService{
	

	KPSPublicSoapProxy client= new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		boolean result= client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdenty()), customer.getName(), customer.getLastName(),customer.getDateOfBirth().getYear());
		
		return result;
	}


	
	
	
	
	
	

}
