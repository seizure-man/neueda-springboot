package uk.ac.belfastmet.dwarfs.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/disney/")
public class DisneyController {
	
	@GetMapping("/")
	public String disney(Model model) 
	{
		model.addAttribute("pageTitle", "Disney!");
		model.addAttribute("dwarfs",getDwarfs());
		return "disneyPage";
	}
	
	public ArrayList<Dwarf> getDwarfs()
	{
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "sleepy.png");
		Dwarf dopey = new Dwarf("Dopey", "Disney", "dopey.png");
		Dwarf bashful = new Dwarf("Bashful", "Disney", "bashful.png");
		Dwarf sneezy = new Dwarf("Sneezy", "Disney", "sneezy.png");
		Dwarf doc = new Dwarf("Doc", "Disney", "doc.png");
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "grumpy.png");
		Dwarf happy = new Dwarf("Happy", "Disney", "happy.png");

		dwarfs.add(sleepy);
		dwarfs.add(dopey);
		dwarfs.add(bashful);
		dwarfs.add(sneezy);
		dwarfs.add(doc);
		dwarfs.add(grumpy);
		dwarfs.add(happy);

		return dwarfs;
	}


}
