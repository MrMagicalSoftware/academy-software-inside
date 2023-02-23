import java.util.Scanner;

/**
 * 
 * 	data una stringa inserita in input
 *  dire se la stringa contiene tutte vocali
 *  
 *  
 *  Es : uaaaaaaauauauau   --> "tu essere uomo primitivo"
 *  
 *       uuaaaaauuac --> "ok tu essere uomo che conosce lettera!"
 * 
 * 
 * @author mr
 *
 */



public class UomoPrimitivo {

	public static void main(String[] args) {
	
		
		Scanner key = new Scanner(System.in);
		

		System.out.println("scrivimi una parola");
	
		String parola  = key.next();
		
		int i  = 0;
		int contVocali = 0;
		
		
		//uuauuaauuauauuauau
		
		while(i < parola.length()) {
		
			char carattereCorrente = parola.charAt(i);
			
			if(carattereCorrente == 'a' || carattereCorrente == 'i' ||
					carattereCorrente == 'o' || carattereCorrente == 'u' 
					|| carattereCorrente == 'e') {
				
				contVocali++;
			}
			
			i++;
		}
		
		if(contVocali == parola.length())
			System.out.println("tu essere uomo primitivo");
		else
			System.out.println("ok tu essere uomo che conosce lettera!");
		
		
		
		
		
		
		
		
		key.close();
	}
	
	
	
}

