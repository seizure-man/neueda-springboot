package uk.ac.belfastmet.dwarfs.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.service.DwarfService;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/tolkien/")
public class TolkienController {
	
	@Autowired
	private DwarfService dwarfService;
	
	@GetMapping("/")
	public String tolkien(Model model)
	{
		model.addAttribute("pageTitle", "Disney!");
		this.dwarfService = new DwarfService();
		model.addAttribute("dwarfs",this.dwarfService.getTolkienDwarfs());
		return "tolkienPage";
	}
	
	

}
