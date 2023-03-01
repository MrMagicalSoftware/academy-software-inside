package it.softwareInside.eserciziPomeriggio;

import java.util.Scanner;

/***
 * 
 * 
 * 	prendere in input 5 caratteri
 *  al termine dei 5 caratteri
 *  se tutti e 5 sono  lettera a
 *  
 *  allora stampo ok altrimenti stampo no
 *  
 *  
 *  aaaaa => ok
 *  aaaak => no
 * 
 * 
 * @author mr
 *
 */


public class Esercizio2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		boolean isAllSequenceOk = true;
		
		
		int i = 0;
		char elemento ;
		
		do {
			
			System.out.println("inserisci");
			elemento = key.next().charAt(0);
			
			if(elemento != 'a')
				isAllSequenceOk = false;
			
			i++;
		} while (i < 5);
		
		
		
		if(isAllSequenceOk)
			System.out.println("ok");
		else
			System.out.println("no");

		
		
		
		key.close();
		
	}
	
}
