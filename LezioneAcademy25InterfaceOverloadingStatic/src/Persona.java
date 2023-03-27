

public class Persona {

	private String codiceFiscale;
	private String nome;
	private String cognome;
	
	
	public Persona(String codiceFiscale, String nome, String cognome) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
	}

	
	@Override
	public boolean equals(Object persona) {
		
		if(persona == null || ! (persona instanceof Persona))
			return false;
		
		Persona personaTmp = (Persona) persona;
		
		if(this.codiceFiscale.equals(personaTmp.codiceFiscale) 
				&& this.cognome.equals(personaTmp.cognome) &&
				this.nome.equals(personaTmp.nome))
			return true;
		
		return false;
	}
	
	

	public String getCodiceFiscale() {
		return codiceFiscale;
	}


	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	
	
	
}
