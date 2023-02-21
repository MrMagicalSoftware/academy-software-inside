import java.util.Scanner;

public class EsercizioTastiera6 {

	
	public static void main(String[] args) {
		
		
		
		//System.out.println(10 % 2);
		//System.out.println(10 % 3);
		
		///23818321321831283812992
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inerisci");
		
		int numeroUtente = key.nextInt();
		
		//  parteSinistra == parteDestra ??
		if(numeroUtente % 2 == 0) {
			System.out.println("numero pari");
			System.out.println("il numero risulta essere pari");
		}
		else
			System.out.println("numero dispari");
		
		
		
		
		key.close();
	}
	
}
