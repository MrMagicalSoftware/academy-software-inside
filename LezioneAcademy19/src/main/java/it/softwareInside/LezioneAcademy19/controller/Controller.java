package it.softwareInside.LezioneAcademy19.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

	
	
	
	@GetMapping("/")
	public ModelAndView getHome() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");   // è il nome del file che si chiama index.html
		
		return modelAndView;
	}
	
	
	
	
	
	@GetMapping("/contatti")
	public ModelAndView getContatti() {
		ModelAndView modelAndView = new ModelAndView("prova");
		
		return modelAndView;
	}
	
	
	
	@GetMapping("/hello")
	public ModelAndView getHello() {
		
		ModelAndView modelAndView = new ModelAndView("hello");
	
		String myNameString ="Welcome to rob Channel";
		
		modelAndView.addObject("channelIntro", myNameString);
		
		
		return modelAndView;
	}
	
	
}
