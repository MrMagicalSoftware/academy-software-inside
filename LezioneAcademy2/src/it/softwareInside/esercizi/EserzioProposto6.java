package it.softwareInside.esercizi;

import java.util.Scanner;

/**
 * 
 * 
 * - Creare un programma che prende da tastiera 
 * un carattere e stampa vero se il carattere
	e' una vocale ... nota : usate next() usate il charAt(0) e confrontate
	potreste anche utilizzare l'operatore or || .
 * 
 * 
 * @author mr
 *
 */
public class EserzioProposto6 {
	
	public static void main(String[] args) {
		
	
		// devo prendere in input un char
		
		
		Scanner key = new Scanner(System.in);
		
		
		char myChar = key.next().toLowerCase().charAt(0);
		
		
		if(myChar == 'a' || myChar == 'e' || myChar =='i' ||
				myChar == 'o' || myChar =='u' )
			System.out.println("ok");
		else {
			System.out.println("no");
		}
		
		
		
		key.close();
	}

	
	
}
