package it.softwareInside.esercizioCasa;

public class Casa {

	
	private Cucina cucina;
	private Sala sala;
	
	
	
	
	public Casa() {
		this(new Cucina(), new Sala());
	}
	
	
	
	public Casa(Cucina cucina, Sala sala) {
		setCucina(cucina);
		setSala(sala);
	}


	public Cucina getCucina() {
		return cucina;
	}


	public void setCucina(Cucina cucina) {
		this.cucina = cucina;
	}


	public Sala getSala() {
		return sala;
	}


	public void setSala(Sala sala) {
		this.sala = sala;
	}


	public double calcolaAreaCasa() {
		
//		//area della cucina + area della sala
//		double areaCucina = this.cucina.getDimensioni().calcolaArea();
//		double areaSala = this.sala.getDimensioni().calcolaArea();
//		
//		return areaCucina + areaSala;

		return this.cucina.getDimensioni().calcolaArea() +
				this.sala.getDimensioni().calcolaArea();
	}
	
	
	@Override
	public String toString() {
		return "Casa [cucina=" + cucina + ", sala=" + sala + "]";
	}
	
	
	
	
	
}
