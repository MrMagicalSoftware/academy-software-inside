
public class SommaElementiMatrix {

	public static void main(String[] args) {
	
		
		int[][] matrix = { {8 , 3 } , { 5 , 2}};
		
		//crare un codice che faccia la somma
		// degli elemtni della matrice che sono pari
		
		//il programma mi restituisce 10 
		
		
		int somma = 0 ;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				
				if(matrix[i] [j] % 2 == 0)
					somma += matrix[i][j];
			}
		}
		
		System.out.println("somma dei pari vale " + somma );

	}

}
