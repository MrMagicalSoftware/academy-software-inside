import java.util.Scanner;

/**
 * 
 * 
 * 
/***
 * 
 * 
 * 
 *  Data una sequenza che termina con il valore 0
 *  dire se ho un numero multiplo di 3 seguito da un numero 
 *  
 *  multiplo di 5
 *  
 *  
 *  Es  	3 5 9 20 12 "ok"
 *  
 *          3 4 9 20  "no"
 *          
 *          
 * 
 * 
 * @author mr
 *
 */

public class PingPong {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("inserisci un valore");
		int numeroUtente = key.nextInt();
		boolean isSequenceOk = true;
		int cont = 0;
		
		while(numeroUtente != 0) {
			
			
			if(cont % 2 == 0 ) {
				//check di non avere un numero multiplo di 3
				
				if(numeroUtente % 3 !=0 )
					isSequenceOk = false;
			}
			else {
				//check di non avere un numero multiplo di 5
				if(numeroUtente % 5 !=0 )
					isSequenceOk = false;
			}
		
			System.out.println("inserisci un valore");
			numeroUtente = key.nextInt();
		
			cont++;
		}
		
		
		
		if(isSequenceOk)
			System.out.println("ok");
		else
			System.out.println("no");


		key.close();
	}

}
