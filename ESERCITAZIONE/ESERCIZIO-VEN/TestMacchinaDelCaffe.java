import junit.framework.TestCase;


public class TestMacchinaDelCaffe extends TestCase {
	public void testIngredienti(){
		Bevanda bevanda = new Bevanda("cappuccino", 120, 2, 3, 1, 3);
		Ingredienti ingredienti = new Ingredienti();
		assertTrue(ingredienti.ingredientiSufficienti(bevanda));
		ingredienti.consuma(bevanda);
		ingredienti.consuma(bevanda);
		assertTrue(ingredienti.ingredientiSufficienti(bevanda));
		ingredienti.consuma(bevanda);
		assertFalse(ingredienti.ingredientiSufficienti(bevanda));
	}
	
	public void testAggiungiBevanda(){
		MacchinaDelCaffe m = new MacchinaDelCaffe();
		Bevanda b1 = new Bevanda("cappuccino", 120, 2, 3, 1, 2);
		assertTrue(m.aggiungiBevanda(b1));
		Bevanda b2 = new Bevanda("cappuccino", 122, 2, 3, 1, 2);
		assertFalse(m.aggiungiBevanda(b2));
		
	}
	
	public void testModificaBevanda(){
		MacchinaDelCaffe m = new MacchinaDelCaffe();
		Bevanda b1 = new Bevanda("cappuccino", 120, 2, 3, 1, 2);
		assertTrue(m.aggiungiBevanda(b1));
		Bevanda b2 = new Bevanda("cappuccino", 122, 2, 3, 1, 2);
		assertTrue(m.modificaBevanda(b2));
		Bevanda b3 = new Bevanda("espresso", 30, 3, 0, 0, 2);
		assertFalse(m.modificaBevanda(b3));
	}
	
	public void testCreditoUtente(){
		MacchinaDelCaffe m = new MacchinaDelCaffe();
		assertEquals(0, m.getCreditoUtente());
		m.inserisciCentesimi(-10);
		assertEquals(0, m.getCreditoUtente());
		m.inserisciCentesimi(50);
		assertEquals(50, m.getCreditoUtente());
		assertEquals(50, m.restituisciCreditoUtente());
		assertEquals(0, m.getCreditoUtente());
	}

	public void testBevandaNonEsistente(){
		MacchinaDelCaffe m = new MacchinaDelCaffe();
		m.inserisciCentesimi(200);
		m.aggiungiBevanda(new Bevanda("cappuccino", 120, 2, 3, 1, 2));
		try {
			assertFalse(m.eroga("espresso"));
		} catch (RisorseInsufficientiException e) {
			fail();
		}		
	}

	public void testCreditoIndufficiente(){
		MacchinaDelCaffe m = new MacchinaDelCaffe();
		m.inserisciCentesimi(10);
		m.aggiungiBevanda(new Bevanda("cappuccino", 120, 2, 3, 1, 2));
		try {
			assertFalse(m.eroga("cappuccino"));
		} catch (RisorseInsufficientiException e) {
			fail();
		}
	}
	
	public void testIngredientiInsufficienti(){
		MacchinaDelCaffe m = new MacchinaDelCaffe();
		m.inserisciCentesimi(200);
		m.aggiungiBevanda(new Bevanda("cappuccino", 120, 11, 3, 1, 2));
		try {
			m.eroga("cappuccino");
			fail();
		} catch (RisorseInsufficientiException e) {
		}		
	}
}
