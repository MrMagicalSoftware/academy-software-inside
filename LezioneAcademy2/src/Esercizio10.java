import java.util.Scanner;

public class Esercizio10 {

	public static void main(String[] args) {

		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("Inserisci parola e indice");
		String parola = key.next();
		
		
		int indice = key.nextInt();
		
		
		if(indice >= 0 && indice < parola.length()) {
			System.out.println(   parola.charAt(indice)             );

		}else {
			System.out.println("nON POSSO PRENDERE IL CARATTERE");
		}
		
		
		
		
		key.close();
		
	}
	
}
