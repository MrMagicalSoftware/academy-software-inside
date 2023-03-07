package it.softwareInside.relazione1Molti;

public class Scaffale {

	private Bevanda[] bevande;
	

	public Scaffale() {
		this.bevande = new Bevanda[3];
	}
	
	
	public Scaffale(int dimensione) {
		this.bevande = new Bevanda[dimensione];
	}
	
	
	public void stampaScaffaleConForEach() {
		
		for(Bevanda bevanda : this.bevande )
			System.out.println(bevanda);
		
	}
	
	
	
	
	public void stampaScaffale() {
		
		for(int i = 0 ; i < this.bevande.length ; i++)
			System.out.println(this.bevande[i]);
		
	}
	
	
	
	//operazione di rimozione 
	//prende in ingresso un intero che deve 
	//essere compreso tra 0 ed lunghezza -1
	
	// restituisce la bevanda che ho rimosso
	
	
	public Bevanda removeBevanda(int posizione) {
		
		if(posizione < 0 || posizione >= this.bevande.length) {
			return null;
		}
		
		Bevanda bevandaTmp  = this.bevande[posizione];
		
		this.bevande[posizione] = null; 
		
		return bevandaTmp;
	}
	
	
	
	public boolean addBevanda(Bevanda bevanda) {
		
		
		if(bevanda == null)
			return false;
		
		for(int i = 0 ; i < this.bevande.length ; i++) {
			
			
			if(this.bevande[i]  == null) {
				//System.out.println("sono quiiiiii  ");
				this.bevande[i] = bevanda;
				return true;
			}
			
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
}
