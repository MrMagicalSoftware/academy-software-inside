package it.softwareInside.esempioConExends;

public class Zoo {

	
	private final int DIMENSIONE_ZOO = 5;
	
	private String nome;
	private Animale[] animali;
	
	
	
	
	public Zoo() {
	
		this("ZOOO CON ANIMALI ");
		
	}
	
	
	public Zoo(String nome) {
		
		setNome(nome);
		this.animali = new Animale[DIMENSIONE_ZOO];
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void stampaZoo() {
		
		for(Animale animale : this.animali)
			if(animale != null)
				animale.saluta();
	}
	
	
	public boolean addAnimale(Animale animale) {
		
		if(animale == null)
			return false;
		
		
		for (int i = 0; i < this.animali.length; i++) {
			
			if(this.animali[i] == null) {
				this.animali[i] = animale;
				return true;
			}
			
			
		}
		
		return false;
		
	}
	
	
	public Animale remove(int pos) {
		
		if(pos < 0 || pos >= this.DIMENSIONE_ZOO)
			return null;
		
		
		Animale tmpAnimale = this.animali[pos];
		this.animali[pos] = null;
		
		return tmpAnimale;
	}
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	
	
	
	
}
