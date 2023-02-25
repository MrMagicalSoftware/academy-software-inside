package it.softwareInside.cicloIndefinito;

import java.util.Scanner;

/**
 * 
 * Esercizio Ciclo INDEFINITO
 * 
 * creare un programma che chieda
 * una e stampa a video una sequenza di numero
 * fino a che l'utente non inserisce il valore  0.
 * 
 * 
 * @author mr
 *
 */


public class ContinuaFino {

	public static void main(String[] args) {
		

		Scanner key =new  Scanner (System.in);
		
		
		System.out.println("Inserisci un numero");
		
		
		int numeroUtente = key.nextInt();
		
		
		while(numeroUtente != 0) {
			
			System.out.println(numeroUtente);
			System.out.println("inserisci");
			numeroUtente = key.nextInt();
		}
		
		
		System.out.println("Fine ");
		
		
		key.close();
	}

}
