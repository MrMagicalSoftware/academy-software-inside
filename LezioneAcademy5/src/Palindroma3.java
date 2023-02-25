import java.util.Scanner;

public class Palindroma3 {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci");
		
		String parola = key.next();
		
		StringBuilder sb = new StringBuilder(parola);  
	    
		String parolaReversed = sb.reverse().toString();
		

		if(parola.equals(parolaReversed))
			System.out.println("palindroma");
		else
			System.out.println("no");

		
		key.close();
	}

}
