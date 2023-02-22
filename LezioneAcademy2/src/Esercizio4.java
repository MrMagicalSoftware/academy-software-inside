import java.util.Scanner;

/**
 * 
 * prendere in input 1 stringa
 * 
 * stampare a video il primo carattere della
 * stringa usando una funzione che si chiama charAt()..
 * 
 *          0 1 2 3
 * 			c i a o
 * 
 *    stampa c  
 * 
 * @author mr
 *
 */


public class Esercizio4 {

	
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("INSERISCI ");
		
		
		String parola = key.next();
		
		
		System.out.println(parola.charAt(0));
		
		key.close();
	}
	
	
}
