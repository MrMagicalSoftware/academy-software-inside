package it.softwareInside.esercizi;

import java.util.Scanner;

/**
 * 
 * 
 * Se un numero è pari stampo il suo doppio
 * se e' dispari divido il numero 
 * 
 * 
 * 	Es : 10 ----------> 20
 * 		 8 -----------> 16
 *       9 -----------> 4.5
 *  
 * 
 * 
 * @author mr
 *
 */


public class EsempioOperatoreTernario {

	
	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in); 
		
		System.out.println("inserisci un numero");
		
		int numeroUtente = key.nextInt();
		
		
		double ris =numeroUtente % 2 == 0 ? numeroUtente * 2 : numeroUtente / 2.0;
		
		
		//System.out.println(numeroUtente % 2 == 0 ? numeroUtente * 2 : numeroUtente / 2.0);
		
		System.out.println(ris);
		
		
		double ris2;
		
		if(numeroUtente % 2 == 0 ) {
			ris2 = numeroUtente * 2;
		}
		else {
			ris2 = numeroUtente / 2.0;
		}
		
		
		
		
		key.close();
	}
	
	
}
