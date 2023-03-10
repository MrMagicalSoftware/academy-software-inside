package it.softwareInside.veicoli;

public class Automobile  extends VeicoloAMotore{

	
	
	private int numeroPorte;
	
	
	
	public Automobile() {
		this(2020, "SUBARRU", "benzina", 1500, 5);
	}
	
	
	
	public Automobile(int annoImmatricola, String marca, String tipoAlimentazione, int cilindrata , int numeroPorte) {
		super(annoImmatricola, marca, tipoAlimentazione, cilindrata);
		setNumeroPorte(numeroPorte);
	}
	


	@Override
	public String toString() {
		
		
	
		return super.toString() + " " + " numero porte " + this.numeroPorte;
	}

	public int getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte) {
		if(numeroPorte == 3 || numeroPorte ==5)
			this.numeroPorte = numeroPorte;
		else 
			this.numeroPorte = 5;
	}
	
	
	
	
	

}
