import java.rmi.RemoteException;
import java.time.LocalDate;

import business.abstracts.BaseCustomerManager;
import business.concretes.StarbucksCustomerManager;
import core.concretes.MernisManagerAdapter;
import dataAcces.concretes.AbcCustomerDao;
import entities.concretes.Customer;
import dataAcces.abstracts.CustomerDao;


public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		
		Customer customer=new Customer("1","Muhammet Ali","Corut","51364467466",LocalDate.of(2002, 5, 19));
		
		AbcCustomerDao dao= new AbcCustomerDao();
		
		
		BaseCustomerManager customerManager= new StarbucksCustomerManager(dao,new MernisManagerAdapter());
		
		
		
		customerManager.add(customer);
		
		

		
	}

}
