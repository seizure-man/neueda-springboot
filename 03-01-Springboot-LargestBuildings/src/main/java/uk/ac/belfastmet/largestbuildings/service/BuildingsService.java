package uk.ac.belfastmet.largestbuildings.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.largestbuildings.domain.LargeFloorAreaBuilding;
import uk.ac.belfastmet.largestbuildings.domain.LargeFootprintBuilding;
import uk.ac.belfastmet.largestbuildings.domain.LargeVolumeBuilding;;

@Service
public class BuildingsService {
	
	private ArrayList<LargeFloorAreaBuilding> largeFloorArea;
	private ArrayList<LargeFootprintBuilding> largeFootprint;
	private ArrayList<LargeVolumeBuilding> largeVolume;
	

	public BuildingsService() {
		super();
	}
	
	public ArrayList<LargeFloorAreaBuilding> getFloorArea()
	{
		ArrayList<LargeFloorAreaBuilding> floorareabuildings = new ArrayList<LargeFloorAreaBuilding>();
		
		LargeFloorAreaBuilding newcenturyglobalcenter = new LargeFloorAreaBuilding("1","New Century Global Center","China","Chengdu","1,760,000m\u00B2","lfa1.jpg");
		LargeFloorAreaBuilding dubaiinternationalairport = new LargeFloorAreaBuilding("2","Dubai International Airport Terminal 3","United Arab Emirates","Dubai","1,713,000m\u00B2","lfa2.jpg");
		LargeFloorAreaBuilding endowment = new LargeFloorAreaBuilding("3","Endowment","Saudi Arabia","Mecca","1,575,815m\u00B2","lfa3.jpg");
		LargeFloorAreaBuilding centralworld = new LargeFloorAreaBuilding("4","Central World","Thailand","Bangkok","1,024,000m\u00B2","lfa4.jpg");
		LargeFloorAreaBuilding aalsmeerflowerauction = new LargeFloorAreaBuilding("5","Aalsmeer Flower Auction","Netherlands","Aalsmeer","990,000m\u00B2","lfa5.jpg");
		LargeFloorAreaBuilding beijinginternationalairport = new LargeFloorAreaBuilding("6","Beijing Capital International Airport Terminal 3","China","Beijing","986,000m\u00B2","lfa6.jpg");
		LargeFloorAreaBuilding venetianmacao = new LargeFloorAreaBuilding("7","The Venetian Macao","Macau","Macau","980,000m\u00B2","lfa7.jpg");
		LargeFloorAreaBuilding sandscotaicentral = new LargeFloorAreaBuilding("8","Sands Cotai Central","Macau","Macau","890,000m\u00B2","lfa8.jpg");
		LargeFloorAreaBuilding ciputraworld = new LargeFloorAreaBuilding("9","Ciputra World","Indonesia","Surabaya","750,000m\u00B2","lfa9.jpg");
		LargeFloorAreaBuilding berjayatimessquare = new LargeFloorAreaBuilding("10","Berjaya Times Square","Malaysia","Kuala Lumpur","700,000m\u00B2","lfa10.jpg");
		
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
		
		LargeFootprintBuilding aalsmeerflowerauction = new LargeFootprintBuilding("1","Aalsmeer Flower Auction","Netherlands","Aalsmeer","518,000m\u00B2","lfp1.jpg");
		LargeFootprintBuilding teslafactory = new LargeFootprintBuilding("2","Tesla Factory","United States","Fremont","427,354m\u00B2","lfp2.jpg");
		LargeFootprintBuilding boeingfactory = new LargeFootprintBuilding("3","Boeing Everett Factory","United States","Everett","398,000m\u00B2","lfp3.jpg");
		LargeFootprintBuilding michelincenter = new LargeFootprintBuilding("4","Michelin Distribution Center","United States","Spartanburg","371,612m\u00B2","lfp4.jpg");
		LargeFootprintBuilding mosqueofmecca = new LargeFootprintBuilding("5","Great Mosque of Mecca","Saudi Arabia","Hijaz-Saudi Arabia","356,000m\u00B2","lfp1.jpg");
		LargeFootprintBuilding nike = new LargeFootprintBuilding("6","Nike Logistics Center","United States","Memphis","260,000m\u00B2","lfp6.jpg");
		LargeFootprintBuilding johndeere = new LargeFootprintBuilding("7","John Deere Distribution Center","United States","Milan","246,000m\u00B2","lfp7.jpg");
		LargeFootprintBuilding mallofdubai = new LargeFootprintBuilding("8","Mall of Dubai","United Arab Emirates","Dubai","500,000m\u00B2","lfp8.jpg");
		LargeFootprintBuilding mitsubishi = new LargeFootprintBuilding("9","Mitsubishi Motors","United States","Normal","220,000m\u00B2","lfp9.jpg");
		LargeFootprintBuilding indonesiaconvention = new LargeFootprintBuilding("10","Indonesia Convention Exhibition","Indonesia","Bumi Serpong Damai","220,000m\u00B2","lfp10.jpg");
		
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
	
	public ArrayList<LargeVolumeBuilding> getVolume()
	{
		ArrayList<LargeVolumeBuilding> volumebuildings = new ArrayList<LargeVolumeBuilding>();
		
		LargeVolumeBuilding boeingfactory = new LargeVolumeBuilding("1", "Boeing Everett Factory", "United States","Everett","13.3 million m\u00B3","lv1.jpg");
		LargeVolumeBuilding greatmosque = new LargeVolumeBuilding("2", "Great Mosque of Mecca", "Saudi Arabia","Hijaz-Saudi Arabia","8  million m\u00B3","lv2.jpg");
		LargeVolumeBuilding jeanluc = new LargeVolumeBuilding("3", "Jean-Luc Lagardere Plant", "France","Toulouse","5.6 million m\u00B3","lv3.jpg");
		LargeVolumeBuilding boeingcomposite = new LargeVolumeBuilding("4", "Boeing Composite Wing Center", "United States","Everett","3.7 million m\u00B3","lv4.jpg");
		LargeVolumeBuilding aerium = new LargeVolumeBuilding("5", "Aerium", "Germany","Halbe","5.2 million m\u00B3","lv5.jpg");
		LargeVolumeBuilding meyer = new LargeVolumeBuilding("6", "Meyer Werft Dockhalle 2", "Germany","Papenburg","4.72 million m\u00B3","lv6.jpg");
		LargeVolumeBuilding nasa = new LargeVolumeBuilding("7", "NASA Vehicle Assembly Building", "United States","Brevard County","3.66 million m\u00B3","lv7.jpg");
		LargeVolumeBuilding the02 = new LargeVolumeBuilding("8", "The 02", "United Kingdom","London","2.79 million m\u00B3","lv8.jpg");
		LargeVolumeBuilding tescoireland = new LargeVolumeBuilding("9", "	Tesco Ireland Distribution Centre", "Ireland","Donabate","1.55 million m\u00B3","lv9.jpg");
		LargeVolumeBuilding targetimport = new LargeVolumeBuilding("10", "Target Import Warehouse", "United States","Savannah","1.5 million m\u00B3","lv10.jpg");
		
		volumebuildings.add(boeingfactory);
		volumebuildings.add(greatmosque);
		volumebuildings.add(jeanluc);
		volumebuildings.add(boeingcomposite);
		volumebuildings.add(aerium);
		volumebuildings.add(meyer);
		volumebuildings.add(nasa);
		volumebuildings.add(the02);
		volumebuildings.add(tescoireland);
		volumebuildings.add(targetimport);
		
		return volumebuildings;
	}
	
	

}
