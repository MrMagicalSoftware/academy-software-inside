package it.softwareInside.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import it.softwareInside.models.Fox;

@org.springframework.stereotype.Controller
public class Controller {

	
	@GetMapping("/")
	public ModelAndView getIndex() {
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		
		//call http 
		RestTemplate restTemplate = new RestTemplate();
		
		Fox risFox =  restTemplate.getForObject("https://randomfox.ca/floof/", Fox.class);
		
		
		System.out.println(risFox);
		System.out.println(risFox.getImage());
		
		modelAndView.addObject("immagineFox" , risFox.getImage() );
		
		return modelAndView;
	}
	
	
}
