package uk.ac.belfastmet.largestbuildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.largestbuildings.service.BuildingsService;


@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

	@Autowired
	private BuildingsService buildingService;

	
	@GetMapping("/")
	public String home(Model model) {
		
		return "homePage";
	}
	
	@GetMapping("/footprint")
	public String largestFootprint(Model model) {
		this.buildingService = new BuildingsService();
		model.addAttribute("footprintbuildings",this.buildingService.getFootprint());
		return "largestfootprintpage";
	}
	
	@GetMapping("/volume")
	public String largestUsableVolume(Model model) {
		this.buildingService = new BuildingsService();
		model.addAttribute("volumebuildings",this.buildingService.getVolume());
		return "largestvolumepage";
	}
	
	@GetMapping("/floorarea")
	public String largestFloorArea(Model model) {
		this.buildingService = new BuildingsService();
		model.addAttribute("floorareabuildings",this.buildingService.getFloorArea());
		return "largestfloorareapage";
	}
	
	
}
