package it.softwareInside.veicoli;

public class VeicoloAMotore {
	
	
	
	private int annoImmatricolazione;
	
	
	private String marca;
	private String tipoAlimentazione;
	private int cilindrata;
	
	
	public VeicoloAMotore(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
		
		setAnnoImmatricolazione(annoImmatricolazione);
		setMarca(marca);
		setTipoAlimentazione(tipoAlimentazione);
		setCilindrata(cilindrata);
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "[annoImmatricola=" + annoImmatricolazione + ", marca=" + marca + ", tipoAlimentazione="
				+ tipoAlimentazione + ", cilindrata=" + cilindrata + "]";
	}





	public void setAnnoImmatricolazione(int annoImmatricola) {
		this.annoImmatricolazione = annoImmatricola;
	}
	
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	public void setTipoAlimentazione(String tipoAlimentazione) {
		
		switch (tipoAlimentazione) {
		case "benzina":
			this.tipoAlimentazione = "benzina";
			break;
		case "diesel":
			this.tipoAlimentazione = "diesel";
			break;
		case "gpl":
			this.tipoAlimentazione = "gpl";
			break;
		case "e-tron":
			this.tipoAlimentazione = "e-tron";
			break;

		default:
			this.tipoAlimentazione = "benzina";
			break;
		}
		
	}
	
	
	public int getAnnoImmatricola() {
		return annoImmatricolazione;
	}
	
	public int getCilindrata() {
		return cilindrata;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}
	
	
	
	
	

}
