import java.util.Scanner;

public class DoWhileChiediVocali {

	public static void main(String[] args) {
		
		
//		Scanner key = new Scanner(System.in);
//		System.out.println("inserisci");
//		char myCharInput = key.next().charAt(0);
//		
//		while(myCharInput == 'a' || 
//				myCharInput == 'e' || 
//				myCharInput == 'i' ||
//				myCharInput == 'o' ||
//				myCharInput == 'u' ) {
//			
//			System.out.println("inserisci");
//			myCharInput = key.next().charAt(0);
//		}
//		
//		key.close();
		
		
		// nel do ci finisco almeno 1 volta...
		// 1 volta e' sicuro ..
		// continuo a rimanere nel se la condizione
		//booleana risulta essere vera.
		
		Scanner key = new Scanner(System.in);
		char myCharInput;
		
		
		do {
			System.out.println("inserisci");
			myCharInput =   key.next().charAt(0);
			
//			if(myCharInput == 'a')
//				System.out.println("ok");
		
			
		} while (myCharInput == 'a' ||
				myCharInput == 'e' ||
				myCharInput == 'i' ||
				myCharInput == 'o' ||
				myCharInput == 'u' );
		
		
		
		System.out.println("fine");
		
		key.close();
	}

}
