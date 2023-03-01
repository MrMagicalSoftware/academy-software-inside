package it.sofwareInside.cicliInnestati;

public class DoppiCicli {

	
	public static void main(String[] args) {
		
		for(int i = 2 ; i <=5  ; i++) {
		
			
			System.out.println("Tabellina del " + i );
		
			for(int j = 0 ; j <= 10  ; j++ )
				System.out.println( i * j );
			
		
			System.out.println();
		}
		
		
		System.out.println("fine");
		
	}
	
	
}
