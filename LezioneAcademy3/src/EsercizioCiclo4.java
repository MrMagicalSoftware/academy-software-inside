
/**
 *  	10 9 8 7 6 5 4 3 2 1 ...
 *  	quando arriva zero scrive "buon anno"
 *  
 *      10 9 8 7 6 5 4 3 2 1 buon anno
 * 
 * 
 * @author mr
 *
 */


public class EsercizioCiclo4 {

	public static void main(String[] args) {
		
		
		int index = 10;
		
		
		while(index >= 0) {
			
			
			if(index > 0)
				System.out.print(index + " ");
			else
				System.out.print("buon anno");


			index--;
		}
		

		
	}

}
