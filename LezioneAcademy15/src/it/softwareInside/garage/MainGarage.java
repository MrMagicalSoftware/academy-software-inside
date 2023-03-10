package it.softwareInside.garage;

import it.softwareInside.veicoli.Automobile;
import it.softwareInside.veicoli.Furgone;
import it.softwareInside.veicoli.VeicoloAMotore;

public class MainGarage {

	public static void main(String[] args) {
		
		
		Garage garage = new Garage();
		
		
		garage.stampaSituazionePosti();
		
	
		garage.addVeicolo(new Automobile());
		garage.addVeicolo(new Automobile());
		garage.addVeicolo(new Automobile());
		garage.addVeicolo(new Furgone());

		System.out.println("################");
		garage.stampaSituazionePosti();
		System.out.println("################");

		VeicoloAMotore v1 =  garage.removeVeicolo(0);
		System.out.println("Esce  ----> " + v1);

		System.out.println(		garage.removeVeicolo(1));
		System.out.println("\n\n\n");
		garage.stampaSituazionePosti();


	}

}
