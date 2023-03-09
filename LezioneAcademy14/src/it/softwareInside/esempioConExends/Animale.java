package it.softwareInside.esempioConExends;

public class Animale {

	
	private String  colore;
	private char  sesso;
	private int eta;
	
	
	
	public Animale() {
		this("rosso", 'f', 10);
	}

	
	
	public Animale(String colore, char sesso, int eta) {
		
		//super();
		setColore(colore);
		setSesso(sesso);
		setEta(eta);
		
	}


	
	
	public void saluta() {
		System.out.println("sono una bestia");
	}
	

	@Override
	public String toString() {
		return "Animale [colore=" + colore + ", sesso=" + sesso + ", eta=" + eta + "]";
	}




	public String getColore() {
		return colore;
	}


	public void setColore(String colore) {
		this.colore = colore;
	}



	public char getSesso() {
		return sesso;
	}



	public void setSesso(char sesso) {
		this.sesso = sesso;
	}



	public int getEta() {
		return eta;
	}



	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
	
}
