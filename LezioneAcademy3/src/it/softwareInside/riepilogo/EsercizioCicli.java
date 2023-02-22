package it.softwareInside.riepilogo;

import java.util.Scanner;

/**
 * 
 * 
 * creare un programma che chieda di inserire un numero da tastiera
 * il programma stampa a video tutti i numeri tra 1 e 100
 * che risultano multipli del numero inserito
 * 
 * 
 * 	Es : 5
 * 
 *          5 10 15 20 25 30 . . . . ... 100
 *          
 *          
 *   Es  :  4 8 12 16   . .. . . .. . . ...   |       
 * 
 * 
 * @author mr
 *
 */



public class EsercizioCicli {

	public static void main(String[] args) {
		
	
		Scanner key = new Scanner(System.in);
		
		
		
		System.out.println("Insersci un numero");
		
		int numeroUtente = key.nextInt();
		
		int i = 1;
		int cont = 0;
		
		while(i <= 1000) {
			
			if(i % numeroUtente ==0 ) {
				System.out.print(i + " ");
				cont++;

			}
			if(cont == 10) {
				System.out.println();
				cont = 0;
			}
			
			i++;
		}
		
		
		
		
		
		key.close();
	}
	
	
	
	
}
