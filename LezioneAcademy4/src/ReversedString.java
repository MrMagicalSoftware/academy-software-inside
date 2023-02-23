import java.util.Scanner;

public class ReversedString {

	public static void main(String[] args) {
	
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("INSERISCI UNA PAROLA");
		
		String parolaUtente  = key.next();
		
		String parolaReversed  = "";
		
		
		int i = parolaUtente.length() -1 ; //errore
		
//		parolaUtente = parolaUtente.toUpperCase();
//		System.out.println("-----> " + parolaUtente);
//		
		while(i >= 0) {
			
			parolaReversed += parolaUtente.charAt(i); // parolaReversed = parolaReversed +  parolaUtente.charAt(i); 
			i--;
		}
		
		
		System.out.println(parolaReversed.toLowerCase());
		
		
		
		
		
		
		
		key.close();
	}

}
