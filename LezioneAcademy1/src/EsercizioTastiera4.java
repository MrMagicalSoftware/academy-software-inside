import java.util.Scanner;

/**
 * 
 * dato da tastiera un numero intero
 * vi chiedo di stampare a video il doppio del numero
 * 
 * 
 * 10 ---->  20
 * 
 * 20 ---> 40
 * 
 * 
 * @author mr
 *
 */


public class EsercizioTastiera4 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("inserisci un numero");
		int numeroUtente = key.nextInt();
		
		
		System.out.println("il doppio vale "  + (numeroUtente * 2) );

		int doppio = numeroUtente * 2 ;
		System.out.println("il doppio vale " + doppio );
		
		
		key.close();
	}
	
}
