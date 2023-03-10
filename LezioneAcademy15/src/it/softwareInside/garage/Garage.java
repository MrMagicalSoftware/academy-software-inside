package it.softwareInside.garage;

import it.softwareInside.veicoli.*;


public class Garage {
	
	private final int QUANTITA_VEICOLO = 10;
	
	
	private VeicoloAMotore[] veicoli;
	
	

	public Garage() {
		this.veicoli = new VeicoloAMotore[QUANTITA_VEICOLO];
	}
	
	
	/**
	 * 
	 * 
	 * se esiste un posto libero si trova tra 0 e  ( n -1 ) 
	 * 
	 * se non trovo posto torno -1 
	 * 
	 * @param veicoloAMotore
	 * @return
	 */
	public int addVeicolo(VeicoloAMotore veicoloAMotore) {
		
		
		if(veicoloAMotore == null)
			return -1;
		
		for (int i = 0; i < veicoli.length; i++) {
			
			if(veicoli[i] == null) {
				
				veicoli[i] = veicoloAMotore;
				return i;
			}
		
		}
		
		return -1 ;
	}
	
	
	
	public VeicoloAMotore removeVeicolo(int pos) {
		
	
		if(pos < 0 || pos >= this.QUANTITA_VEICOLO)
			return null;
			
		VeicoloAMotore veicoloAMotoreTmp = this.veicoli[pos];
		this.veicoli[pos] = null;
		
		return veicoloAMotoreTmp;
	}
	
	
	
	
	public void stampaSituazionePosti() {
		
		for(VeicoloAMotore veicoloAMotore : this.veicoli) {
			
			if(veicoloAMotore == null)
				System.out.println("Posto libero");
			else 
				System.out.println(veicoloAMotore);
			
		}
		
	}
	
	
	
	
	
	
}
