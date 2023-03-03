package it.softwareInside.object;

public class StarterFunzione {

	public static void main(String[] args) {
		
		
		
		EserciziFunzione obj = new EserciziFunzione();
		
		
		
//		int ris = obj.somma(3, 5);	
//		System.out.println(ris);
//		System.out.println(   obj.somma(3, 5)  );

		
		
		int numeroUtente = 10;
		
		boolean risultato = obj.isEven(numeroUtente);
		
		System.out.println("----------->  " + risultato);
		
		
		
		
		
		int[] vettDiNumeri = { 10 , 2  , 5 };
		
		
		
		
		int[] ris =  obj.moltiplicaVett(vettDiNumeri);
		
		
		
		for(int i = 0 ; i < ris.length ; i++) {
			System.out.print(ris[i] + " ");
		}
		
		
		System.out.println("#########");
		
		
		obj.stampaVettore(vettDiNumeri);
		System.out.println();
		
		obj.stampaVettore(ris);
		

	}

}
