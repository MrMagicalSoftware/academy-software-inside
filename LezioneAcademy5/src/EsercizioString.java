import java.util.Scanner;

/**
 * 
 * Data una stringa in input
 * 
 * stampare a video una nuova stringa
 * dove al posto della lettera a verrà scritto il simbolo @
 * 
 * 
 * 		Es :  ciao ---------_>  ci@o
 * 
 * 			  alone ---->  @lone
 * 
 * 
 * @author mr
 *
 */

public class EsercizioString {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);		
		
		System.out.println("INSERISCI PAROLA");
		String parolaUtente = key.next();
		
		
		String nuovaParola ="";
		
		
		int i = 0;
		
		
		while(i < parolaUtente.length()) {
			
			char carattereCorrente = parolaUtente.charAt(i);
			
			
			if(carattereCorrente == 'a')
				nuovaParola += "@"; // nuovaParola = nuovaParola + "@"
			else 
				nuovaParola +=carattereCorrente;
			
			i++;
		}
		
		
		System.out.println(nuovaParola);
		
		
		key.close();
	}

}
