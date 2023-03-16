package it.softwareInside.LezioneAcademy19.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	
	@GetMapping("/example")
	public ModelAndView getHome() {
		
		ModelAndView modelAndView = new ModelAndView("test");
		
		modelAndView.addObject("myNum", 87);
		modelAndView.addObject("myName", "Programming with Rob");

		
		
		
		return modelAndView;
	}
	
	
	
	
}
