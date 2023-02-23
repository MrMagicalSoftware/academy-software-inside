import java.util.Scanner;

/***
 * 
 * 
 * Esercizio : 
 * 			
 * 		Creare un semplice programma
 * 		che prenda in ingresso ingresso 
 * 
 * 		una stringa e stampi la meta' della stringa
 * 
 * 
 * 		Es : ciao
 *    
 *      gattino 7/ 2 = 3.5 
 * 
 * 
 * @author mr
 *
 */

public class EsercizioCiclo3 {

	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci una parola");

		String parolaUtente = key.next();

		// ciao  // 0 1 
		
		int i = 0;
		
		while(i <   parolaUtente.length() / 2) {
			System.out.print(parolaUtente.charAt(i) );
			i++;
		}
		
		
		
		key.close();
	}

}
