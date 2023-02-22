import java.util.Scanner;

/*
 *  dati 3 numeri in input stampare si 
 *  se tutti e 3 i numeri sono multipli di 5 
 *  
 *  
 *   10 20 50 ok
 *   
 *   10 20 4  no 
 * 
 * 
 */



public class Esercizio11 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		int numero1 , numero2 , numero3;
		
		
		System.out.println("inserisci 3 numeri");
		
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		numero3 = key.nextInt();
		
		
		if(numero1 % 5 == 0 && numero2 % 5 == 0 && numero3 % 5 == 0)
			System.out.println("ok");
		else
			System.out.println("no");

		
		key.close();
	}
	
}
