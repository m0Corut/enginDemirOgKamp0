import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServisAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServisAdapter());
		customerManager.save(new Customer("1","Muhammet Ali","Corut","51364467466",LocalDate.of(2002, 5, 19)));
		
		System.out.println();
		
	}

}
