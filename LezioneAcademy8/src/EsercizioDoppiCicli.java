
public class EsercizioDoppiCicli {

	public static void main(String[] args) {
		
		
		int[] vett = { 12 , 6 , 7 , 8 , 7 };
		
		boolean found = false;
		
		for (int i = 0; i < vett.length; i++) {
			
			for (int j = i+1; j < vett.length; j++) {
				if(vett[i] == vett[j]) {
					found = true;
					break;
				}
					
			}
			
			if(found)
				break;
			
		}
		
		if(found)
			System.out.println("ok");
		else
			System.out.println("no");

		
		
		

	}

	
	
	
}
