import java.util.Scanner;

public class CheckTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero ");
		 
		int num = sc.nextInt();
 
		System.out.print("Parola ");
 
		String testo = sc.next();
 
 
		if (num >= 0 && num < testo.length()) {
 
			int cont = num;
 
			while (cont < testo.length()) {
				System.out.print(testo.charAt(cont));
				cont++;
			}
		} else {
			System.out.println("rip");
		}
		
		
		

	}

}
