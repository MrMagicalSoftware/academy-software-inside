import java.util.Scanner;

/**
 * prendere 2 stringhe in input
 * 
 * stampare a video la stringa che ha maggiori caratteri
 * 
 * 
 * Es  : ciao
 * 		 gattino 
 * 
 * 
 *       gattino
 *       
 *       
 * Se i caratteri sono uguali stampare la prima stringa
 * 
 *       ciao
 *       miao
 *       
 *       ciao
 *       
 *       
 *       >  < >= <= ==  !=   
 *       
 *       
 *       ! NEGAZIONE
 *       
 * 
 * 
 * @author mr
 *
 */


public class Esercizio2 {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);		
		
		
		System.out.println("Inserisci 2 parole");
		
		
		String parola1 = key.next();
		String parola2 = key.next();
		
		
		System.out.println();
		
		if(parola1.length() >= parola2.length() )
			System.out.println(parola1);
		else
			System.out.println(parola2);

		
		key.close();
	}
	
}
