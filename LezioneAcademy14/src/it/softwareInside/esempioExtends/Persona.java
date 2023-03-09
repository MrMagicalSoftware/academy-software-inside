package it.softwareInside.esempioExtends;


public class Persona {

	
	private String nome;
	private int eta;
	
	
	 
	
	
	public Persona() {
		this("mario" , 18 ) ;
		
	}
	
	public Persona(String nome , int eta ) {
		setNome(nome);
		setEta(eta);
	}
	
	public Persona(String nome) {
		setNome(nome);
		setEta(25);
	}
	
	
	
	@Override
	public String toString() {
		return  "Persona [nome=" + nome + ", eta=" + eta + "]";
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void saluta() {
	
		System.out.println("Ciao mi chiamo " + this.nome + " " + " eta ==> " + this.eta);
	}
	
	
}
