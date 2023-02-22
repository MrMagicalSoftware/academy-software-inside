package it.softwareInside.esercizi;

import java.util.Scanner;

public class EsercizioProposto2 {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci 2 stringhe");
		
		String parola1, parola2 ;
		
		parola1 = key.next();
		parola2 = key.next();
		
		
		String parolaConcatenata = parola1 + " " + parola2;
		
		System.out.println(parolaConcatenata);
		
		
		key.close();
	}
	
}
