package it.softwareInside.esercizioNave;

public class Capitano extends Persona{

	
	private int exp;

	
	public Capitano() {
		super();
		setExp(0);
	}

	public Capitano(String nome, int eta, int exp) {
		super(nome, eta);
		this.setExp(exp);
		
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " EXP " + exp;
	}
	
	
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public int getExp() {
		return exp;
	}
	
	
	
}
