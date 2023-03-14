package it.softwareInside.esercizioNave;


import java.util.ArrayList;

public class Nave {

	
	private final int DIMENSIONE_NAVE = 5;
	private String nome , codiceDiImbarco;
	private int numeroDiAnniRichiesti ;

	private ArrayList<Persona> personeAbordo;

	public Nave() {
		this("nave", "aa", 3);
	}
	
	
	public Nave(String nome ,String codiceDiImbarco,int numeroDiAnniRichiesti) {
	
		setNome(nome);
		setCodiceDiImbarco(codiceDiImbarco);
		setNumeroDiAnniRichiesti(numeroDiAnniRichiesti);
		
		this.personeAbordo = new ArrayList<>();
	}
	
	
	
	public void stampaNave() {
		System.out.println(toString());
	}
	
	/**
	 * 
	 * 
	 * 
	 * @param persona
	 * @return
	 */
	public boolean addPesseggero(Persona persona) {
		
		if(persona == null)
			return false;
		
		if(  this.personeAbordo.size() + 2 >= this.DIMENSIONE_NAVE)
			return false;
		
		
		if(! (persona instanceof Passeggero))
			return false;
		
		Passeggero passeggero = (Passeggero) persona;
			
		
		if(! passeggero.getCartaDiImbarco().equals(this.codiceDiImbarco))
			return false;
		
		this.personeAbordo.add(passeggero);
		
		return true;
	}
	
	
	
	/**
	 * Se il capitano è null ritorno false 
	 * Se esiste già un capitano ritorno false.
	 * 
	 * @param capitano
	 * @return
	 */
	public boolean addCapitano(Capitano capitano) {
		
		if(capitano == null ||  isCapitanoOnBoard() || 
				capitano.getExp() < this.numeroDiAnniRichiesti )
			return false;
		
		
		this.personeAbordo.add(capitano);
		
		return true;
	}
	
	
	public boolean isCapitanoOnBoard() {
		for (Persona persona : personeAbordo)
			if(persona instanceof Capitano)
				return true;
	
		
		return false;
	}
	
	
	
	
	public boolean addPersonale(PersonaleDiBordo personaleDiBordo) {
		
		if(personaleDiBordo ==null)
			return false;
		
		//check che non esiste un altro personal di bordo...
		
		if(isPersonaleDiBordoOnArray())
			return false;
		
//		if(contaPersonaleDiBordo() > 4)
//			return false;
		
		this.personeAbordo.add(personaleDiBordo);
		
		return true;
	}
	
	
	public boolean isPersonaleDiBordoOnArray() {
		
		for (Persona persona : personeAbordo) {
			if(persona instanceof PersonaleDiBordo)
				return true;
		}
		
		return false;
	}
	
	
	public int contaPersonaleDiBordo() {
		int cont = 0 ;
		
		for (Persona persona : personeAbordo) {
			if(persona instanceof PersonaleDiBordo)
				cont++;
		}
		
		return cont;
	}
	
	
	public void removeAll() {
		
		
		//this.personeAbordo.clear();
		
		
		for(Persona persona : this.personeAbordo) {
			
			if( ! ( persona instanceof Capitano))
				this.personeAbordo.remove(persona);
			
		}
		
		
		this.personeAbordo.remove(0);
	}
	
	
	
	public Persona removePersona(Persona persona) {
		
		if(persona == null)
			return null;
		
		
		if( this.personeAbordo.remove(persona))
			return persona;
		
		
		return null;
	}
	
	
	@Override
	public String toString() {
		return "Nave [DIMENSIONE_NAVE=" + DIMENSIONE_NAVE + ", nome=" + nome + ", codiceDiImbarco=" + codiceDiImbarco
				+ ", numeroDiAnniRichiesti=" + numeroDiAnniRichiesti + ", personeAbordo=" + personeAbordo + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodiceDiImbarco() {
		return codiceDiImbarco;
	}

	public void setCodiceDiImbarco(String codiceDiImbarco) {
		this.codiceDiImbarco = codiceDiImbarco;
	}

	public int getNumeroDiAnniRichiesti() {
		return numeroDiAnniRichiesti;
	}

	public void setNumeroDiAnniRichiesti(int numeroDiAnniRichiesti) {
		this.numeroDiAnniRichiesti = numeroDiAnniRichiesti;
	}

	public ArrayList<Persona> getPersoneAbordo() {
		return personeAbordo;
	}

	public void setPersoneAbordo(ArrayList<Persona> personeAbordo) {
		this.personeAbordo = personeAbordo;
	}

	public int getDIMENSIONE_NAVE() {
		return DIMENSIONE_NAVE;
	}
	
	
	
	
	
	
	
}
