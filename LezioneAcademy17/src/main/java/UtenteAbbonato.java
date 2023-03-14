

public class UtenteAbbonato extends Utente {

	public UtenteAbbonato() {
		super();
	}

	public UtenteAbbonato(String nome, int massimoPagineInPrestito) {
		super(nome, massimoPagineInPrestito);
	}

	
	@Override
	public boolean prendiInPrestito(Libro libro) {
		
		
		if(libro == null)
			return false;
		
		if( !(libro instanceof Rivista) )
			return super.prendiInPrestito(libro);
		
		//rivista... 
		super.getLibriInPrestito().add(libro);
		return true;
	}
	
	
	
	
	@Override
	public int contaPagineInPrestito() {
		
		int cont = 0;
		
		for(Libro libro : super.getLibriInPrestito())
			if( ! (libro instanceof Rivista))
				cont += libro.getPagine();
		
		
		return cont;
	}
	
	
}
