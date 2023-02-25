import java.util.Scanner;

public class NumeroPrimoPro {

	public static void main(String[] args) {

		
		Scanner key = new Scanner(System.in);
		
		System.out.println("insert");
		int numeroUtente = key.nextInt();
		
		
		boolean isPrimeNumber = true;
		
		int i = numeroUtente / 2;
		
		
		while(i > 1 ) {
			
			System.out.println("PRENDO IN CONSIDERAZIONE " + i);
			
			if(numeroUtente % i == 0  ) {
				
				System.out.println("Sono qui " + i );
				
				isPrimeNumber = false;
				break;
			}
			
			i--;
		}
		
		
		if(isPrimeNumber)
			System.out.println("ok primo");
		else
			System.out.println("non primo");

		
		key.close();
		
	}

}
