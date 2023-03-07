package it.softwareInside.relazione1Molti;

public class Bevanda {

	private double costo;
	private String nomeBevanda;
	private double capienza;
	private boolean isAlcoholic;
	
		
	//isAlcoool boolean 
	// capienza  ---> 0.33 0.66 

	
	public Bevanda() {
		this(1.20, "fanta", 0.66, false);
	}
	
	public Bevanda(String nomeBevanda) {
		this(1.20, nomeBevanda, 0.66, false);
	}
	
	
	public Bevanda(double costo, String nomeBevanda, double capienza , boolean isAlcoholic) {
		setNomeBevanda(nomeBevanda);
		setCosto(costo); 
		setAlcoholic(isAlcoholic);
		setCapienza(capienza);
	}

	
	public void setAlcoholic(boolean isAlcoholic) {
		this.isAlcoholic = isAlcoholic;
	}
	
	public void setCapienza(double capienza) {
		
		
		if(capienza == 0.33 || capienza == 0.66)
			this.capienza = capienza;
		else 
			this.capienza = 0.33;
		
	}
	
	public double getCapienza() {
		return capienza;
	}
	
	public boolean isAlcoholic() {
		return isAlcoholic;
	}

	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getNomeBevanda() {
		return nomeBevanda;
	}

	public void setNomeBevanda(String nomeBevanda) {
		this.nomeBevanda = nomeBevanda;
	}


	@Override
	public String toString() {
		return "Bevanda [costo=" + costo + ", nomeBevanda=" + nomeBevanda + "]";
	}

	
}
