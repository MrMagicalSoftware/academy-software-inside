import java.util.Scanner;

public class EsercizioSingolo {

	
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci");
		int numeroU ;
		int contErrori = 0;
		
		do {
			System.out.println("Inserisci un numero > 0");
			numeroU = key.nextInt();
			
			
			
			if(contErrori > 2) {
				System.out.println("ok basta me ne vado io .. . ");
				System.exit(0);
			}
			contErrori++;
			
		} while (numeroU <= 0);
		
		
		System.out.println("###################à");
		
		System.out.println("Soluzione con FOR \n");
		
		for (int i = 0; i < numeroU; i++) {
			System.out.print("*");
		}
		
		
		
		System.out.println(" \n\n#####################");
		
		
		int i = 0;
		
		
		while( i  < numeroU) {
			
			System.out.print("*");
			
			i++;
		}
		
	
		System.out.println("\n\n\n");
		
		
		
		int j = 0 ;
		
		do {
			System.out.print("*");
			j++;
		} while (j < numeroU);
		
		
		
		key.close();
	}
}
