package it.softwareInside.team;

import java.util.Random;
import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		
		Random random = new Random(); 
		Team team = new Team();
		Scanner key = new Scanner(System.in);
		String inputUtente;
		
		do {
			System.out.println("Cosa vuoi fare ?");
			System.out.println("Premi i per inserire");
			System.out.println("Premi r per inserire");
			System.out.println("Premi s per inserire");
			System.out.println("Premi setting per inserire");

			System.out.println("Premi f per inserire");

			System.out.println("Premi q per uscire");

			inputUtente = key.nextLine();
			
			switch (inputUtente) {
			case "i":
				
				System.out.println("inserisci il nome");
				
				if(   team.addPlayer( new Player(key.nextLine(), "difensore", random.nextInt(18, 41)  )    )   )
					System.out.println("ok aggiunto");
				else
					System.out.println("team pieno");

				break;
			case "r":
				
				System.out.println("Inserisci la posizione da rimuovere");
				int pos = key.nextInt()  ;
				System.out.println("Hai rimosso " + team.removePlayer( pos )   );
				break;
			
			case "s":
				System.out.println(team);
				//team.stampaTeamConAllenatore();
				break;
				
			case "setting":
				System.out.println("****** OK SETTING *********");
				Player[] myPlayers = {  new Player("gigino", "portiere", 33)  ,
						new Player("paolino" , "difensore" , 22)  };
				
				team.setPlayers(myPlayers);
				
				break;
				
			case "f":
				
				int i = 0 ;
				
				while(i < 11 ) {
					
					team.addPlayer(new Player());
					
					i++;
				}
					
				break;
				
			default:
				break;
			}
			
			
			
		} while (! inputUtente.equals("q"));
		
		
		
		
		
		key.close();
	}

}
