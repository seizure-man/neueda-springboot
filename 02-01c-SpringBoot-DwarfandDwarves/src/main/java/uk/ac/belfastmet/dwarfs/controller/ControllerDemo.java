package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/disneyrocks/")
public class ControllerDemo {
	
	@GetMapping("/")
	public String disney(Model model)
	{
		return "Hello world";
	}
	
	@GetMapping("/bingo")
	public String dog(Model model) {
		return "There was a dog in our backyard...";
	}
	
	@GetMapping("/princess")
	public String princess(Model model)
	{
		return "Meghan Markle";
	}

}
