import java.util.Scanner;

/**
 * 
 * 
 * Esercizio 2.3: Scrivere un programma PositivoNegativo 
 *  che chiede all’utente di inserire una sequenza
	di interi terminata quando l’utente
	 immette il valore 0 e poi stampa "OK" se la sequenza contiene un
	valore positivo seguito da uno negativo,
	 altrimenti stampa il messaggio "NO". A vostra scelta, la stampa
	del messaggio "OK" può interrompere o meno l’inserimento dei valori. 
	Risolvere questo esercizio senza
	usare array.
 * 
 *  10 -9 2 OK
 *  10 2 2 --> NO
 * 
 * @author mr
 *
 */


public class PositivoNegativo {
	
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Numero positivo seguito da uno negativo");
		
		System.out.println("Inserisci un numero");
		
		boolean isSequenceOk = true;
		int cont = 0;
		
		int numeroUtente = key.nextInt();
		
		while(numeroUtente != 0) {
			
			if(cont % 2 == 0) {
				//significa che devo
				//cercare se ho un numero negativo
				//se ho un valore negativo allora non mi va bene
				// e isSequenceOk = false;
				System.out.println("Sono nel ramo if");
				
				if(numeroUtente < 0 ) {
					System.out.println("la sequenza non va bene");
					isSequenceOk = false;
				}
					
			}
			else {
				System.out.println("Sono nella else");

				
				if(numeroUtente > 0 ) {
					System.out.println("invalidata");

					isSequenceOk = false;
				}
					
			}
			
			System.out.println("inserisci");
			numeroUtente = key.nextInt();
			
			cont++;
		
		}
		
		
		//conclusioni
		
		if(isSequenceOk)
			System.out.println("ok");
		else
			System.out.println("no");

		
		
		
		System.out.println("fine");
		
		key.close();
	}

}
