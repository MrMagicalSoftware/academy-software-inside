import java.util.Scanner;

/**
 * 
 * 
 * Dato un numero in input che rappresenta la grandezza del vettore
 * il numero deve essere > 0 altrimenti richiedere.
 * 
 * usare il numero per creare un vettore di n elementi
 * e con un ciclo riempire il vettore usando sempre scanner
 * 
 * stampare tutti gli elemementi del vettore usando un ciclo
 * 
 * 
 * 			
 * 			Es : inserisci la dimensione
 * 				 -8 
 * 				 inserisci la dimensione
 * 				 -3
 *  			 inserisci la dimensione
 * 				  5
 * 
 * 
 *  ok creo un vettore di 5 elementi
 *  
 *  
 *  			syso(inserisci un elemento nel vettore ) 
 *  			 10  
 *  			 5 
 *               7 
 *               -1
 *               -99
 *               
 *  
 *  			Stampo il vettore  10 .. ... . -99
 * 
 * 
 * 
 * @author mr
 *
 */



public class RiempimentoManualeVettore {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		int dimensioneVettore ;
		
		//semaforo devo avere la dimensione del vettor
		//che deve essere > 0
		do {
			System.out.println("dim vett ?");
			dimensioneVettore = key.nextInt();
			
		} while (dimensioneVettore <=0 );
		
		
		
		System.out.println("ok creo un vettore di " + dimensioneVettore);
		
		int[] vett = new int[dimensioneVettore];
		
		
		int i = 0;
		//inserimento elementi del vettore
		while(i < vett.length) {
			
			System.out.println("inserisci elemento");
			// vettore nella posizione i riceve un elemento da tastiera
			vett[i] = key.nextInt() ; 
			
			i++;
		}
		
		System.out.println("#########################");
		
		i = 0;
		
		//lettura del vettore
		while(i < vett.length) {
			System.out.println(vett[i]);
			i++;
		}
		
		
		
		System.out.println("##########################");
		
		key.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
