package it.softwareInside.riepilogo;

import java.util.Scanner;

/****
 * 
 * 
 * prendere da tastiera una stringa 
 * 
 * stampare la stringa al contrario
 * 
 * 
 * cioa ------> aoic
 * 
 * 
 * 
 * @author mr
 *
 */


public class EsercizioReverseString {

	
	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("inserisci una stringa");
		
		String parola  =  key.next();
		
		int i = parola.length() -1;
		
		while(i >= 0) {
			
			System.out.print(parola.charAt(i));
			
			i--;
		}
		
		
		
		key.close();
	}
	
	
	
}
