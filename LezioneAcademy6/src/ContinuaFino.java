import java.util.Scanner;

/**
 * 
 * 
 * 
 * 
 * Esercizio 2.2: Scrivere un programma 
 * ContinuaFino che chiede all’utente di inserire una sequenza di
	interi. Il programma continua a chiedere 
	all’utente di inserire valori fintanto che i valori inseriti soddisfano
	almeno una delle seguenti condizioni:
	• è negativo e divisibile per 2 (elementoCorrente < 0 && elementoCorrente % 2 == 0 )
	• è positivo e divisibile per 3
	Al termine il programma stampa la 
	somma di tutti i valori inseriti escluso quello ha violato le condizioni.
	Risolvere questo esercizio senza usare array.
	 * 
 * @author mr
 *
 */


public class ContinuaFino {

	public static void main(String[] args) {
		

		Scanner key = new Scanner(System.in);
		int somma = 0;

		
		
		
//		do {
//			System.out.println("inserisci");
//			elementoCorrente = key.nextInt();
//			somma += elementoCorrente;
//		} while ( (elementoCorrente < 0 && elementoCorrente % 2 == 0 ) 
//				|| (elementoCorrente > 0 && elementoCorrente % 3 == 0)  );
		
		
		System.out.println("inserisci ");
		int elementoCorrente = key.nextInt();
		
		while((elementoCorrente < 0 && elementoCorrente % 2 == 0 ) 
				|| (elementoCorrente > 0 && elementoCorrente % 3 == 0)) {
			

			somma += elementoCorrente;
			elementoCorrente = key.nextInt();
		}
		
		
		
		System.out.println("somma vale " + somma);
		
		
		key.close();
	}

}
