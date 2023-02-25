import java.util.Scanner;

/***
 * 
 * 
 * L'utente prende in input 2 stringhe 
 * il programma va avanti solamente se 
 * le due stringhe hanno la dimensione..
 * 
 * 
 * Il programma crea una nuova stringa cosi' composta
 * 
 * 
 * 		ciao 
 * 		miao
 *   
 *      
 *      
 * 
 * 
 * @author mr
 *
 */


public class EsercizioStringExample {

	public static void main(String[] args) {
		
	
		Scanner key = new Scanner(System.in);
	
		
		System.out.println("inserisci 2 parole");
		String parola1 = key.next();
		String parola2 =key.next();
		
		
		if(parola1.length() != parola2.length()) {
			
			System.out.println("nON POSSO ANDARE AVANTI");
			System.exit(0);
		}
		
		
		int i = 0;
		String ris ="";
		
		while(i < parola1.length() / 2) {
			
			ris += parola1.charAt(i) + "" +parola2.charAt(i);
			
			
			i++;
		}
		
		
		System.out.println(ris);
		
		
		key.close();
	}
	
	
	
	
	
	
}
