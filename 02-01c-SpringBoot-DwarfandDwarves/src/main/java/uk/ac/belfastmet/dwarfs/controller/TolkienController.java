package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/tolk/")
public class TolkienController {
	
	@GetMapping("/")
	public String tolkien(Model model)
	{
		return "tolkienPage";
	}

}
