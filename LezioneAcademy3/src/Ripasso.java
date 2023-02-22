import java.util.Random;
import java.util.Scanner;

/**
 * 
 * 
 * 
 * 
 * 		PRIMIVITI
 * 				INT   ( byte short int long ) 
 * 				VIRGOLA
 * 				CHAR
 * 				BOOL
 * 
 * 
 *      NON PRIMITIVI === OBJECT 
 * 			String Scanner Random
 * 			. . . ... . . . . . . .. . .
 * 
 * 
 * @author mr
 *
 */
public class Ripasso {

	public static void main(String[] args) {
	
		
		
		// CASTING
		int myNum = 10 ;
		
		long myLong = myNum;
		

		// byte short int long
		
		byte myByte = (byte) myNum;
		
		System.out.println(myByte);
		
		
		// CASTING
		
		double mySaldo = 9.00;
		
		int example = (int) mySaldo;
		
		//tipoDato nomeVariabile = (tipoDato) nomeAltraV
		
		System.out.println("saldo " + example);
		
		
		Random generatoreRandom = new Random();
		
		//NomeClasse nomeVariable = new NomeClasse();
		
		Scanner key = new Scanner(System.in);
		
		
	}

}
