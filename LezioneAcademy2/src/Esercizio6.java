import java.util.Scanner;

/**
 * 
 * crea un programma che prenda in ingresso un numero
 * se il numero e' minore o uguale a 0 il programma
 * stampa a video la scritta non posso continuare oltre,
 * 
 * altrimenti il programma converte i minuti in secondi
 * 
 * sapendo che 1 min sono 60 secondi
 * 
 * 
 *    2 minuti sono 120 secondi
 * 
 * 
 * @author mr
 *
 */



public class Esercizio6 {

	public static void main(String[] args) {
		
		int numeroUtente ;
		
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("inserisci un numero che sia > 0 ");
		
		
		numeroUtente = key.nextInt();
		
		
//		if(numeroUtente > 0) {
//			
//			System.out.println(numeroUtente + " minuto  corrispondono a " + (60 * numeroUtente )  + " secondi");
//			
//		}else {
//			System.out.println("non posso eseguire il calcolo");
//		}
		
		
		
		if(numeroUtente <= 0) {
			System.out.println("non posso eseguire il calcolo");

		}
		else {
			System.out.println(numeroUtente + " minuto  corrispondono a " + (60 * numeroUtente )  + " secondi");

		}
		
		
		
		
		
		
		
		key.close();
	}
	
}
