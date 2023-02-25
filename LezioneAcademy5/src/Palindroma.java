import java.util.Scanner;

/**
 * 
 *  data una stringa dire se è palindroma...
 *  
 *  
 *  
 *  	Es :::   anna ----> palindroma
 *  
 *   			 ala ---> palindroma

 *  
 * 
 * @author mr
 *
 */

public class Palindroma {

	public static void main(String[] args) {
		
		
		
		Scanner key = new Scanner(System.in);
	
		String parola = key.next();
		
		String parolaReversed ="";
		
		int i = parola.length() - 1;
		
		
		while(i >= 0) {
			
			parolaReversed += parola.charAt(i);
			
			i--;
		}
		
		System.out.println("Reversed ----> " + parolaReversed);
		
		if(   parola.equals(parolaReversed)    )
			System.out.println("ok è palindroma");
		else
			System.out.println("no");

		
		key.close();

	}

}
