package it.softwareInside.LezioneAcademy18.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@GetMapping("/")
	public String saluta() {
		
		return "ciao a tutti";
	}
	
	@GetMapping("/contatti")
	public String showContatti() {
		
		return "Mr Robot : 28381238218138 " ;
	}
	
	
	@GetMapping(value={"/welcome1", "/welcome2"})
	public ArrayList<Integer> generateArray(){
		
		ArrayList<Integer>  risArrayList = new ArrayList<>();
		risArrayList.add(10);
		risArrayList.add(20);
		risArrayList.add(30);
		
		return risArrayList;
	}
	
	
	
	//create ed esporre su web
	// una funzione che ritorna un arraylist di interi
	// con 6 numeri scelti a caso con una random nell'intervallo 1-90
	
	
	@GetMapping("/generatore")
	public ArrayList<Integer> getRandomNumber(){
	
		
		System.out.println("######## OK GENERATORE ###########");
		Random random = new Random();
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		int i = 0 ;
		do {
			
			arrayList.add(random.nextInt(1, 91));
			i++;
		} while (i < 6);
		
		System.out.println("######## FINE GENERATORE ###########");
		System.out.println(arrayList);
		
		
		return arrayList;
	}
	
	
	
	//creare una funzione in grado di restituire un Hashmap ?? ??? ?? 
	//con una rotta che si chiama /dizionario
	

	@GetMapping("/dizionario")
	public HashMap<String, String> getDizionario(){
		
	
		HashMap<String, String> myMap = new HashMap<>();
		
		myMap.put("java", "linguaggio di programmazione ecc ecc cecc");
		myMap.put("javascript", "linguaggio di programmazione per il web ");
		myMap.put("sql", "linguaggio di programmazione per i database .. . ..");
	
		return myMap;
	}
	
	
}
