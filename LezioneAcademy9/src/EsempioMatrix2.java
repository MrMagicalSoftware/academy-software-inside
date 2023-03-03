import java.util.Random;
import java.util.Scanner;

/***
 * 
 * 	chiedere un programma che prenda in input 2 interi
 * 
 *  verificando che tutti e due gli interi siano > 0
 *  
 *  altrimenti richiedere tutti e due i numeri
 *  
 *   		10 -1
 *          "devi inserire 2 numeri > 0 "
 *          
 *          -7  8 
 *          "devi inserire 2 numeri > 0 "
 * 
 * 			2  3
 * 
 * 
 *  il programma crea una matrice di stringhe di 2 righe e 3 colonne
 *  
 *  // riempire la matrice di stringhe in modo randomico
 *  // scegliente 3 differenti emojii
 *  
 *  	
 *  	😘  🥹   😟  simboli       x  y z 
 *       
 *     
 *     😘  🥹   😟
 *     🥹  🥹   😘
 *  
 *    Vi serve la classe random
 *  
 * 
 * 
 * 
 * @author mr
 *
 */


public class EsempioMatrix2 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner key = new Scanner(System.in);
		Random random = new Random();
		int row , col ; 
		
		do {
			
			System.out.println("Inserisci row and col");
			row = key.nextInt();
			col = key.nextInt();
		} while (row <= 0  || col <= 0 );
		
		
		System.out.println("###############");
		
		
		
		String[][] matrixStrings = new String[row][col];
		
		
		
		for (int i = 0; i < matrixStrings.length; i++) {
			
			for (int j = 0; j < matrixStrings[i].length; j++) {
				
				int sceltaEmoj = random.nextInt(1, 11); // significa che puo' uscire 1 , 2 , 3 , 4,   . . .. . 10 
				
				if(sceltaEmoj == 1) 
					matrixStrings[i][j] = "😘"; // 10 %
				else if(sceltaEmoj >= 2 && sceltaEmoj <= 4)  // se esce 2 oppure 3 , 4  30 % 
					matrixStrings[i][j] = "🥹"; 
				else if(sceltaEmoj >= 5 && sceltaEmoj <= 7 )  // 5 6 7 
					matrixStrings[i][j] = "😟"; // 30 % 
				else
					matrixStrings[i][j] = "😈"; // 30 %   //  8 , 9 10 
				
				Thread.sleep(1000);
				
				System.out.print(matrixStrings[i][j] + "\t");
			}
			System.out.println(); // porta il cursore sotto
		}
		
		
		
		
		
		
		
		key.close();
	}
	
}
