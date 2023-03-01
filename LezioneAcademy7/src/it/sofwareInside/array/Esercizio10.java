package it.sofwareInside.array;

/*
 * 
 * 
 * 
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per trovare l’elemento di valore
minimo e l’indice (nell’intervallo da 0 a N-1) della sua posizione.
 * 
 * 
 */

public class Esercizio10 {

	
	public static void main(String[] args) {
		
		
		int[] carrello = {8 , 7 , 16 , 99 , 18};

		
		
		int min = carrello[0];
		int index = 0;
		
		for (int i = 0; i < carrello.length; i++) {
			if(carrello[i] < min) {
				min = carrello[i];
				index = i;
			}
		}
		
		System.out.println("elemento min " + min + "  indice " + index ) ;
		
	}
	
	
	
	
}
