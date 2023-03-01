package it.sofwareInside.array;


/*
 * 
 * 
 * 
	Dato un array di N interi scrivere un algoritmo (o programma Java) per stampare i valori degli
	elementi in posizione pari.
	
	
	 0    1   2    3      4     =======>  8 , 16 , -18 
	[ 8 , 7 , 16 , -8 , -18]
 * 
 */

public class Esercizio8 {

	public static void main(String[] args) {
		
		int[] vett = {8 , 7 , 16 , -8 , -18};
		
		int j = 0 ;
		
		while(j < vett.length) {
			System.out.print(vett[j] + " ");
			j+=2;
		}
		
		System.out.println("###############");
		
		
		for(int i = 0 ; i < vett.length ; i++) {
			
			if(i % 2 == 0 )
				System.out.print(vett[i] + " ");
		
		}
		

		
		
		
		
		
		int myValue = 99;
		
		int export = 0;
		
		
		{
			// il regno di ROB
			
			System.out.println(myValue);
			int variabileDiRob = 888;
			export = variabileDiRob;
			
			
		}
		
		System.out.println(export);
		
		
		
		
		
	
		{
			int myVar = 88 ;
			
		}
		
		
		{
			int myVar = 88 ;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
