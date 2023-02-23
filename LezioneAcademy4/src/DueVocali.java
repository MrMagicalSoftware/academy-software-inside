import java.util.Scanner;

/**
 * 
 * Scrivere un programma che prende con la tastiera una
 * stringa e stampa "si" se la stringa contiene almeno 2 vocali
 * 
 * altrimenti stampa no.
 * 
 * 
 * Se possibile ottimizzare l'algoritmo
 * 
 * 
 * 			Es   casale --> si
 * 
 *                pin ----> no
 *                
 *                
 *                alabarda ----> si 
 * 
 * 
 * 
 * 
 * @author mr
 *
 */




public class DueVocali {

	
	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci una parola");
		String parola = key.next();
		
		
		int contatore = 0;
		
		int i = 0 ;
		
		while(i < parola.length() ) {
			
			
			char carattereCorrente = parola.charAt(i);
			
			if(carattereCorrente == 'a' || carattereCorrente == 'e' ||
					carattereCorrente == 'o' || carattereCorrente == 'u' || carattereCorrente == 'i' )
				contatore++;
			
			
			if(contatore >=2)
				break;
			
			i++;
		}
		
		
		
		if(contatore >= 2)
			System.out.println("ok");
		else
			System.out.println("no");
		
		
		
		key.close();
	}
	
}
