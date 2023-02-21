import java.util.Scanner;

/**
 * 
 * prendere in ingresso 2 numeri e dire se i due numeri sono uguali oppure diversi
 * 
 * 
 * 20 20 UGUALI
 * 
 * 20 5 DIVERSI
 * 
 * 
 * @author mr
 *
 */

public class EsercizioTastiera8 {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		int numero1 , numero2;
		
		
		
		System.out.println("#################");
		System.out.println("inserisci 2 numeri");
		System.out.println("##################");
		
		
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		
		if(numero1 == numero2)
			System.out.println("numeri uguali");
		else
			System.out.println("numeri diversi");
		
		System.out.println();
		System.out.println();
		
		
		if(numero1 != numero2)
			System.out.println("numeri diversi");
		else
			System.out.println("numeri uguali");

		
		
		key.close();
	}
	
	
}





