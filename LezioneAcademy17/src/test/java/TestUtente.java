import static org.junit.Assert.*;

import org.junit.Test;

public class TestUtente {

	@Test
	public void test() {
	
		Utente utente  = new Utente("ario", 300);
		
		Libro libro1 =  new Libro("book1", 100);
		
		assertTrue(utente.prendiInPrestito(libro1));
		assertTrue(utente.prendiInPrestito(new Libro("book2", 100)));
		assertTrue(utente.prendiInPrestito(new Libro("book3", 100)));
		
		assertFalse(utente.prendiInPrestito(new Libro("book4", 100)));

		System.out.println("----> " + utente.getLibriInPrestito().get(0));
		System.out.println("----> " + utente.getLibriInPrestito().get(1));
		System.out.println("----> " + utente.getLibriInPrestito().get(2));

		
		assertEquals(utente.restituisciLibro() , libro1);
		assertTrue(utente.getLibriInPrestito().size() == 2);
	}

}
