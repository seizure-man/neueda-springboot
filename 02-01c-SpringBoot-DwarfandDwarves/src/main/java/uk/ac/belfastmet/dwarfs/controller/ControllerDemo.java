package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class ControllerDemo {
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("pageTitle", "Dwarf City Bitch");
		return "homepage";
	}

}
