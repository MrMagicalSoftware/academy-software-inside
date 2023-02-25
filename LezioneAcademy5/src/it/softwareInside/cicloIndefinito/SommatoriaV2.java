package it.softwareInside.cicloIndefinito;

import java.util.Scanner;

/***
 * 
 * 			
 * 
 * 	PRENDERE con la tastiera 
 *  una sequenza di numeri che termina con il valore		
 *  0 , , il programma farà la somma dei soli elementi 
 *  che sono pari
 *  
 *  
 *  Es 10 5 2 3 3 0 -----> 12
 * 
 * @author mr
 *
 */

public class SommatoriaV2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci un numero");
		
		int numero = key.nextInt();
		
		int somma = 0;
		
		
		while(numero != 0) {
			
			if(numero % 2 == 0 )
				somma += numero;
			
			System.out.println("inserire");
			numero = key.nextInt();
		}
		
		System.out.println("somma " + somma);
		
		
		
		key.close();
	}
	
	
}
