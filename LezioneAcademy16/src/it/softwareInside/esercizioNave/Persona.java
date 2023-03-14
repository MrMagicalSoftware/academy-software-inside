package it.softwareInside.esercizioNave;

public class Persona {

	
	private String nome;
	private int eta;
	
	
	
	public Persona() {
		this("mario rossi", 18);
	}
	
	
	
	
	public Persona(String nome, int eta) {
		super();
		setNome(nome);
		setEta(eta);
	}







	@Override
	public String toString() {
		return "[nome=" + nome + ", eta=" + eta + "]";
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
	
}
