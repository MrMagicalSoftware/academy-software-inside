
/***
 * 
 * Dato un vettore di String già con dei valori
 * 
 * 
 * stampare tutte le stringhe che si trovano in una posizione pari del vettore
 * 
 * 
 * 		[ "ciao , "mario" , "rossi" , "bello" ] 
 * 
 * 
 * 		----> ciao rossi
 * 
 * 
 * @author mr
 *
 */

public class StampaCaselle {

	public static void main(String[] args) {
		String[] insiemeStrings = { "ciao" , "miao"  , "gatto"};
		
		int i = 0;
		
		
		while(i < insiemeStrings.length) {
			
			if(i % 2  == 0)
				System.out.println(insiemeStrings[i]);
			
			i++;
		}
		
		System.out.println("############");
		
		//versione pro
		
		i = 0 ;
		
		//0 2 4 . . . . .. ..
		
		while(i < insiemeStrings.length) {
			System.out.println(insiemeStrings[i]);
			i+=2; // i = i + 2 ==> i = 0 +2
		}
		
	
		
		
		
		
	}
	
}
