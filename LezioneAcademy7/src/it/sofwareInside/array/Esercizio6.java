package it.sofwareInside.array;

/**
 * 
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per contare gli elementi dispari.
 * @author mr
 *
 */

public class Esercizio6 {

	
	public static void main(String[] args) {
		
		
		
		int[] vett = { 10 ,8 , 3 , 5 , 15};

		int cont = 0 ;
		
		
		
		int i = 0 ;
		
		while(i < vett.length) {
			
			if(vett[i] % 2 != 0)
				cont++;
			
			i++;
		}
		
		System.out.println("somma " + cont);
		
		
		
		
	}
	
	
}
