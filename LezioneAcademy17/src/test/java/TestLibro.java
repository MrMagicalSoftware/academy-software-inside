import static org.junit.Assert.*;

import org.junit.Test;

public class TestLibro {

	@Test
	public void test() {
		
		Libro libro = new Libro("book1", 100);
		
		assertEquals(libro.getTitolo() , "book1");
		
		
		Rivista rivista = new Rivista("dd", 100, 1);
		
		assertTrue(rivista.getPagine() == 100);
		assertTrue(rivista.getNumeroRivista() == 1);

	}
	
	
	

	@Test
	public void test2() {
		
		Utente utente = new Utente();
		
		//assertNotNull(utente.getLibriInPrestito());

		
		System.out.println(utente.getLibriInPrestito().size());
		
	}

	
	

}
