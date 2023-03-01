package it.softwareInside.eserciziPomeriggio;

import java.util.Scanner;

/*
 * prendere in input una striga
 * e un carattere , dire se il carattere
 * e' presente nella stringa
 * 
 * 
 * 	casa  , a  => si 
 * 
 *  casa , b   => no
 *  
 *  cercare di ottimizz il codice
 * 
 * 
 */


public class Esercizio4 {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);

		
		System.out.println("inserisci la parola");
		String parola = key.next();
		
		char myChar = key.next().charAt(0);
		
		boolean isFound = false;
		
		int i = 0 ;
		
		while(i < parola.length()) {
			
			if(parola.charAt(i) == myChar) {
				isFound = true;
				break; // finisco la ricerca
			}
			i++;
		}
		
		
		if(isFound)
			System.out.println("ok trovato");
		else
			System.out.println("lettera non trovata");

		
		
		
		key.close();
	}
	
}
