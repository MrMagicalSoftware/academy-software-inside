import java.util.Random;

public class MatrixExample {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[][] matrix = new int[2][2];
		
		
		for (int i = 0; i < matrix.length; i++) 
			for (int j = 0; j < matrix[i].length; j++) 
				matrix[i][j] = random.nextInt(1, 11);
		
		System.out.println("###########");
		
		
		
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) 
				System.out.print(matrix[i][j] + " ");
		
			System.out.println();
		}
			
		
			
		
		
		
	}
	
}
