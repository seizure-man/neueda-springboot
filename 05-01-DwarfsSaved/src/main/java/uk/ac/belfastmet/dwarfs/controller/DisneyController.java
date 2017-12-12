package uk.ac.belfastmet.dwarfs.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.repositories.DwarfRepository;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/disney/")
public class DisneyController {
	

	@Autowired
	DwarfRepository dwarfRepository;
	
	
	
	public DisneyController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}



	@GetMapping("/")
	public String disney(Model model) 
	{
		

		model.addAttribute("dwarfs",dwarfRepository.findByAuthor("Disney"));
		

		return "disneyPage";
	}

}
