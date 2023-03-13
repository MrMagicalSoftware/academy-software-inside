package it.softwareInside.operatoreInstanceOf;

import java.util.ArrayList;

public class Starter {

	public static void main(String[] args) {
	
		
	
		ArrayList<Persona> personeABordo = new ArrayList<>();
		
		
		personeABordo.add( new Persona());  // 0
		personeABordo.add( new Capitano());  // 1 
		personeABordo.add( new PersonaDiBordo());
		personeABordo.add( new Passegero());

		
		
		for(Persona persona : personeABordo)
			if(persona instanceof Passegero) {
				System.out.println("ok sono qui");
				
			}

		//come faccio a capire se una posizione è presente un object specifico ?
		//  instance of
		
		
		//  personeABordo.get(1)   instanceof Capitano  
		
		//  object instanceof CLASSE
		
		//System.out.println(  personeABordo.get(1)   instanceof Capitano );
		//System.out.println(  personeABordo.get(0)   instanceof Capitano );

		
		
		
		
		
		
	}

	
	
}
