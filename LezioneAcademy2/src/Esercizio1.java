import java.util.Scanner;

/**
 * 
 *  si prenda in input una stringa usando la tastiera
 *  con scanner.
 *  
 *  si stampa a video il numero di caratteri
 *  della stringa che ha inserito l'utente
 *  
 *  
 *  ciao ---> 4
 *  
 * 
 * 
 * @author mr
 *
 */


public class Esercizio1 {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("Inserisci una stringa");
		
		String parolaUtente = key.next();
		
		String parolaUtente2 = key.next();
		
		System.out.println("Lunghezza parola" 
				+ parolaUtente + " ==> "+	
				parolaUtente.length());
		
		
		System.out.println("Lunghezza parola" 
				+ parolaUtente2 + " ==> "+	
				parolaUtente2.length());
		
		
		key.close();
	}

}
