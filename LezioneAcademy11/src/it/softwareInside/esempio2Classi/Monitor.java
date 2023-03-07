package it.softwareInside.esempio2Classi;

public class Monitor {

	private String marca;
	private double costo;
	private double pollici;
	
	
	
	public Monitor(String marca, double costo, double pollici) {
		setCosto(costo);
		setMarca(marca);
		setPollici(pollici);
	}

	

	public Monitor() {
		
		setMarca("samsung");
		setCosto(190);
		setPollici(19.5);
		
	}
	
	
	
	@Override
	public String toString() {
		return "Monitor [marca=" + marca + ", costo=" + costo + ", pollici=" + pollici + "]";
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setPollici(double pollici) {
		this.pollici = pollici;
	}
	
	
	
	
	public double getCosto() {
		return costo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getPollici() {
		return pollici;
	}
	
}
