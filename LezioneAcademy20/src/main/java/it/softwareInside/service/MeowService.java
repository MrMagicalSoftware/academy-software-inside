package it.softwareInside.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import it.softwareInside.models.Meow;

@Service
public class MeowService {

	
	public String getMeow() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Meow ris =  restTemplate.getForObject("https://meowfacts.herokuapp.com/", Meow.class);
		
		return ris.getData().get(0);
	}
	
	
	public ArrayList<String> createMeow(int numeroMeow){
		
		ArrayList<String> risArrayList = new ArrayList<>();
		
		for(int i =0  ; i < numeroMeow ; i++) {
			risArrayList.add(  getMeow()  );
		}
		
		return risArrayList;
	}
	
	
	
	
	//curl https://meowfacts.herokuapp.com/?lang=ukr&count=3
	
	
	public Meow getMeowByLanguage(String lang , int contMeow) {
		
		
		try {
		
			String uString = "https://meowfacts.herokuapp.com/?lang=" + lang +"&count=" + contMeow;
			RestTemplate restTemplate = new RestTemplate();
			return restTemplate.getForObject(uString, Meow.class);
			
			
		}catch (Exception e) {
			return null;
		}
		
		
		
	}
	
	
	// https://meowfacts.herokuapp.com/?count=3
	
	public Meow getSomeMeow(int numeroMeow){
		
		RestTemplate restTemplate = new RestTemplate();
		
		
		String urlString = "https://meowfacts.herokuapp.com/?count=" + numeroMeow;
		
		Meow ris =  restTemplate.getForObject(urlString, Meow.class);
		
		return ris;
		
	}
	
}
