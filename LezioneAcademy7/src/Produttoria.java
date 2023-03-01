
/**
 * 
 * 	dato un vettoria già init
 * 
 * 
 * stampare a video la produtttoria del vett
 * 
 *    [  3, 2 , 6 ] 
 *    
 *     ======> 36 
 * 
 * 
 * @author mr
 *
 */


public class Produttoria {

	public static void main(String[] args) {

		int[] vett  = { 3 ,2 , 6 };
		
		int i = 0 ;
		int prodotto = 1;
		
		while(i < vett.length) {
			prodotto *= vett[i];
			
			i++;
		}
		
		System.out.println("prodotto ==> " +  prodotto );
		
		
	}

}
