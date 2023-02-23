import java.util.Scanner;

/*
 * 
 *  1 - scanner
 *  2 - salvare in una variabile la parola
 *  3 -ciclo while da 0 fino a length
 *  4- selezione se la i è pari ... stampa il carattere della stringa
 *     alla posizione i 
 * 
 * 
 * 
 * 	Creare un programma che prenda in ingresso una stringa
 *  stampi a video solamente le posizioni pari della stringa
 *  
 *       0 1 2 3 4 5
 *  Es   a l b e r o 
 * 
 *       a b r
 *    
 *    
 */

public class EsercizioCicli {
	
	
	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisc");

		String parola = key.next();
		
		int i = 0 ;
		String parolaInPosizionePari ="";
		
		while(i < parola.length()) {
			
			if(i % 2 == 0 ) {
				System.out.print(parola.charAt(i) + "");
				parolaInPosizionePari +=parola.charAt(i);
			}
			
			i++;
		}
		System.out.println();
		System.out.println("###################");
		
		System.out.println(parolaInPosizionePari);
		
	}
	
	

}




