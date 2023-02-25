import java.util.Scanner;

/**
 * 
 * si prende in input da tastiera un numero intero
 * il programma stampa se il numero è primo oppure no
 * 
 * Cosa significa primo ?
 * 
 * 
 * 
 * Primo significa che il numero ha solamente 2 divisori
 * che sono chiamati "divisori banali " e sono 1 e il numero stesso.
 * 
 * 
 * 	10 ---> 1 10 2 5  non è primo
 * 
 *   7 ---> è primo  1 - 7 
 * 
 * 
 * @author mr
 *
 */


public class NumeroPrimo {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci");
		int numeroUtente = key.nextInt();
		
		int i = 1;
		int cont = 0;
		
		
		while(i <= numeroUtente) {
			
			if(numeroUtente % i == 0 )
				cont++;

			i++;
		}
		
		
		if(cont > 2)
			System.out.println("non primo");
		else
			System.out.println("PRIMO");

		
		
		
		key.close();
		
	}
	
	
}
