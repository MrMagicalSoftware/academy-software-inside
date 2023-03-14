import java.util.ArrayList;

import lombok.Data;

@Data

public class Utente {

	
	private String nome;
	private int massimoPagineInPrestito;
	
	private ArrayList<Libro> libriInPrestito;
	
	public Utente() {
		this("mario", 100);
	}
	
	

	public Utente(String nome, int massimoPagineInPrestito) {
		
		setNome(nome);
		setMassimoPagineInPrestito(massimoPagineInPrestito);
		
		this.libriInPrestito = new ArrayList<Libro>();
	}

	
	public int contaPagineInPrestito() {
		
		int cont = 0;
		for (Libro libro : libriInPrestito)
			cont += libro.getPagine();
		
		return cont;
	}
	
	
	public Libro restituisciLibro() {
		
		if(this.libriInPrestito.isEmpty())
			return null;
		
//		if(this.libriInPrestito.size() == 0 )
//			return null;

		
		return this.libriInPrestito.remove(0);
	}
	
	public boolean prendiInPrestito(Libro libro) {
		
		if(libro == null)
			return false;
		
		if(libro.getPagine() + contaPagineInPrestito() > this.massimoPagineInPrestito)
			return false;
			
		
		this.libriInPrestito.add(libro);
		
		return true;
		
	}
	
	
	
}
