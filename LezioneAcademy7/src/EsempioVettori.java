
public class EsempioVettori {

	
	public static void main(String[] args) {
		
		//int temp1, temp2 , temp3 ;
		
		//per creare un vettore ho bisogno 
		
		// di usare questa sintassi :
		
		
		/**
		 * 
		 * 	tipoVettore [] nomeVettore = new tipoVettore [ DIMENSIONE_VETTORE ] ;
		 * 
		 * 
		 */
		
		
		int[] vettNumeri = new int[3];
		
		vettNumeri[0] = 10;  // per riempire/usare un elemento del vettore vettNumeri[POSIZIONE] ;
		
		
		vettNumeri[2] = 60;
		
		System.out.println(vettNumeri[0]);
		System.out.println(vettNumeri[1]);
		System.out.println(vettNumeri[2]);
		
		System.out.println("################################");
		
		
		int i = 0;
		
		while(i < vettNumeri.length) {
			System.out.print(vettNumeri[i] + " ");
			
			i++;
		}
		
		
		

	}
	
	
}
