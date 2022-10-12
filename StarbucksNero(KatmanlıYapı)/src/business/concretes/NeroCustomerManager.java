package business.concretes;

import business.abstracts.BaseCustomerManager;
import dataAcces.abstracts.CustomerDao;

public class NeroCustomerManager extends BaseCustomerManager{

CustomerDao customerDao;
	
	
	public NeroCustomerManager( CustomerDao customerDao) {
	
		super(customerDao);

	}

	
}
