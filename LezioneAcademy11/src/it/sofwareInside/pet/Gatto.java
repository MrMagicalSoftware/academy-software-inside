package it.sofwareInside.pet;

public class Gatto {

	
	private String nome, colore;
	private int eta;
	
	
	public Gatto() {
		setNome("Gattino");
		setColore("bianchino");
		setEta(1);
	}
	
	
	public Gatto(String nome,String colore, int eta) {
		setColore(colore);
		setEta(eta);
		setNome(nome);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Gatto [nome=" + nome + ", colore=" + colore + ", eta=" + eta + "]";
	}

	public String getColore() {
		return colore;
	}
	
	public int getEta() {
		return eta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
