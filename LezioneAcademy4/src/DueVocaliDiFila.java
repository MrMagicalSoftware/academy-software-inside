import java.util.Scanner;

/**
 * 
 * 		prendere con scannar una stringa
 * 		e dire se la stringa contiene 2 vocali di fila ..
 * 
 * 
 * 		aajdajsdjsajd ---> si   (aa 
 * 
 * 
 * 
 * 		casa ----->  no 
 * 
 * 
 * @author mr
 *
 */



public class DueVocaliDiFila {

	public static void main(String[] args) {
	
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("INSERT");
		String parolaUtente = key.next();
		
		int i = 0;
		boolean isConsecutiveOk = false;
		
		
		while(i < parolaUtente.length() -1) {
			
			char carattereCorrente = parolaUtente.charAt(i);
			char carattereSuccessivo = parolaUtente.charAt(i + 1);

			
			if( carattereCorrente == 'a' || 
			    carattereCorrente == 'e' ||
			    carattereCorrente == 'i' ||
			    carattereCorrente == 'o' || 
			    carattereCorrente == 'u' ) {
				
				if(carattereSuccessivo == 'a' || 
				   carattereSuccessivo == 'e' || 
				   carattereSuccessivo == 'i' ||
				   carattereSuccessivo == 'o' ||
				   carattereSuccessivo == 'u') {
					
					isConsecutiveOk = true;
					break;
				}
				
			}
			
			
			i++;
		}
		
		
		
		if(isConsecutiveOk)
			System.out.println("Esistono 2 vocali consecutive");
		else
			System.out.println("No non esistono");


		key.close();
	}

}
