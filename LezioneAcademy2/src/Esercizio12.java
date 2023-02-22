import java.util.Scanner;

/**
 * 
 * dati 3 numeri da tastiera dire se sono crescenti
 * 
 * Es   10 80 100 ok
 * 
 * 		50 100 90 no
 * 
 * 
 * @author mr
 *
 */


public class Esercizio12 {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		
		
		int numero1 , numero2 , numero3 ;
		
		System.out.println("inserisci");
		
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		numero3 = key.nextInt();
		
		if(numero1 <= numero2 && numero2 <= numero3)
			System.out.println("Ok");
		else
			System.out.println("no");
		
		
		key.close();
		
	}
	
	
}
