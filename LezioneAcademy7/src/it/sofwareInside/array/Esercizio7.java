package it.sofwareInside.array;

import java.util.Scanner;

/*
 * 
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per contare quante volte
	compare un determinato valore k.
	
	
	[ 8 , 10 , 8 , 7 , 5 ]
	
	k = 8 
	
	=====> presente 2 volte
 * 
 */

public class Esercizio7 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci un numero");
		
		int numeroU = key.nextInt();
		
		int[] vettoreDiElementi = { 8 ,  18 ,8 ,1  , 8 , 7 , 77 };
		
		
		int i = 0 , cont = 0  ;
		
		while(i < vettoreDiElementi.length) {
			
			if(vettoreDiElementi[i]  == numeroU)
				cont++;
			i++;
		}
		
		System.out.println("il numero " + numeroU + " è presente " + cont);
		
		
		
		key.close();
	}
	
}
