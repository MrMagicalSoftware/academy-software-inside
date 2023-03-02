import java.util.Scanner;

public class EsercizioPiramide {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int altezza;
		
		do {
			System.out.println("inserisci");
			altezza = key.nextInt();
		} while (altezza <= 0);
		
		
		
		for (int i = 0; i < altezza; i++) {
			
			
			
			for(int j = 0 ; j <  i + 1 ; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
		
		
		key.close();
	}
	
}
