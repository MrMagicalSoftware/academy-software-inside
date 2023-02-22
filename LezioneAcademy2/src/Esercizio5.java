import java.util.Scanner;

/**
 * 
 * 
 * 
 * 
 * Creare un programma che prenda in ingresso un numero  intero eta,
 * 
 * e una stringa che rappresenta il nome 
 * e stampi a video se una persona puo' prendere la patente di guida
 * 
 * 
 * 
 * Es gianni 18 ----> ok gianni puoi prendere la patente
 * 
 * 	   michele 15 ---> no michele non puoi prendere la patente 
 * 
 * 
 * @author mr
 *
 */


public class Esercizio5 {

	
	public static void main(String[] args) {
		
		int eta;
		String nome;
		
		Scanner key = new Scanner(System.in);
		
		
		
		System.out.println("inserire nome ed eta");
		
		nome =  key.next();
		eta = key.nextInt();
		
		
		if(eta >= 18)
			System.out.println("ok "+ nome + " puoi prendere la patente " );
		else {
			int anniMancanti = 18 - eta;
			System.out.println( nome + " non puoi prendere la patente "  + "ti mancano " + anniMancanti);
		}
		
		
		
		key.close();
		
	}
	
	
}
