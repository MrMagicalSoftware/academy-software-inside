package it.softwareInside.cinema;

public class Cinema {
	
	private final int CATALOGO_FILM = 5;
	private final int DIMENSIONE_CINEMA = 10;
	
	
	private String nome;
	private Film[] films ;
	private Persona[] persone;
	
	
	public Cinema(String nome) {
		setNome(nome);
		this.films = new Film[CATALOGO_FILM];
		this.persone = new Persona[DIMENSIONE_CINEMA];
	}
	
	public Cinema() {
		this("KINEPOLIS");
	}
	
	
	
	public String getNome() {
		return nome;
	}
	
	
	
	
	/**
	 * ritorna true se il film è 
	 * presente nel vettore altrimenti false.
	 * 
	 * @param film
	 * @return
	 */
	public boolean cercaFilm(Film film) {
		
		if(film == null)
			return false;
			
		for (int i = 0; i < films.length; i++) {
			
			if(this.films[i] == null )
				continue;
			
			if(this.films[i].getTitolo().equals(film.getTitolo()))
				return true;
		}
		
		return false;
	}
	
	/**
	 * prende in input una posizione
	 * che deve essere nel range .. . . .
	 * 
	 * rimuove il film in una determinata posizione
	 * andando a ritornare il film rimosso .
	 * 
	 * @param posizione
	 * @return
	 */
	public Film removeFilm(int posizione ) {
		
		if(posizione  < 0  || posizione >= this.films.length)
			return null;
		
		
		Film filmTmp = this.films[posizione];
		this.films[posizione] = null;
		
		return filmTmp;
	}
	
	
	public void stampaFilms() {
		
		for(Film f : this.films)
			System.out.println(f);
		
		
		// String[] myString = {"ciao" , "miao " , "gatto "}
		// for(String parola : myString }
		// 		syso(parola) 
		
	}
	
	
	public void stampaPersone() {
		for(Persona persona : this.persone)
			System.out.println(persona);
	}
	
	
	
	public void removeAllPersonInCinema() {
		
		for(int i = 0 ; i < this.persone.length;i++) 
			this.persone[i] = null;

	}
	
	
	
	/**
	 * 
	 * posso aggiungere il film se trovo posto
	 * e se non esiste un altro film con lo stesso nome.
	 * 
	 * @param film
	 * @return
	 */
	public boolean aggiungiFilm(Film film) {
	
		if(film == null)
			return false;
		
		if(  cercaFilm(film)  )
			return false;
		
		
		for (int i = 0; i < this.films.length; i++) {
			
			
			// esiste un posto libero ??
			if(this.films[i] == null) {
				this.films[i] = film;
				return true;
			}
			
		}
		
		return false;
		
	}
	
	
	public int contaPersonaInSala() {
		
		int contatorePersone = 0;
		
		for(Persona persona  : this.persone)
			if(persona != null)
				contatorePersone++;
		
		return contatorePersone;
	}
	
	
	public int trovaPrimoPostoLibero() {
		
			
		for (int i = 0; i < persone.length; i++) {
			if(persone[i] == null)
				return i;
		}
		
		return -1;
	}
	
	
	public boolean aggingiSpettatore(Persona persona , Film film) {
		
		if(persona == null || film == null)
			return false;
		
		if( ! cercaFilm(film)  )
			return false;
		
		// tutto pieno ??
		if(contaPersonaInSala() == this.persone.length)
			return false;
		
		if( persona.getEta() < film.getEtaMinima() ) 
			return false;
		
		
		int pos = trovaPrimoPostoLibero();
		
		if(pos != -1) {
			this.persone[pos] = persona;
			return true;
		}
	
		//cerco un posto per farlo sedere.....
		
//		for (int i = 0; i < this.persone.length; i++) {
//			if(this.persone[i] == null) {
//				this.persone[i] = persona;
//				return true;
//			}
//		}
//		
		return false;
		
	}
	
	
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPersone(Persona[] persone) {
		this.persone = persone;
	}
	
	public void setFilms(Film[] films) {
		this.films = films;
	}
	
	
	
}
