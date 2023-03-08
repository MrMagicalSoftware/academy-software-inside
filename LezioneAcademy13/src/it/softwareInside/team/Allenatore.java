package it.softwareInside.team;

public class Allenatore {

	
	private String nome;
	private int anniDiEsperienza;
	
	
	public Allenatore(String nome , int anniDiEsperienza) {
		setAnniDiEsperienza(anniDiEsperienza);
		setNome(nome);
	}
	
	public Allenatore() {
		this("ciccio graziani", 10);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nome : " + this.nome + " Exp " + anniDiEsperienza; 
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAnniDiEsperienza(int anniDiEsperienza) {
		this.anniDiEsperienza = anniDiEsperienza > 0 ? anniDiEsperienza : 3;
	}
	
	
	public int getAnniDiEsperienza() {
		return anniDiEsperienza;
	}
	
	public String getNome() {
		return nome;
	}
	
}
