package it.softwareInside.esercizi;

import java.util.Random;

/**
 * 
 * Simulare il lancio di un dado a 6 faccie
 * che vanno 1 ...fino a  6 
 * 
 * stampare a video il risultato ottenuto dal lancio
 * 
 * Nota : i numeri devono essere da 1 ...a  6 
 * 
 * @author mr
 *
 */


public class EsercizioDadi {

	public static void main(String[] args) {
		
		Random random = new Random() ;
		
		int dado = 1 + random.nextInt(6);
		int dado2 =  random.nextInt(1, 6);
		
		//int dado3 = (int) Math.ceil( Math.random() * 6 );
		
		System.out.println(dado);
		System.out.println(dado2);
		

		
	}

}
