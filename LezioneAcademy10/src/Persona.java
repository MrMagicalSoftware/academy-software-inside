import java.awt.AWTError;

public class Persona {

	//attributi di classe
	private String  nome;
	private String  cognome;
	private int eta;
	
	
	//METODI DI GETTING
	
	public String getNome() {	
		return this.nome;
	}
	
	public int getEta() {
		return this.eta;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	
	
	
	// METODI DI SETTING 
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	
	public void setEta(int eta) {
		
		if(eta > 0)
			this.eta = eta;
		else
			this.eta = - eta; // eta = -  ( - 20 ) ==> + 20
	}
	
	
	//Metodi della classe
	
	/**
	 * semplice metodo che stampa a video
	 * il nome della persona.
	 */
	public void saluta() {
		
		System.out.println("ciao mi chiamo " + nome + " eta " + eta);
	}
	
	
	
	
}
