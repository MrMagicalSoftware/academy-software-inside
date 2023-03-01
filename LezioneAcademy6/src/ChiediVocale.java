import java.util.Scanner;

/**
 * 
 * 
 *  fino a che l'utente inserisce una vocale
    il programma prosegue , altrimenti termina..
    Es : aaaaaeeeeeiuuooouoooouz

 * 
 * @author mr
 *
 */

public class ChiediVocale {

	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci");

		char myCharInput = key.next().charAt(0);
		
		while(myCharInput == 'a' || 
				myCharInput == 'e' || 
				myCharInput == 'i' ||
				myCharInput == 'o' ||
				myCharInput == 'u' ) {
			
			
			System.out.println("inserisci");
			
			myCharInput = key.next().charAt(0);
		}
		
		
		key.close();
	}

}
