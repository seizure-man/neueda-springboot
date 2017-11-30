package uk.ac.belfastmet.largestbuildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.largestbuildings.service.BuildingsService;

@Controller
@RequestMapping("/floorarea/")
public class FloorAreaController {
	
	@Autowired
	private BuildingsService largefloorareaservice;
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("pageTitle", "Largest Floor Area");
		this.largefloorareaservice = new BuildingsService();
		model.addAttribute("floorareabuildings",this.largefloorareaservice.getFloorArea());
		return "largestfloorareapage";
	}

}
