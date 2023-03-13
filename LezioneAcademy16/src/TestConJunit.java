import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

import org.junit.Test;

public class TestConJunit {

	
	
	
	@Test
	public void testArrayList() {
	
		FunzioneArrayList obj = new FunzioneArrayList();

		System.out.println("ok inizio il test");

		
		ArrayList<Integer> primeArrayList = new ArrayList<>();
		primeArrayList.add(1);
		primeArrayList.add(3);
		primeArrayList.add(5);
		primeArrayList.add(7);
		primeArrayList.add(11);
		
		
		assertTrue( obj.isAllNumberInArrayPrime(primeArrayList) );

	
		
		
		boolean ris = obj.isPrimeNumber(4);
		System.out.println("valore ====> " + ris);
		
		assertFalse(ris);
		assertTrue(obj.isPrimeNumber(3));
		
		
		primeArrayList.add(4);
		assertFalse( obj.isAllNumberInArrayPrime(primeArrayList) );

	}
	
	
	
	
	
	@Test
	public void test() {
		
		
		FunzioneArrayList obj = new FunzioneArrayList();
		
		
		//System.out.println("################");
		
		assertFalse(   obj.isPrimeNumber(10)  );
		
		assertTrue( obj.isPrimeNumber(3) );
		
		
		assertEquals(obj.isPrimeNumber(7), true);
		assertEquals(obj.isPrimeNumber(1), true);
		assertEquals(obj.isPrimeNumber(2), true);
		assertEquals(obj.isPrimeNumber(3), true);
		assertEquals(obj.isPrimeNumber(5), true);
		
		
		int i = 10;  
		
		// 10 12 14  . .. . . 20
		do {
		
			assertFalse(   obj.isPrimeNumber(i)   );
			i += 2;
		} while (i <= 20);

		
	}
	
	
	

	
}
