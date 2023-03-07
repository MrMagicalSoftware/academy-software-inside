package it.softwareInside.relazione1Molti;

public class StarterScaffale {

	
	public static void main(String[] args) {
		
		Scaffale scaffale = new Scaffale(5);
		
		scaffale.stampaScaffale();
		
		System.out.println();
		
//		System.out.println(   scaffale.addBevanda(null)  ?  "ok aggiunta" : "no"  );
		System.out.println(   scaffale.addBevanda(new Bevanda())  ?  "ok aggiunta" : "no"  );
		System.out.println(   scaffale.addBevanda(new Bevanda("peps"))  ?  "ok aggiunta" : "no"  );
		System.out.println(   scaffale.addBevanda(new Bevanda("limonata"))  ?  "ok aggiunta" : "no"  );

		
		
		scaffale.stampaScaffale();
		
		System.out.println("STO EROGANDO  . . . .. . . .. " + scaffale.removeBevanda(1)  );

		System.out.println("\n\n");
		
		scaffale.stampaScaffale();
		
		
		/*
		int i = 0 ;
		
		do {
			
			System.out.println(   scaffale.addBevanda(new Bevanda())  ?  "ok aggiunta" : "no"  );

			i++;
		} while (i < 40);

		
		System.out.println("######################à");
		
		
		scaffale.stampaScaffale();
		*/
		
		
		
		
	}
	
}
