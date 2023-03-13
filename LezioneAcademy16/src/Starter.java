import java.util.ArrayList;

public class Starter {

	public static void main(String[] args) {
		
		
		FunzioneArrayList myObj = new FunzioneArrayList();
		
		ArrayList<Double> myArrayList = new ArrayList<>();
		myArrayList.add(3.1);
		myArrayList.add(8.5);
		
		double risultato =  myObj.moltiplicaElementiArrayList(myArrayList);
		
		System.out.println(risultato);
		
		
		ArrayList<Integer>arrayListIntegers = new ArrayList<>();
		
		arrayListIntegers.add(10);
		arrayListIntegers.add(5);
	
		boolean b = myObj.isAllNumbersEven(arrayListIntegers);
		
		System.out.println(b);
		
		
	}
	
	
	
}
