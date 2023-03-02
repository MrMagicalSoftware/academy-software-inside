package it.softwareInside.matrix;

import java.util.Random;

public class MatrixExample {

	
	public static void main(String[] args) {
		
		
		//svolgere prima l'esercizio 
		//usando un vettore di grandezza 8
		//riempire e stampare il vettore
		// [ 0,0,0,0.....]
		
		//int[][] matrice = new int [2][2];
		
		// vi chiedo di usare la classe 
		// random per riempire
		//in modo casuale gli elementi della
		//matrice con valori compresi tra 1 e
		// 10 estremi inclusi
		
		// stampare a video la matrice
		
		
		int[] vett = new int[8];
		Random random = new Random();
		
		for (int i = 0; i < vett.length; i++) {
			vett[i] = random.nextInt(1, 11);
			System.out.println(vett[i]);
		}
		
		
		
		
	}
	
	
	
	
}
