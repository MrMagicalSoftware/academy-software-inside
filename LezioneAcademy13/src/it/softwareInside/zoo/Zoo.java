package it.softwareInside.zoo;

public class Zoo {
	
	private final int DIMENSIONE_ZOO = 10;  // COSTANTE 
	
	private String nome;
	private Animale[] animali;
	
	
	public Zoo() {
		this("zoo fantasy wowww");
	}
	
	
	public Zoo(String nome) {
		
		setNome(nome);
		this.animali = new Animale[DIMENSIONE_ZOO];	
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void stampaZoo() {
		
		for(Animale animale : this.animali)
			System.out.println(animale);
		
		
	}
	
	
	public boolean isOneLionMaleInVector() {
		
		for(Animale animale : this.animali) {
			
			if(animale == null)  //significa che il posto è vuoto...
				continue;
			
			if(animale.getSpecie().equals("leone") && animale.getSesso() == 'm')
				return true;
			
		}
		return false;
		
	}
	
	
	
	
	public boolean addAnimale(Animale animale) {
		
		
		if(animale == null)
			return false;
		
		
		for (int i = 0; i < animali.length; i++) {
			
			//esiste un posto libero ??
			if(this.animali[i] == null){
				
								
				if(animale.getSpecie().equals("leone") && animale.getSesso() == 'm' &&  isOneLionMaleInVector() ) 
					return false;
				
				animali[i] = animale;			
				return true;
			}
				
		}
	
		
		return false;
		
	}
	
	
	
	public Animale removeAnimale(int posizione) {
		
		if(posizione < 0 || posizione > this.DIMENSIONE_ZOO)
			return null;
		
		Animale animaleTmp = this.animali[posizione];
		this.animali[posizione] = null;
		
		return animaleTmp;
		
	}
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
