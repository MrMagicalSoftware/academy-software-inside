import java.util.Scanner;

public class UomoPrimitivo2 {

	public static void main(String[] args) {
		
		
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("inser");
		
		String parString = key.next();
		
		
		int i = 0 ;
		
		boolean sonoTutteVocali = true;
		
		
		//   uuuuuuuuu
		//   sonotutteVocali = true;
		
		while(i < parString.length()) {
			
			
			 char carattereCorrente = parString.charAt(i);
			 
			 //  u != u && u != e
			 //   F && T ------------> F
			 
			 //  z != u &&  z != e  .. . . . t && t  .. . .. ..
			 
			 if(  carattereCorrente != 'u' && carattereCorrente != 'e' && carattereCorrente !='i' &&
					 carattereCorrente != 'o'  && carattereCorrente != 'a') {
				 
				 sonoTutteVocali = false;
				 break;
			 }
			
			 System.out.println("OK STO CICLANDO");
			
			
			i++;
		}
		
		
		
		
		if(sonoTutteVocali )
			System.out.println("tu essere uomo primitivo");
		else
			System.out.println("ok tu essere uomo che conosce lettera!");

		
		
		key.close();
		
	}

}
