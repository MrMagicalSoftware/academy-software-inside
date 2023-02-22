package it.softwareInside.riepilogo;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * 
 * l'utente vi inserisce una stringa con scanner
 * 
 * il programma stampa a video il numero di lettere 'a' presenti nella stringa
 * 
 * 
 * ES  casa ---> 2
 *     oro --->  0
 *     
 *     
 *     NOTA : DOVETE FARE UN CICLO CHE VA 0 FINO ALLA LUNGHEZZA DELLA STRINGA
 *     		  (esiste .length() )
 *     
 *           All'interno del ciclo dovete estrarre la lettera corrente
 *           con chartAt(pos) e capire se e' una lettera 'a'
 *           
 *           se è una lettera 'a' utlizzo un contatore che viene aumentato
 *           
 *           fuori dal ciclo ..stampo il valore del contatore.
 *      
 * 
 * 
 * @author mr
 *
 */


public class Esercizio {

	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);
		
		System.out.println("##################");
		System.out.println("inserisci");
		String parola = key.next(); 
		
		int i = 0;
		int cont = 0;
		
		while(i < parola.length()) {
			
			
			//System.out.println(parola.charAt(i));
			
			char carattereCorrente = parola.charAt(i) ;
			
			if(carattereCorrente == 'a')
				cont++;
			
			i++;
		}
		
		
		System.out.println("TOTALE LETTERE A " + cont);
		
		
		key.close();
	}

}
