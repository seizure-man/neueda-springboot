/*package uk.ac.belfastmet.largestbuildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.largestbuildings.service.BuildingsService;

@Controller
@RequestMapping("/footprint/")
public class FootprintController {
	
	@Autowired
	private BuildingsService largefootprintservice;
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("pageTitle", "Largest Footprint");
		this.largefootprintservice = new BuildingsService();
		model.addAttribute("footprintbuildings",this.largefootprintservice.getFootprint());
		return "largestfootprintpage";
	}

}
*/