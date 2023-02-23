import java.util.Scanner;

/***
 * 
 * 
 *  Scrivere un programma che prenda in ingresso
 *  una parola e un char
 *  
 *  
 *  il programma stampa a video se esiste il carattere
 *  
 *  all'interno della parola
 *  
 *  
 *  Es  :  gattino  y ----> no
 *  
 *         gattino  t -----> yes
 * 
 * 
 * @author mr
 *
 */


public class RicercaDiUnaLettera {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
	
		System.out.println("inserisci una parola");
		String parolaUtente = key.next();
		
		
		System.out.println("inserisci una lettera da cercare");
		char letteraDaCercare = key.next().charAt(0);
		
		boolean parolaTrovata = false;
		
		//boolean nonAncoraTrovato = true;
		
		
		
		int i = 0;
		
		while(i < parolaUtente.length()) {
			
			if(parolaUtente.charAt(i) == letteraDaCercare) {
				parolaTrovata = true;
				//nonAncoraTrovato  = false;
				break;
			}
			
			System.out.println("cerco .. ...");
			
			i++;
		}
		
		
		
		
//		if( ! nonAncoraTrovato)
//			System.out.println("ok ho trovato");
//		else
//			System.out.println("non trovato");

		
		
		
		
		if(parolaTrovata) {
			System.out.println("ok ho trovato la lettera " + letteraDaCercare
					+ " all'interno della parola " + parolaUtente) ;
		}
		else {
			System.out.println("mi dispiace la lettera non è presente ......");
		}
		
		
		
		key.close();
	}
	
	
	
}
