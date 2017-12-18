package uk.ac.belfastmet.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.weather.domain.TodaysWeather;
import uk.ac.belfastmet.weather.service.WeatherService;

@Controller
@RequestMapping("/")
public class WeatherController {
	
	@Autowired
	WeatherService weatherService;
	

	private TodaysWeather todaysWeather;
	
	@GetMapping("")
	public TodaysWeather home(Model model)
	{
		model.addAttribute("pageTitle","Weather");
		RestTemplate restTemplate = this.restTemplate();
		this.todaysWeather = weatherService.getForObject("http://www.codingfury.net/training/weathersample/weather.php?location=belfast", TodaysWeather.class);
		return this.todaysWeather;
	}
	
	public WeatherController(WeatherService weatherservice) {
		super();
		this.weatherService = weatherService;
	}

	
	

}
