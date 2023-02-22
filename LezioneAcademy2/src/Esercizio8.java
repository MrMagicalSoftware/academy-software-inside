import java.util.Scanner;

/**
 * 
 * 
 * 
 *   3 numeri in ingresso dire se sono tutti uguali
 *   
 *   altrimenti stampare "diversi"
 *   
 *   
 *   Es 10 10 10  uguali
 *   
 *   Es 10 10 9   diversi
 * 
 * 
 * @author mr
 *
 */




public class Esercizio8 {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("inserisci 3 numeri");
		
		int numero1 , numero2 , numero3;
		
		
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		numero3 = key.nextInt();
		
		
		if(numero1 == numero2 && numero2 == numero3) {
			System.out.println("i numeri sono uguali");
		}
		else {
			System.out.println("diversi");
		}
		
		
		
		key.close();
	}

	
	
	
	
	
	
	
	
}
