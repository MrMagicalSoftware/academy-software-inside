package it.softwareInside.cinema;

public class Starter {
	
	
	public static void main(String[] args) {
		
		
		
	
		Cinema cinema = new Cinema("KINEPOLIS PRO");
		
		
		Film film1 = new Film("gladiatore", "avventura", 15);
		
		cinema.aggiungiFilm(film1);
		cinema.aggiungiFilm(new Film("natale al cinema", "comico", 16));
		
		
		System.out.println(  cinema.aggingiSpettatore( new Persona("mario", 13), film1));
		System.out.println(  cinema.aggingiSpettatore( new Persona("marini", 20), new Film("natale al cinema", "comico", 16)));
		System.out.println(  cinema.aggingiSpettatore( new Persona("luigi", 18), film1));
		System.out.println(  cinema.aggingiSpettatore( new Persona("gigini", 55), film1));

		
		
		System.out.println("#############");
		
		cinema.stampaFilms();
		
		System.out.println("############à");
		
		
		cinema.stampaPersone();
		
		
	}

	
	
}
