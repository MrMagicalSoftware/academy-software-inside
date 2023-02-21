import java.util.Scanner;

/**
 * 
 * prende in ingresso 2 numeri interi con la tastiera
 * stampa  a video il numero piu' grande
 * 
 *    2  8 --->  8
 *    
 *    10 3 ---> 10 
 * 
 * 
 * @author mr
 *
 */


public class EsercizioTastiera7 {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in); 
		
		
		int numero1 , numero2 ;
		
		System.out.println("inserisci");
		
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		
		
		// 50 20
		
		// 4 20 
		
		if(numero1 > numero2) {
			System.out.println(numero1);
		}
		else {
			System.out.println(numero2);
		}
		
		
		
	
		key.close();
	}
	
	
}




