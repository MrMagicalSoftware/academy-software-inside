/**
 * 
 * 
 * 
 * CREARE UN PROGRAMMA CHE USA UN CICLO PER STAMPARE A VIDEO
 * LA PRODUTTORIA DEGLI ELEMENTI CHE VANNO DA 4 FINO A 8 ESTREMI INCLUSI
 * 
 * 
 * 		4 * 5 * 6 * 7 * 8 
 * 
 * @author mr
 *
 */


public class EsercizioCiclo6 {

	public static void main(String[] args) {
	
		
		int  i = 4;
		int prodotto = 1;
		
		while(i <= 8) {
			
			//System.out.println(i);
			prodotto *= i ; // prodotto = prodotto * i 
			
			i++;
		}
		
		System.out.println(prodotto);

	}

}
