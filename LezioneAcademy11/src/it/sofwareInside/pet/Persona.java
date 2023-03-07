package it.sofwareInside.pet;

public class Persona {

	
	private String nome;
	private int eta ;
	private Gatto gatto;

	public Persona() {
		
//		int eta = 18;
//		setEta(eta);
		
		setEta(18);
		setNome("mario");
		
		//Gatto gatto = new Gatto("romero", "nero", 2);
		//setGatto(gatto);
		
		
		setGatto( new Gatto("romero", "nero", 2) );
	}
	
	
	
	public Persona(String nome , int eta , Gatto gatto) {
		
		setEta(eta);
		setNome(nome);
		setGatto(gatto);
	}

	
	
	
	
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" + eta + ", gatto=" + gatto + "]";
	}



	public void setGatto(Gatto gatto) {
		this.gatto = gatto;
	}
	
	
	public Gatto getGatto() {
		return gatto;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
	
	
	
}
