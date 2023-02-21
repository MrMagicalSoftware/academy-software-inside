import java.util.Scanner;

/**
 * 
 * prenda in ingresso da tastiera con scanner un numero intero
 * il programma stampa a video il precedente del numero e il
 * successi del numero
 * 
 * 
 * Es    10 
 * 
 * 		  "il precedente .. . ."  9 
 * 
 * 		  "il success "   11
 * 
 * 
 * 		 100 ---> 101  99
 * 
 * 
 * 
 * @author mr
 *
 */



public class EsercizioTastiera3 {

	
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int numeroUtente ;
		
		System.out.println("Insersci un numero");
		numeroUtente = key.nextInt();
		
		System.out.println("Il precedente di " + numeroUtente + " vale " +  (numeroUtente - 1)  );
		System.out.println("Il succ di " + numeroUtente + " vale " +  (numeroUtente + 1)  );

		int pre , succ ;
		
		
		//pre = numeroUtente - 1 ;  
		pre = numeroUtente--; // decremento di 1 
		
		
		
		//succ = numeroUtente + 1; 
		succ = numeroUtente++;
		
		
		int succ3  = numeroUtente +=3;
		System.out.println("3 numeri in avanti " + succ3);
		
		
		key.close();
	}
	
	
}
