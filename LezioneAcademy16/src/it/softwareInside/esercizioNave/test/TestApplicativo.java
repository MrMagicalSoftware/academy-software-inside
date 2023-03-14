package it.softwareInside.esercizioNave.test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.softwareInside.esercizioNave.Capitano;
import it.softwareInside.esercizioNave.Persona;

public class TestApplicativo {

	@Test
	public void testPersona() {
		Persona persona = new Persona();
		assertNotNull(persona);
		
		assertEquals(persona.getNome(), "mario rossi");
		assertEquals(persona.getEta(), 18);
		
		
		Persona persona2 = new Persona("luigi", 20);
		assertEquals(persona2.getNome(), "luigi");
		assertEquals(persona2.getEta(), 20);

	}
	
	@Test
	public void testCapitano() {
		
	
		Capitano capitano = new Capitano();
		
		assertTrue(capitano instanceof Persona);
		
		

	}

	
	
}
