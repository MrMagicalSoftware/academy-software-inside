package it.softwareInside.restController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import it.softwareInside.models.Cat;
import it.softwareInside.models.Fox;
import it.softwareInside.models.Meow;
import it.softwareInside.service.MeowService;

@RestController
public class RestContoller {

	
	@Autowired
	MeowService meowService;
	
	
	
	
	@GetMapping("/meow")
	public String showMeow() {
		
		return meowService.getMeow();
	}
	
	@GetMapping("/get-some-meow")
	public Meow getSomeMeowByInput(@RequestParam("n") int numeroDiMeow) {
		
		return meowService.getSomeMeow(numeroDiMeow);
	}
	
	
	@GetMapping("/meow-by-lang")
	public Meow getMeowByLanguage(@RequestParam("l") String  linguaString ,@RequestParam("c") int cont) {
		
		
		return meowService.getMeowByLanguage(linguaString, cont);
	}
	
	
	@GetMapping("/genera-fox")
	public ArrayList<Fox> generaFox(@RequestParam("n") int numeroFox) {
		
		ArrayList<Fox> arrayList = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		
		for (int i = 0; i < numeroFox; i++) {
			Fox risFox =  restTemplate.getForObject("https://randomfox.ca/floof/", Fox.class);
			arrayList.add(risFox);
		}
		
		return arrayList;
	}
	
	
	@GetMapping("/cat")
	public void generaCatFacts() {
		
		RestTemplate restTemplate = new RestTemplate();
	    restTemplate.getForObject("https://cat-fact.herokuapp.com/facts", Cat.class);
		
		
	}
	
	
	
	
}
