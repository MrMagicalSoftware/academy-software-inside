package it.softwareInside.esercizioPdf1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApp {

	@Test
	public void test() {
		
		Documento documento = new Documento("ciao");  //  1 / 1 + 4 ==> 1 / 5 
		
		assertEquals(documento.getTesto(), "ciao");
		
		
		Documento documento1 = new Documento();
		
		
		assertEquals(documento1.getTesto(), "");
		
		
		System.out.println(documento.calcolaQualita());
		System.out.println(1.0/5);

		assertTrue(documento.calcolaQualita() ==  1.0 / 5 );
		
		
		
		documento.setTesto(""); // o caratteri --->
		// quanta qualità dovrei avrei ??     1/ 1 + 0 ===> 1 
		
		assertTrue(documento.calcolaQualita() == 1 );
		
		assertTrue(documento.calcolaQualita() > 0 &&   documento.calcolaQualita()  < 2  );

		
	}
	
	
	
	@Test
	public void testDocumentoPrioritario() {
	
	
		DocumentoPrioritario documentoPrioritario = new DocumentoPrioritario("ciao", 3);
		
		//  (1 / 1 + 4)      + 3  ==> 1/5 + 3
		
		assertTrue( documentoPrioritario.calcolaQualita() ==  (1.0 / 5)   + 3   );
	}
	
	
	
	@Test
	public void testArchivio() {
		
		
		Archivio archivio = new Archivio();
		assertNotNull(archivio);
		assertNotNull(archivio.getDocumenti());
		
		
		Documento doc1 = new Documento();
		DocumentoPrioritario documentoPrioritario = new DocumentoPrioritario();
		
		
		
		archivio.aggiungiDocumenti(doc1);
		
		assertTrue( archivio.getDocumenti().size()  == 1 );
		
		assertEquals(archivio.getDocumenti().get(0),  doc1);
		
		
		archivio.aggiungiDocumenti(documentoPrioritario);
		assertTrue( archivio.getDocumenti().size()  == 2);


		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
