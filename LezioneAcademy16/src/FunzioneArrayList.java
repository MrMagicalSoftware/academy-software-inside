import java.util.ArrayList;

public class FunzioneArrayList {

	//attributi 
	
	
	
	
	
	//metodi
	
	
	/*
	 * Creare una funzione che prenda in ingresso
	 * un arrayList di integer , e un numero intero 
	 * e restituisce la somma di tutti gli elementi che
	 * sono multipli dell'elemento inserito.
	 * 
	 *   
	 *    (  ARRAYLIST , NUMERO             )
	 
	 *    [10 , 5 , 2 , 6 , 3 ] , 5 =====> ( 10 + 5 ) ===> 15 
	 *  
	 * 
	 */
	
	
	public int sommaElementiArrayList(ArrayList<Integer> vett , int numeroInserito) {
		int somma = 0 ;
		
		for(int elemento : vett)
			if(elemento % numeroInserito == 0 )
				somma += elemento;
		
		
		return somma;
	}
	
	
	
	//creare una funzionc che prenda in ingresso
	// un arraylist di double  e ritorna il prodotto in double
	// di tutti gli elementi dell'arraylist
	
	// Es : [ 3,2 , 6 , 1,4 ] ====>   ( 3.2 * 6 * 1.4 ) ==> 
	
	
	public double moltiplicaElementiArrayList(ArrayList<Double> myVett) {
		
		double ris = 1;
		
		for (int i = 0; i < myVett.size(); i++) {
			ris *=  myVett.get(i);        // ris = ris * myVett.get(i)
		}
	
		return ris;
	}
	
	
	//prendere in input un arraylist di interi e ritornare
	// un valore booleano
	
	// true se tutti gli elementi sono pari
	//altimenti false ..
	
	//   7 ,14 3 ,2    ==========> false
	
	// [ 10 , 2 , 20 ] =========> true 
	
	
	public boolean isAllNumbersEven(ArrayList<Integer> vett) {
		
		for (Integer el : vett) 
			if(el % 2 != 0 )
				return false;
		
		return true;
	}
	
	
	/*
	 * 
	 * creare una funzione che prenda in ingresso 
	 * un arraylist di double  e un double compreso tra (0 e 1 )
	 * 
	 * nella funzione se il numero non è compreseo tra il range
	 * indicato il programma ritorna null.
	 * 
	 * 
	 * altrimenti il programma ritorna un arraylist dove elemento per elemento
	 * 
	 * succede questo    :
	 * 
	 * 
	 *        [ 100 , 8 ,  7.4  ] , 0.5   ========> 
	 *        
	 *        
	 *       [ 100 * 0.5   ,  8 * 0.5  , 7.4 * 0.5 ]===> 
	 * 
	 * 		
	 *        
	 * 
	 * 
	 */

	
	
	
	
}
