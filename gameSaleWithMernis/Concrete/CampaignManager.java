package Concrete;
import Abstract.*;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.name+" yeni kampanya eklendi : ");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.name+" kampanya silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.name+" kampanya gŁncellendi");
		
	}
	

	
	
	

}
