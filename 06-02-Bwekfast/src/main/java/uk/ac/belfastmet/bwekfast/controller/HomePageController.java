package uk.ac.belfastmet.bwekfast.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.bwekfast.domain.Cereal;
import uk.ac.belfastmet.bwekfast.repository.CerealRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/")
public class HomePageController {

	@Autowired
	CerealRepository cerealRepository;

	public HomePageController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("cereals", cerealRepository.findAll());
		return "homepage";
	}

	@GetMapping("/cereals/view/{cerealid}")
	public String viewCereal(@PathVariable("cerealid") Integer cerealid, Model model) {

		model.addAttribute("cereal", cerealRepository.findOne(cerealid));

		return "viewCereal";
	}
	
	@GetMapping("/cereals/edit/{cerealid}")
	public String editCereal(@PathVariable("cerealid") Integer cerealid, Model model)
	{
		model.addAttribute("cereal",cerealRepository.findOne(cerealid));
		return "editCereal";
	}

	
	@GetMapping("/cereals/delete/{cerealid}")
	public String deleteCereal(@PathVariable("cerealid") Integer cerealid, RedirectAttributes redirectAttrs)
	{
		cerealRepository.delete(cerealid);
		redirectAttrs.addFlashAttribute("message", "Cereal was deleted");
		return "redirect:/cereals/";
	}
	
	
	@GetMapping("/cereals/add")
	public String createCereal(Model model) {

		model.addAttribute("pageTitle", "Add Cereal");
		model.addAttribute("cereal", new Cereal());
		return "editCereal";
	}

	@PostMapping("/cereals/save")
	public String saveCereal(@Valid Cereal cereal, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "editCereal";
		} else {
			Cereal savedCereal = cerealRepository.save(cereal);

			return "redirect:/cereals/view/" + savedCereal.getCerealid();
		}

	}
	
	


}
