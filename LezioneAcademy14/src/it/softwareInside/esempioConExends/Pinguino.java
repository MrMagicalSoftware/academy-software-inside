package it.softwareInside.esempioConExends;

public class Pinguino extends Animale {
	
	public Pinguino() {
		super();
	}
	
	
	public Pinguino(String colore, char sesso, int eta) {
		super(colore, sesso, eta);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PINGU" + super.toString();
	}
	
	
	@Override
	public void saluta() {
		// TODO Auto-generated method stub
		System.out.println("pinguuu pinguuuuuuuu uuuu");
	}
	
	
	

}
