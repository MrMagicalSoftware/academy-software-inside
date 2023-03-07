import java.util.Random;
import java.util.Scanner;





public class StarterPhone {

	
	public static void main(String[] args) {
	
		
		Random random = new Random();
		
		
		Scanner key = new Scanner(System.in);
		int dimensione = 0 ;
		
		do {
			
			System.out.println("inserisci quanti telefoni creare ");
			dimensione = key.nextInt();
			
		} while (dimensione <= 0 );
		
		
	
		Phone[] phones = new Phone[dimensione];
		
		
		
		// per ogni telefono presente nel vettore dei telefoni
		for(Phone phone : phones) {
			System.out.println(phone);
		}
		
		
		System.out.println("#####################");

		for (int i = 0; i < phones.length; i++) {
			
			Phone phone = new Phone();
			phone.setCosto(random.nextDouble(100, 600));

			phone.setDualSim(random.nextBoolean());
			
			phones[i] = phone;
			
		}
		
		
		
		System.out.println("######################");
		
		
		
		for(Phone phone : phones) 
			System.out.println(phone);
		
		
		
		
		System.out.println("Cerco e stampo il Telefono con costo minimo");
		
		
		Phone phoneMin  = phones[0];
		
		
		for (int i = 1; i < phones.length; i++) {
			
			
			if(phones[i].getCosto() < phoneMin.getCosto()) {
				phoneMin = phones[i];
			}
			
		}
		
		
		System.out.println("Telefono min ====");
		System.out.println(phoneMin);
		
		
		
		
		
	
		
		
		key.close();
	}
	
	
}


/*      utilizzo del Foreach
 * 
 * 		
		//Esempio di For each
		
//		int[] myVettNum = { 10 , 20 , 30 };
//		
//		for(int numero : myVettNum)
//			System.out.println(numero);
//		
//		
//		
//		boolean[] myVettBool = {true , false , true, false};
//		
//		for(boolean bool : myVettBool)
//			System.out.println(bool);
//		
//		
//		
//		System.out.println("");
//		
//		String[] myVettStiStrings = {"ciao" , "miao" , "gatto" , "felice" , "morde"};
//		
//		
//		for(String elemento : myVettStiStrings) {
//			
//			if(elemento.length() > 4)
//				System.out.println(elemento);
//		}
//			
		
		
		
//		for(int i = 0 ; i < myVettNum.length ; i++)
//			System.out.println(myVettNum[i]);
 * 
 * 
 * 
 * 
 * 
 * 
 */







