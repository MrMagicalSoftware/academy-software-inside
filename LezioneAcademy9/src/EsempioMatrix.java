import java.util.Iterator;

public class EsempioMatrix {

	public static void main(String[] args) {
		
		int[][] matrix2 =  {{5 , 2, 1} ,{1,10,3 } ,
		          {2 , 4 , 2 }};
		
		//fare il prodotto della diagonale principale
		// e fare il prodotto della diagonale inferiore
		
		
		
		int prodotto = 1 , prodottoDiagonaleInf = 1;
		int contScala = 1;
		
		for(int i = 0 ; i < matrix2.length ; i++) {
			
			
			for (int j = 0; j < matrix2[i].length; j++) {
				
				if(i== j) {
					//diagonale principale
					prodotto *= matrix2[i][j];
				}
				
				// 0 == 3 -1 
				// 1 == 2
				// 2 == 2 ok
				if(j  == matrix2[i].length  - contScala) {
					System.out.println(" ok ----> " + matrix2[i][j]);
					prodottoDiagonaleInf *= matrix2[i][j];
				}
				
			}
			
			contScala++;
			
		}
		
		
		System.out.println("Diagonale princiaple " + prodotto);
		System.out.println("Diagonale inf " + prodottoDiagonaleInf);

		
		
		
		
		

	}
	
	
	
	
	
	

}
