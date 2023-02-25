package it.softwareInside.cicloIndefinito;

import java.util.Scanner;

/***
 * 
 * 	Creare un programma che è in grado di svolgere
 *  la sommatoria di un numero indefinito di elementi
 *  presi da tastiera . il programma termina quando si 
 *  inserisce il valore 0
 *  e al termine stampa la somma finale
 *  
 *  
 *  Es 8 2 4 0 ---------> totale : 14
 * 
 * 
 * 
 * @author mr
 *
 */



public class Sommatoria {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int somma = 0;
		
		System.out.println("Inserisci un numero");
		
		int numeroUtente = key.nextInt();
		
		while(numeroUtente != 0) {
			
			somma += numeroUtente;
			System.out.println("SOMMA PARZIALE " + somma);
			System.out.println("inserisci");
			numeroUtente = key.nextInt();

		}
		
		
		System.out.println("TOT " + somma);
		
		key.close();
		
	}

}
