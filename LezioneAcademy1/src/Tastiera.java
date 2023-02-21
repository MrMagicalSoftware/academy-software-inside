import java.util.Scanner;


/*
 * 
 *  Creare un programma che prenda in 
 *  ingresso da tastiera 3 numeri interi
 *  e si mostra a video la somma di questi 3
 *  numeri .
 *  
 *  Es  ( 10  2  4 ) ===> 10 + 2 + 4 => 16 
 * 
 * 
 */


public class Tastiera {

	public static void main(String[] args) {
	
		// tipoDato nomeVariabile
		
		int numero1 , numero2;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci un numero ");
		
		
		
		numero1 = tastiera.nextInt();
		
		
		System.out.println("Hai scritto il numero " + numero1);
		
		tastiera.close();
		
	}

}
