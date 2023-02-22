package it.softwareInside.esercizi;

import java.util.Random;

// lancia il dado 2 volte ... se la somma fa 7 scrive hai vinto 
// altrimenti hai perso..

public class EserciziDado2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int dado1 = random.nextInt(1, 6);
		
		System.out.println("... . ... .. " + dado1);
		
		int dado2 = random.nextInt(1, 6);
		
		
		System.out.println("... . ... .. " + dado2);
		
		
		int somma = dado1 + dado2 ;
		
		if(somma  == 7 ) {
			System.out.println("u win");
		}
		else {
			System.out.println(" perso ");
		}
		
		
	}
	
}
