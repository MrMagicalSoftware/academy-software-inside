import java.util.Random;
import java.util.Scanner;

/**
 * 
 * 
 * 
 * dati in input 2 numeri row e col
 * 
 * costruire una matrice di row * col
 * 
 * verificando che row che col > 0 
 * 
 * 
 * matrice di valori boolean , che mi rappresenta i posti liberi/occupati di un cinema
 * 
 * con la classe random riempire tutta matrice con valori casuali 
 * 
 * 
 * 
 * nextBoolean() ---> true oppure false
 * 
 * 
 * chiede all'utente di inserire una posizione
 * dove vuole sedersi , per la posizione di serviranno due numeri 
 * 
 * 
 * se il posto è libero il programma vi assegna il posto, andando ad occupare
 * il valore che passa da true a false,
 * 
 * 
 * se il posto è occupato  , il programma richiede 2 nuove coordinate..
 * 
 * 
 * 
 * 
 * @author mr
 *
 */



public class EsempioMatrix3 {

	public static void main(String[] args) {
	

		Scanner key = new Scanner(System.in);
		Random random = new Random();
		
		int row , col ;
		
		do {
			System.out.println("ROW AND COL");
			row = key.nextInt();
			col = key.nextInt();
		} while (row <=0 || col <= 0 );
		
		
		boolean[][] cinema = new boolean[row][col];
		
		
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				cinema[i][j] = random.nextBoolean();
				System.out.print(cinema[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		int postoRow , postoCol;
		
		do {
			System.out.println("Dove vuoi sederti ??");
			postoRow = key.nextInt();
			postoCol = key.nextInt();
			
			
			if(postoRow < row && postoCol < col) {
				//significa che la posizione esiste
				
				if(cinema[postoRow][postoCol] == true) {
					System.out.println("ok stampo il biglietto");
					 // occupo il posto
				}
				else
					System.out.println("mi dispice posto occupato");
			}
			
			
		} while ( postoRow >= row ||  postoCol >= col || !cinema[postoRow][postoCol] );
			
													//   !  cinema[0][1]  = ! false
		
		cinema[postoRow][postoCol] = false;
		System.out.println("Posto in posizone .. . . . . " + postoRow + " " + postoCol);
		
		
		
		key.close();
	}

}
