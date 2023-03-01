package it.softwareInside.eserciziPomeriggio;

import java.util.Scanner;

/**
 * 	data una stringa in input!!!
 * 
 *  ciao
 *  maio 
 *  gatto
 *   
 *   
 *  dire se la stringa contiene almeno due lettere b
 *  
 *   
 *  barabba ====> ok
 *  
 *  b&b ==> ok
 *  
 *  gatto => no 
 * 
 * 
 * @author mr
 *
 */

public class Esercizio3 {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("inserisci una stringa");
		String inputString = key.next();
		
		int i = 0;
		int contLettB = 0 ;
		
		while(i < inputString.length()) {
			
			
			char carattereCorrente = inputString.charAt(i);
			
			if(carattereCorrente == 'b')
				contLettB++;
			
			i++;
		}
		
		if(contLettB >= 2)
			System.out.println("ok");
		else
			System.out.println("no");

		
	
		key.close();
	}
	
	
	
}



