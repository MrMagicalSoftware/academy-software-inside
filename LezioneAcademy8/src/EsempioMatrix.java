
public class EsempioMatrix {

	
	public static void main(String[] args) {
	
		
		// righe 0 -1
		// colonne0- 3
//		int[][] matrix = new int[2][4];
//		
//		matrix[0][0] = 10;
//		matrix[0][1] = 20;
//		matrix[1][0] = 30;
//		matrix[1][1] = 50;
				
		
		
//		System.out.println(matrix.length);
//		System.out.println(matrix[0].length);

		int[] vett = { 1 , 4 , 5 };
		
		
		int[][] matrixWithDifferentSize =  { {1 , 2 ,3 } , 
				                               {4,5} , 
				                               {99} 
				                           };
		
		
		
		System.out.println(matrixWithDifferentSize[0].length);
		System.out.println(matrixWithDifferentSize[1].length);
		System.out.println(matrixWithDifferentSize[2].length);
		
		System.out.println("################## \n\n");

		
//		matrixWithDifferentSize[0][0];
//		matrixWithDifferentSize[0][1];
//		matrixWithDifferentSize[0][2];
	
		
//		matrixWithDifferentSize[1][0];
//		matrixWithDifferentSize[1][1];
		
		
//		matrixWithDifferentSize[2][0];
		
		/*
		 * per tutti gli elementi dello "zaino"
		 * so quanti elementi contiene lo zaino
		 * perchè uso matrixWithDifferentSize.length
		 * 
		 */
		
		System.out.println("QUANTA ROBA CONTIENE IL MIO ZAINO  " +
		matrixWithDifferentSize.length);
		
		for(int i = 0 ; i < matrixWithDifferentSize.length ; i++) {
			
			//considera la struttura corrente
			for(int j = 0 ; j < matrixWithDifferentSize[i].length ; j++ )
				System.out.print(matrixWithDifferentSize[i][j] + " ");
			
			
			System.out.println();
		}
		
		
		
		int[][][] space = {
				
				{  {1 ,3 , 4} , { 7 , 5 , 8 } , { 7 , 5 , 8 } }, 
				
				{  {1 , 4 , 3} , { 77 , 88} , {100} }
				
		};
		
		System.out.println("");
		
		for(int i = 0 ; i < space.length ; i ++) {
			
			for(int j = 0 ; j < space[i].length ; j++) {
				
				for(int z = 0 ; z < space[i][j].length  ; z++) {
					
					space[i][j][z] *=2; 
					System.out.print(space[i][j][z] + " ");
					
				}
				
				
				System.out.println();
			}
				
			System.out.println("@@@@@@@@@@@@@@@");
		}
		
		
		
		
		
		
		
		
	}
	
	
}
