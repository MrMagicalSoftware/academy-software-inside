package it.softwareInside.esercizioNave;

public class PersonaleDiBordo extends Persona {

	private String mansione;

	public PersonaleDiBordo() {
		super();
		setMansione("tecnico");
	}

	public PersonaleDiBordo(String nome, int eta, String mansione) {
		super(nome, eta);
		setMansione(mansione);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + this.mansione ;
	}
	
	
	public void setMansione(String mansione) {
		this.mansione = mansione;
	}
	
	public String getMansione() {
		return mansione;
	}
	
	
	
	
}
