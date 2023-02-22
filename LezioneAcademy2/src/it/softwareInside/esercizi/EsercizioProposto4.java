package it.softwareInside.esercizi;

import java.util.Scanner;

public class EsercizioProposto4 {
	

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		
		double prezzoInput , scontoInput ; 
		
		System.out.println("inserisci prezzo e sconto  % ");
		
		
		
		prezzoInput = key.nextDouble();
		scontoInput = key.nextDouble();
		
		
		if(scontoInput > 70 ) {
			System.out.println("Scusami non posso");
			System.exit(0); // termina il programma Java!!!!
		}
		
		// 100 unita
		
		// 30 ----> 30 / 100
		
		double nuovoPrezzo = prezzoInput 
				-  prezzoInput *  ( (scontoInput) / 100.00 )   ;
				
		
		System.out.println("fine del programma");
		System.out.println(nuovoPrezzo );
		
		key.close();
	}
	

}
