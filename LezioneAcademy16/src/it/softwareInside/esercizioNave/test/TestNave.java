package it.softwareInside.esercizioNave.test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.softwareInside.esercizioNave.Capitano;
import it.softwareInside.esercizioNave.Nave;
import it.softwareInside.esercizioNave.Passeggero;
import it.softwareInside.esercizioNave.Persona;

public class TestNave {


	public void test() {
		
		
		Nave nave = new Nave();
		
		System.out.println();
		
		assertFalse(   nave.addPesseggero(null)   );
		assertFalse(  nave.addPesseggero( new Persona()));
		assertFalse(nave.addPesseggero( new Capitano()));

		assertEquals(nave.getPersoneAbordo().size(), 0);
		
		assertFalse(nave.addPesseggero(new Passeggero()));
	
		assertTrue(nave.addPesseggero(new Passeggero("mario1", 20, "aa")));
		assertTrue(nave.addPesseggero(new Passeggero("mario2", 20, "aa")));
		assertTrue(nave.addPesseggero(new Passeggero("mario3", 20, "aa")));
		
		assertFalse(nave.addPesseggero(new Passeggero("mario4", 20, "aa")));
		assertEquals(nave.getPersoneAbordo().size(), 3);

		nave.stampaNave();

		
		
	}
	
	
	public void addCapitano() {
		
		
		Nave nave = new Nave();
		
//		System.out.println("#############");
//		System.out.println(nave.getNumeroDiAnniRichiesti());
		
		Capitano capitano = new Capitano("Jack the C", 20, 1);
		
		
		assertFalse( 		nave.addCapitano(null)  );

		
		assertFalse( 		nave.addCapitano(capitano));
		
		capitano.setExp(5);
		
		assertTrue( 		nave.addCapitano(capitano));

		Capitano capitano2 = new Capitano("PLUTINO", 20, 10);
		
		assertFalse( 		nave.addCapitano(capitano2) );


	}
	
	@Test
	public void removeCapitano() {
		
		
		Nave nave = new Nave();
		assertTrue(nave.addPesseggero(new Passeggero("mario1", 20, "aa")));
		assertTrue(nave.addPesseggero(new Passeggero("mario2", 20, "aa")));
		assertTrue(nave.addPesseggero(new Passeggero("mario3", 20, "aa")));
		
		
		nave.removeAll();
		
		assertTrue(nave.getPersoneAbordo().size()  == 0 );

		System.out.println("naveeeee");
		System.out.println(nave.getPersoneAbordo());
		
		
		
	}
	

}
