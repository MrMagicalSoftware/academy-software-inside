package it.softwareInside.esempio2Classi;

public class Pc {

	
	private double costo;
	private String marca;
	
	private Monitor monitor;
	
	
	
	public Pc(double costo , String marca, Monitor monitor) {
		setCosto(costo);
		setMarca(marca);
		setMonitor(monitor);
	}
	
	
	
	public Pc() {
		setCosto(500);
		setMarca("acer");
		
		this.monitor = new Monitor(); // setMonitor( new Monitor() ) 
		
		//this.monitor = new Monitor(marca, costo, costo)
	}
	
	
	@Override
	public String toString() {
		return "Pc [costo=" + costo + ", "
				+ "marca=" + marca + ", monitor=" 
				+ monitor + "]";
	}

	public Monitor getMonitor() {
		return monitor;
	}
	
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	
	
	
	
	
	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
}
