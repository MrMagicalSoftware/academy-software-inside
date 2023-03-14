import static org.junit.Assert.*;

import org.junit.Test;

public class TestUtenteAbbonato {

	@Test
	public void test() {
		
		UtenteAbbonato utenteAbbonato = new UtenteAbbonato("mario", 300);
		
		assertTrue(utenteAbbonato.prendiInPrestito(new Rivista("riv1", 100, 1)));
		assertTrue(utenteAbbonato.prendiInPrestito(new Rivista("riv2", 1000, 1)));
		assertTrue(utenteAbbonato.prendiInPrestito(new Rivista("riv3", 10000, 1)));

		
		assertTrue(utenteAbbonato.prendiInPrestito(new Libro("book1", 10)));

	}

}
