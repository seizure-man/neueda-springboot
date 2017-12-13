package uk.ac.belfastmet.titanic.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import uk.ac.belfastmet.titanic.repositories.PassengersRepository;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/passengers/")
public class PassengersController {
	

	@Autowired
	PassengersRepository passengersRepository;
	

	public PassengersController(PassengersRepository passengersRepository) {
		super();
		this.passengersRepository = passengersRepository;
	}



	@GetMapping("/")
	public String disney(Model model) 
	{
		model.addAttribute("passengers",passengersRepository.findAll());
		return "passengerpage";
	}

}
