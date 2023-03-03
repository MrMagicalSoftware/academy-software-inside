package it.softwareInside.object;

public class EserciziFunzione {

	
	
	
	/*
	 * 
	 * creare una funzione che prenda in input 2 numeri 
	 * e ritorna la somma di 2 due numeri
	 * 
	 * Es :  3 , 5  ====> 8
	 * 
	 */
	
	/*
	 * 
	 * 
	 *   public tipoRitorno nomeFunzione ( PARAMETRI IN INPUT ) {
	 *   
	 *   	
	 *   	return  .. . . . .
	 *   }
	 *  
	 *  
	 */
	
	
	
	public int somma(int numero1 , int numero2) {
		
		
		return numero1 + numero2;
	}
	
	
	
	
	
	// creare una funzione che prenda in input un numero
	// ritorna il doppio del numero
	
	// ES  10 ----> 20
	
	
	
	public int moltiplicaPerDue(int numero) {
		
		int ris = numero * 2;
		return ris;
	}
	
	
	//costruire una funzione che prenda in ingresso un numero
	// ritorna true se il numero è pari altrimenti ritorna false.
	
	
	// Es : 10 ----> true
	// es  : 5 ___> false
	
	//  isEven
	
	
	public boolean isEven(int numero) {
		
		if(numero % 2 == 0)
			return true;
		else
			return false;

	}
	
	
	public boolean isEven2(int numero) {
		
		return numero % 2 == 0;
	}
	
	
	
	
	//creare una funzione che 
	//prenda una stringa e ritorni 
	// il numero lettere "a" che contiene la stringa
	
	// ES : ala ----> 2 
	
	// ciao --> 1
	
	// oro ---> 0
	
	
	
	
	
	
	/**
	 * 
	 * La funzione prende in input 
	 * una stringa e ritorni il numero lettere "a" che contiene la stringa <br><br>
	 *  
	 * 
	 * Es  ala ----> 2 <br>
	 * Es  ciao --> 1<br>
	 * 
	 * @param parola
	 * @return
	 */
	public int contaLettereA(String parola) {
		
		
		int cont = 0;
		
		for(int i = 0; i < parola.length() ; i++) {
			if(parola.charAt(i) == 'a')
				cont++;
		}
		
		
		return cont ; 
	}
	
	
	
	
	//creare una funzione che prende in ingresso un vettore
	// di interi e retuisce il vettore di interi dove ogni elemento
	//è moltiplicato per 2
	
	
	// [ 5 , 3 , 2 ]   ===========> [ 10 , 6 , 4 ]
	
	public int[] moltiplicaVett(int[] vett) {
		
		int[] vettRis = new int[vett.length];
		
		for (int i = 0; i < vett.length; i++) {
			vettRis[i] = 2 * vett[i];
		}
		
		
		return vettRis;
	}
	
	
	public void stampaVettore(int[] vett) {
		
		for (int i = 0; i < vett.length; i++) {
			System.out.print(vett[i] + " ");
		}
	}
	
	
	
	
}
