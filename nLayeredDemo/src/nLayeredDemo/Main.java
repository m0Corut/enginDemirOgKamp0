package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAcces.concretes.AbcProductDao;
import nLayeredDemo.dataAcces.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
	
		//ToDo Spring IoC ��z�lecek
	ProductService productService= new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
	
	
	Product product= new Product(1,2,"elma",12,50);
	productService.add(product);
	
	
	

	}

}
