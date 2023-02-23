import java.util.Scanner;

/**** 
 * 
 * 		data una stringa da tastiera
 * 
 * 		se la stringa contiene piu'>= 1 carattere
 * 
 * 		voglio sapere se la stringa ha la prima lettera
 *     
 *      che è uguale all'ultima..
 *      
 *      
 *      
 *      Es ::       c#############c  ---> ok
 *      
 *      		    alla ---> ok
 *      
 *                  cione ---> no
 *      
 * 
 * 
 * @author mr
 *
 */



public class EsercizioString {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		
		String parolaUtente  = key.next();
		
		
		String risposta = parolaUtente.charAt(0) == parolaUtente.charAt(parolaUtente.length() -1) ? "ok" : "no";
			
		System.out.println(risposta);
		
		
		
		char carattere1 = parolaUtente.charAt(0);
		char carattere2 = parolaUtente.charAt(parolaUtente.length() -1);

		if(carattere1 == carattere2)
			System.out.println("ok");
		else
			System.out.println("no");


		
		key.close();
	}

}
