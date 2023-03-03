package it.softwareInside.car;

public class Car {

	
	private String marca, colore;
	private double costo, velox;
	
	
	//costruttore di default
	
	public Car() {
		this.colore ="rosso";
		this.marca="MR AUTO";
		
		
		setCosto(-7); // this.costo = -7;
		
		setVelox(1000);
		
	}
	
	//Costuttore con i parametri
	
	
	public Car(String marca, String colore , double costo , double velox ) {
		
		setColore(colore);
		setCosto(costo);
		setMarca(marca);
		setVelox(velox);
		//this.velox = velox;
	}
	
	
	public void frenata(int valoreDiFrenata) {
		
		//50 km   80 
		
		this.velox = this.velox - valoreDiFrenata > 0 ? 
				(this.velox - valoreDiFrenata) : 0 ;
		
		
	}
	
	
	public void frena() {
		this.velox--;  // this.velox = this.velox -1      this.velox -= 1
	}
	
	public void accelera() {
		this.velox++;
	}
	
	@Override
	public String toString() {
		return "Car [marca=" + marca + ", colore=" 
				+ colore + ", costo=" + costo + ", velox=" + velox + "]";
	}
	
	
	
	
	//getter
	
	public double getVelox() {
		return velox;
	}
	


	public double getCosto() {
		return this.costo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	
	public String getColore() {
		return colore;
	}
	
	
	
	
	//setting
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public void setCosto(double costo) {
		this.costo = costo > 0 ? costo : - costo;
	}
	
	public void setVelox(double velox) {
		this.velox = velox > 0  && velox < 250 ? velox : 50;
	}
	
	
}
