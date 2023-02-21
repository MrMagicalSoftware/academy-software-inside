import java.util.Scanner;

public class EsercizioTastiera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//TIPOLOGIA nomeVariabile
		
		/*
		 *  double resto 
		 *  double quelloCheVoglio
		 * 
		 * 
		 *  Cane caneRex = new Cane();
		 * 
		 */
		
		
		Scanner key = new Scanner(System.in);

		int numero1 , numero2 , numero3 , somma;
		
		
		System.out.println("Inserisci 3 numeri");
		
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		numero3 = key.nextInt();
		
		somma = numero1 + numero2 + numero3;
		
		System.out.println("La somma vale " + somma);
		

		key.close();
	}

}
