package it.softwareInside.esercizioPdf1;

public class DocumentoPrioritario extends Documento {

	
	private int incremento;
	
	public DocumentoPrioritario() {
		this("", 1);
	}

	public DocumentoPrioritario(String testo,  int incremento) {
		
		super(testo);
		setIncremento(incremento);
	}

	
	
	@Override
	public double calcolaQualita() {
//		double ris = 1.0 / (1 + super.getTesto().length())   + this.incremento;
//		return ris;
		
		
		return super.calcolaQualita() + this.incremento;
		
	}
	
	
	public void setIncremento(int incremento) {
		this.incremento = incremento > 0 ? incremento : - incremento;
	}
	
	
	public int getIncremento() {
		return incremento;
	}
	
	
}
