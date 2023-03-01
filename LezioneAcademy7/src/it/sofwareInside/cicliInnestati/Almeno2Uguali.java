package it.sofwareInside.cicliInnestati;

public class Almeno2Uguali {

	public static void main(String[] args) {
		
		int[] vett = { 10 , 1 , 3 , 1 , 18 };
		
		boolean found = false;
		
		
		for (int i = 0; i < vett.length; i++) {
			
			System.out.println("Sto considerando " + vett[i]);
			
			for (int j = i + 1; j < vett.length; j++) {
				
				System.out.println("CONFRONTO TRA  "+vett[i] + " " + vett[j]);
				
				if(vett[i] == vett[j]) {
					found = true;
					break;
				}
						
			}
			
			if(found)
				break;
			
			System.out.println();
			
		}
		
		
		
		if(found)
			System.out.println("ok");
		else
			System.out.println("no");

		
	}
	
}
