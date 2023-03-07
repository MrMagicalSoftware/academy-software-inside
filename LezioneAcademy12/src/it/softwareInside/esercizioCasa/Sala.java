package it.softwareInside.esercizioCasa;

public class Sala {

	
	private Dimensioni dimensioni;
	private Televisore televisore;
	
	
	
	
	public Sala() {
		this(new Dimensioni(2, 30), new Televisore());
	}
	
	public Sala(Dimensioni dimensioni, Televisore televisore) {
		setDimensioni(dimensioni);
		setTelevisore(televisore);
	}


	@Override
	public String toString() {
		return "Sala [dimensioni=" + dimensioni + ", televisore=" + televisore + "]";
	}


	public Dimensioni getDimensioni() {
		return dimensioni;
	}


	public void setDimensioni(Dimensioni dimensioni) {
		this.dimensioni = dimensioni;
	}


	public Televisore getTelevisore() {
		return televisore;
	}


	public void setTelevisore(Televisore televisore) {
		this.televisore = televisore;
	}
	
	
	
	
	
	
}
