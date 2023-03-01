package it.softwareInside.eserciziPomeriggio;

import java.util.Scanner;

/**
 * 
 * 
 * creare un programma che prende una sequenza
 * di caratteri e verifica al termine della sequenza
 * se una vocale e' seguita da una lettera 
 * la sequenza termina con la lettera q
 * 
 * 
 * 	es   ala ---> ok
 * 
 * 
 *       ika ---> ok
 *       
 *       ok ---> ok
 *       
 *       aakk --> no
 *       
 *       
 *       akukq --> ok
 *       
 *       kka
 *       
 *       La sequenza termina quando inserisco un valore speciale chiamato q
 *       
 *       alaq ---> ok
 * 
 * 
 * @author mr
 *
 */



public class Esercizio1 {

	
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		boolean isSequenceOk = true;
		
		
		System.out.println("inserisci");
		char elemento = key.next().charAt(0);
		int cont = 0;
		
		while(elemento != 'q') {
			
			if(cont % 2 == 0 ) {
				
				// se trovo una consonante non va bene e quindi lo segno
				if(  !(  elemento == 'a' || elemento == 'e' || elemento == 'i' ||
						elemento == 'o' || elemento == 'u') ) {
					isSequenceOk = false;
				}	
			}
			else {
				
				// voglio che non ci sia una vocale
				
				if( elemento == 'a' || elemento == 'e' ||  elemento == 'i' 
						||  elemento == 'o' ||  elemento == 'u') {
				
					isSequenceOk = false;
				}
				
			}
			
			elemento = key.next().charAt(0);
			
			cont++;
		}
		
		
		if(isSequenceOk)
			System.out.println("ok");
		else
			System.out.println("no");

		
		System.out.println("#################");
		
		key.close();
	}
	
	
	
}








