package uk.ac.belfastmet.bwekfast.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import uk.ac.belfastmet.bwekfast.repository.CerealRepository;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/cereals/")
public class CerealController {
	

	@Autowired
	CerealRepository cerealRepository;
	

	public CerealController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}



	@GetMapping("/")
	public String cereal(Model model) 
	{
		model.addAttribute("cereals",cerealRepository.findAll());
		return "cerealpage";
	}

}
