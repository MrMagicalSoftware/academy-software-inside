import java.util.Scanner;

/**
 * 
 * 
 * dati 2 numeri da tastiera
 * il programma stampa ok se il secondo numero e' un divisiore del primo
 * 
 * 
 * 
 * Es    10  2 ----> ok
 * 
 *       10   3 ---> no
 *    
 *       9     3  --> ok
 * 
 * @author mr
 *
 */

public class EsercizioTastiera9 {

	
	public static void main(String[] args) {
		System.out.println("##############");
		
		Scanner key = new Scanner(System.in);
		
		
		int numero1 , numero2 ;

		numero1 = key.nextInt();
		numero2 = key.nextInt();
		
		if(numero1 % numero2 == 0)
			System.out.println("ok");
		else {
			System.out.println("no");
		}
		
		
		
		key.close();
	}
	
}
