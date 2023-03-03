package it.softwareInside.book;

public class Book {

	
	private String titolo, autore, genere;
	private double prezzo;
	private int numeroDiPagine;
	
	
	

	@Override
	public String toString() {
		
		return "titolo : " + this.titolo + " genere " + this.genere 
				+  " prezzo " + this.prezzo;
	}
	
	
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	public void setPrezzo(double prezzo) {
		
		
		this.prezzo = prezzo > 0 ?  prezzo : 10 ;
		
		
	}
	
	
	
	
	public void setNumeroDiPagine(int numeroDiPagine) {
		
		this.numeroDiPagine = numeroDiPagine > 0 ?  numeroDiPagine : - numeroDiPagine;

//		if(numeroDiPagine > 0)
//			this.numeroDiPagine = numeroDiPagine;
//		else
//			this.numeroDiPagine =  - numeroDiPagine;

	}
	
	
	//get
	
	public double getPrezzo() {
		return this.prezzo;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public String getGenere() {
		return genere;
	}

	public int getNumeroDiPagine() {
		return numeroDiPagine;
	}
	
	
	
	
	
}

