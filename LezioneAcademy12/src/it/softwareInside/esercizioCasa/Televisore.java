package it.softwareInside.esercizioCasa;

public class Televisore {

	private String marca;
	private double costo , pollici;
	
	
	
	public Televisore() {
		this("Philips", 100, 32);
	}
	
	public Televisore(String marca, double costo, double pollici) {
		setMarca(marca);
		setCosto(costo);
		setPollici(pollici);
	}

	@Override
	public String toString() {
		return "Televisore [marca=" + marca + ", costo=" + costo + ", pollici=" + pollici + "]";
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public double getPollici() {
		return pollici;
	}
	
	public void setPollici(double pollici) {
		this.pollici = pollici;
	}
	

}
