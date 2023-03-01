package it.sofwareInside.array;

import java.util.Iterator;

public class Esercizio11 {

	public static void main(String[] args) {
		
		int[] carrello = { 7 , 6 , 5 };
		
		
		int somma = 0 ;
		
		for (int i = 0; i < carrello.length; i++) {
			somma += carrello[i];
		}
		
		double media = somma / (double) carrello.length;
		
		
		int cont = 0 ;
		
		for (int i = 0; i < carrello.length; i++) {
			if(carrello[i] >= media)
				cont++;
		}
		
		System.out.println("la media vale " + media);
		System.out.println("numero di elmenti >  " + cont);

		
		
	}
	
}
