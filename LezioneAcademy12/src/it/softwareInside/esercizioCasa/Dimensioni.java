package it.softwareInside.esercizioCasa;

public class Dimensioni {

	private double larghezza;
	private double lunghezza;
	
	
	
	public Dimensioni() {
		this(10 , 3);
	}
	
	
	public Dimensioni(double larghezza, double lunghezza) {
		setLarghezza(larghezza);
		setLunghezza(lunghezza);
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "larghezza " + larghezza + " lunghezz" + lunghezza + " AREA " + calcolaArea() ;
	}
	
	
	
	public double calcolaArea() {
		return larghezza * lunghezza;
	}
	
	
	public double getLarghezza() {
		return larghezza;
	}
	
	public double getLunghezza() {
		return lunghezza;
	}
	
	
	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}
	
	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	
}
