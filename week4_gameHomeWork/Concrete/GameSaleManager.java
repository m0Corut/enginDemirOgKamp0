package Concrete;

import Abstract.ISalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Game;
public class GameSaleManager implements ISalesService{

	@Override
	public void sale(Customer customer, Game game) {

		System.out.println(customer.firstName+" adlý oyuncusuna "+game.name+"oyunu satýldý.");
		
		
	}

	@Override
	public void saleWithCampaign(Customer customer, Game game, Campaign campaign) {

		System.out.println(customer.firstName+" adlý oyuncusuna "+game.name+" oyunu "+(game.price-(game.price*campaign.discountPrice/100))+"TL indirimli haliyle satýldý");
		
		
	}
	
	
	
	

}
