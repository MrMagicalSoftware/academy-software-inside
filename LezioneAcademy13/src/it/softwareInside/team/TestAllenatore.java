package it.softwareInside.team;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAllenatore {

	@Test
	public void test() {
		
		Allenatore allenatore = new Allenatore("ciccio", -13);
		
		
		assertTrue(allenatore.getAnniDiEsperienza()  == 3);
		assertEquals(allenatore.getNome(), "ciccio");
	}


	@Test
	public void testCreaAllenatoreDefault() {
		
		
		Allenatore allenatore = new Allenatore();
		
		System.out.println("#######################");
		
		System.out.println(allenatore);
		
		System.out.println("########################");
		
		assertTrue(allenatore.getAnniDiEsperienza() == 10);
	}
	
	
	@Test
	public void testCambiaNomeAllenatore() {
		
		
		Allenatore allenatore = new Allenatore();
		
		
		System.out.println("#######################");
		System.out.println(allenatore);
		System.out.println("########################");
		
		allenatore.setNome("roby");
		
		System.out.println(" ##### Nuovo nome #### ");
		System.out.println(allenatore.getNome());
		
		assertEquals(allenatore.getNome(), "roby");
		
	}
	
	
	
	
	
	
}
