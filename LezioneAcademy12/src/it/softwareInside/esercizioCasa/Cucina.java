package it.softwareInside.esercizioCasa;

public class Cucina {

	private Dimensioni dimensioni;
	private Frigorifero frigorifero;
	
	
	
	
	public Cucina() {
		this(new Dimensioni(2, 20), new Frigorifero());
	}
	
	
	public Cucina(Dimensioni dimensioni, Frigorifero frigorifero) {
		setDimensioni(dimensioni);
		setFrigorifero(frigorifero);
	}


	public void setFrigorifero(Frigorifero frigorifero) {
		this.frigorifero = frigorifero;
	}
	
	
	public void setDimensioni(Dimensioni dimensioni) {
		this.dimensioni = dimensioni;
	}
	
	
	public Frigorifero getFrigorifero() {
		return this.frigorifero;
	}
	
	
	public Dimensioni getDimensioni() {
		return this.dimensioni;
	}
	
	
	@Override
	public String toString() {
		return  this.dimensioni +  " " + this.frigorifero +
				"GRANDEZZA CUCINA " + this.dimensioni.calcolaArea();
	}
	
	
}
