import java.util.Scanner;

/**
 * si crea un programma che in ingresso da tastiera 2 double
 * e stampa a video la moltiplicazione di questi 2 double
 * 
 * 
 * @author mr
 *
 */

public class EsercizioTastiera2 {

	public static void main(String[] args) {
		
		//double example = 0.30;

		Scanner key = new Scanner(System.in);
		
		double valore1 , valore2 ;
		 
		System.out.println("Inserisci il primo valore");
		
		valore1 = key.nextDouble();
		
		System.out.println("Inseriscil il secondo");
		 
		valore2 = key.nextDouble();
		
		
		System.out.println("il prodotto vale "   +  ( valore1 * valore2));
		
		double prodotto = valore1 * valore2;
		
		System.out.println("il prodotto vale "   + prodotto);
		
		
		key.close();
	}

}
