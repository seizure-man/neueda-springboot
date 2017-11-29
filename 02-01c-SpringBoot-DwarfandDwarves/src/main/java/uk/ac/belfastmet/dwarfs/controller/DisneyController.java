package uk.ac.belfastmet.dwarfs.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
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
		
		Dwarf thorin = new Dwarf("Thorin", "Tolkien", "thorin.png");
		Dwarf balin = new Dwarf("Balin", "Tolkien", "balin.png");
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "dwalin.png");
		Dwarf fili = new Dwarf("Fili", "Tolkien", "fili.png");
		Dwarf kili = new Dwarf("Kili", "Tolkien", "kili.png");
		Dwarf dori = new Dwarf("Dori", "Tolkien", "dori.png");
		Dwarf nori = new Dwarf("Nori", "Tolkien", "nori.png");
		Dwarf ori = new Dwarf("Ori", "Tolkien", "ori.png");
		Dwarf oin = new Dwarf("Oin", "Tolkien", "oin.png");
		Dwarf bifur = new Dwarf("Bifur", "Tolkien", "bifur.png");
		Dwarf bofur = new Dwarf("Bofur", "Tolkien", "bofur.png");
		Dwarf bombur = new Dwarf("Bombur", "Tolkien", "bombur.png");
		Dwarf gloin = new Dwarf("Gloin", "Tolkien", "gloin.png");
		
		dwarfs.add(sleepy);
		dwarfs.add(dopey);
		dwarfs.add(bashful);
		dwarfs.add(sneezy);
		dwarfs.add(doc);
		dwarfs.add(grumpy);
		dwarfs.add(happy);
		
		dwarfs.add(thorin);
		dwarfs.add(balin);
		dwarfs.add(dwalin);
		dwarfs.add(fili);
		dwarfs.add(kili);
		dwarfs.add(dori);
		dwarfs.add(nori);
		dwarfs.add(ori);
		dwarfs.add(oin);
		dwarfs.add(bifur);
		dwarfs.add(bofur);
		dwarfs.add(bombur);
		dwarfs.add(gloin);
		
		return dwarfs;
	}


}
