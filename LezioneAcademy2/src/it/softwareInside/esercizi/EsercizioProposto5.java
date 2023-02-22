package it.softwareInside.esercizi;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * 
 * -Esercizio Hai vinto una multa :
 *  prende con la tastiera una velocità e un limite ,
 *  se la velocità e' maggiore
	del limite stampa a video "hai vinto una multa" altrimenti non fa nulla...

 * 
 * 
 * @author mr
 *
 */


public class EsercizioProposto5 {

	public static void main(String[] args) {
		

		Scanner key = new Scanner(System.in);
		
		System.out.println("############");
		
		System.out.println("Inserisci velox km/h");
		
		int velox = key.nextInt();
		
		
		System.out.println("Inserisci un limite");
		
		int limite = key.nextInt();
		
		
		if(velox > limite) {
			System.out.println("Hai vinto una multa... ...");
			System.out.println("so goooddd");
		}
		
		
		key.close();
	}
	
	
}






