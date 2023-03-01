import java.util.Scanner;

/**
 * 
 * prendere un numero da tastiera con scanner
 * 
 * stampare tutti gli elementi del vettore
 * che sono multipli dell'elemento inserito
 * 
 * 	Es : input ( 3) 
 * 
 *       6 , 3 , 12
 * 
 * @author mr
 *
 */

public class StampaVettoreMultipli {

	public static void main(String[] args) {

		int[] vett = { 6 , 8 , 10 , 3 , 12  , 100 , 677 , 617  };
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("dammi un numero e ti trovo tutti i multipli presenti nel vettore");

		int numeroUtente = key.nextInt();
		
		int i = 0 ;
		
		
		while( i < vett.length ) {
			
			
			if(vett[i] % numeroUtente == 0)
				System.out.println(vett[i]);
				
			i++;
		}
		
		
		
		key.close();
	}

}
