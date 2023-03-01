import java.util.Scanner;

/**
 * 
 * 
 * Esercizio 2.1: 
 *   Scrivere un programma TuttiPositiviPari
 *  che chiede all’utente di inserire una se-
	quenza di interi (chiedendo prima quanti numeri voglia inserire) 
	e poi, al termine dell’inserimento
	dell’intera sequenza, stampa "Tutti positivi e pari" 
	se i numeri inseriti sono tutti positivi e pari,
	altrimenti stampa "NO". 
	Risolvere questo esercizio senza usare array.
 * 
 * 
 * @author mr
 *
 */



public class TuttiPositiviPari {

	public static void main(String[] args) {
		
		//fino a che l'utente non mi inserisce
		// un numero positivo non vado avanti
		// e richiedo il numero
		
		
		Scanner key = new Scanner(System.in);
		
		int numeroDiElementi ;
		
		do {
			System.out.println("inserisci n > 0");
			numeroDiElementi = key.nextInt();
		} while (numeroDiElementi <= 0 );
		
		
		// sono sicuro che numeroDiElementi > 0 
		
		
		System.out.println("OK CREO UN CICLO DI " + numeroDiElementi);
		
		boolean isAllNumersEven = true;
		
		
		int i = 0;
		int elementoCorrente ;
		
		
		while(i < numeroDiElementi) {
			
			System.out.println("inserisci");
			elementoCorrente = key.nextInt();
			
			// se è negativo oppure dispari 
			if(elementoCorrente < 0 || elementoCorrente % 2 != 0) {
				isAllNumersEven = false;
				//break;
			}
				
			i++;
		}
		
		
		if(isAllNumersEven)
			System.out.println("Tutti positivi e pari" );
		else
			System.out.println("no");

		
		
		
		key.close();
	}

}
