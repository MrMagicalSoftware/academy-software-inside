package it.softwareInside.car;



public class Carrozzeria {

	private String materiale, tipoVernice , colore;

		
	public Carrozzeria(String materiale, String tipoVernice, String colore) {
		setColore(colore);
		setMateriale(materiale);
		setTipoVernice(tipoVernice);
	}




	public Carrozzeria() {
		this("carbonio", "metallico", "giallo");
	}
	

	@Override
	public String toString() {
		return "Carrozzeria [materiale=" + materiale + ", tipoVernice=" + tipoVernice + ", colore=" + colore + "]";
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	public String getTipoVernice() {
		return tipoVernice;
	}

	public void setTipoVernice(String tipoVernice) {
		this.tipoVernice = tipoVernice;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
	
	
	
	
	
	
	
	
	
	
}
