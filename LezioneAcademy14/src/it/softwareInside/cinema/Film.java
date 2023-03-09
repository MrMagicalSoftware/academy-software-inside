package it.softwareInside.cinema;

public class Film {

	
	private String titolo, genere;
	private int etaMinima;
	
	
	public Film() {
		this("encanto", "cartoon", 6);
	}
	
	public Film(String titolo,String genere, int etaMinima) {
		setTitolo(titolo);
		setGenere(genere);
		setEtaMinima(etaMinima);
	}
	
	
	@Override
	public String toString() {
		return "Film [titolo=" + titolo + ", genere=" + genere + ", etaMinima=" + etaMinima + "]";
	}
	
	public int getEtaMinima() {
		return etaMinima;
	}
	
	
	public String getGenere() {
		return genere;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setEtaMinima(int etaMinima) {
		this.etaMinima = etaMinima;
	}
	
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	
	
	
}
