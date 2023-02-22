import java.util.Scanner;

/**
 * 
 * 
 *  Creare un programma che prenda da tastiera
 *  un numero intero con scanner
 *  
 *  il programma calcola il fattoriale del numero.
 *  
 *  Es :  
 *  
 *  	fatt3 = 1 * 2 * 3 ==== 3 * 2 * 1
 *  
 *  	fattoriale di 4 =======>  4 * 3 * 2 * 1
 * 	
 * 		fattoriale di 5 ===> 1 *2*3*4*5 ====> 120
 * 
 * @author mr
 *
 */


public class EsecizioCiclo7 {

	public static void main(String[] args) {
		
		
		int fattoriale = 1;
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("inserisic un numero");
		int numeroUtente = key.nextInt();
		
		while(numeroUtente > 1) {
			
			//System.out.println(numeroUtente);
			fattoriale *= numeroUtente;  // 5 * 4 * 3 . .. . ..
			// fattoriale = fattoriale * numeroUtente 
			
			numeroUtente--;
		}
		
		// fattoriale = 1 * 5
		// fattoriale = 5 * 4
		// fattoriale = 20 * 3
		// fattoriale = 60 * 2
		// fattoriale = 120 * 1 ====> 120
		
		
		System.out.println(fattoriale);
		key.close();
	}
	
}
