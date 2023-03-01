package it.sofwareInside.array;



/*
Esercizio 2
Dato un array di N interi scrivere un algoritmo (o programma Java) per sommare tutti gli elementi
che sono multipli di 3.
*/

public class Esercizio2 {

	public static void main(String[] args) {
		
		int[] vett = { 10 , 8 , 6 , 5 ,3};
		
		
		int i = 0 ;
		int somma = 0;
		
		while(i < vett.length ) {
			
			if(vett[i] % 3 == 0 )
				somma += vett[i];
			i++;
		
		}
		
		System.out.println("somma vale " + somma);
		
	}
	
}
