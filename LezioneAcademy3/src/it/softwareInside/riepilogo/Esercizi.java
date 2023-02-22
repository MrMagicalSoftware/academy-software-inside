package it.softwareInside.riepilogo;

import java.util.Scanner;

/**
 * 
 * Creare un programma che 
 * 
 * prenda con la tastiera un numero 
 * 
 * se il numer e' negativo il programma termina
 * 
 * se il numero e' >= 0  , il programma stampa tutti i numeri da 1 ..fino a n
 * 
 * dove n è il numero inserito a tastiera
 * 
 * 
 * 
 * 	Es   :  10
 * 
 * 			1  2 3 4 5 6 7 8 9 10
 * 
 *        
 *        
 *   ES : 3 
 *   
 *        1 2 3 
 *        
 *        
 *        
 *  Es : -1 non posso andare avanti     
 *        
 *        
 * 
 * 
 * @author mr
 *
 */


public class Esercizi {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisic un numero");
		
		
		int numeroUtente = key.nextInt();
		
		
		if(numeroUtente <= 0 ) {
			System.out.println("NON POSSO ANDARE AVANTI");
			//System.exit(0);
		}
		
		
		int i = 1;
		
		
		//  1 <= -1 False
		
		while(i <= numeroUtente) {
			
			System.out.print(i + " ");
			
			i++;
		}

		
		
		
		
		
		
		

		key.close();
	}

}
