import java.util.Scanner;

/**
 * 
 * prendere in input una sequenza di interni
 * che termina con 0.
 * 
 * il programma stampa "si" se la sequenza è
 * formata da un pari seguito da un dispari , seguito
 * da un multiplo di 5.
 * 
 * 
 * 	Es 10 3 5 	0 "ok"
 * 
 * 	Es 10 3 5 22 7 50 ok
 * 

 * 
 *  Es 10 4 50  0  "no"
 * 
 * 
 * @author mr
 *
 */


public class EsercizioCiclo {


	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);		
		
		
		int numeroCorrente;
		int cont = 0;
		boolean isSequenzaOk = true;
		
		do {
			
		
			System.out.println("inserisci");
			numeroCorrente = key.nextInt();
			
			if(numeroCorrente ==  0)
				break;
			
			
			if(cont == 0) {
				//devo avere un numero pari
				//quindi se trovo dispari non va bene...
				
				if(numeroCorrente % 2 != 0) {
					System.err.println("@@@@@@@PARTE 1 FALSE@@@@@");
					isSequenzaOk = false;
				}
					

			}

			else if(cont == 1) {
				//devo avere un numero dispari
				//quindi se trovo pari non va bene...
				
				if(numeroCorrente % 2 == 0) {
					System.err.println("PARTE 2 FALSE");
					isSequenzaOk = false;

				}

			}
			else {
				//devo avere un numero multiplo di 5 
				//quindi se trovo un NON MULTIPLO DI 5 NON VA BENE
				
				if(numeroCorrente % 5 != 0) {
					System.err.println("PARTE 3 FALSE");

					isSequenzaOk = false;
				}
					
			}

			cont++;						
			
			if(cont > 2) // reset ???
				cont = 0;
			
			System.out.println("Quanto vale cont ??? " + cont);
			
			
		} while (numeroCorrente != 0);
		
		
		
		if(isSequenzaOk)
			System.out.println("ok");
		else
			System.out.println("no");

		System.out.println("##################");
		
		
		key.close();
	
	}
	
	
	
	
}
