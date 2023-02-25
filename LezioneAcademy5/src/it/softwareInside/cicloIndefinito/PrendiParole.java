package it.softwareInside.cicloIndefinito;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * 	Scrivere un programma che prende in ingresso
 *  un certo numero di stringhe , il programma termina
 *  quando si scrive la parola exit.
 * 
 * 	ciao miao gatto hello gda d sahdashsah exit
 * 
 * 
 * 	!equals("ciao") non è la sintassi completa
 * 
 * @author mr
 *
 */


public class PrendiParole {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("inserisci");
		String parola  = key.next();
		
		while( ! parola.equalsIgnoreCase("exit") ) {
			
			System.out.println("inserisci");
			parola = key.next();
		}
		
		System.out.println("fine del programma");
		
		key.close();
	}
	
}
