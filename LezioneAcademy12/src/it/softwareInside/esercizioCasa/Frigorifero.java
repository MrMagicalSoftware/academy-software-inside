package it.softwareInside.esercizioCasa;

public class Frigorifero {

	
	private char classeEnergetica;
	private double costo;
	private String marca;
	private boolean isAntiFroz;
	
	
	
	
	
	public Frigorifero() {
		this('b', 300, "samsung", true);
	}
	
	
	public Frigorifero(char classeEnergetica, double costo, String marca, boolean isAntiFroz) {
		setAntiFroz(isAntiFroz);
		setClasseEnergetica(classeEnergetica);
		setMarca(marca);
		setCosto(costo);
		
	}


	@Override
	public String toString() {
		
		String ris  = isAntiFroz ? "SI anti -froz" : "NO anti -froz";
		
		return "Frigorifero [classeEnergetica=" + classeEnergetica + ", costo=" + costo + ", marca=" + marca
				+ ", isAntiFroz=" + ris + "]";
	}


	public boolean isAntiFroz() {
		return isAntiFroz;
	}
	
	
	public char getClasseEnergetica() {
		return classeEnergetica;
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
		
		
		this.costo = costo > 0 ? costo : 150; 
	}
	
	
	public void setClasseEnergetica(char classeEnergetica) {
		
		switch (classeEnergetica) {
		case 'a':
			this.classeEnergetica = 'a';
			break;
		case 'b':
			this.classeEnergetica = 'b';
			break;
		case 'c':
			this.classeEnergetica = 'c';
			break;
		case 'd':
			this.classeEnergetica = 'd';
			break;
			
		default:
			this.classeEnergetica = 'b';
			break;
		}
		
		
	}
	
	
	public void setAntiFroz(boolean isAntiFroz) {
		this.isAntiFroz = isAntiFroz;
	}
	
	
	
}
