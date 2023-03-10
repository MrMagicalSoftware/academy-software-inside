package it.softwareInside.esercizioPdf1;

public class Documento {
	
	
	private String testo;
	
	
	public Documento() {
		this("");
	}
	
	public Documento(String testo) {
		setTesto(testo);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public double calcolaQualita() {
		
		return 1.0 / (1 + this.testo.length());
		
	}
	
	
	
	public String getTesto() {
		return testo;
	}
	
	public void setTesto(String testo) {
		this.testo = testo;
	}

}
