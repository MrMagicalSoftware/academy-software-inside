package it.softwareInside.esercizi;

import java.util.Scanner;

/**
 * 
 * 
 * - Esercizio : prendere 3 numeri e dire se tutti e 3 sono diversi..
 * 
 * @author mr
 *
 */

public class EsercizioProposto3 {

	
	
	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);

		int numero1 , numero2 , numero3 ;
		
		
		System.out.println("inserisci 3  numeri");
		
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		numero3 = key.nextInt();
		
		
		if(  ! (numero1 == numero2 && numero2 == numero3)    ) {
			System.out.println("diversi");
		}
		else
			System.out.println("sono uguali");
		
		key.close();
		
	}
	
}
