package it.softwareInside.riepilogo;

import java.util.Scanner;

/***
 * 
 * 	creare un programma che chieda in ingresso un numero
 * 	il programma calcola la media da 1 fino al numero inserito.
 * 
 * 
 * 
 * 
 * 	Es   se inserisco 3 :......>      1 ...3 
 * 										
 * 
 * 							1+2+3 / 3
 * 
 *      se fosse 5 ....>   1 +2+3+4+5 / 5
 *      
 *      il risultato è un double..
 * 
 * 
 * 
 * @author mr
 *
 */


public class EsercizioCicloMedia {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("Inserisci  un numero");
		
		int numeroUtente = key.nextInt();
		
		int i = 1;
		int somma = 0;
		
		while( i <= numeroUtente) {
			somma +=i;
			i++;
		}
		
		System.out.println("La somma vale " + somma);
		//double media = somma / (numeroUtente * 1.0);
		
		double media = somma /(double)  numeroUtente ; //casting (double)

		
		System.out.println("La media vale " + media );
		
		key.close();
	
	
	}
	
	
	
	
	
	
	
	
	
}
