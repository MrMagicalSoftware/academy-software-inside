import java.util.Scanner;

/**
 * 
 * 
 * 
 * Creare una funzione che 
 * prenda in ingresso un numero intero 
 * 
 * e una stringa , il programma prosegue 
 * 
 * solamente se il numero intero è compreso
 * 
 * tra 0 e la lunghezza -1 .
 * 
 * 
 * Il programma stampa a video la stringa che va dal numero
 * fino alla fine della parola.
 * 
 * 
 * PRATICAMENTE MI SONO CREATO A MANO UNA FUNZIONE
 * CHE GIA'ESISTE DELLE STRINGHE CHE SI CHIAMA SUBSTRING
 * 
 * 		Es : 1 ciao
 * 
 *       		iao

 * 
 * 
 * @author mr
 *
 */

public class EsercizioCiclo2 {

	
	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("################");
		
		
		System.out.println("Scrivi una parola");
		
		String parola = key.next();
		
		System.out.println();
		
		int i = 0 ;
		System.out.println("Indici disponibili");
		
		while(i < parola.length()) {
			System.out.print(i + " ");
			i++;
		}
		
		
		
		System.out.println("SCRIVI UN INDICE ");
		int indice = key.nextInt();
		
		if(indice < 0 || indice >= parola.length()) {
			System.out.println("ATTENZIONE NON POSSO FARE IL CALCOLO");
		}
		
		
		//CALCOLO
		
		
		while(indice < parola.length()  ) {
			System.out.print (parola.charAt(indice));
			indice++;
		}
		
		
		
		key.close();
	}
	
	
	
}
