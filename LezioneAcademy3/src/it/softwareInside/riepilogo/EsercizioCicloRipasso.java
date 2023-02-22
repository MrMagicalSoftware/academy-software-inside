package it.softwareInside.riepilogo;

import java.util.Scanner;

/**
 * 
 * 
 * prendete in input 2 numeri da tastiera
 * e stampate tutti i numeri che sono compresi
 * 
 * tra numero1 e numero2 
 * 
 * 
 * 		Per convenzione il numero1 e' piu' piccolo del numero2 
 * 
 * 
 * 		8   18 ------> 8 9 10 11 12  . . . . .. . ...18
 * 
 * 
 * @author mr
 *
 */


public class EsercizioCicloRipasso {

	
	public static void main(String[] args) {
		
		
	
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci 2 numeri");
		
		int numero1 = key.nextInt();  //10
		int numero2 = key.nextInt();  // 20
		
		
		while(numero1 <= numero2) {
			System.out.print(numero1 + " ");
			numero1++;
		}
		// 10 11 12 13  . . .. . .. . .20
		
		
		key.close();
	}
	
	
	
}
