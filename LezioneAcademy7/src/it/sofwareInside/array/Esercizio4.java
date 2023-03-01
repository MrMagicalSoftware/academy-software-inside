package it.sofwareInside.array;


/**
 * 
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per sommare tutti gli elementi
che sono contemporaneamente multipli di 2 e di 3.
 * 
 * @author mr
 *
 */


public class Esercizio4 {

	
	public static void main(String[] args) {
		int[] vett = { 10 , 8 , 6 , 5 ,3,12};
		
		int somma = 0 ;
		
		
		
		int i = 0 ;
		
		while(i < vett.length) {
			
			
			if(vett[i] % 6 == 0)  // vett[i] % 6 == 0  //vett[i] % 2 == 0 && vett[i] % 3 == 0
				somma += vett[i];
				
			i++;
		}
		
		System.out.println("somma " + somma);
		
	}
	
}
