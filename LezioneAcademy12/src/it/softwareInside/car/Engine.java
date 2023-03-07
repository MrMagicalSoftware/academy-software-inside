package it.softwareInside.car;

public class Engine {

	private int numeroDiCavalli;
	private String alimentazione;
	
	
	public Engine(int numeroDiCavalli) {
		this(numeroDiCavalli , "benzina");
//		setNumeroDiCavalli(numeroDiCavalli);
//		setAlimentazione("benzina");
	}
	
	
	
	public Engine(int numeroDiCavalli , String alimentazione) {
		setAlimentazione(alimentazione);
		setNumeroDiCavalli(numeroDiCavalli);
	}
	
	
	
	public Engine() {
		//this(300);
		this(100, "benzina");  // chiama il costruttore alla riga 10 , passando come parametri 100 , benzina
//		setAlimentazione("benzina");
//		setNumeroDiCavalli(100);
		
		
	}
	
	
	
	@Override
	public String toString() {
		return "Engine [numeroDiCavalli=" + numeroDiCavalli + ", alimentazione=" + alimentazione + "]";
	}

	public int getNumeroDiCavalli() {
		return numeroDiCavalli;
	}
	
	public void setNumeroDiCavalli(int numeroDiCavalli) {
		this.numeroDiCavalli = numeroDiCavalli;
	}
	
	public String getAlimentazione() {
		return alimentazione;
	}
	
	public void setAlimentazione(String alimentazione) {
		
		
		switch (alimentazione) {
		case "benzina":
			this.alimentazione = "benzina";
			break;
		case "diesel":
			this.alimentazione = "diesel";
			break;
		case "metano":
			this.alimentazione = "metano";
			break;
		case "elettrica":
			this.alimentazione = "elettrica";
			break;
			
		default:
			this.alimentazione = "benzina";

			break;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
