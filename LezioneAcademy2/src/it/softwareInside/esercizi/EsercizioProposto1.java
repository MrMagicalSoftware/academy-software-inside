package it.softwareInside.esercizi;

import java.util.Scanner;

public class EsercizioProposto1 {

	public static void main(String[] args) {

		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("Inserisci un numero");
		
		int numero = key.nextInt();
		
		
		if(numero % 2 == 0)
			System.out.println("pari");
		else
			System.out.println("dispari");


		
		//Operatore ternario
		String risposta = numero % 2 == 0 ? "pari" : "dispari";
		
		System.out.println("##################");
		
		System.out.println(risposta);
		
		key.close();
	}

}
