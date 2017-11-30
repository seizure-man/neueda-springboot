/*package uk.ac.belfastmet.largestbuildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.largestbuildings.service.BuildingsService;

@Controller
@RequestMapping("/volume/")
public class VolumeController {
	
	@Autowired
	private BuildingsService volumeservice;
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("pageTitle", "Largest Volume");
		this.volumeservice = new BuildingsService();
		model.addAttribute("volumebuildings",this.volumeservice.getVolume());
		return "largestvolumepage";
	}

}
*/