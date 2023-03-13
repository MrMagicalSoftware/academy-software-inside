import java.util.ArrayList;
import java.util.Scanner;

public class RipassoArrayList {

	
	public static void main(String[] args) {
		
		
		// ARRAYLIST 
		//STRUTTURA DINAMICA IN GRADO DI MODIFICARE
		//LA DIMENSIONE A RUN-TIME.
		
		Scanner key = new Scanner(System.in);
		ArrayList<Integer> myArr = new ArrayList<>();
		
		myArr.add(10);
		myArr.add(20);
		myArr.add(30);

	
		System.out.println("***********************");
		
		System.out.println(myArr.get(0));
		
		
		System.out.println("***********************");

		
		
		
		

		
		try {
			
			System.out.println("Inserisci un numero  compreso");
			System.out.println("tra 0 e " +  (myArr.size() - 1));
			
		
			myArr.get(  key.nextInt() );
			
			
		} catch (Exception e) {
			
			System.out.println("*******+");
			System.out.println(e);
			System.out.println("*********");
			
			main(args);
		}
		
		
		
		System.out.println("####### STMAPA VETTORE ############");
	
		
		
		for(int elemento : myArr)
			System.out.println(elemento);
		
		
		
		System.out.println("fine del programma");
		
		
	}
	
	
	
}
