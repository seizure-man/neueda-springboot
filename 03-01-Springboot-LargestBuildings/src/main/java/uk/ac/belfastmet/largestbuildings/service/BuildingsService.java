package uk.ac.belfastmet.largestbuildings.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.largestbuildings.domain.LargeFloorAreaBuilding;
import uk.ac.belfastmet.largestbuildings.domain.LargeFootprintBuilding;;

@Service
public class BuildingsService {
	
	private ArrayList<LargeFloorAreaBuilding> largeFloorArea;
	private ArrayList<LargeFootprintBuilding> largeFootprint;
	

	public BuildingsService() {
		super();
	}
	
	public ArrayList<LargeFloorAreaBuilding> getFloorArea()
	{
		ArrayList<LargeFloorAreaBuilding> floorareabuildings = new ArrayList<LargeFloorAreaBuilding>();
		
		LargeFloorAreaBuilding newcenturyglobalcenter = new LargeFloorAreaBuilding("1","New Century Global Center","China","Chengdu","1,760,000 m2","lfa1.jpg");
		LargeFloorAreaBuilding dubaiinternationalairport = new LargeFloorAreaBuilding("2","Dubai International Airport Terminal 3","United Arab Emirates","Dubai","1,713,000 m2","lfa2.jpg");
		LargeFloorAreaBuilding endowment = new LargeFloorAreaBuilding("3","Endowment","Saudi Arabia","Mecca","1,575,815 m2","lfa3.jpg");
		LargeFloorAreaBuilding centralworld = new LargeFloorAreaBuilding("4","Central World","Thailand","Bangkok","1,024,000 m2","lfa4.jpg");
		LargeFloorAreaBuilding aalsmeerflowerauction = new LargeFloorAreaBuilding("5","Aalsmeer Flower Auction","Netherlands","Aalsmeer","990,000 m2","lfa5.jpg");
		LargeFloorAreaBuilding beijinginternationalairport = new LargeFloorAreaBuilding("6","Beijing Capital International Airport Terminal 3","China","Beijing","986,000 m2","lfa6.jpg");
		LargeFloorAreaBuilding venetianmacao = new LargeFloorAreaBuilding("7","The Venetian Macao","Macau","Macau","980,000 m2","lfa7.jpg");
		LargeFloorAreaBuilding sandscotaicentral = new LargeFloorAreaBuilding("8","Sands Cotai Central","Macau","Macau","890,000 m2","lfa8.jpg");
		LargeFloorAreaBuilding ciputraworld = new LargeFloorAreaBuilding("9","Ciputra World","Indonesia","Surabaya","750,000 m2","lfa9.jpg");
		LargeFloorAreaBuilding berjayatimessquare = new LargeFloorAreaBuilding("10","Berjaya Times Square","Malaysia","Kuala Lumpur","700,000 m2","lfa10.jpg");
		
		floorareabuildings.add(newcenturyglobalcenter);
		floorareabuildings.add(dubaiinternationalairport);
		floorareabuildings.add(endowment);
		floorareabuildings.add(centralworld);
		floorareabuildings.add(aalsmeerflowerauction);
		floorareabuildings.add(beijinginternationalairport);
		floorareabuildings.add(venetianmacao);
		floorareabuildings.add(sandscotaicentral);
		floorareabuildings.add(ciputraworld);
		floorareabuildings.add(berjayatimessquare);
		
		return floorareabuildings;
	}
	
	public ArrayList<LargeFootprintBuilding> getFootprint()
	{
		ArrayList<LargeFootprintBuilding> footprintbuildings = new ArrayList<LargeFootprintBuilding>();
		
		LargeFootprintBuilding aalsmeerflowerauction = new LargeFootprintBuilding("5","Aalsmeer Flower Auction","Netherlands","Aalsmeer","518,000 m2","lfa5.jpg");
		LargeFootprintBuilding teslafactory = new LargeFootprintBuilding("2","Tesla Factory","United States","Fremont","427,354 m2","lfa2.jpg");
		LargeFootprintBuilding boeingfactory = new LargeFootprintBuilding("3","Boeing Everett Factory","United States","Everett","398,000 m2","lfa3.jpg");
		LargeFootprintBuilding michelincenter = new LargeFootprintBuilding("4","Michelin Distribution Center","United States","Spartanburg","371,612 m2","lfa4.jpg");
		LargeFootprintBuilding mosqueofmecca = new LargeFootprintBuilding("5","Great Mosque of Mecca","Saudi Arabia","Hijaz-Saudi Arabia","356,000  m2","lfa1.jpg");
		LargeFootprintBuilding nike = new LargeFootprintBuilding("6","Nike Logistics Center","United States","Memphis","260,000 m2","lfa6.jpg");
		LargeFootprintBuilding johndeere = new LargeFootprintBuilding("7","John Deere Distribution Center","United States","Milan","246,000 m2","lfa7.jpg");
		LargeFootprintBuilding mallofdubai = new LargeFootprintBuilding("8","Mall of Dubai","United Arab Emirates","Dubai","500,000 m2","lfa8.jpg");
		LargeFootprintBuilding mitsubishi = new LargeFootprintBuilding("9","Mitsubishi Motors","United States","Normal","220,000 m2","lfa9.jpg");
		LargeFootprintBuilding indonesiaconvention = new LargeFootprintBuilding("10","Indonesia Convention Exhibition","Indonesia","Bumi Serpong Damai","220,000 m2","lfa10.jpg");
		
		footprintbuildings.add(aalsmeerflowerauction);
		footprintbuildings.add(teslafactory);
		footprintbuildings.add(boeingfactory);
		footprintbuildings.add(michelincenter);
		footprintbuildings.add(mosqueofmecca);
		footprintbuildings.add(nike);
		footprintbuildings.add(johndeere);
		footprintbuildings.add(mallofdubai);
		footprintbuildings.add(mitsubishi);
		footprintbuildings.add(indonesiaconvention);
		
		return footprintbuildings;
	}
	
	

}
