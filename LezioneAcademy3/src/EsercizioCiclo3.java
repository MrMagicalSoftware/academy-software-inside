/**
 * 
 * stampare tutti i numeri pari da 2 fino a 30
 * 
 * 
 * 
 * @author mr
 *
 */


public class EsercizioCiclo3 {

	public static void main(String[] args) {
		
		
		//operatori di pre-incremento vs operatori post incremento
		
		/*
		 *  i = 2
		 *  
		 *  
		 * 
		 *  while( i <= 30 ){
		 *  
		 *  	print(i++) // 2 
		 *  	i++;
		 * }
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		int i = 2 ;
		
		// 2 ---30 
		while(i <= 30) {
			
			if(i % 2 == 0 )
				System.out.println(i);
			
			i++;
		}
		
		System.out.println("######## SOLUZIONE 2 ########");
		
		
		int j = 2;
		
		while(j <= 30) {
			System.out.println(j);
			j+=2;  // j = j + 2
		}
		
		
	}
	
	
	
	
	
}
