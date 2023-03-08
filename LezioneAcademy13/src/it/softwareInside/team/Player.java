package it.softwareInside.team;

public class Player {

	private String nome, ruolo ;
	private int eta;
	
	
	/*
	 * 	public NomeClasse () {
	 * 
	 *  }
	 * 
	 * 
	 */
		
	
	public Player() {
		this("cannavaro", "difensore", 25);
	}
	

	
	public Player(String nome, String ruolo, int eta) {
		
		setNome(nome);
		setRuolo(ruolo);
		setEta(eta);
	}



	@Override
	public String toString() {
		return "Player [nome=" + nome + ", ruolo=" + ruolo + ", eta=" + eta + "]";
	}

	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRuolo() {
		return ruolo;
	}
	
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	public int getEta() {
		return eta;
	}
	
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
	
	
	
	
}
