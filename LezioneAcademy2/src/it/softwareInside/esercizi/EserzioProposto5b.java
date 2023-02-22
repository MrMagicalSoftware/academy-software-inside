package it.softwareInside.esercizi;

import java.util.Random;

/**
 * 
 * 			PRIMITIVI ------> 
 * 
 * 
 * 
 *          NON PRIMITIVI -------> String , Scanner , Random
 * 
 * 
 * @author mr
 *
 */


public class EserzioProposto5b {

	public static void main(String[] args) {
		
		Random random = new Random();
		
//		System.out.println(random.nextDouble() * 100);
//		System.out.println(random.nextInt(10)); // 0 --9 
		
		
		int limite = 50;
		
		// la car si muove da almeno 10km/h fino a un max di 70 km/h
		
		int  velox = 10 + random.nextInt(61);
						 // 0 ----60 
		
		
		System.out.println("km/h della macchina " + velox);
		 
		
		if(velox > limite) {
			System.out.println("MULTONE TAC TAC!");
		}
		else {
			System.out.println("Sei salvo");
		}
		
	}
	
}
