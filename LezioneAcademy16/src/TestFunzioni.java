import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestFunzioni {

	@Test
	public void test() {
		
	
		FunzioneArrayList myObj = new FunzioneArrayList();
		
		
		ArrayList<Integer> myVeArrayList = new ArrayList<>();
		
		
		
		myVeArrayList.add(10);
		myVeArrayList.add(20);
		assertTrue(   myObj.isAllNumbersEven(myVeArrayList)   );

		
		
		
		myVeArrayList.add(5);
		assertFalse(   myObj.isAllNumbersEven(myVeArrayList)   );
		
	}
	
	

}
