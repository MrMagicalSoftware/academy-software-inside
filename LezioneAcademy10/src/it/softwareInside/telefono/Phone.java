package it.softwareInside.telefono;

import java.util.Random;

public class Phone {

	
	private String modello, marca;
	private double costo;
	private boolean isDualSim;
	
	
	
	
	
	
	
	
	
	
	public Phone(String modello, String marca, double costo, boolean isDualSim) {
		
		setModello(modello);
		setCosto(costo);
		setDualSim(isDualSim);
		setMarca(marca);

	}



	//default
	public Phone() {
		setModello(generaModello());
		setCosto(100);
		setDualSim(true);
		setMarca("SAMSINGS");
	}
	
	
	
	/**
	 * 
	 * GENERA UN CODICE DI 4 LETTERE e 3 numeri 
	 * 
	 * Es  AACD-789
	 * 
	 * @return
	 */
	public String generaModello() {
		Random random = new Random();
		
							//   0    1     2      3     4
		String[] vetStrings = { "A" , "B" , "C" , "D" , "E"};
		String codice = "";
		
		for (int i = 0; i < 4; i++) {
			int indiceDaEstrarre =  random.nextInt(0, vetStrings.length);
			
			codice += vetStrings[   indiceDaEstrarre  ];
		}
		
		codice += "-" + random.nextInt(100, 1000);
		
		return codice;
	}
	
	
	
	@Override
	public String toString() {
		return "Phone [modello="
				+ modello + ", "
			+ "marca=" + marca + ", costo=" + costo + ", isDualSim=" + isDualSim + "]";
	}
	
	
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setCosto(double costo) {
		this.costo = costo > 0  ? costo : - costo;
	}
	
	public void setDualSim(boolean isDualSim) {
		this.isDualSim = isDualSim;
	}
	
	
	
	
	public String getModello() {
		return modello;
	}
	public String getMarca() {
		return marca;
	}
	public double getCosto() {
		return costo;
	}
	public boolean isDualSim() {
		return isDualSim;
	}
	
	
	
	
	
	
	
	
	
	
	
}
