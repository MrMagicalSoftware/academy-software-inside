import java.util.Scanner;

public class RipassoLezione {

	public static void main(String[] args) {
		
		
		/**
		 * 
		 * 		DATI PRIMITIVI
		 * 		- interi ( byte short int long )
		 *      - virgola mobile ( float double )
		 *      - boolean ( true or false )
		 *      - char   	
		 * 
		 * 
		 * 		DATI NON PRIMITIVI
		 * 		-String ciaojdsajdja90@!jjdsa
		 * 		-Scanner
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		String myString = "ciao a tutti ";
		String name = "Rob";
		System.out.println(myString + name);
	
		
		System.out.println("#####################");
		
		
		char myChar1 ='r';
		char myChar2 = 'o';
		char myChar3 = 'b';
		char myChar4 = 'y';

		
		System.out.print(myChar1);
		System.out.print(myChar2);
		System.out.print(myChar3);
		System.out.print(myChar4);

		System.out.println();

		/**
		 * 	  a    0
		 * 	  b    1
		 *    c    2
		 *    d    3 
		 *   . . . .. . . .
		 *   
		 * 
		 */
		
		System.out.println("\n");
		
		System.out.println(myChar1 + "" + myChar2 + "" + myChar3 + "" + myChar4 );
		
		
		Scanner tastiera = new Scanner(System.in);
		
		
		
		String welcomeMesage = "W";
		
		

		System.out.println(welcomeMesage.length());
		
		
	}

}
