import java.util.Scanner;

/**
 * 
 * 
 * dato in input 3 numeri calcolare la media artimetica
 * 
 * 
 * @author mr
 *
 */



public class EserzioTastiera10 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		
		int numero1 , numero2 , numero3 ;
		
		double media ;
		
		System.out.println("inserisci");
		
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		numero3 = key.nextInt();
		
		media = (numero1 + numero2 + numero3)/ 3.0;
		
		System.out.println("la media vale " + media );
		
		key.close();
	}
	
}
