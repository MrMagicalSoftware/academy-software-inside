import java.util.Scanner;

/**
 * 
 * 
 * creare un programma che prenda 2 numeri interi da tastiera
 * che sono la base e esponente il programma calcola la potenza
 * 
 * 
 * Es     2 ^ 3 ==>   2 * 2 * 2
 * 
 * 		   4^ 2  ==>  4 * 4 
 * 
 * @author mr
 *
 */



public class EsercizioCiclo8 {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int base , esponente ;
		int potenza = 1;
		
		System.out.println("Inserisci la base");
		base = key.nextInt();
		
		System.out.println("Esponente");
		esponente = key.nextInt();
		
		
		System.out.println("Hai inserito base " + base + " esponente ==  " + esponente);
		System.out.println("POTENZA " + Math.pow(base, esponente));

		
		while(esponente >= 1) {
			
			//System.out.print(base + " * " );
			potenza = potenza * base;   // potenza *= base;
			
			esponente--;
		}
		
		System.out.println("POTENZA VALE " + potenza);
		
		
		
		key.close();
	}
	
	
	
}
