package it.softwareInside.veicoli;

public class Furgone extends VeicoloAMotore{

	private int capacitaDiCarico;
	
	
	public Furgone() {
		this(2022, "super furgone", "benzina", 1900, 100);
	}
	
	
	public Furgone(int annoImmatricola, String marca, String tipoAlimentazione, int cilindrata, int capacitaDiCarico) {
		super(annoImmatricola, marca, tipoAlimentazione, cilindrata);
		setCapacitaDiCarico(capacitaDiCarico);
	}
	
	
	
	@Override
	public String toString() {
		return  "Furgone [capacitaDiCarico=" + capacitaDiCarico + "]" + super.toString();
	}


	public void setCapacitaDiCarico(int capacitaDiCarico) {
		this.capacitaDiCarico = capacitaDiCarico > 0 ? capacitaDiCarico : 100;
	}
	
	public int getCapacitaDiCarico() {
		return capacitaDiCarico;
	}
	
	
	
	
}
