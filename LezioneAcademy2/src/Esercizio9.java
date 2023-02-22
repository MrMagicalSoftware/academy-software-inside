import java.util.Scanner;

/**
 * 
 * 
 * prendere in input 2 stringhe e dire se hanno lo stesso numero di caratteri
 * 
 * 
 * 	esempio ciao miao ---> ok
 * 
 * 			ciao gg --> no
 * 
 * 
 * @author mr
 *
 */



public class Esercizio9 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("Inserisci 2 parole");
		
		String parola1 , parola2 ;
		
		parola1 = key.next();
		parola2 = key.next();
		
		if(parola1.length() == parola2.length())
			System.out.println("ok");
		else {
			System.out.println("no");
		}
		
		
		
		key.close();
	}
	
}
