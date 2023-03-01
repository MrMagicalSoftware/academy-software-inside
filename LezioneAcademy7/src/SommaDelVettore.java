
public class SommaDelVettore {

	
	
	public static void main(String[] args) {
		
		int[] vett  = { 10 , 40 , 60 , 100 };
		
		int somma = 0;
		
		
		int i = 0 ;
		
		while(i < vett.length) {
			
			somma += vett[i] ; // somma = somma + vett[i];
			
			i++;
		}
		
		System.out.println("la somma vale " + somma);
		
		
	}
	
	
	
}
