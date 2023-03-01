package it.sofwareInside.array;



/**
 * 
 * 
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per trovare l’elemento di valore
massimo e l’indice (nell’intervallo da 0 a N-1) della sua posizione.
 * 
 * @author mr
 *
 */
public class Esercizio9 {

	
	public static void main(String[] args) {
		
	
		int[] carrello = { -5 , - 10 ,-2, -70 , -100 };
		
		int max = carrello[0]; ; //carrello[0]; // supposizione
		
		int indiceMax = 0;
		
		for(int i = 1 ; i < carrello.length ; i++) {
			
			if(carrello[i] > max) {
				max= carrello[i];
				indiceMax = i;
			}
		}
		
		
		System.out.println("max vale "+ max + " INDICE POS " + indiceMax);
		
		
	}
	
	
	
}
