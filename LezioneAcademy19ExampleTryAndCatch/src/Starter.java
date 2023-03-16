import java.util.NoSuchElementException;
import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		//3
		
		int somma = 0;
		int cont = 0 ;
		
		do {
			
			
			try {
			
				System.out.println("Inserisci un numero");
				int i = key.nextInt();
				System.out.println("ok numero "+ i );
				somma += i;
			}catch (Exception e) {
				System.out.println("Errore reinserisci un numero");
				key = new Scanner(System.in);
				continue;
			}
			
			cont++;
			
		} while (cont < 10 );
		
		
		
		System.out.println("somma vale " + somma);
		key.close();
	}

}
