import java.rmi.RemoteException;
import java.time.LocalDate;

import Adapters.MernisServiceManager;
import Concrete.CustomerManager;
import Concrete.GameSaleManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Customer customer =new Customer("1","Alperen","Özcan","47956940790",LocalDate.of(2002, 6, 20));
		
		Game game = new Game(413124,"valorant",100);
		Campaign campaign= new Campaign(152,"Sezon sonu indirimi",30);

		
		
		CustomerManager customerManager= new CustomerManager(new MernisServiceManager());
		
		customerManager.add(customer);

		GameSaleManager saleManager= new GameSaleManager();
		
		saleManager.saleWithCampaign(customer, game, campaign);
		
		
		
		
		
		
	}

}
