import java.util.Scanner;

/**
 * dato un numero ingresso con scanner
 * 
 * il programma stampa a video l'opposto del numero
 * 
 * 	se il numero vale 5 ---> -5
 * 
 *  se il numero vale -10 ---> 10 
 * 
 * 
 * @author mr
 *
 */


public class EsercizioTastiera5 {
	
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci");
		int numeroUtente = key.nextInt();
		
		int opposto = - numeroUtente;
		
		System.out.println("opposto vale " + opposto);
		
		
		int opposto2 = numeroUtente * -1;
		System.out.println("opposto vale " + opposto2);

		
		key.close();
	}
	
}
