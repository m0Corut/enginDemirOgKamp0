package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface ISalesService {
	
	public void sale(Customer customer,Game game);
	
	public void saleWithCampaign(Customer customer,Game game,Campaign campaign);
	
	
	
	

}
