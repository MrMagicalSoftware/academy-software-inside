import java.util.Scanner;

/**
 * 
 * 		CALCOLA PUNTI 
 * 
 * 
 *      3 NUMERI IN input 
 *      che sono le vittorie , sconfitte , e pareggi
 *      e calcola il punteggio del team
 *      
 *      
 *      sapendo che 1 vittoria => 3 punti
 *      			sconfitta =>  0 punti
 *      			pareggio => 1 punti
 *      
 *      
 *      Es     v = 3 , s = 10 , p = 2
 *      
 *      	  ottengo ?  9 + 2 => 11
 * 
 * 
 * 
 * 
 * 			&& -------> AND
 * 				
 * 
 * 
 * 
 * @author mr
 *
 */





public class Esercizio7 {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
	
		System.out.println("inserisci 3 numeri v - p - s");
		
		
		int vittorie = key.nextInt();
		int pareggi  = key.nextInt();
		int sconfitte = key.nextInt();
		
		
		if(vittorie >= 0 && pareggi >= 0 && sconfitte >= 0  ) {
			
			int totale = vittorie * 3 + pareggi;
			
			System.out.println("Totale " + totale);
			
			
		}else {
			System.out.println("qualche numero risulta essere negativo");
		}
		
		
		
		
		
		
		key.close();
	}
	
	
	
	
	
	
	
}
