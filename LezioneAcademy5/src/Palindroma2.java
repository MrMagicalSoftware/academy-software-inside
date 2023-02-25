import java.util.Scanner;

public class Palindroma2 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		
		String parola  = key.next();
		
		boolean isPalindroma = true;
		
		int i = 0 , j = parola.length() -1 ;
		
		
		
		while(i < parola.length() / 2 ) {
			
			System.out.println("Confronto  tra " + parola.charAt(i) 
			+ " " + parola.charAt(j));
			
			if(parola.charAt(i) != parola.charAt(j)) {
				
				System.out.println("ok sono qui ....");
				isPalindroma = false;
				break;
			}	
			i++;
			j--;
		}
		
		
		
		if(isPalindroma)
			System.out.println("ok");
		else
			System.out.println("no");

		
		
		key.close();
	}
	

}
