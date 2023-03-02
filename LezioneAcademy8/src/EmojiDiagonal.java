import java.util.Scanner;

public class EmojiDiagonal {

	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner key = new Scanner(System.in);
		
		
		int lato ;
		
		do {
			System.out.println("inserisci il lato");
			lato = key.nextInt();
		} while (lato <= 0);
		
		
		
		for (int i = 0; i < lato; i++) {
			for (int j = 0; j < lato; j++) {
				
				Thread.sleep(1000);
				
				if(i == j)
					System.out.print("😄\t");
				else if(i > j)
					System.out.print("😡\t");
				else	
					System.out.print("🥲\t");

			}
			// 🥲 😡
			System.out.println();
		}
		
		

		
		
		
		
		key.close();
	}

}
