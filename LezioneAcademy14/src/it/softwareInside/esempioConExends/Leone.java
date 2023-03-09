package it.softwareInside.esempioConExends;

public class Leone  extends Animale{

	public Leone() {
		super();	
	}

	public Leone(String colore, char sesso, int eta) {
		super(colore, sesso, eta);
		
	}

	
	@Override
	public String toString() {
	 
		return "LEONE " + super.toString();
	}
	 
	
	@Override
	public void saluta() {
		System.out.println("grrrrrrrrr arrrrr arrr");
	}
	
	
}
