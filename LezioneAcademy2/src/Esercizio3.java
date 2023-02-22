import java.util.Scanner;

/**
 * 
 * prendere in una stringa 
 * con scanner
 * 
 * 
 * se la stringa contiene piu' o almeno  3 caratteri
 * 
 * stampare a video la sotto-stringa 
 * 
 * escludendo il primo carattere .
 * 
 * Nota : esiste un metodo che si chiama substring
 * 
 * altrimenti non fare nulla...
 * 
 * 
 * Es ciao ----------> iao
 * 
 * 
 *   ci ------> 
 * 
 * 
 * @author mr
 *
 */



public class Esercizio3 {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa");
		
		String parola = key.next();
		
		System.out.println("Hai inserito " + parola);
		
		if(parola.length() >= 3) {
			System.out.println(parola.substring(1));
		}
		
		System.out.println("###########");
		System.out.println(parola);
		
		System.out.println("fine");
		
		
		
		
		
		
		key.close();
	}

	
	
	
	
	
	
	
}
