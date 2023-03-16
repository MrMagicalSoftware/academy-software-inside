package it.softwareInside.app.controller;

import java.util.Iterator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	/**
	 * 
	 * creare una funzione con rotta /sommatoria
	 * 
	 * la funzione ritorna un intero
	 * che rappresenta la sommatoria di tutti i numeri
	 * multiplidi di 3 compresi tra 1 ,e 100
	 * 
	 * 
	 *  3 + 6 + 9 .. . . . . .. . . ..
	 * 
	 * 
	 */
	
	
	@GetMapping("/sommatoria")
	public int sommatoria() {
		
		int somma = 0 ;
	
		for (int j = 3; j < 100; j+=3)
			somma+=j;
		return  somma;
	}
	
	
	
	@GetMapping("/somma")
	public int somma( @RequestParam(name ="numero1") int numero1 , @RequestParam(name ="numero2")int numero2) {
		
		
		return numero1 + numero2;
		
	}
	
	
	@GetMapping("/length")
	public int calcolaLength( @RequestParam(name ="parola") String myString ) {
		
		return myString.length();
	}
	
	
	// Es  ---> 8 
	
	
	// 1 6 5 5 3 4 1 6
	
	
	
}
